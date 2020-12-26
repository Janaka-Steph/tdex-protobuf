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


var types_pb = require('./types_pb.js')
const proto = require('./operator_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.OperatorClient =
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
proto.OperatorPromiseClient =
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
 *   !proto.DepositMarketRequest,
 *   !proto.DepositMarketReply>}
 */
const methodDescriptor_Operator_DepositMarket = new grpc.web.MethodDescriptor(
  '/Operator/DepositMarket',
  grpc.web.MethodType.UNARY,
  proto.DepositMarketRequest,
  proto.DepositMarketReply,
  /**
   * @param {!proto.DepositMarketRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.DepositMarketReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.DepositMarketRequest,
 *   !proto.DepositMarketReply>}
 */
const methodInfo_Operator_DepositMarket = new grpc.web.AbstractClientBase.MethodInfo(
  proto.DepositMarketReply,
  /**
   * @param {!proto.DepositMarketRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.DepositMarketReply.deserializeBinary
);


/**
 * @param {!proto.DepositMarketRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.DepositMarketReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.DepositMarketReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.OperatorClient.prototype.depositMarket =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Operator/DepositMarket',
      request,
      metadata || {},
      methodDescriptor_Operator_DepositMarket,
      callback);
};


/**
 * @param {!proto.DepositMarketRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.DepositMarketReply>}
 *     Promise that resolves to the response
 */
proto.OperatorPromiseClient.prototype.depositMarket =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Operator/DepositMarket',
      request,
      metadata || {},
      methodDescriptor_Operator_DepositMarket);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ListDepositMarketRequest,
 *   !proto.ListDepositMarketReply>}
 */
const methodDescriptor_Operator_ListDepositMarket = new grpc.web.MethodDescriptor(
  '/Operator/ListDepositMarket',
  grpc.web.MethodType.UNARY,
  proto.ListDepositMarketRequest,
  proto.ListDepositMarketReply,
  /**
   * @param {!proto.ListDepositMarketRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ListDepositMarketReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ListDepositMarketRequest,
 *   !proto.ListDepositMarketReply>}
 */
const methodInfo_Operator_ListDepositMarket = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ListDepositMarketReply,
  /**
   * @param {!proto.ListDepositMarketRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ListDepositMarketReply.deserializeBinary
);


/**
 * @param {!proto.ListDepositMarketRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ListDepositMarketReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ListDepositMarketReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.OperatorClient.prototype.listDepositMarket =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Operator/ListDepositMarket',
      request,
      metadata || {},
      methodDescriptor_Operator_ListDepositMarket,
      callback);
};


/**
 * @param {!proto.ListDepositMarketRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ListDepositMarketReply>}
 *     Promise that resolves to the response
 */
proto.OperatorPromiseClient.prototype.listDepositMarket =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Operator/ListDepositMarket',
      request,
      metadata || {},
      methodDescriptor_Operator_ListDepositMarket);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.DepositFeeAccountRequest,
 *   !proto.DepositFeeAccountReply>}
 */
const methodDescriptor_Operator_DepositFeeAccount = new grpc.web.MethodDescriptor(
  '/Operator/DepositFeeAccount',
  grpc.web.MethodType.UNARY,
  proto.DepositFeeAccountRequest,
  proto.DepositFeeAccountReply,
  /**
   * @param {!proto.DepositFeeAccountRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.DepositFeeAccountReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.DepositFeeAccountRequest,
 *   !proto.DepositFeeAccountReply>}
 */
const methodInfo_Operator_DepositFeeAccount = new grpc.web.AbstractClientBase.MethodInfo(
  proto.DepositFeeAccountReply,
  /**
   * @param {!proto.DepositFeeAccountRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.DepositFeeAccountReply.deserializeBinary
);


/**
 * @param {!proto.DepositFeeAccountRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.DepositFeeAccountReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.DepositFeeAccountReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.OperatorClient.prototype.depositFeeAccount =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Operator/DepositFeeAccount',
      request,
      metadata || {},
      methodDescriptor_Operator_DepositFeeAccount,
      callback);
};


/**
 * @param {!proto.DepositFeeAccountRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.DepositFeeAccountReply>}
 *     Promise that resolves to the response
 */
proto.OperatorPromiseClient.prototype.depositFeeAccount =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Operator/DepositFeeAccount',
      request,
      metadata || {},
      methodDescriptor_Operator_DepositFeeAccount);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.BalanceFeeAccountRequest,
 *   !proto.BalanceFeeAccountReply>}
 */
