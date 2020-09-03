// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.23.0
// 	protoc        v3.7.1
// source: wallet.proto

package wallet

import (
	proto "github.com/golang/protobuf/proto"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

type WalletBalanceRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *WalletBalanceRequest) Reset() {
	*x = WalletBalanceRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wallet_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *WalletBalanceRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*WalletBalanceRequest) ProtoMessage() {}

func (x *WalletBalanceRequest) ProtoReflect() protoreflect.Message {
	mi := &file_wallet_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use WalletBalanceRequest.ProtoReflect.Descriptor instead.
func (*WalletBalanceRequest) Descriptor() ([]byte, []int) {
	return file_wallet_proto_rawDescGZIP(), []int{0}
}

type WalletBalanceResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The balance of the wallet
	TotalBalance uint64 `protobuf:"varint,1,opt,name=total_balance,json=totalBalance,proto3" json:"total_balance,omitempty"`
	// The confirmed balance of a wallet(with >= 1 confirmations)
	ConfirmedBalance uint64 `protobuf:"varint,2,opt,name=confirmed_balance,json=confirmedBalance,proto3" json:"confirmed_balance,omitempty"`
	// The unconfirmed balance of a wallet(with 0 confirmations)
	UnconfirmedBalance uint64 `protobuf:"varint,3,opt,name=unconfirmed_balance,json=unconfirmedBalance,proto3" json:"unconfirmed_balance,omitempty"`
}

func (x *WalletBalanceResponse) Reset() {
	*x = WalletBalanceResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wallet_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *WalletBalanceResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*WalletBalanceResponse) ProtoMessage() {}

func (x *WalletBalanceResponse) ProtoReflect() protoreflect.Message {
	mi := &file_wallet_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use WalletBalanceResponse.ProtoReflect.Descriptor instead.
func (*WalletBalanceResponse) Descriptor() ([]byte, []int) {
	return file_wallet_proto_rawDescGZIP(), []int{1}
}

func (x *WalletBalanceResponse) GetTotalBalance() uint64 {
	if x != nil {
		return x.TotalBalance
	}
	return 0
}

func (x *WalletBalanceResponse) GetConfirmedBalance() uint64 {
	if x != nil {
		return x.ConfirmedBalance
	}
	return 0
}

func (x *WalletBalanceResponse) GetUnconfirmedBalance() uint64 {
	if x != nil {
		return x.UnconfirmedBalance
	}
	return 0
}

type GenSeedRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	//
	//passphrase is an optional user provided passphrase that will be used
	//to encrypt the generated seed.
	Passphrase []byte `protobuf:"bytes,1,opt,name=passphrase,proto3" json:"passphrase,omitempty"`
}

func (x *GenSeedRequest) Reset() {
	*x = GenSeedRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wallet_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenSeedRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenSeedRequest) ProtoMessage() {}

func (x *GenSeedRequest) ProtoReflect() protoreflect.Message {
	mi := &file_wallet_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenSeedRequest.ProtoReflect.Descriptor instead.
func (*GenSeedRequest) Descriptor() ([]byte, []int) {
	return file_wallet_proto_rawDescGZIP(), []int{2}
}

func (x *GenSeedRequest) GetPassphrase() []byte {
	if x != nil {
		return x.Passphrase
	}
	return nil
}

type GenSeedResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	//
	//seed_mnemonic is a 24-word mnemonic that encodes a prior seed obtained
	//by the user. This field is optional, as if not provided, then the daemon will
	//generate a new cipher seed for the user. Otherwise, then the daemon will
	//attempt to recover the wallet state linked to this cipher seed.
	SeedMnemonic []string `protobuf:"bytes,1,rep,name=seed_mnemonic,json=seedMnemonic,proto3" json:"seed_mnemonic,omitempty"`
}

func (x *GenSeedResponse) Reset() {
	*x = GenSeedResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wallet_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GenSeedResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GenSeedResponse) ProtoMessage() {}

