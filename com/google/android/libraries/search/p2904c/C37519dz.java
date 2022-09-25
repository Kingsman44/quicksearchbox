package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.dz */
/* compiled from: PG */
public enum C37519dz implements C62957cd {
    UNKNOWN_OPENING_FAILURE(0),
    FAILED_TO_OPEN_AUDIO_SOURCE(100),
    FAILED_OPENING_DUE_TO_INACTIVE_CLIENT(101),
    FAILED_OPENING_MICROPHONE_PERMISSION_DENIED(102),
    FAILED_OPENING_HOTWORD_DUE_TO_AUDIO_REQUEST_CLIENT_LISTENING(103),
    FAILED_TO_OPEN_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING(104),
    FAILED_OPENING_NOT_ALLOWED_HOTWORD_SOURCE_USAGE(105),
    FAILED_OPENING_DUE_TO_INACTIVE_SESSION(106),
    FAILED_OPENING_DUE_TO_INACTIVE_AUDIO_ROUTE_SESSION(107),
    FAILED_OPENING_HOTWORD_INCORRECT_AUDIO_SOURCE_TYPE(108),
    FAILED_OPENING_OP_NOT_ALLOWED(109),
    FAILED_OPENING_NOT_ALLOWED_ZERO_MIC_LATENCY_USAGE(110),
    FAILED_OPENING_PERMISSION_CAPTURE_AUDIO_HOTWORD_DENIED(111),
    FAILED_OPENING_MIC_OCCUPIED(113),
    FAILED_OPENING_ERROR_INIT(200),
    FAILED_OPENING_ERROR_MODE_IN_CALL(201),
    FAILED_OPENING_ERROR_START_RECORDING(202),
    FAILED_OPENING_FILE_NOT_FOUND(203),
    FAILED_OPENING_FILE_SECURITY(204),
    FAILED_OPENING_FILE_DESCRIPTOR_ERROR(205),
    FAILED_OPENING_URI_AUTHORITY_ABSENT(206),
    FAILED_OPENING_CONTENT_PROVIDER_NOT_FOUND(207),
    FAILED_OPENING_INVALID_CAPTURE_SESSION_ID(208),
    FAILED_OPENING_ZERO_LATENCY_MIC_INVALID_AUDIO_SOURCE(211),
    FAILED_OPENING_ZERO_LATENCY_MIC_INVALID_CHANNEL_MASK(212),
    FAILED_OPENING_ZERO_LATENCY_MIC_REFLECTION_ERROR(213),
    FAILED_OPENING_MEDIA_SYNC_MIC_INVALID_AUDIO_SOURCE(214),
    FAILED_OPENING_INVALID_MEDIA_SYNC_EVENT(215),
    FAILED_OPENING_MISSING_ZERO_LATENCY_MIC_IMPLEMENTATION(216),
    FAILED_OPENING_MISSING_MEDIA_SYNC_MIC_IMPLEMENTATION(217),
    FAILED_OPENING_MISSING_SOURCE_ATTRIBUTION(218),
    FAILED_OPENING_SOURCE_ATTRIBUTION_EXCEPTION(219),
    FAILED_OPENING_SOURCE_ATTRIBUTION_UNSUPPORTED_AUDIO_SDK(220),
    FAILED_OPENING_ID_ATTRIBUTION_UNSUPPORTED_AUDIO_SDK(222),
    FAILED_OPENING_MISSING_DSP_MIC_IMPLEMENTATION(221),
    FAILED_OPENING_INVALID_WRITEABLE_AUDIO_BUFFER_DATA(300),
    FAILED_OPENING_ABSENT_WRITEABLE_AUDIO_BUFFER_DATA(303),
    FAILED_OPENING_HOTWORD_DUE_TO_EXTERNAL_CLIENT_LISTENING(304),
    FAILED_OPENING_NO_CONNECTION_TO_AUDIO_ADAPTER_FOUND(307),
    FAILED_OPENING_NO_AUDIO_ADAPTER_FOUND(308),
    FAILED_OPENING_GRPC_START_LISTENING_STATUS_NOT_RECEIVED(400),
    FAILED_OPENING_GRPC_START_LISTENING_HOTWORD_STATUS_NOT_RECEIVED(401),
    FAILED_OPENING_ERROR_RETRIEVING_STATUS(500),
    FAILED_OPENING_ERROR_RETRIEVING_AUDIO_PARAMS(501),
    FAILED_OPENING_NO_AUDIO_STREAM_IN_STORE(600);
    

    /* renamed from: T */
    public static final C62958ce f99659T = null;

    /* renamed from: U */
    public final int f99687U;

    static {
        f99659T = new C37517dx();
    }

    private C37519dz(int i) {
        this.f99687U = i;
    }

