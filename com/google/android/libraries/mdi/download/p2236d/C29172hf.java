package com.google.android.libraries.mdi.download.p2236d;

/* renamed from: com.google.android.libraries.mdi.download.d.hf */
/* compiled from: PG */
public enum C29172hf {
    NEW_FILE_KEY(0),
    ADD_DOWNLOAD_TRANSFORM(1),
    USE_CHECKSUM_ONLY(2);
    

    /* renamed from: d */
    public final int f79119d;

    private C29172hf(int i) {
        this.f79119d = i;
    }

    /* renamed from: a */
    static C29172hf m54126a(int i) {
        if (i == 0) {
            return NEW_FILE_KEY;
        }
        if (i == 1) {
            return ADD_DOWNLOAD_TRANSFORM;
        }
        if (i == 2) {
            return USE_CHECKSUM_ONLY;
        }
        throw new IllegalArgumentException("Unknown MDD FileKey version:" + i);
    }
}
