# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: tdex/v1/trade.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from tdex.v1 import swap_pb2 as tdex_dot_v1_dot_swap__pb2
from tdex.v1 import types_pb2 as tdex_dot_v1_dot_types__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x13tdex/v1/trade.proto\x12\x07tdex.v1\x1a\x12tdex/v1/swap.proto\x1a\x13tdex/v1/types.proto\x1a\x1cgoogle/api/annotations.proto\"\x10\n\x0eMarketsRequest\"@\n\x0cMarketsReply\x12\x30\n\x07markets\x18\x01 \x03(\x0b\x32\x16.tdex.v1.MarketWithFeeR\x07markets\":\n\x0f\x42\x61lancesRequest\x12\'\n\x06market\x18\x01 \x01(\x0b\x32\x0f.tdex.v1.MarketR\x06market\"D\n\rBalancesReply\x12\x33\n\x08\x62\x61lances\x18\x01 \x03(\x0b\x32\x17.tdex.v1.BalanceWithFeeR\x08\x62\x61lances\"\x93\x01\n\x12MarketPriceRequest\x12\'\n\x06market\x18\x01 \x01(\x0b\x32\x0f.tdex.v1.MarketR\x06market\x12&\n\x04type\x18\x02 \x01(\x0e\x32\x12.tdex.v1.TradeTypeR\x04type\x12\x16\n\x06\x61mount\x18\x03 \x01(\x04R\x06\x61mount\x12\x14\n\x05\x61sset\x18\x04 \x01(\tR\x05\x61sset\"A\n\x10MarketPriceReply\x12-\n\x06prices\x18\x01 \x03(\x0b\x32\x15.tdex.v1.PriceWithFeeR\x06prices\"\x9f\x01\n\x13TradeProposeRequest\x12\'\n\x06market\x18\x01 \x01(\x0b\x32\x0f.tdex.v1.MarketR\x06market\x12&\n\x04type\x18\x02 \x01(\x0e\x32\x12.tdex.v1.TradeTypeR\x04type\x12\x37\n\x0cswap_request\x18\x03 \x01(\x0b\x32\x14.tdex.v1.SwapRequestR\x0bswapRequest\"\xa3\x01\n\x11TradeProposeReply\x12\x34\n\x0bswap_accept\x18\x01 \x01(\x0b\x32\x13.tdex.v1.SwapAcceptR\nswapAccept\x12.\n\tswap_fail\x18\x02 \x01(\x0b\x32\x11.tdex.v1.SwapFailR\x08swapFail\x12(\n\x10\x65xpiry_time_unix\x18\x03 \x01(\x04R\x0e\x65xpiryTimeUnix\"\x82\x01\n\x14TradeCompleteRequest\x12:\n\rswap_complete\x18\x01 \x01(\x0b\x32\x15.tdex.v1.SwapCompleteR\x0cswapComplete\x12.\n\tswap_fail\x18\x02 \x01(\x0b\x32\x11.tdex.v1.SwapFailR\x08swapFail\"X\n\x12TradeCompleteReply\x12\x12\n\x04txid\x18\x01 \x01(\tR\x04txid\x12.\n\tswap_fail\x18\x02 \x01(\x0b\x32\x11.tdex.v1.SwapFailR\x08swapFail\"\x9f\x01\n\x13ProposeTradeRequest\x12\'\n\x06market\x18\x01 \x01(\x0b\x32\x0f.tdex.v1.MarketR\x06market\x12&\n\x04type\x18\x02 \x01(\x0e\x32\x12.tdex.v1.TradeTypeR\x04type\x12\x37\n\x0cswap_request\x18\x03 \x01(\x0b\x32\x14.tdex.v1.SwapRequestR\x0bswapRequest\"\xa3\x01\n\x11ProposeTradeReply\x12\x34\n\x0bswap_accept\x18\x01 \x01(\x0b\x32\x13.tdex.v1.SwapAcceptR\nswapAccept\x12.\n\tswap_fail\x18\x02 \x01(\x0b\x32\x11.tdex.v1.SwapFailR\x08swapFail\x12(\n\x10\x65xpiry_time_unix\x18\x03 \x01(\x04R\x0e\x65xpiryTimeUnix\"\x82\x01\n\x14\x43ompleteTradeRequest\x12:\n\rswap_complete\x18\x01 \x01(\x0b\x32\x15.tdex.v1.SwapCompleteR\x0cswapComplete\x12.\n\tswap_fail\x18\x02 \x01(\x0b\x32\x11.tdex.v1.SwapFailR\x08swapFail\"X\n\x12\x43ompleteTradeReply\x12\x12\n\x04txid\x18\x01 \x01(\tR\x04txid\x12.\n\tswap_fail\x18\x02 \x01(\x0b\x32\x11.tdex.v1.SwapFailR\x08swapFail*\x1e\n\tTradeType\x12\x07\n\x03\x42UY\x10\x00\x12\x08\n\x04SELL\x10\x01\x32\xdf\x05\n\x05Trade\x12T\n\x07Markets\x12\x17.tdex.v1.MarketsRequest\x1a\x15.tdex.v1.MarketsReply\"\x19\x82\xd3\xe4\x93\x02\x13\x12\x11/v1/trade/markets\x12Z\n\x08\x42\x61lances\x12\x18.tdex.v1.BalancesRequest\x1a\x16.tdex.v1.BalancesReply\"\x1c\x82\xd3\xe4\x93\x02\x16:\x01*\"\x11/v1/trade/balance\x12^\n\x0bMarketPrice\x12\x1b.tdex.v1.MarketPriceRequest\x1a\x19.tdex.v1.MarketPriceReply\"\x17\x82\xd3\xe4\x93\x02\x11\"\x0f/v1/trade/price\x12o\n\x0cTradePropose\x12\x1c.tdex.v1.TradeProposeRequest\x1a\x1a.tdex.v1.TradeProposeReply\"#\x82\xd3\xe4\x93\x02\x1d:\x01*\"\x18/v1/trade/stream/propose0\x01\x12l\n\x0cProposeTrade\x12\x1c.tdex.v1.ProposeTradeRequest\x1a\x1a.tdex.v1.ProposeTradeReply\"\"\x82\xd3\xe4\x93\x02\x1c:\x01*\"\x17/v1/trade/unary/propose\x12s\n\rTradeComplete\x12\x1d.tdex.v1.TradeCompleteRequest\x1a\x1b.tdex.v1.TradeCompleteReply\"$\x82\xd3\xe4\x93\x02\x1e:\x01*\"\x19/v1/trade/stream/complete0\x01\x12p\n\rCompleteTrade\x12\x1d.tdex.v1.CompleteTradeRequest\x1a\x1b.tdex.v1.CompleteTradeReply\"#\x82\xd3\xe4\x93\x02\x1d:\x01*\"\x18/v1/trade/unary/completeB\xa3\x01\n\x0b\x63om.tdex.v1B\nTradeProtoP\x01ZKgithub.com/tdex-network/tdex-prototbuf/api-spec/protobuf/gen/tdex/v1;tdexv1\xa2\x02\x03TXX\xaa\x02\x07Tdex.V1\xca\x02\x07Tdex\\V1\xe2\x02\x13Tdex\\V1\\GPBMetadata\xea\x02\x08Tdex::V1b\x06proto3')

