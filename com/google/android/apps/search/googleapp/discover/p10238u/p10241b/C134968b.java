package com.google.android.apps.search.googleapp.discover.p10238u.p10241b;

import android.net.Uri;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.b.b */
/* compiled from: PG */
public final class C134968b extends Exception {

    /* renamed from: a */
    public final int f367493a;

    public C134968b(int i, Uri uri) {
        super(String.format(Locale.US, "%d %s", new Object[]{Integer.valueOf(i), uri.buildUpon().clearQuery().build()}));
        this.f367493a = i;
    }
}