func (x *GenSeedResponse) ProtoReflect() protoreflect.Message {
	mi := &file_wallet_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GenSeedResponse.ProtoReflect.Descriptor instead.
func (*GenSeedResponse) Descriptor() ([]byte, []int) {
	return file_wallet_proto_rawDescGZIP(), []int{3}
}

func (x *GenSeedResponse) GetSeedMnemonic() []string {
	if x != nil {
		return x.SeedMnemonic
	}
	return nil
}

type InitWalletRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	//
	//wallet_password is the passphrase that should be used to encrypt the
	//wallet. This MUST be at least 8 chars in length. After creation, this
	//password is required to unlock the daemon.
	WalletPassword []byte `protobuf:"bytes,1,opt,name=wallet_password,json=walletPassword,proto3" json:"wallet_password,omitempty"`
	//
	//seed_mnemonic is a 24-word mnemonic that encodes a prior seed obtained by the
	//user. This MUST be a generated by the GenSeed method
	SeedMnemonic []string `protobuf:"bytes,2,rep,name=seed_mnemonic,json=seedMnemonic,proto3" json:"seed_mnemonic,omitempty"`
}

func (x *InitWalletRequest) Reset() {
	*x = InitWalletRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wallet_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *InitWalletRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*InitWalletRequest) ProtoMessage() {}

func (x *InitWalletRequest) ProtoReflect() protoreflect.Message {
	mi := &file_wallet_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use InitWalletRequest.ProtoReflect.Descriptor instead.
func (*InitWalletRequest) Descriptor() ([]byte, []int) {
	return file_wallet_proto_rawDescGZIP(), []int{4}
}

func (x *InitWalletRequest) GetWalletPassword() []byte {
	if x != nil {
		return x.WalletPassword
	}
	return nil
}

func (x *InitWalletRequest) GetSeedMnemonic() []string {
	if x != nil {
		return x.SeedMnemonic
	}
	return nil
}

type InitWalletResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *InitWalletResponse) Reset() {
	*x = InitWalletResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wallet_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *InitWalletResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*InitWalletResponse) ProtoMessage() {}

func (x *InitWalletResponse) ProtoReflect() protoreflect.Message {
	mi := &file_wallet_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use InitWalletResponse.ProtoReflect.Descriptor instead.
func (*InitWalletResponse) Descriptor() ([]byte, []int) {
	return file_wallet_proto_rawDescGZIP(), []int{5}
}

type UnlockWalletRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	//
	//wallet_password should be the current valid passphrase for the daemon. This
	//will be required to decrypt on-disk material that the daemon requires to
	//function properly.
	WalletPassword []byte `protobuf:"bytes,1,opt,name=wallet_password,json=walletPassword,proto3" json:"wallet_password,omitempty"`
}

func (x *UnlockWalletRequest) Reset() {
	*x = UnlockWalletRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wallet_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UnlockWalletRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UnlockWalletRequest) ProtoMessage() {}

func (x *UnlockWalletRequest) ProtoReflect() protoreflect.Message {
	mi := &file_wallet_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UnlockWalletRequest.ProtoReflect.Descriptor instead.
func (*UnlockWalletRequest) Descriptor() ([]byte, []int) {
	return file_wallet_proto_rawDescGZIP(), []int{6}
}

func (x *UnlockWalletRequest) GetWalletPassword() []byte {
	if x != nil {
		return x.WalletPassword
	}
	return nil
}

type UnlockWalletResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *UnlockWalletResponse) Reset() {
	*x = UnlockWalletResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wallet_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UnlockWalletResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UnlockWalletResponse) ProtoMessage() {}