_TRADETYPE = DESCRIPTOR.enum_types_by_name['TradeType']
TradeType = enum_type_wrapper.EnumTypeWrapper(_TRADETYPE)
BUY = 0
SELL = 1


_MARKETSREQUEST = DESCRIPTOR.message_types_by_name['MarketsRequest']
_MARKETSREPLY = DESCRIPTOR.message_types_by_name['MarketsReply']
_BALANCESREQUEST = DESCRIPTOR.message_types_by_name['BalancesRequest']
_BALANCESREPLY = DESCRIPTOR.message_types_by_name['BalancesReply']
_MARKETPRICEREQUEST = DESCRIPTOR.message_types_by_name['MarketPriceRequest']
_MARKETPRICEREPLY = DESCRIPTOR.message_types_by_name['MarketPriceReply']
_TRADEPROPOSEREQUEST = DESCRIPTOR.message_types_by_name['TradeProposeRequest']
_TRADEPROPOSEREPLY = DESCRIPTOR.message_types_by_name['TradeProposeReply']
_TRADECOMPLETEREQUEST = DESCRIPTOR.message_types_by_name['TradeCompleteRequest']
_TRADECOMPLETEREPLY = DESCRIPTOR.message_types_by_name['TradeCompleteReply']
_PROPOSETRADEREQUEST = DESCRIPTOR.message_types_by_name['ProposeTradeRequest']
_PROPOSETRADEREPLY = DESCRIPTOR.message_types_by_name['ProposeTradeReply']
_COMPLETETRADEREQUEST = DESCRIPTOR.message_types_by_name['CompleteTradeRequest']
_COMPLETETRADEREPLY = DESCRIPTOR.message_types_by_name['CompleteTradeReply']
MarketsRequest = _reflection.GeneratedProtocolMessageType('MarketsRequest', (_message.Message,), {
  'DESCRIPTOR' : _MARKETSREQUEST,
  '__module__' : 'tdex.v1.trade_pb2'
  # @@protoc_insertion_point(class_scope:tdex.v1.MarketsRequest)
  })
