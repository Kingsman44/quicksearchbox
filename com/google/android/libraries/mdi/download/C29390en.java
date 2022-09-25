package com.google.android.libraries.mdi.download;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.mdi.download.en */
/* compiled from: PG */
public enum C29390en implements C62957cd {
    NONE(0),
    SUBSCRIBED(1),
    DOWNLOAD_IN_PROGRESS(2),
    DOWNLOAD_FAILED(3),
    DOWNLOAD_COMPLETE(4),
    CORRUPTED(6),
    INTERNAL_ERROR(5);
    

    /* renamed from: h */
    public final int f79678h;

    private C29390en(int i) {
        this.f79678h = i;
    }

    /* renamed from: a */
    public static C29390en m54308a(int i) {
        switch (i) {
            case 0:
                return NONE;
            case 1:
                return SUBSCRIBED;
            case 2:
                return DOWNLOAD_IN_PROGRESS;
            case 3:
                return DOWNLOAD_FAILED;
            case 4:
                return DOWNLOAD_COMPLETE;
            case 5:
                return INTERNAL_ERROR;
            case 6:
                return CORRUPTED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m54309b() {
        return C29389em.f79669a;
    }

    public final int getNumber() {
        return this.f79678h;
    }

    public final String toString() {
        return Integer.toString(this.f79678h);
    }
}
