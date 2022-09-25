package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.ds */
/* compiled from: PG */
public enum C37512ds implements C62957cd {
    UNKNOWN_CLOSING_FAILURE(0),
    FAILED_CLOSING_DUE_TO_INACTIVE_CLIENT(100),
    FAILED_CLOSING_DUE_TO_INACTIVE_SESSION(101),
    FAILED_CLOSING_HOTWORD_DUE_TO_AUDIO_REQUEST_CLIENT_LISTENING(102),
    FAILED_TO_KEEP_MIC_OPEN_FOR_SEAMLESS_HANDOVER(103),
    FAILED_CLOSING_NO_AUDIO_SOURCE(104),
    FAILED_CLOSING_NO_AUDIO_RECORD(105),
    FAILED_CLOSING_NO_AUDIO_URI_STREAM(106),
    FAILED_CLOSING_WAS_NOT_OPENED(107),
    FAILED_CLOSING_DUE_TO_FAILED_OPENING_AUDIO_SOURCE(108),
    FAILED_CLOSING_MICROPHONE_PERMISSION_DENIED(109),
    FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_SOURCE_CLOSING_STATUS(110),
    FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_STREAM(111),
    FAILED_CLOSING_NOT_ALLOWED_HOTWORD_SOURCE_USAGE(112),
    FAILED_CLOSING_DUE_TO_INACTIVE_AUDIO_ROUTE_SESSION(113),
    FAILED_CLOSING_HOTWORD_INCORRECT_AUDIO_SOURCE_TYPE(114),
    FAILED_CLOSING_OP_NOT_ALLOWED(115),
    FAILED_CLOSING_NOT_ALLOWED_ZERO_MIC_LATENCY_USAGE(116),
    FAILED_CLOSING_PERMISSION_CAPTURE_AUDIO_HOTWORD_DENIED(117),
    FAILED_CLOSING_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING(118),
    FAILED_CLOSING_NO_AUDIO_PFD_STREAM(119),
    FAILED_CLOSING_MIC_OCCUPIED(120),
    FAILED_CLOSING_AUDIO_RECORD_ERROR(200),
    FAILED_CLOSING_AUDIO_URI_STREAM_ERROR(201),
    FAILED_CLOSING_AUDIO_PFD_STREAM_ERROR(202),
    FAILED_CLOSING_BISTO_MIC_NOT_REGISTERED(300),
    FAILED_CLOSING_ABSENT_WRITEABLE_AUDIO_BUFFER_DATA(302),
    FAILED_CLOSING_HOTWORD_DUE_TO_EXTERNAL_CLIENT_LISTENING(303),
    FAILED_CLOSING_CALLED_WITHOUT_PRECACHED_BUFFER_ID(304),
    FAILED_CLOSING_CALLED_UNEXPECTED_PRECACHED_BUFFER_ID(305),
    FAILED_CLOSING_NO_CONNECTION_TO_AUDIO_ADAPTER_FOUND(306),
    FAILED_CLOSING_NO_AUDIO_ADAPTER_FOUND(307),
    FAILED_CLOSING_ERROR_IN_GRPC_START_LISTENING(400),
    FAILED_CLOSING_GRPC_STOP_LISTENING_STATUS_NOT_RECEIVED(401),
    FAILED_CLOSING_ERROR_RETRIEVING_STATUS(500),
    FAILED_CLOSING_NO_AUDIO_STREAM_IN_STORE(600);
    

    /* renamed from: K */
    public final int f99628K;

    private C37512ds(int i) {
        this.f99628K = i;
    }