const methodDescriptor_Operator_BalanceFeeAccount = new grpc.web.MethodDescriptor(
  '/Operator/BalanceFeeAccount',
  grpc.web.MethodType.UNARY,
  proto.BalanceFeeAccountRequest,
  proto.BalanceFeeAccountReply,
  /**
   * @param {!proto.BalanceFeeAccountRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.BalanceFeeAccountReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.BalanceFeeAccountRequest,
 *   !proto.BalanceFeeAccountReply>}
 */
const methodInfo_Operator_BalanceFeeAccount = new grpc.web.AbstractClientBase.MethodInfo(
  proto.BalanceFeeAccountReply,
  /**
   * @param {!proto.BalanceFeeAccountRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.BalanceFeeAccountReply.deserializeBinary
);


/**
 * @param {!proto.BalanceFeeAccountRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.BalanceFeeAccountReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.BalanceFeeAccountReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.OperatorClient.prototype.balanceFeeAccount =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Operator/BalanceFeeAccount',
      request,
      metadata || {},
      methodDescriptor_Operator_BalanceFeeAccount,
      callback);
};


/**
 * @param {!proto.BalanceFeeAccountRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.BalanceFeeAccountReply>}
 *     Promise that resolves to the response
 */
proto.OperatorPromiseClient.prototype.balanceFeeAccount =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Operator/BalanceFeeAccount',
      request,
      metadata || {},
      methodDescriptor_Operator_BalanceFeeAccount);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.OpenMarketRequest,
 *   !proto.OpenMarketReply>}
 */
const methodDescriptor_Operator_OpenMarket = new grpc.web.MethodDescriptor(
  '/Operator/OpenMarket',
  grpc.web.MethodType.UNARY,
  proto.OpenMarketRequest,
  proto.OpenMarketReply,
  /**
   * @param {!proto.OpenMarketRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.OpenMarketReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.OpenMarketRequest,
 *   !proto.OpenMarketReply>}
 */
const methodInfo_Operator_OpenMarket = new grpc.web.AbstractClientBase.MethodInfo(
  proto.OpenMarketReply,
  /**
   * @param {!proto.OpenMarketRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.OpenMarketReply.deserializeBinary
);


/**
 * @param {!proto.OpenMarketRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.OpenMarketReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.OpenMarketReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.OperatorClient.prototype.openMarket =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Operator/OpenMarket',
      request,
      metadata || {},
      methodDescriptor_Operator_OpenMarket,
      callback);
};


/**
 * @param {!proto.OpenMarketRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.OpenMarketReply>}
 *     Promise that resolves to the response
 */
proto.OperatorPromiseClient.prototype.openMarket =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Operator/OpenMarket',
      request,
      metadata || {},
      methodDescriptor_Operator_OpenMarket);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.CloseMarketRequest,
 *   !proto.CloseMarketReply>}
 */
const methodDescriptor_Operator_CloseMarket = new grpc.web.MethodDescriptor(
  '/Operator/CloseMarket',
  grpc.web.MethodType.UNARY,
  proto.CloseMarketRequest,
  proto.CloseMarketReply,
  /**
   * @param {!proto.CloseMarketRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.CloseMarketReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.CloseMarketRequest,
 *   !proto.CloseMarketReply>}
 */
const methodInfo_Operator_CloseMarket = new grpc.web.AbstractClientBase.MethodInfo(
  proto.CloseMarketReply,
  /**
   * @param {!proto.CloseMarketRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.CloseMarketReply.deserializeBinary
);


/**
 * @param {!proto.CloseMarketRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.CloseMarketReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.CloseMarketReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.OperatorClient.prototype.closeMarket =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Operator/CloseMarket',
      request,
      metadata || {},
      methodDescriptor_Operator_CloseMarket,
      callback);
};


/**
 * @param {!proto.CloseMarketRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.CloseMarketReply>}
 *     Promise that resolves to the response
 */
proto.OperatorPromiseClient.prototype.closeMarket =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Operator/CloseMarket',
      request,
      metadata || {},
      methodDescriptor_Operator_CloseMarket);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ListMarketRequest,
 *   !proto.ListMarketReply>}
 */
const methodDescriptor_Operator_ListMarket = new grpc.web.MethodDescriptor(
  '/Operator/ListMarket',
  grpc.web.MethodType.UNARY,
  proto.ListMarketRequest,
  proto.ListMarketReply,
  /**
   * @param {!proto.ListMarketRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ListMarketReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ListMarketRequest,
 *   !proto.ListMarketReply>}
 */
const methodInfo_Operator_ListMarket = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ListMarketReply,
  /**
   * @param {!proto.ListMarketRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ListMarketReply.deserializeBinary
);


/**
 * @param {!proto.ListMarketRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ListMarketReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ListMarketReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.OperatorClient.prototype.listMarket =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Operator/ListMarket',
      request,
      metadata || {},
      methodDescriptor_Operator_ListMarket,
      callback);
};


/**
 * @param {!proto.ListMarketRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ListMarketReply>}
 *     Promise that resolves to the response
 */
proto.OperatorPromiseClient.prototype.listMarket =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Operator/ListMarket',
      request,
      metadata || {},
      methodDescriptor_Operator_ListMarket);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.UpdateMarketFeeRequest,
 *   !proto.UpdateMarketFeeReply>}
 */