_sym_db.RegisterMessage(MarketsRequest)

MarketsReply = _reflection.GeneratedProtocolMessageType('MarketsReply', (_message.Message,), {
  'DESCRIPTOR' : _MARKETSREPLY,
  '__module__' : 'tdex.v1.trade_pb2'
  # @@protoc_insertion_point(class_scope:tdex.v1.MarketsReply)
  })
_sym_db.RegisterMessage(MarketsReply)

BalancesRequest = _reflection.GeneratedProtocolMessageType('BalancesRequest', (_message.Message,), {
  'DESCRIPTOR' : _BALANCESREQUEST,
  '__module__' : 'tdex.v1.trade_pb2'
  # @@protoc_insertion_point(class_scope:tdex.v1.BalancesRequest)
  })
_sym_db.RegisterMessage(BalancesRequest)

BalancesReply = _reflection.GeneratedProtocolMessageType('BalancesReply', (_message.Message,), {
  'DESCRIPTOR' : _BALANCESREPLY,
  '__module__' : 'tdex.v1.trade_pb2'
  # @@protoc_insertion_point(class_scope:tdex.v1.BalancesReply)
  })
_sym_db.RegisterMessage(BalancesReply)

MarketPriceRequest = _reflection.GeneratedProtocolMessageType('MarketPriceRequest', (_message.Message,), {
  'DESCRIPTOR' : _MARKETPRICEREQUEST,
  '__module__' : 'tdex.v1.trade_pb2'
  # @@protoc_insertion_point(class_scope:tdex.v1.MarketPriceRequest)
  })
_sym_db.RegisterMessage(MarketPriceRequest)

MarketPriceReply = _reflection.GeneratedProtocolMessageType('MarketPriceReply', (_message.Message,), {
  'DESCRIPTOR' : _MARKETPRICEREPLY,
  '__module__' : 'tdex.v1.trade_pb2'
  # @@protoc_insertion_point(class_scope:tdex.v1.MarketPriceReply)
  })
_sym_db.RegisterMessage(MarketPriceReply)

TradeProposeRequest = _reflection.GeneratedProtocolMessageType('TradeProposeRequest', (_message.Message,), {
  'DESCRIPTOR' : _TRADEPROPOSEREQUEST,
  '__module__' : 'tdex.v1.trade_pb2'
  # @@protoc_insertion_point(class_scope:tdex.v1.TradeProposeRequest)
  })
_sym_db.RegisterMessage(TradeProposeRequest)

TradeProposeReply = _reflection.GeneratedProtocolMessageType('TradeProposeReply', (_message.Message,), {
  'DESCRIPTOR' : _TRADEPROPOSEREPLY,
  '__module__' : 'tdex.v1.trade_pb2'
  # @@protoc_insertion_point(class_scope:tdex.v1.TradeProposeReply)
  })
_sym_db.RegisterMessage(TradeProposeReply)

TradeCompleteRequest = _reflection.GeneratedProtocolMessageType('TradeCompleteRequest', (_message.Message,), {
  'DESCRIPTOR' : _TRADECOMPLETEREQUEST,
  '__module__' : 'tdex.v1.trade_pb2'
  # @@protoc_insertion_point(class_scope:tdex.v1.TradeCompleteRequest)
  })
_sym_db.RegisterMessage(TradeCompleteRequest)

TradeCompleteReply = _reflection.GeneratedProtocolMessageType('TradeCompleteReply', (_message.Message,), {
  'DESCRIPTOR' : _TRADECOMPLETEREPLY,
  '__module__' : 'tdex.v1.trade_pb2'
  # @@protoc_insertion_point(class_scope:tdex.v1.TradeCompleteReply)
  })
_sym_db.RegisterMessage(TradeCompleteReply)

ProposeTradeRequest = _reflection.GeneratedProtocolMessageType('ProposeTradeRequest', (_message.Message,), {
  'DESCRIPTOR' : _PROPOSETRADEREQUEST,
  '__module__' : 'tdex.v1.trade_pb2'
  # @@protoc_insertion_point(class_scope:tdex.v1.ProposeTradeRequest)
  })
_sym_db.RegisterMessage(ProposeTradeRequest)

ProposeTradeReply = _reflection.GeneratedProtocolMessageType('ProposeTradeReply', (_message.Message,), {
  'DESCRIPTOR' : _PROPOSETRADEREPLY,
  '__module__' : 'tdex.v1.trade_pb2'
  # @@protoc_insertion_point(class_scope:tdex.v1.ProposeTradeReply)
  })
_sym_db.RegisterMessage(ProposeTradeReply)

