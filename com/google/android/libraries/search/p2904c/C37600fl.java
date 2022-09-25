package com.google.android.libraries.search.p2904c;

/* renamed from: com.google.android.libraries.search.c.fl */
/* compiled from: PG */
public final class C37600fl {
    /* renamed from: a */
    public static /* synthetic */ String m66588a(int i) {
        if (i == 1) {
            return "UNKNOWN_EVENT";
        }
        if (i == 2) {
            return "ACTIVATE_AUDIO_REQUEST_CLIENT";
        }
        if (i == 3) {
            return "DEACTIVATE_AUDIO_REQUEST_CLIENT";
        }
        if (i == 101) {
            return "AUDIO_REQUEST_START_LISTENING";
        }
        if (i == 102) {
            return "AUDIO_REQUEST_STOP_LISTENING";
        }
        if (i == 303) {
            return "EXTERNAL_CLIENT_NOTIFY_START_LISTENING";
        }
        if (i == 304) {
            return "EXTERNAL_CLIENT_NOTIFY_STOP_LISTENING";
        }
        switch (i) {
            case 105:
                return "ACQUIRE_AUDIO_FOCUS";
            case 106:
                return "RELEASE_AUDIO_FOCUS";
            case 107:
                return "AUDIO_REQUEST_UPDATE_AUDIO_ROUTE";
            case 108:
                return "UPDATE_AUDIO_ROUTE_TO_SEAMLESS_HANDOVER";
            case 109:
                return "AUDIO_REQUEST_VERIFY_ROUTE_AND_START_LISTENING";
            default:
                switch (i) {
                    case 201:
                        return "HOTWORD_START_LISTENING";
                    case 202:
                        return "HOTWORD_STOP_LISTENING";
                    case 203:
                        return "HOTWORD_STOP_LISTENING_SEAMLESS";
                    case 204:
                        return "HOTWORD_UPDATE_AUDIO_ROUTE";
                    case 205:
                        return "HOTWORD_VERIFY_ROUTE_AND_START_LISTENING";
                    default:
                        switch (i) {
                            case 401:
                                return "DISCONNECT_AUDIO_ADAPTER_ROUTE";
                            case 402:
                                return "DISCONNECT_AUDIO_ADAPTER_ROUTE_WITH_TIMEOUT";
                            case 403:
                                return "REGISTER_AUDIO_ADAPTER";
                            case 404:
                                return "UNREGISTER_AUDIO_ADAPTER";
                            default:
                                return "null";
                        }
                }
        }
    }

    /* renamed from: b */
    public static int m66589b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 100) {
            return 101;
        }
        if (i == 101) {
            return 102;
        }
        if (i == 302) {
            return 303;
        }
        if (i == 303) {
            return 304;
        }
        switch (i) {
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 108:
                return 109;
            default:
                switch (i) {
                    case 200:
                        return 201;
                    case 201:
                        return 202;
                    case 202:
                        return 203;
                    case 203:
                        return 204;
                    case 204:
                        return 205;
                    default:
                        switch (i) {
                            case 400:
                                return 401;
                            case 401:
                                return 402;
                            case 402:
                                return 403;
                            case 403:
                                return 404;
                            default:
                                return 0;
                        }
                }
        }
    }
}