    /* renamed from: a */
    public static C37512ds m66519a(int i) {
        if (i == 0) {
            return UNKNOWN_CLOSING_FAILURE;
        }
        if (i == 300) {
            return FAILED_CLOSING_BISTO_MIC_NOT_REGISTERED;
        }
        if (i == 500) {
            return FAILED_CLOSING_ERROR_RETRIEVING_STATUS;
        }
        if (i == 600) {
            return FAILED_CLOSING_NO_AUDIO_STREAM_IN_STORE;
        }
        if (i == 400) {
            return FAILED_CLOSING_ERROR_IN_GRPC_START_LISTENING;
        }
        if (i == 401) {
            return FAILED_CLOSING_GRPC_STOP_LISTENING_STATUS_NOT_RECEIVED;
        }
        switch (i) {
            case 100:
                return FAILED_CLOSING_DUE_TO_INACTIVE_CLIENT;
            case 101:
                return FAILED_CLOSING_DUE_TO_INACTIVE_SESSION;
            case 102:
                return FAILED_CLOSING_HOTWORD_DUE_TO_AUDIO_REQUEST_CLIENT_LISTENING;
            case 103:
                return FAILED_TO_KEEP_MIC_OPEN_FOR_SEAMLESS_HANDOVER;
            case 104:
                return FAILED_CLOSING_NO_AUDIO_SOURCE;
            case 105:
                return FAILED_CLOSING_NO_AUDIO_RECORD;
            case 106:
                return FAILED_CLOSING_NO_AUDIO_URI_STREAM;
            case 107:
                return FAILED_CLOSING_WAS_NOT_OPENED;
            case 108:
                return FAILED_CLOSING_DUE_TO_FAILED_OPENING_AUDIO_SOURCE;
            case 109:
                return FAILED_CLOSING_MICROPHONE_PERMISSION_DENIED;
            case 110:
                return FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_SOURCE_CLOSING_STATUS;
            case 111:
                return FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_STREAM;
            case 112:
                return FAILED_CLOSING_NOT_ALLOWED_HOTWORD_SOURCE_USAGE;
            case 113:
                return FAILED_CLOSING_DUE_TO_INACTIVE_AUDIO_ROUTE_SESSION;
            case 114:
                return FAILED_CLOSING_HOTWORD_INCORRECT_AUDIO_SOURCE_TYPE;
            case 115:
                return FAILED_CLOSING_OP_NOT_ALLOWED;
            case 116:
                return FAILED_CLOSING_NOT_ALLOWED_ZERO_MIC_LATENCY_USAGE;
            case 117:
                return FAILED_CLOSING_PERMISSION_CAPTURE_AUDIO_HOTWORD_DENIED;
            case 118:
                return FAILED_CLOSING_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING;
            case 119:
                return FAILED_CLOSING_NO_AUDIO_PFD_STREAM;
            case 120:
                return FAILED_CLOSING_MIC_OCCUPIED;
            default:
                switch (i) {
                    case 200:
                        return FAILED_CLOSING_AUDIO_RECORD_ERROR;
                    case 201:
                        return FAILED_CLOSING_AUDIO_URI_STREAM_ERROR;
                    case 202:
                        return FAILED_CLOSING_AUDIO_PFD_STREAM_ERROR;
                    default:
                        switch (i) {
                            case 302:
                                return FAILED_CLOSING_ABSENT_WRITEABLE_AUDIO_BUFFER_DATA;
                            case 303:
                                return FAILED_CLOSING_HOTWORD_DUE_TO_EXTERNAL_CLIENT_LISTENING;
                            case 304:
                                return FAILED_CLOSING_CALLED_WITHOUT_PRECACHED_BUFFER_ID;
                            case 305:
                                return FAILED_CLOSING_CALLED_UNEXPECTED_PRECACHED_BUFFER_ID;
                            case 306:
                                return FAILED_CLOSING_NO_CONNECTION_TO_AUDIO_ADAPTER_FOUND;
                            case 307:
                                return FAILED_CLOSING_NO_AUDIO_ADAPTER_FOUND;
                            default:
                                return null;
                        }
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m66520b() {
        return C37511dr.f99590a;
    }

    public final int getNumber() {
        return this.f99628K;
    }

    public final String toString() {
        return Integer.toString(this.f99628K);
    }
}
