package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import android.util.FloatProperty;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.b */
/* compiled from: PG */
final class C119461b extends FloatProperty {
    public C119461b() {
        super("Logo Height");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = LogoView.f332958g;
        return Float.valueOf(((LogoView) obj).f332959a.f333055l);
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f) {
        LogoView logoView = (LogoView) obj;
        int i = LogoView.f332958g;
        logoView.mo104344d(logoView.f332959a.f333054k, f);
    }
}
