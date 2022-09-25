package com.google.android.apps.search.transcription.p10666b;

/* renamed from: com.google.android.apps.search.transcription.b.b */
/* compiled from: PG */
public abstract class C141743b {
    /* renamed from: b */
    static C141742a m229989b() {
        C141744c cVar = new C141744c();
        cVar.mo116702b(-1);
        return cVar;
    }

    /* renamed from: a */
    public abstract int mo116703a();

    /* renamed from: c */
    public final String mo116704c() {
        String str;
        int d = mo116705d();
        switch (d) {
            case 1:
                str = "GENERIC";
                break;
            case 2:
                str = "CANCELLED";
                break;
            case 3:
                str = "MICROPHONE_UNAVAILABLE";
                break;
            case 4:
                str = "MICROPHONE_AUDIO_BUFFER_OVERFLOW";
                break;
            case 5:
                str = "NETWORK_REQUEST_BUILDING";
                break;
            case 6:
                str = "GRPC_ERROR";
                break;
            case 7:
                str = "S3_ERROR";
                break;
            case 8:
                str = "NO_SPEECH_DETECTED";
                break;
            case 9:
                str = "CREATE_RECORDING_FAILED";
                break;
            case 10:
                str = "OFFLINE_RECOGNITION_UNAVAILABLE";
                break;
            case 11:
                str = "SODA_ERROR";
                break;
            case 12:
                str = "SODA_INITIALIZATION_ERROR";
                break;
            case 13:
                str = "ONLINE_NO_PROGRESS";
                break;
            case 14:
                str = "INVALID_INTENT";
                break;
            case 15:
                str = "LANGUAGE_PACK_ERROR";
                break;
            default:
                str = "null";
                break;
        }
        if (d != 0) {
            return "agsa_transcription_".concat(str);
        }
        throw null;
    }

    /* renamed from: d */
    public abstract int mo116705d();
}
