import * as grpcWeb from 'grpc-web';

import * as operator_pb from './operator_pb';


export class OperatorClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  depositMarket(
    request: operator_pb.DepositMarketRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: operator_pb.DepositMarketReply) => void
  ): grpcWeb.ClientReadableStream<operator_pb.DepositMarketReply>;

  listDepositMarket(
    request: operator_pb.ListDepositMarketRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: operator_pb.ListDepositMarketReply) => void
  ): grpcWeb.ClientReadableStream<operator_pb.ListDepositMarketReply>;

  depositFeeAccount(
    request: operator_pb.DepositFeeAccountRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: operator_pb.DepositFeeAccountReply) => void
  ): grpcWeb.ClientReadableStream<operator_pb.DepositFeeAccountReply>;

  balanceFeeAccount(
    request: operator_pb.BalanceFeeAccountRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: operator_pb.BalanceFeeAccountReply) => void
  ): grpcWeb.ClientReadableStream<operator_pb.BalanceFeeAccountReply>;

  openMarket(
    request: operator_pb.OpenMarketRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: operator_pb.OpenMarketReply) => void
  ): grpcWeb.ClientReadableStream<operator_pb.OpenMarketReply>;

  closeMarket(
    request: operator_pb.CloseMarketRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: operator_pb.CloseMarketReply) => void
  ): grpcWeb.ClientReadableStream<operator_pb.CloseMarketReply>;

  listMarket(
    request: operator_pb.ListMarketRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: operator_pb.ListMarketReply) => void
  ): grpcWeb.ClientReadableStream<operator_pb.ListMarketReply>;

  updateMarketFee(
    request: operator_pb.UpdateMarketFeeRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: operator_pb.UpdateMarketFeeReply) => void
  ): grpcWeb.ClientReadableStream<operator_pb.UpdateMarketFeeReply>;

  updateMarketPrice(
    request: operator_pb.UpdateMarketPriceRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: operator_pb.UpdateMarketPriceReply) => void
  ): grpcWeb.ClientReadableStream<operator_pb.UpdateMarketPriceReply>;

  updateMarketStrategy(
    request: operator_pb.UpdateMarketStrategyRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: operator_pb.UpdateMarketStrategyReply) => void
  ): grpcWeb.ClientReadableStream<operator_pb.UpdateMarketStrategyReply>;

  withdrawMarket(
    request: operator_pb.WithdrawMarketRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: operator_pb.WithdrawMarketReply) => void
  ): grpcWeb.ClientReadableStream<operator_pb.WithdrawMarketReply>;

  listSwaps(
    request: operator_pb.ListSwapsRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: operator_pb.ListSwapsReply) => void
  ): grpcWeb.ClientReadableStream<operator_pb.ListSwapsReply>;

  reportMarketFee(
    request: operator_pb.ReportMarketFeeRequest,
    metadata: grpcWeb.Metadata | undefined,
    callback: (err: grpcWeb.Error,
               response: operator_pb.ReportMarketFeeReply) => void
  ): grpcWeb.ClientReadableStream<operator_pb.ReportMarketFeeReply>;

}

export class OperatorPromiseClient {
  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; });

  depositMarket(
    request: operator_pb.DepositMarketRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<operator_pb.DepositMarketReply>;

  listDepositMarket(
    request: operator_pb.ListDepositMarketRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<operator_pb.ListDepositMarketReply>;

  depositFeeAccount(
    request: operator_pb.DepositFeeAccountRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<operator_pb.DepositFeeAccountReply>;

  balanceFeeAccount(
    request: operator_pb.BalanceFeeAccountRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<operator_pb.BalanceFeeAccountReply>;

  openMarket(
    request: operator_pb.OpenMarketRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<operator_pb.OpenMarketReply>;

  closeMarket(
    request: operator_pb.CloseMarketRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<operator_pb.CloseMarketReply>;

  listMarket(
    request: operator_pb.ListMarketRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<operator_pb.ListMarketReply>;

  updateMarketFee(
    request: operator_pb.UpdateMarketFeeRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<operator_pb.UpdateMarketFeeReply>;

  updateMarketPrice(
    request: operator_pb.UpdateMarketPriceRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<operator_pb.UpdateMarketPriceReply>;

  updateMarketStrategy(
    request: operator_pb.UpdateMarketStrategyRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<operator_pb.UpdateMarketStrategyReply>;

  withdrawMarket(
    request: operator_pb.WithdrawMarketRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<operator_pb.WithdrawMarketReply>;

  listSwaps(
    request: operator_pb.ListSwapsRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<operator_pb.ListSwapsReply>;

  reportMarketFee(
    request: operator_pb.ReportMarketFeeRequest,
    metadata?: grpcWeb.Metadata
  ): Promise<operator_pb.ReportMarketFeeReply>;

}

