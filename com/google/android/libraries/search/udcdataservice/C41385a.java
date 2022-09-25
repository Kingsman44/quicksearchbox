package com.google.android.libraries.search.udcdataservice;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.search.udcdataservice.a */
/* compiled from: PG */
public enum C41385a implements C62957cd {
    SEARCH(1),
    GOOGLE_APP_BROWSER(2),
    LENS(3),
    MAVATAR(4),
    PROMO_MANAGER(5),
    ASSISTANT(6);
    

    /* renamed from: g */
    private final int f108132g;

    private C41385a(int i) {
        this.f108132g = i;
    }

    public final int getNumber() {
        return this.f108132g;
    }

    public final String toString() {
        return Integer.toString(this.f108132g);
    }
}
