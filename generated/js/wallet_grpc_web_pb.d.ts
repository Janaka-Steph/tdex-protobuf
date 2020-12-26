import * as grpcWeb from 'grpc-web';

import * as wallet_pb from './wallet_pb';


export class WalletClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  genSeed(
    request: wallet_pb.GenSeedRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: wallet_pb.GenSeedReply) => void
  ): grpcWeb.ClientReadableStream<wallet_pb.GenSeedReply>;

  initWallet(
    request: wallet_pb.InitWalletRequest,
    metadata?: grpcWeb.Metadata
  ): grpcWeb.ClientReadableStream<wallet_pb.InitWalletReply>;

  unlockWallet(
    request: wallet_pb.UnlockWalletRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: wallet_pb.UnlockWalletReply) => void
  ): grpcWeb.ClientReadableStream<wallet_pb.UnlockWalletReply>;

  changePassword(
    request: wallet_pb.ChangePasswordRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: wallet_pb.ChangePasswordReply) => void
  ): grpcWeb.ClientReadableStream<wallet_pb.ChangePasswordReply>;

  walletAddress(
    request: wallet_pb.WalletAddressRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: wallet_pb.WalletAddressReply) => void
  ): grpcWeb.ClientReadableStream<wallet_pb.WalletAddressReply>;

  walletBalance(
    request: wallet_pb.WalletBalanceRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: wallet_pb.WalletBalanceReply) => void
  ): grpcWeb.ClientReadableStream<wallet_pb.WalletBalanceReply>;

  sendToMany(
    request: wallet_pb.SendToManyRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: wallet_pb.SendToManyReply) => void
  ): grpcWeb.ClientReadableStream<wallet_pb.SendToManyReply>;

}

export class WalletPromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  genSeed(
    request: wallet_pb.GenSeedRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<wallet_pb.GenSeedReply>;

  initWallet(
    request: wallet_pb.InitWalletRequest,
    metadata?: grpcWeb.Metadata
  ): grpcWeb.ClientReadableStream<wallet_pb.InitWalletReply>;

  unlockWallet(
    request: wallet_pb.UnlockWalletRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<wallet_pb.UnlockWalletReply>;

  changePassword(
    request: wallet_pb.ChangePasswordRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<wallet_pb.ChangePasswordReply>;

  walletAddress(
    request: wallet_pb.WalletAddressRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<wallet_pb.WalletAddressReply>;

  walletBalance(
    request: wallet_pb.WalletBalanceRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<wallet_pb.WalletBalanceReply>;

  sendToMany(
    request: wallet_pb.SendToManyRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<wallet_pb.SendToManyReply>;

}

