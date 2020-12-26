import * as grpcWeb from 'grpc-web';

import * as trade_pb from './trade_pb';


export class TradeClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  markets(
    request: trade_pb.MarketsRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: trade_pb.MarketsReply) => void
  ): grpcWeb.ClientReadableStream<trade_pb.MarketsReply>;

  balances(
    request: trade_pb.BalancesRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: trade_pb.BalancesReply) => void
  ): grpcWeb.ClientReadableStream<trade_pb.BalancesReply>;

  marketPrice(
    request: trade_pb.MarketPriceRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: trade_pb.MarketPriceReply) => void
  ): grpcWeb.ClientReadableStream<trade_pb.MarketPriceReply>;

  tradePropose(
    request: trade_pb.TradeProposeRequest,
    metadata?: grpcWeb.Metadata
  ): grpcWeb.ClientReadableStream<trade_pb.TradeProposeReply>;

  tradeComplete(
    request: trade_pb.TradeCompleteRequest,
    metadata?: grpcWeb.Metadata
  ): grpcWeb.ClientReadableStream<trade_pb.TradeCompleteReply>;

}

export class TradePromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  markets(
    request: trade_pb.MarketsRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<trade_pb.MarketsReply>;

  balances(
    request: trade_pb.BalancesRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<trade_pb.BalancesReply>;

  marketPrice(
    request: trade_pb.MarketPriceRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<trade_pb.MarketPriceReply>;

  tradePropose(
    request: trade_pb.TradeProposeRequest,
    metadata?: grpcWeb.Metadata
  ): grpcWeb.ClientReadableStream<trade_pb.TradeProposeReply>;

  tradeComplete(
    request: trade_pb.TradeCompleteRequest,
    metadata?: grpcWeb.Metadata
  ): grpcWeb.ClientReadableStream<trade_pb.TradeCompleteReply>;

}