const methodDescriptor_Operator_UpdateMarketFee = new grpc.web.MethodDescriptor(
  '/Operator/UpdateMarketFee',
  grpc.web.MethodType.UNARY,
  proto.UpdateMarketFeeRequest,
  proto.UpdateMarketFeeReply,
  /**
   * @param {!proto.UpdateMarketFeeRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.UpdateMarketFeeReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.UpdateMarketFeeRequest,
 *   !proto.UpdateMarketFeeReply>}
 */
const methodInfo_Operator_UpdateMarketFee = new grpc.web.AbstractClientBase.MethodInfo(
  proto.UpdateMarketFeeReply,
  /**
   * @param {!proto.UpdateMarketFeeRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.UpdateMarketFeeReply.deserializeBinary
);


/**
 * @param {!proto.UpdateMarketFeeRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.UpdateMarketFeeReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.UpdateMarketFeeReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.OperatorClient.prototype.updateMarketFee =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Operator/UpdateMarketFee',
      request,
      metadata || {},
      methodDescriptor_Operator_UpdateMarketFee,
      callback);
};


/**
 * @param {!proto.UpdateMarketFeeRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.UpdateMarketFeeReply>}
 *     Promise that resolves to the response
 */
proto.OperatorPromiseClient.prototype.updateMarketFee =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Operator/UpdateMarketFee',
      request,
      metadata || {},
      methodDescriptor_Operator_UpdateMarketFee);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.UpdateMarketPriceRequest,
 *   !proto.UpdateMarketPriceReply>}
 */
const methodDescriptor_Operator_UpdateMarketPrice = new grpc.web.MethodDescriptor(
  '/Operator/UpdateMarketPrice',
  grpc.web.MethodType.UNARY,
  proto.UpdateMarketPriceRequest,
  proto.UpdateMarketPriceReply,
  /**
   * @param {!proto.UpdateMarketPriceRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.UpdateMarketPriceReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.UpdateMarketPriceRequest,
 *   !proto.UpdateMarketPriceReply>}
 */
const methodInfo_Operator_UpdateMarketPrice = new grpc.web.AbstractClientBase.MethodInfo(
  proto.UpdateMarketPriceReply,
  /**
   * @param {!proto.UpdateMarketPriceRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.UpdateMarketPriceReply.deserializeBinary
);


/**
 * @param {!proto.UpdateMarketPriceRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.UpdateMarketPriceReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.UpdateMarketPriceReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.OperatorClient.prototype.updateMarketPrice =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Operator/UpdateMarketPrice',
      request,
      metadata || {},
      methodDescriptor_Operator_UpdateMarketPrice,
      callback);
};


/**
 * @param {!proto.UpdateMarketPriceRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.UpdateMarketPriceReply>}
 *     Promise that resolves to the response
 */
proto.OperatorPromiseClient.prototype.updateMarketPrice =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Operator/UpdateMarketPrice',
      request,
      metadata || {},
      methodDescriptor_Operator_UpdateMarketPrice);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.UpdateMarketStrategyRequest,
 *   !proto.UpdateMarketStrategyReply>}
 */
const methodDescriptor_Operator_UpdateMarketStrategy = new grpc.web.MethodDescriptor(
  '/Operator/UpdateMarketStrategy',
  grpc.web.MethodType.UNARY,
  proto.UpdateMarketStrategyRequest,
  proto.UpdateMarketStrategyReply,
  /**
   * @param {!proto.UpdateMarketStrategyRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.UpdateMarketStrategyReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.UpdateMarketStrategyRequest,
 *   !proto.UpdateMarketStrategyReply>}
 */
const methodInfo_Operator_UpdateMarketStrategy = new grpc.web.AbstractClientBase.MethodInfo(
  proto.UpdateMarketStrategyReply,
  /**
   * @param {!proto.UpdateMarketStrategyRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.UpdateMarketStrategyReply.deserializeBinary
);


/**
 * @param {!proto.UpdateMarketStrategyRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.UpdateMarketStrategyReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.UpdateMarketStrategyReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.OperatorClient.prototype.updateMarketStrategy =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Operator/UpdateMarketStrategy',
      request,
      metadata || {},
      methodDescriptor_Operator_UpdateMarketStrategy,
      callback);
};


/**
 * @param {!proto.UpdateMarketStrategyRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.UpdateMarketStrategyReply>}
 *     Promise that resolves to the response
 */
proto.OperatorPromiseClient.prototype.updateMarketStrategy =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Operator/UpdateMarketStrategy',
      request,
      metadata || {},
      methodDescriptor_Operator_UpdateMarketStrategy);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.WithdrawMarketRequest,
 *   !proto.WithdrawMarketReply>}
 */
