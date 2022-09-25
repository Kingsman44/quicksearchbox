package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.mv */
/* compiled from: PG */
public final class C14535mv {
    /* renamed from: a */
    public static /* synthetic */ String m30634a(int i) {
        if (i == 1) {
            return "UNRECOGNIZED";
        }
        if (i == 2) {
            return "UNKNOWN";
        }
        switch (i) {
            case 5:
                return "SEND_ASSISTANT_QUERY";
            case 6:
                return "CANCEL_ASSISTANT_ACTION_IN_PROGRESS";
            case 7:
                return "CANCEL_ASSISTANT_QUERY";
            case 8:
                return "OPEN_MIC";
            case 9:
                return "SEND_ASSISTANT_CLIENT_INPUT";
            case 10:
                return "SEND_LOW_CONNECTIVITY_TTS_QUERY";
            case 11:
                return "SET_ACTIVE_MESSAGE_IN_MESSAGE_CACHE";
            case 12:
                return "SET_ALL_UNREAD_MESSAGES_IN_MESSAGE_CACHE";
            case 13:
                return "SEND_ASSISTANT_LOCAL_PHONE_CALL_REQUEST";
            case 14:
                return "SET_ALL_REPLYABLE_MESSAGES_IN_MESSAGE_CACHE";
            default:
                return "null";
        }
    }

    /* renamed from: b */
    public static int m30635b(int i) {
        return i - 2;
    }

    /* renamed from: c */
    public static int m30636c(int i) {
        if (i == 0) {
            return 2;
        }
        switch (i) {
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            default:
                return 0;
        }
    }
}