func (x *UnlockWalletResponse) ProtoReflect() protoreflect.Message {
	mi := &file_wallet_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UnlockWalletResponse.ProtoReflect.Descriptor instead.
func (*UnlockWalletResponse) Descriptor() ([]byte, []int) {
	return file_wallet_proto_rawDescGZIP(), []int{7}
}

type ChangePasswordRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	//
	//current_password should be the current valid passphrase used to unlock the
	//daemon.
	CurrentPassword []byte `protobuf:"bytes,1,opt,name=current_password,json=currentPassword,proto3" json:"current_password,omitempty"`
	//
	//new_password should be the new passphrase that will be needed to unlock the
	//daemon.
	NewPassword []byte `protobuf:"bytes,2,opt,name=new_password,json=newPassword,proto3" json:"new_password,omitempty"`
}

func (x *ChangePasswordRequest) Reset() {
	*x = ChangePasswordRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wallet_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ChangePasswordRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ChangePasswordRequest) ProtoMessage() {}

func (x *ChangePasswordRequest) ProtoReflect() protoreflect.Message {
	mi := &file_wallet_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ChangePasswordRequest.ProtoReflect.Descriptor instead.
func (*ChangePasswordRequest) Descriptor() ([]byte, []int) {
	return file_wallet_proto_rawDescGZIP(), []int{8}
}

func (x *ChangePasswordRequest) GetCurrentPassword() []byte {
	if x != nil {
		return x.CurrentPassword
	}
	return nil
}

func (x *ChangePasswordRequest) GetNewPassword() []byte {
	if x != nil {
		return x.NewPassword
	}
	return nil
}

type ChangePasswordResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *ChangePasswordResponse) Reset() {
	*x = ChangePasswordResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wallet_proto_msgTypes[9]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ChangePasswordResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ChangePasswordResponse) ProtoMessage() {}

func (x *ChangePasswordResponse) ProtoReflect() protoreflect.Message {
	mi := &file_wallet_proto_msgTypes[9]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ChangePasswordResponse.ProtoReflect.Descriptor instead.
func (*ChangePasswordResponse) Descriptor() ([]byte, []int) {
	return file_wallet_proto_rawDescGZIP(), []int{9}
}

type SendToManyRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	//
	//A slice of the outputs that should be created in the transaction produced.
	Outputs []*TxOut `protobuf:"bytes,1,rep,name=outputs,proto3" json:"outputs,omitempty"`
	//
	//The number of satoshis per kilo weight that should be used when crafting
	//this transaction.
	SatPerKw int64 `protobuf:"varint,2,opt,name=sat_per_kw,json=satPerKw,proto3" json:"sat_per_kw,omitempty"`
	// Optional: if true the transaction will be pushed to the network
	Push bool `protobuf:"varint,3,opt,name=push,proto3" json:"push,omitempty"`
}

func (x *SendToManyRequest) Reset() {
	*x = SendToManyRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wallet_proto_msgTypes[10]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SendToManyRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SendToManyRequest) ProtoMessage() {}

func (x *SendToManyRequest) ProtoReflect() protoreflect.Message {
	mi := &file_wallet_proto_msgTypes[10]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SendToManyRequest.ProtoReflect.Descriptor instead.
func (*SendToManyRequest) Descriptor() ([]byte, []int) {
	return file_wallet_proto_rawDescGZIP(), []int{10}
}

func (x *SendToManyRequest) GetOutputs() []*TxOut {
	if x != nil {
		return x.Outputs
	}
	return nil
}

func (x *SendToManyRequest) GetSatPerKw() int64 {
	if x != nil {
		return x.SatPerKw
	}
	return 0
}

func (x *SendToManyRequest) GetPush() bool {
	if x != nil {
		return x.Push
	}
	return false
}

type SendToManyReply struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	//
	//The serialized transaction sent out on the network.
	RawTx []byte `protobuf:"bytes,1,opt,name=raw_tx,json=rawTx,proto3" json:"raw_tx,omitempty"`
}

func (x *SendToManyReply) Reset() {
	*x = SendToManyReply{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wallet_proto_msgTypes[11]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SendToManyReply) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SendToManyReply) ProtoMessage() {}