CompleteTradeRequest = _reflection.GeneratedProtocolMessageType('CompleteTradeRequest', (_message.Message,), {
  'DESCRIPTOR' : _COMPLETETRADEREQUEST,
  '__module__' : 'tdex.v1.trade_pb2'
  # @@protoc_insertion_point(class_scope:tdex.v1.CompleteTradeRequest)
  })
_sym_db.RegisterMessage(CompleteTradeRequest)

CompleteTradeReply = _reflection.GeneratedProtocolMessageType('CompleteTradeReply', (_message.Message,), {
  'DESCRIPTOR' : _COMPLETETRADEREPLY,
  '__module__' : 'tdex.v1.trade_pb2'
  # @@protoc_insertion_point(class_scope:tdex.v1.CompleteTradeReply)
  })
_sym_db.RegisterMessage(CompleteTradeReply)

_TRADE = DESCRIPTOR.services_by_name['Trade']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\013com.tdex.v1B\nTradeProtoP\001ZKgithub.com/tdex-network/tdex-prototbuf/api-spec/protobuf/gen/tdex/v1;tdexv1\242\002\003TXX\252\002\007Tdex.V1\312\002\007Tdex\\V1\342\002\023Tdex\\V1\\GPBMetadata\352\002\010Tdex::V1'
  _TRADE.methods_by_name['Markets']._options = None
  _TRADE.methods_by_name['Markets']._serialized_options = b'\202\323\344\223\002\023\022\021/v1/trade/markets'
  _TRADE.methods_by_name['Balances']._options = None
  _TRADE.methods_by_name['Balances']._serialized_options = b'\202\323\344\223\002\026:\001*\"\021/v1/trade/balance'
  _TRADE.methods_by_name['MarketPrice']._options = None
  _TRADE.methods_by_name['MarketPrice']._serialized_options = b'\202\323\344\223\002\021\"\017/v1/trade/price'
  _TRADE.methods_by_name['TradePropose']._options = None
  _TRADE.methods_by_name['TradePropose']._serialized_options = b'\202\323\344\223\002\035:\001*\"\030/v1/trade/stream/propose'
  _TRADE.methods_by_name['ProposeTrade']._options = None
  _TRADE.methods_by_name['ProposeTrade']._serialized_options = b'\202\323\344\223\002\034:\001*\"\027/v1/trade/unary/propose'
  _TRADE.methods_by_name['TradeComplete']._options = None
  _TRADE.methods_by_name['TradeComplete']._serialized_options = b'\202\323\344\223\002\036:\001*\"\031/v1/trade/stream/complete'
  _TRADE.methods_by_name['CompleteTrade']._options = None
  _TRADE.methods_by_name['CompleteTrade']._serialized_options = b'\202\323\344\223\002\035:\001*\"\030/v1/trade/unary/complete'
  _TRADETYPE._serialized_start=1636
  _TRADETYPE._serialized_end=1666
  _MARKETSREQUEST._serialized_start=103
  _MARKETSREQUEST._serialized_end=119
  _MARKETSREPLY._serialized_start=121
  _MARKETSREPLY._serialized_end=185
  _BALANCESREQUEST._serialized_start=187
  _BALANCESREQUEST._serialized_end=245
  _BALANCESREPLY._serialized_start=247
  _BALANCESREPLY._serialized_end=315
  _MARKETPRICEREQUEST._serialized_start=318
  _MARKETPRICEREQUEST._serialized_end=465
  _MARKETPRICEREPLY._serialized_start=467
  _MARKETPRICEREPLY._serialized_end=532
  _TRADEPROPOSEREQUEST._serialized_start=535
  _TRADEPROPOSEREQUEST._serialized_end=694
  _TRADEPROPOSEREPLY._serialized_start=697
  _TRADEPROPOSEREPLY._serialized_end=860
  _TRADECOMPLETEREQUEST._serialized_start=863
  _TRADECOMPLETEREQUEST._serialized_end=993
  _TRADECOMPLETEREPLY._serialized_start=995
  _TRADECOMPLETEREPLY._serialized_end=1083
  _PROPOSETRADEREQUEST._serialized_start=1086
  _PROPOSETRADEREQUEST._serialized_end=1245
  _PROPOSETRADEREPLY._serialized_start=1248
  _PROPOSETRADEREPLY._serialized_end=1411
  _COMPLETETRADEREQUEST._serialized_start=1414
  _COMPLETETRADEREQUEST._serialized_end=1544
  _COMPLETETRADEREPLY._serialized_start=1546
  _COMPLETETRADEREPLY._serialized_end=1634
  _TRADE._serialized_start=1669
  _TRADE._serialized_end=2404
# @@protoc_insertion_point(module_scope)
