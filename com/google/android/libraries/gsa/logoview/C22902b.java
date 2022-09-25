package com.google.android.libraries.gsa.logoview;

import android.util.FloatProperty;

/* renamed from: com.google.android.libraries.gsa.logoview.b */
/* compiled from: PG */
public final class C22902b extends FloatProperty {
    public C22902b() {
        super("Logo Width");
    }

    /* renamed from: a */
    public static final Float m42827a(LogoView logoView) {
        int i = LogoView.f62993j;
        return Float.valueOf(logoView.f62995b.f63086k);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return m42827a((LogoView) obj);
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f) {
        LogoView logoView = (LogoView) obj;
        int i = LogoView.f62993j;
        logoView.mo28223c(f, logoView.f62995b.f63087l);
    }
}