    /* renamed from: a */
    public static C37519dz m66524a(int i) {
        if (i == 0) {
            return UNKNOWN_OPENING_FAILURE;
        }
        if (i == 113) {
            return FAILED_OPENING_MIC_OCCUPIED;
        }
        if (i == 300) {
            return FAILED_OPENING_INVALID_WRITEABLE_AUDIO_BUFFER_DATA;
        }
        if (i == 600) {
            return FAILED_OPENING_NO_AUDIO_STREAM_IN_STORE;
        }
        if (i == 303) {
            return FAILED_OPENING_ABSENT_WRITEABLE_AUDIO_BUFFER_DATA;
        }
        if (i == 304) {
            return FAILED_OPENING_HOTWORD_DUE_TO_EXTERNAL_CLIENT_LISTENING;
        }
        if (i == 307) {
            return FAILED_OPENING_NO_CONNECTION_TO_AUDIO_ADAPTER_FOUND;
        }
        if (i == 308) {
            return FAILED_OPENING_NO_AUDIO_ADAPTER_FOUND;
        }
        if (i == 400) {
            return FAILED_OPENING_GRPC_START_LISTENING_STATUS_NOT_RECEIVED;
        }
        if (i == 401) {
            return FAILED_OPENING_GRPC_START_LISTENING_HOTWORD_STATUS_NOT_RECEIVED;
        }
        if (i == 500) {
            return FAILED_OPENING_ERROR_RETRIEVING_STATUS;
        }
        if (i == 501) {
            return FAILED_OPENING_ERROR_RETRIEVING_AUDIO_PARAMS;
        }
        switch (i) {
            case 100:
                return FAILED_TO_OPEN_AUDIO_SOURCE;
            case 101:
                return FAILED_OPENING_DUE_TO_INACTIVE_CLIENT;
            case 102:
                return FAILED_OPENING_MICROPHONE_PERMISSION_DENIED;
            case 103:
                return FAILED_OPENING_HOTWORD_DUE_TO_AUDIO_REQUEST_CLIENT_LISTENING;
            case 104:
                return FAILED_TO_OPEN_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING;
            case 105:
                return FAILED_OPENING_NOT_ALLOWED_HOTWORD_SOURCE_USAGE;
            case 106:
                return FAILED_OPENING_DUE_TO_INACTIVE_SESSION;
            case 107:
                return FAILED_OPENING_DUE_TO_INACTIVE_AUDIO_ROUTE_SESSION;
            case 108:
                return FAILED_OPENING_HOTWORD_INCORRECT_AUDIO_SOURCE_TYPE;
            case 109:
                return FAILED_OPENING_OP_NOT_ALLOWED;
            case 110:
                return FAILED_OPENING_NOT_ALLOWED_ZERO_MIC_LATENCY_USAGE;
            case 111:
                return FAILED_OPENING_PERMISSION_CAPTURE_AUDIO_HOTWORD_DENIED;
            default:
                switch (i) {
                    case 200:
                        return FAILED_OPENING_ERROR_INIT;
                    case 201:
                        return FAILED_OPENING_ERROR_MODE_IN_CALL;
                    case 202:
                        return FAILED_OPENING_ERROR_START_RECORDING;
                    case 203:
                        return FAILED_OPENING_FILE_NOT_FOUND;
                    case 204:
                        return FAILED_OPENING_FILE_SECURITY;
                    case 205:
                        return FAILED_OPENING_FILE_DESCRIPTOR_ERROR;
                    case 206:
                        return FAILED_OPENING_URI_AUTHORITY_ABSENT;
                    case 207:
                        return FAILED_OPENING_CONTENT_PROVIDER_NOT_FOUND;
                    case 208:
                        return FAILED_OPENING_INVALID_CAPTURE_SESSION_ID;
                    default:
                        switch (i) {
                            case 211:
                                return FAILED_OPENING_ZERO_LATENCY_MIC_INVALID_AUDIO_SOURCE;
                            case 212:
                                return FAILED_OPENING_ZERO_LATENCY_MIC_INVALID_CHANNEL_MASK;
                            case 213:
                                return FAILED_OPENING_ZERO_LATENCY_MIC_REFLECTION_ERROR;
                            case 214:
                                return FAILED_OPENING_MEDIA_SYNC_MIC_INVALID_AUDIO_SOURCE;
                            case 215:
                                return FAILED_OPENING_INVALID_MEDIA_SYNC_EVENT;
                            case 216:
                                return FAILED_OPENING_MISSING_ZERO_LATENCY_MIC_IMPLEMENTATION;
                            case 217:
                                return FAILED_OPENING_MISSING_MEDIA_SYNC_MIC_IMPLEMENTATION;
                            case 218:
                                return FAILED_OPENING_MISSING_SOURCE_ATTRIBUTION;
                            case 219:
                                return FAILED_OPENING_SOURCE_ATTRIBUTION_EXCEPTION;
                            case 220:
                                return FAILED_OPENING_SOURCE_ATTRIBUTION_UNSUPPORTED_AUDIO_SDK;
                            case 221:
                                return FAILED_OPENING_MISSING_DSP_MIC_IMPLEMENTATION;
                            case 222:
                                return FAILED_OPENING_ID_ATTRIBUTION_UNSUPPORTED_AUDIO_SDK;
                            default:
                                return null;
                        }
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m66525b() {
        return C37518dy.f99639a;
    }

    public final int getNumber() {
        return this.f99687U;
    }

    public final String toString() {
        return Integer.toString(this.f99687U);
    }
}
