package com.google.android.enterprise.connectedapps.internal;

import android.os.Bundle;

/* renamed from: com.google.android.enterprise.connectedapps.internal.b */
/* compiled from: PG */
public final class C142577b {
    /* renamed from: a */
    public static Throwable m231205a(Bundle bundle) {
        bundle.setClassLoader(Bundler.class.getClassLoader());
        return (Throwable) bundle.getSerializable("throwable");
    }
}
