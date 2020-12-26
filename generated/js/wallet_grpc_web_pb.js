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

const proto = require('./wallet_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.WalletClient =
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
proto.WalletPromiseClient =
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
 *   !proto.GenSeedRequest,
 *   !proto.GenSeedReply>}
 */
const methodDescriptor_Wallet_GenSeed = new grpc.web.MethodDescriptor(
  '/Wallet/GenSeed',
  grpc.web.MethodType.UNARY,
  proto.GenSeedRequest,
  proto.GenSeedReply,
  /**
   * @param {!proto.GenSeedRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.GenSeedReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.GenSeedRequest,
 *   !proto.GenSeedReply>}
 */
const methodInfo_Wallet_GenSeed = new grpc.web.AbstractClientBase.MethodInfo(
  proto.GenSeedReply,
  /**
   * @param {!proto.GenSeedRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.GenSeedReply.deserializeBinary
);


/**
 * @param {!proto.GenSeedRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.GenSeedReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.GenSeedReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.WalletClient.prototype.genSeed =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Wallet/GenSeed',
      request,
      metadata || {},
      methodDescriptor_Wallet_GenSeed,
      callback);
};


/**
 * @param {!proto.GenSeedRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.GenSeedReply>}
 *     Promise that resolves to the response
 */
proto.WalletPromiseClient.prototype.genSeed =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Wallet/GenSeed',
      request,
      metadata || {},
      methodDescriptor_Wallet_GenSeed);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.InitWalletRequest,
 *   !proto.InitWalletReply>}
 */
const methodDescriptor_Wallet_InitWallet = new grpc.web.MethodDescriptor(
  '/Wallet/InitWallet',
  grpc.web.MethodType.SERVER_STREAMING,
  proto.InitWalletRequest,
  proto.InitWalletReply,
  /**
   * @param {!proto.InitWalletRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.InitWalletReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.InitWalletRequest,
 *   !proto.InitWalletReply>}
 */
const methodInfo_Wallet_InitWallet = new grpc.web.AbstractClientBase.MethodInfo(
  proto.InitWalletReply,
  /**
   * @param {!proto.InitWalletRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.InitWalletReply.deserializeBinary
);


/**
 * @param {!proto.InitWalletRequest} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.InitWalletReply>}
 *     The XHR Node Readable Stream
 */
proto.WalletClient.prototype.initWallet =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/Wallet/InitWallet',
      request,
      metadata || {},
      methodDescriptor_Wallet_InitWallet);
};


/**
 * @param {!proto.InitWalletRequest} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.InitWalletReply>}
 *     The XHR Node Readable Stream
 */
proto.WalletPromiseClient.prototype.initWallet =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/Wallet/InitWallet',
      request,
      metadata || {},
      methodDescriptor_Wallet_InitWallet);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.UnlockWalletRequest,
 *   !proto.UnlockWalletReply>}
 */
const methodDescriptor_Wallet_UnlockWallet = new grpc.web.MethodDescriptor(
  '/Wallet/UnlockWallet',
  grpc.web.MethodType.UNARY,
  proto.UnlockWalletRequest,
  proto.UnlockWalletReply,
  /**
   * @param {!proto.UnlockWalletRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.UnlockWalletReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.UnlockWalletRequest,
 *   !proto.UnlockWalletReply>}
 */
const methodInfo_Wallet_UnlockWallet = new grpc.web.AbstractClientBase.MethodInfo(
  proto.UnlockWalletReply,
  /**
   * @param {!proto.UnlockWalletRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.UnlockWalletReply.deserializeBinary
);


/**
 * @param {!proto.UnlockWalletRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.UnlockWalletReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.UnlockWalletReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.WalletClient.prototype.unlockWallet =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Wallet/UnlockWallet',
      request,
      metadata || {},
      methodDescriptor_Wallet_UnlockWallet,
      callback);
};


/**
 * @param {!proto.UnlockWalletRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.UnlockWalletReply>}
 *     Promise that resolves to the response
 */
proto.WalletPromiseClient.prototype.unlockWallet =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Wallet/UnlockWallet',
      request,
      metadata || {},
      methodDescriptor_Wallet_UnlockWallet);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.ChangePasswordRequest,
 *   !proto.ChangePasswordReply>}
 */
