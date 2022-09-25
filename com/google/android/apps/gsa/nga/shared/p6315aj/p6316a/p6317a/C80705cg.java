package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.cg */
/* compiled from: PG */
public abstract class C80705cg {
    /* renamed from: h */
    public static C80704cf m128502h() {
        C80661aq aqVar = new C80661aq();
        aqVar.mo74451b(Locale.getDefault().toLanguageTag());
        aqVar.mo74455f(false);
        return aqVar;
    }

    @Deprecated
    /* renamed from: a */
    public abstract PendingIntent mo74456a();

    @Deprecated
    /* renamed from: b */
    public abstract PendingIntent mo74457b();

    /* renamed from: c */
    public abstract C80704cf mo74458c();

    /* renamed from: d */
    public abstract String mo74459d();

    /* renamed from: e */
    public abstract boolean mo74460e();

    /* renamed from: f */
    public abstract boolean mo74462f();

    /* renamed from: g */
    public final Bundle mo74633g() {
        Bundle bundle = new Bundle();
        bundle.putString("action", "config");
        bundle.putBoolean("is_available", mo74460e());
        bundle.putBoolean("nga_is_assistant", mo74462f());
        bundle.putParcelable("configuration", mo74456a());
        bundle.putParcelable("keyboard_showing_changed", mo74457b());
        bundle.putString("assistant_locale", mo74459d());
        return bundle;
    }
}