func (x *SendToManyReply) ProtoReflect() protoreflect.Message {
	mi := &file_wallet_proto_msgTypes[11]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SendToManyReply.ProtoReflect.Descriptor instead.
func (*SendToManyReply) Descriptor() ([]byte, []int) {
	return file_wallet_proto_rawDescGZIP(), []int{11}
}

func (x *SendToManyReply) GetRawTx() []byte {
	if x != nil {
		return x.RawTx
	}
	return nil
}

type TxOut struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Asset string `protobuf:"bytes,1,opt,name=asset,proto3" json:"asset,omitempty"`
	// The value of the output being spent.
	Value int64 `protobuf:"varint,2,opt,name=value,proto3" json:"value,omitempty"`
	// The script of the output being spent.
	Script []byte `protobuf:"bytes,3,opt,name=script,proto3" json:"script,omitempty"`
}

func (x *TxOut) Reset() {
	*x = TxOut{}
	if protoimpl.UnsafeEnabled {
		mi := &file_wallet_proto_msgTypes[12]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TxOut) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TxOut) ProtoMessage() {}

func (x *TxOut) ProtoReflect() protoreflect.Message {
	mi := &file_wallet_proto_msgTypes[12]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TxOut.ProtoReflect.Descriptor instead.
func (*TxOut) Descriptor() ([]byte, []int) {
	return file_wallet_proto_rawDescGZIP(), []int{12}
}

func (x *TxOut) GetAsset() string {
	if x != nil {
		return x.Asset
	}
	return ""
}

func (x *TxOut) GetValue() int64 {
	if x != nil {
		return x.Value
	}
	return 0
}

func (x *TxOut) GetScript() []byte {
	if x != nil {
		return x.Script
	}
	return nil
}

var File_wallet_proto protoreflect.FileDescriptor

var file_wallet_proto_rawDesc = []byte{
	0x0a, 0x0c, 0x77, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x16,
	0x0a, 0x14, 0x57, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x42, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x22, 0x9a, 0x01, 0x0a, 0x15, 0x57, 0x61, 0x6c, 0x6c, 0x65,
	0x74, 0x42, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x12, 0x23, 0x0a, 0x0d, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x5f, 0x62, 0x61, 0x6c, 0x61, 0x6e, 0x63,
	0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x04, 0x52, 0x0c, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x42, 0x61,
	0x6c, 0x61, 0x6e, 0x63, 0x65, 0x12, 0x2b, 0x0a, 0x11, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d,
	0x65, 0x64, 0x5f, 0x62, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x04,
	0x52, 0x10, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d, 0x65, 0x64, 0x42, 0x61, 0x6c, 0x61, 0x6e,
	0x63, 0x65, 0x12, 0x2f, 0x0a, 0x13, 0x75, 0x6e, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d, 0x65,
	0x64, 0x5f, 0x62, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x04, 0x52,
	0x12, 0x75, 0x6e, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d, 0x65, 0x64, 0x42, 0x61, 0x6c, 0x61,
	0x6e, 0x63, 0x65, 0x22, 0x30, 0x0a, 0x0e, 0x47, 0x65, 0x6e, 0x53, 0x65, 0x65, 0x64, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1e, 0x0a, 0x0a, 0x70, 0x61, 0x73, 0x73, 0x70, 0x68, 0x72,
	0x61, 0x73, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x0a, 0x70, 0x61, 0x73, 0x73, 0x70,
	0x68, 0x72, 0x61, 0x73, 0x65, 0x22, 0x36, 0x0a, 0x0f, 0x47, 0x65, 0x6e, 0x53, 0x65, 0x65, 0x64,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x23, 0x0a, 0x0d, 0x73, 0x65, 0x65, 0x64,
	0x5f, 0x6d, 0x6e, 0x65, 0x6d, 0x6f, 0x6e, 0x69, 0x63, 0x18, 0x01, 0x20, 0x03, 0x28, 0x09, 0x52,
	0x0c, 0x73, 0x65, 0x65, 0x64, 0x4d, 0x6e, 0x65, 0x6d, 0x6f, 0x6e, 0x69, 0x63, 0x22, 0x61, 0x0a,
	0x11, 0x49, 0x6e, 0x69, 0x74, 0x57, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x12, 0x27, 0x0a, 0x0f, 0x77, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x5f, 0x70, 0x61, 0x73,
	0x73, 0x77, 0x6f, 0x72, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x0e, 0x77, 0x61, 0x6c,
	0x6c, 0x65, 0x74, 0x50, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x12, 0x23, 0x0a, 0x0d, 0x73,
	0x65, 0x65, 0x64, 0x5f, 0x6d, 0x6e, 0x65, 0x6d, 0x6f, 0x6e, 0x69, 0x63, 0x18, 0x02, 0x20, 0x03,
	0x28, 0x09, 0x52, 0x0c, 0x73, 0x65, 0x65, 0x64, 0x4d, 0x6e, 0x65, 0x6d, 0x6f, 0x6e, 0x69, 0x63,
	0x22, 0x14, 0x0a, 0x12, 0x49, 0x6e, 0x69, 0x74, 0x57, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x3e, 0x0a, 0x13, 0x55, 0x6e, 0x6c, 0x6f, 0x63, 0x6b,
	0x57, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x27, 0x0a,
	0x0f, 0x77, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x5f, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x0e, 0x77, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x50, 0x61,
	0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x22, 0x16, 0x0a, 0x14, 0x55, 0x6e, 0x6c, 0x6f, 0x63, 0x6b,
	0x57, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x65,
	0x0a, 0x15, 0x43, 0x68, 0x61, 0x6e, 0x67, 0x65, 0x50, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x29, 0x0a, 0x10, 0x63, 0x75, 0x72, 0x72, 0x65,
	0x6e, 0x74, 0x5f, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x0c, 0x52, 0x0f, 0x63, 0x75, 0x72, 0x72, 0x65, 0x6e, 0x74, 0x50, 0x61, 0x73, 0x73, 0x77, 0x6f,
	0x72, 0x64, 0x12, 0x21, 0x0a, 0x0c, 0x6e, 0x65, 0x77, 0x5f, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f,
	0x72, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x0b, 0x6e, 0x65, 0x77, 0x50, 0x61, 0x73,
	0x73, 0x77, 0x6f, 0x72, 0x64, 0x22, 0x18, 0x0a, 0x16, 0x43, 0x68, 0x61, 0x6e, 0x67, 0x65, 0x50,
	0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22,
	0x67, 0x0a, 0x11, 0x53, 0x65, 0x6e, 0x64, 0x54, 0x6f, 0x4d, 0x61, 0x6e, 0x79, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x12, 0x20, 0x0a, 0x07, 0x6f, 0x75, 0x74, 0x70, 0x75, 0x74, 0x73, 0x18,
	0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x06, 0x2e, 0x54, 0x78, 0x4f, 0x75, 0x74, 0x52, 0x07, 0x6f,
	0x75, 0x74, 0x70, 0x75, 0x74, 0x73, 0x12, 0x1c, 0x0a, 0x0a, 0x73, 0x61, 0x74, 0x5f, 0x70, 0x65,
	0x72, 0x5f, 0x6b, 0x77, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x08, 0x73, 0x61, 0x74, 0x50,
	0x65, 0x72, 0x4b, 0x77, 0x12, 0x12, 0x0a, 0x04, 0x70, 0x75, 0x73, 0x68, 0x18, 0x03, 0x20, 0x01,
	0x28, 0x08, 0x52, 0x04, 0x70, 0x75, 0x73, 0x68, 0x22, 0x28, 0x0a, 0x0f, 0x53, 0x65, 0x6e, 0x64,
	0x54, 0x6f, 0x4d, 0x61, 0x6e, 0x79, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x12, 0x15, 0x0a, 0x06, 0x72,
	0x61, 0x77, 0x5f, 0x74, 0x78, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x05, 0x72, 0x61, 0x77,
	0x54, 0x78, 0x22, 0x4b, 0x0a, 0x05, 0x54, 0x78, 0x4f, 0x75, 0x74, 0x12, 0x14, 0x0a, 0x05, 0x61,
	0x73, 0x73, 0x65, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x61, 0x73, 0x73, 0x65,
	0x74, 0x12, 0x14, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03,
	0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x73, 0x63, 0x72, 0x69, 0x70,
	0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x06, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x32,
	0xe1, 0x02, 0x0a, 0x06, 0x57, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x12, 0x2c, 0x0a, 0x07, 0x47, 0x65,
	0x6e, 0x53, 0x65, 0x65, 0x64, 0x12, 0x0f, 0x2e, 0x47, 0x65, 0x6e, 0x53, 0x65, 0x65, 0x64, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x10, 0x2e, 0x47, 0x65, 0x6e, 0x53, 0x65, 0x65, 0x64,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x35, 0x0a, 0x0a, 0x49, 0x6e, 0x69, 0x74,
	0x57, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x12, 0x12, 0x2e, 0x49, 0x6e, 0x69, 0x74, 0x57, 0x61, 0x6c,
	0x6c, 0x65, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x13, 0x2e, 0x49, 0x6e, 0x69,
	0x74, 0x57, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12,
	0x3b, 0x0a, 0x0c, 0x55, 0x6e, 0x6c, 0x6f, 0x63, 0x6b, 0x57, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x12,
	0x14, 0x2e, 0x55, 0x6e, 0x6c, 0x6f, 0x63, 0x6b, 0x57, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x15, 0x2e, 0x55, 0x6e, 0x6c, 0x6f, 0x63, 0x6b, 0x57, 0x61,
	0x6c, 0x6c, 0x65, 0x74, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x41, 0x0a, 0x0e,
	0x43, 0x68, 0x61, 0x6e, 0x67, 0x65, 0x50, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x12, 0x16,
	0x2e, 0x43, 0x68, 0x61, 0x6e, 0x67, 0x65, 0x50, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x17, 0x2e, 0x43, 0x68, 0x61, 0x6e, 0x67, 0x65, 0x50,
	0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12,
	0x3e, 0x0a, 0x0d, 0x57, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x42, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65,
	0x12, 0x15, 0x2e, 0x57, 0x61, 0x6c, 0x6c, 0x65, 0x74, 0x42, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x16, 0x2e, 0x57, 0x61, 0x6c, 0x6c, 0x65, 0x74,
	0x42, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12,
	0x32, 0x0a, 0x0a, 0x53, 0x65, 0x6e, 0x64, 0x54, 0x6f, 0x4d, 0x61, 0x6e, 0x79, 0x12, 0x12, 0x2e,
	0x53, 0x65, 0x6e, 0x64, 0x54, 0x6f, 0x4d, 0x61, 0x6e, 0x79, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x10, 0x2e, 0x53, 0x65, 0x6e, 0x64, 0x54, 0x6f, 0x4d, 0x61, 0x6e, 0x79, 0x52, 0x65,
	0x70, 0x6c, 0x79, 0x42, 0x3b, 0x5a, 0x39, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x74, 0x64, 0x65, 0x78, 0x2d, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2f, 0x74,
	0x64, 0x65, 0x78, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x67, 0x65, 0x6e,
	0x65, 0x72, 0x61, 0x74, 0x65, 0x64, 0x2f, 0x67, 0x6f, 0x2f, 0x77, 0x61, 0x6c, 0x6c, 0x65, 0x74,
	0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_wallet_proto_rawDescOnce sync.Once
	file_wallet_proto_rawDescData = file_wallet_proto_rawDesc
)

func file_wallet_proto_rawDescGZIP() []byte {
	file_wallet_proto_rawDescOnce.Do(func() {
		file_wallet_proto_rawDescData = protoimpl.X.CompressGZIP(file_wallet_proto_rawDescData)
	})
	return file_wallet_proto_rawDescData
}

var file_wallet_proto_msgTypes = make([]protoimpl.MessageInfo, 13)
var file_wallet_proto_goTypes = []interface{}{
	(*WalletBalanceRequest)(nil),   // 0: WalletBalanceRequest
	(*WalletBalanceResponse)(nil),  // 1: WalletBalanceResponse
	(*GenSeedRequest)(nil),         // 2: GenSeedRequest
	(*GenSeedResponse)(nil),        // 3: GenSeedResponse
	(*InitWalletRequest)(nil),      // 4: InitWalletRequest
	(*InitWalletResponse)(nil),     // 5: InitWalletResponse
	(*UnlockWalletRequest)(nil),    // 6: UnlockWalletRequest
	(*UnlockWalletResponse)(nil),   // 7: UnlockWalletResponse
	(*ChangePasswordRequest)(nil),  // 8: ChangePasswordRequest
	(*ChangePasswordResponse)(nil), // 9: ChangePasswordResponse
	(*SendToManyRequest)(nil),      // 10: SendToManyRequest
	(*SendToManyReply)(nil),        // 11: SendToManyReply
	(*TxOut)(nil),                  // 12: TxOut
}
var file_wallet_proto_depIdxs = []int32{
	12, // 0: SendToManyRequest.outputs:type_name -> TxOut
	2,  // 1: Wallet.GenSeed:input_type -> GenSeedRequest
	4,  // 2: Wallet.InitWallet:input_type -> InitWalletRequest
	6,  // 3: Wallet.UnlockWallet:input_type -> UnlockWalletRequest
	8,  // 4: Wallet.ChangePassword:input_type -> ChangePasswordRequest
	0,  // 5: Wallet.WalletBalance:input_type -> WalletBalanceRequest
	10, // 6: Wallet.SendToMany:input_type -> SendToManyRequest
	3,  // 7: Wallet.GenSeed:output_type -> GenSeedResponse
	5,  // 8: Wallet.InitWallet:output_type -> InitWalletResponse
	7,  // 9: Wallet.UnlockWallet:output_type -> UnlockWalletResponse
	9,  // 10: Wallet.ChangePassword:output_type -> ChangePasswordResponse
	1,  // 11: Wallet.WalletBalance:output_type -> WalletBalanceResponse
	11, // 12: Wallet.SendToMany:output_type -> SendToManyReply
	7,  // [7:13] is the sub-list for method output_type
	1,  // [1:7] is the sub-list for method input_type
	1,  // [1:1] is the sub-list for extension type_name
	1,  // [1:1] is the sub-list for extension extendee
	0,  // [0:1] is the sub-list for field type_name
}

func init() { file_wallet_proto_init() }
func file_wallet_proto_init() {
	if File_wallet_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_wallet_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*WalletBalanceRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_wallet_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*WalletBalanceResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_wallet_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenSeedRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_wallet_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GenSeedResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_wallet_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*InitWalletRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_wallet_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*InitWalletResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_wallet_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UnlockWalletRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_wallet_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UnlockWalletResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_wallet_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ChangePasswordRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_wallet_proto_msgTypes[9].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ChangePasswordResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_wallet_proto_msgTypes[10].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SendToManyRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_wallet_proto_msgTypes[11].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SendToManyReply); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_wallet_proto_msgTypes[12].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TxOut); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_wallet_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   13,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_wallet_proto_goTypes,
		DependencyIndexes: file_wallet_proto_depIdxs,
		MessageInfos:      file_wallet_proto_msgTypes,
	}.Build()
	File_wallet_proto = out.File
	file_wallet_proto_rawDesc = nil
	file_wallet_proto_goTypes = nil
	file_wallet_proto_depIdxs = nil
}
