package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import android.util.FloatProperty;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.a */
/* compiled from: PG */
final class C138810a extends FloatProperty {
    public C138810a() {
        super("Logo Width");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = LogoView.f377572f;
        return Float.valueOf(((LogoView) obj).f377573a.f377655k);
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f) {
        LogoView logoView = (LogoView) obj;
        int i = LogoView.f377572f;
        logoView.mo114547d(f, logoView.f377573a.f377656l);
    }
}
