package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.common.api.ai */
/* compiled from: PG */
public final class C143716ai extends UnsupportedOperationException {

    /* renamed from: a */
    private final Feature f389626a;

    public C143716ai(Feature feature) {
        this.f389626a = feature;
    }

    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.f389626a)));
    }
}