const methodDescriptor_Operator_WithdrawMarket = new grpc.web.MethodDescriptor(
  '/Operator/WithdrawMarket',
  grpc.web.MethodType.UNARY,
  proto.WithdrawMarketRequest,
  proto.WithdrawMarketReply,
  /**
   * @param {!proto.WithdrawMarketRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.WithdrawMarketReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.WithdrawMarketRequest,
 *   !proto.WithdrawMarketReply>}
 */
const methodInfo_Operator_WithdrawMarket = new grpc.web.AbstractClientBase.MethodInfo(
  proto.WithdrawMarketReply,
  /**
   * @param {!proto.WithdrawMarketRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.WithdrawMarketReply.deserializeBinary
);


/**
 * @param {!proto.WithdrawMarketRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.WithdrawMarketReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.WithdrawMarketReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.OperatorClient.prototype.withdrawMarket =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Operator/WithdrawMarket',
      request,
      metadata || {},
      methodDescriptor_Operator_WithdrawMarket,
      callback);
};


/**
 * @param {!proto.WithdrawMarketRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.WithdrawMarketReply>}
 *     Promise that resolves to the response
 */
proto.OperatorPromiseClient.prototype.withdrawMarket =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Operator/WithdrawMarket',
      request,
      metadata || {},
      methodDescriptor_Operator_WithdrawMarket);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ListSwapsRequest,
 *   !proto.ListSwapsReply>}
 */
const methodDescriptor_Operator_ListSwaps = new grpc.web.MethodDescriptor(
  '/Operator/ListSwaps',
  grpc.web.MethodType.UNARY,
  proto.ListSwapsRequest,
  proto.ListSwapsReply,
  /**
   * @param {!proto.ListSwapsRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ListSwapsReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ListSwapsRequest,
 *   !proto.ListSwapsReply>}
 */
const methodInfo_Operator_ListSwaps = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ListSwapsReply,
  /**
   * @param {!proto.ListSwapsRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ListSwapsReply.deserializeBinary
);


/**
 * @param {!proto.ListSwapsRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ListSwapsReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ListSwapsReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.OperatorClient.prototype.listSwaps =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Operator/ListSwaps',
      request,
      metadata || {},
      methodDescriptor_Operator_ListSwaps,
      callback);
};


/**
 * @param {!proto.ListSwapsRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ListSwapsReply>}
 *     Promise that resolves to the response
 */
proto.OperatorPromiseClient.prototype.listSwaps =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Operator/ListSwaps',
      request,
      metadata || {},
      methodDescriptor_Operator_ListSwaps);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ReportMarketFeeRequest,
 *   !proto.ReportMarketFeeReply>}
 */
const methodDescriptor_Operator_ReportMarketFee = new grpc.web.MethodDescriptor(
  '/Operator/ReportMarketFee',
  grpc.web.MethodType.UNARY,
  proto.ReportMarketFeeRequest,
  proto.ReportMarketFeeReply,
  /**
   * @param {!proto.ReportMarketFeeRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ReportMarketFeeReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ReportMarketFeeRequest,
 *   !proto.ReportMarketFeeReply>}
 */
const methodInfo_Operator_ReportMarketFee = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ReportMarketFeeReply,
  /**
   * @param {!proto.ReportMarketFeeRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ReportMarketFeeReply.deserializeBinary
);


/**
 * @param {!proto.ReportMarketFeeRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ReportMarketFeeReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ReportMarketFeeReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.OperatorClient.prototype.reportMarketFee =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Operator/ReportMarketFee',
      request,
      metadata || {},
      methodDescriptor_Operator_ReportMarketFee,
      callback);
};


/**
 * @param {!proto.ReportMarketFeeRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ReportMarketFeeReply>}
 *     Promise that resolves to the response
 */
proto.OperatorPromiseClient.prototype.reportMarketFee =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Operator/ReportMarketFee',
      request,
      metadata || {},
      methodDescriptor_Operator_ReportMarketFee);
};


module.exports = proto;

