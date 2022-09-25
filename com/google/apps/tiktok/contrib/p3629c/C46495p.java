package com.google.apps.tiktok.contrib.p3629c;

import android.os.Bundle;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.apps.tiktok.contrib.c.p */
/* compiled from: PG */
public abstract class C46495p {
    /* renamed from: a */
    public abstract MessageLite mo50486a();

    /* renamed from: b */
    public abstract int mo50487b();

    /* renamed from: c */
    public abstract String mo50491c();

    /* renamed from: d */
    public final Bundle mo50504d() {
        Bundle bundle = new Bundle();
        if (mo50487b() == 2) {
            bundle.putString("TIKTOK_FRAGMENT_ARGUMENT", mo50491c());
        } else if (mo50487b() == 1) {
            ProtoParsers.m95532o(bundle, "TIKTOK_FRAGMENT_ARGUMENT", mo50486a());
        }
        return bundle;
    }
}
