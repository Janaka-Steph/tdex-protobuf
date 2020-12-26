/**
 * @fileoverview gRPC-Web generated client stub for 
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!


/* eslint-disable */
// @ts-nocheck



const grpc = {};
grpc.web = require('grpc-web');


var swap_pb = require('./swap_pb.js')

var types_pb = require('./types_pb.js')
const proto = require('./trade_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.TradeClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

};


/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.TradePromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.MarketsRequest,
 *   !proto.MarketsReply>}
 */
const methodDescriptor_Trade_Markets = new grpc.web.MethodDescriptor(
  '/Trade/Markets',
  grpc.web.MethodType.UNARY,
  proto.MarketsRequest,
  proto.MarketsReply,
  /**
   * @param {!proto.MarketsRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.MarketsReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.MarketsRequest,
 *   !proto.MarketsReply>}
 */
const methodInfo_Trade_Markets = new grpc.web.AbstractClientBase.MethodInfo(
  proto.MarketsReply,
  /**
   * @param {!proto.MarketsRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.MarketsReply.deserializeBinary
);


/**
 * @param {!proto.MarketsRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.MarketsReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.MarketsReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.TradeClient.prototype.markets =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Trade/Markets',
      request,
      metadata || {},
      methodDescriptor_Trade_Markets,
      callback);
};


/**
 * @param {!proto.MarketsRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.MarketsReply>}
 *     Promise that resolves to the response
 */
proto.TradePromiseClient.prototype.markets =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Trade/Markets',
      request,
      metadata || {},
      methodDescriptor_Trade_Markets);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.BalancesRequest,
 *   !proto.BalancesReply>}
 */
const methodDescriptor_Trade_Balances = new grpc.web.MethodDescriptor(
  '/Trade/Balances',
  grpc.web.MethodType.UNARY,
  proto.BalancesRequest,
  proto.BalancesReply,
  /**
   * @param {!proto.BalancesRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.BalancesReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.BalancesRequest,
 *   !proto.BalancesReply>}
 */
const methodInfo_Trade_Balances = new grpc.web.AbstractClientBase.MethodInfo(
  proto.BalancesReply,
  /**
   * @param {!proto.BalancesRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.BalancesReply.deserializeBinary
);


/**
 * @param {!proto.BalancesRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.BalancesReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.BalancesReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.TradeClient.prototype.balances =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Trade/Balances',
      request,
      metadata || {},
      methodDescriptor_Trade_Balances,
      callback);
};


/**
 * @param {!proto.BalancesRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.BalancesReply>}
 *     Promise that resolves to the response
 */
proto.TradePromiseClient.prototype.balances =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Trade/Balances',
      request,
      metadata || {},
      methodDescriptor_Trade_Balances);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.MarketPriceRequest,
 *   !proto.MarketPriceReply>}
 */
const methodDescriptor_Trade_MarketPrice = new grpc.web.MethodDescriptor(
  '/Trade/MarketPrice',
  grpc.web.MethodType.UNARY,
  proto.MarketPriceRequest,
  proto.MarketPriceReply,
  /**
   * @param {!proto.MarketPriceRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.MarketPriceReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.MarketPriceRequest,
 *   !proto.MarketPriceReply>}
 */
const methodInfo_Trade_MarketPrice = new grpc.web.AbstractClientBase.MethodInfo(
  proto.MarketPriceReply,
  /**
   * @param {!proto.MarketPriceRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.MarketPriceReply.deserializeBinary
);


/**
 * @param {!proto.MarketPriceRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.MarketPriceReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.MarketPriceReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.TradeClient.prototype.marketPrice =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Trade/MarketPrice',
      request,
      metadata || {},
      methodDescriptor_Trade_MarketPrice,
      callback);
};


/**
 * @param {!proto.MarketPriceRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.MarketPriceReply>}
 *     Promise that resolves to the response
 */
proto.TradePromiseClient.prototype.marketPrice =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Trade/MarketPrice',
      request,
      metadata || {},
      methodDescriptor_Trade_MarketPrice);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.TradeProposeRequest,
 *   !proto.TradeProposeReply>}
 */
const methodDescriptor_Trade_TradePropose = new grpc.web.MethodDescriptor(
  '/Trade/TradePropose',
  grpc.web.MethodType.SERVER_STREAMING,
  proto.TradeProposeRequest,
  proto.TradeProposeReply,
  /**
   * @param {!proto.TradeProposeRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.TradeProposeReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.TradeProposeRequest,
 *   !proto.TradeProposeReply>}
 */
const methodInfo_Trade_TradePropose = new grpc.web.AbstractClientBase.MethodInfo(
  proto.TradeProposeReply,
  /**
   * @param {!proto.TradeProposeRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.TradeProposeReply.deserializeBinary
);


/**
 * @param {!proto.TradeProposeRequest} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.TradeProposeReply>}
 *     The XHR Node Readable Stream
 */
proto.TradeClient.prototype.tradePropose =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/Trade/TradePropose',
      request,
      metadata || {},
      methodDescriptor_Trade_TradePropose);
};


/**
 * @param {!proto.TradeProposeRequest} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.TradeProposeReply>}
 *     The XHR Node Readable Stream
 */
proto.TradePromiseClient.prototype.tradePropose =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/Trade/TradePropose',
      request,
      metadata || {},
      methodDescriptor_Trade_TradePropose);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.TradeCompleteRequest,
 *   !proto.TradeCompleteReply>}
 */
const methodDescriptor_Trade_TradeComplete = new grpc.web.MethodDescriptor(
  '/Trade/TradeComplete',
  grpc.web.MethodType.SERVER_STREAMING,
  proto.TradeCompleteRequest,
  proto.TradeCompleteReply,
  /**
   * @param {!proto.TradeCompleteRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.TradeCompleteReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.TradeCompleteRequest,
 *   !proto.TradeCompleteReply>}
 */
const methodInfo_Trade_TradeComplete = new grpc.web.AbstractClientBase.MethodInfo(
  proto.TradeCompleteReply,
  /**
   * @param {!proto.TradeCompleteRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.TradeCompleteReply.deserializeBinary
);


/**
 * @param {!proto.TradeCompleteRequest} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.TradeCompleteReply>}
 *     The XHR Node Readable Stream
 */
proto.TradeClient.prototype.tradeComplete =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/Trade/TradeComplete',
      request,
      metadata || {},
      methodDescriptor_Trade_TradeComplete);
};


/**
 * @param {!proto.TradeCompleteRequest} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.TradeCompleteReply>}
 *     The XHR Node Readable Stream
 */
proto.TradePromiseClient.prototype.tradeComplete =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/Trade/TradeComplete',
      request,
      metadata || {},
      methodDescriptor_Trade_TradeComplete);
};


module.exports = proto;

