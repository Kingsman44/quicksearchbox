package com.google.android.libraries.p1635au;

import android.content.Context;
import com.google.android.gms.clearcut.C143658k;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.libraries.au.c */
/* compiled from: PG */
public final class C19566c {

    /* renamed from: a */
    public final C143658k f54473a;

    /* renamed from: b */
    public final String f54474b;

    /* renamed from: c */
    public CopyOnWriteArrayList f54475c;

    public C19566c(Context context, String str, String str2) {
        this(new C143658k(context, str, str2), str);
    }

    public C19566c(C143658k kVar, String str) {
        this.f54475c = new CopyOnWriteArrayList();
        if (str.startsWith("STREAMZ_")) {
            this.f54473a = kVar;
            this.f54474b = str;
            return;
        }
        throw new IllegalArgumentException("logSourceName should be prefixed by STREAMZ_");
    }
}