const methodDescriptor_Wallet_ChangePassword = new grpc.web.MethodDescriptor(
  '/Wallet/ChangePassword',
  grpc.web.MethodType.UNARY,
  proto.ChangePasswordRequest,
  proto.ChangePasswordReply,
  /**
   * @param {!proto.ChangePasswordRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ChangePasswordReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.ChangePasswordRequest,
 *   !proto.ChangePasswordReply>}
 */
const methodInfo_Wallet_ChangePassword = new grpc.web.AbstractClientBase.MethodInfo(
  proto.ChangePasswordReply,
  /**
   * @param {!proto.ChangePasswordRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.ChangePasswordReply.deserializeBinary
);


/**
 * @param {!proto.ChangePasswordRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.ChangePasswordReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.ChangePasswordReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.WalletClient.prototype.changePassword =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Wallet/ChangePassword',
      request,
      metadata || {},
      methodDescriptor_Wallet_ChangePassword,
      callback);
};


/**
 * @param {!proto.ChangePasswordRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.ChangePasswordReply>}
 *     Promise that resolves to the response
 */
proto.WalletPromiseClient.prototype.changePassword =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Wallet/ChangePassword',
      request,
      metadata || {},
      methodDescriptor_Wallet_ChangePassword);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.WalletAddressRequest,
 *   !proto.WalletAddressReply>}
 */
const methodDescriptor_Wallet_WalletAddress = new grpc.web.MethodDescriptor(
  '/Wallet/WalletAddress',
  grpc.web.MethodType.UNARY,
  proto.WalletAddressRequest,
  proto.WalletAddressReply,
  /**
   * @param {!proto.WalletAddressRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.WalletAddressReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.WalletAddressRequest,
 *   !proto.WalletAddressReply>}
 */
const methodInfo_Wallet_WalletAddress = new grpc.web.AbstractClientBase.MethodInfo(
  proto.WalletAddressReply,
  /**
   * @param {!proto.WalletAddressRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.WalletAddressReply.deserializeBinary
);


/**
 * @param {!proto.WalletAddressRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.WalletAddressReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.WalletAddressReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.WalletClient.prototype.walletAddress =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Wallet/WalletAddress',
      request,
      metadata || {},
      methodDescriptor_Wallet_WalletAddress,
      callback);
};


/**
 * @param {!proto.WalletAddressRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.WalletAddressReply>}
 *     Promise that resolves to the response
 */
proto.WalletPromiseClient.prototype.walletAddress =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Wallet/WalletAddress',
      request,
      metadata || {},
      methodDescriptor_Wallet_WalletAddress);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.WalletBalanceRequest,
 *   !proto.WalletBalanceReply>}
 */
const methodDescriptor_Wallet_WalletBalance = new grpc.web.MethodDescriptor(
  '/Wallet/WalletBalance',
  grpc.web.MethodType.UNARY,
  proto.WalletBalanceRequest,
  proto.WalletBalanceReply,
  /**
   * @param {!proto.WalletBalanceRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.WalletBalanceReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.WalletBalanceRequest,
 *   !proto.WalletBalanceReply>}
 */
const methodInfo_Wallet_WalletBalance = new grpc.web.AbstractClientBase.MethodInfo(
  proto.WalletBalanceReply,
  /**
   * @param {!proto.WalletBalanceRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.WalletBalanceReply.deserializeBinary
);


/**
 * @param {!proto.WalletBalanceRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.WalletBalanceReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.WalletBalanceReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.WalletClient.prototype.walletBalance =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Wallet/WalletBalance',
      request,
      metadata || {},
      methodDescriptor_Wallet_WalletBalance,
      callback);
};


/**
 * @param {!proto.WalletBalanceRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.WalletBalanceReply>}
 *     Promise that resolves to the response
 */
proto.WalletPromiseClient.prototype.walletBalance =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Wallet/WalletBalance',
      request,
      metadata || {},
      methodDescriptor_Wallet_WalletBalance);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.SendToManyRequest,
 *   !proto.SendToManyReply>}
 */
const methodDescriptor_Wallet_SendToMany = new grpc.web.MethodDescriptor(
  '/Wallet/SendToMany',
  grpc.web.MethodType.UNARY,
  proto.SendToManyRequest,
  proto.SendToManyReply,
  /**
   * @param {!proto.SendToManyRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.SendToManyReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.SendToManyRequest,
 *   !proto.SendToManyReply>}
 */
const methodInfo_Wallet_SendToMany = new grpc.web.AbstractClientBase.MethodInfo(
  proto.SendToManyReply,
  /**
   * @param {!proto.SendToManyRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.SendToManyReply.deserializeBinary
);


/**
 * @param {!proto.SendToManyRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.SendToManyReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.SendToManyReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.WalletClient.prototype.sendToMany =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/Wallet/SendToMany',
      request,
      metadata || {},
      methodDescriptor_Wallet_SendToMany,
      callback);
};


/**
 * @param {!proto.SendToManyRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.SendToManyReply>}
 *     Promise that resolves to the response
 */
proto.WalletPromiseClient.prototype.sendToMany =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/Wallet/SendToMany',
      request,
      metadata || {},
      methodDescriptor_Wallet_SendToMany);
};


module.exports = proto;

