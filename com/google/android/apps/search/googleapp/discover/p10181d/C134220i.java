package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.i */
/* compiled from: PG */
public enum C134220i implements C62957cd {
    IMAGES_UNSPECIFIED(0),
    IMAGES_FULLY_RENDERED(1),
    SOME_IMAGES_FAILED_TO_RENDER(2),
    ALL_IMAGES_FAILED_TO_RENDER(3),
    IMAGE_LOADING_CANCELLED(4);
    

    /* renamed from: f */
    public final int f365627f;

    private C134220i(int i) {
        this.f365627f = i;
    }

    public final int getNumber() {
        return this.f365627f;
    }

    public final String toString() {
        return Integer.toString(this.f365627f);
    }
}
