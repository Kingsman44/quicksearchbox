package com.google.android.libraries.gsa.logoview;

import android.util.FloatProperty;

/* renamed from: com.google.android.libraries.gsa.logoview.c */
/* compiled from: PG */
public final class C22906c extends FloatProperty {
    public C22906c() {
        super("Logo Height");
    }

    /* renamed from: a */
    public static final Float m42844a(LogoView logoView) {
        int i = LogoView.f62993j;
        return Float.valueOf(logoView.f62995b.f63087l);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return m42844a((LogoView) obj);
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f) {
        LogoView logoView = (LogoView) obj;
        int i = LogoView.f62993j;
        logoView.mo28223c(logoView.f62995b.f63086k, f);
    }
}
