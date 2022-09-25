package com.google.android.apps.gsa.staticplugins.recently.p8683f;

import android.content.SharedPreferences;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.f.c */
/* compiled from: PG */
public final /* synthetic */ class C116082c implements C116086g {

    /* renamed from: a */
    public final /* synthetic */ long f321879a;

    public /* synthetic */ C116082c(long j) {
        this.f321879a = j;
    }

    /* renamed from: a */
    public final void mo102473a(SharedPreferences.Editor editor) {
        editor.putLong("onboarding_timestamp", this.f321879a);
        C116087h.m192469f(editor, false);
    }
}
