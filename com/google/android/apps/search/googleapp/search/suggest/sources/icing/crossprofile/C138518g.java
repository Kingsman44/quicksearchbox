package com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile;

import android.content.Context;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142587l;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.g */
/* compiled from: PG */
public final class C138518g {

    /* renamed from: a */
    public static final C138518g f376764a = new C138518g();

    /* renamed from: b */
    public static final Bundler f376765b = new CrossProfileIcingApi_Bundler();

    /* renamed from: c */
    public final C142587l[] f376766c = {new C138516e(), new C138517f()};

    private C138518g() {
    }

    /* renamed from: a */
    public static final C138513b m224953a(Context context) {
        C138531s sVar = C138531s.f376786a;
        if (sVar.f376787b == null) {
            synchronized (C138531s.class) {
                if (sVar.f376787b == null) {
                    sVar.f376787b = new C138524m(context);
                }
            }
        }
        return sVar.f376787b.f376780a;
    }
}
