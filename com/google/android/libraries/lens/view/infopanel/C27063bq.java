package com.google.android.libraries.lens.view.infopanel;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2096f.C25802e;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bq */
/* compiled from: PG */
public final class C27063bq {

    /* renamed from: a */
    public static final C59071e f73783a = C59071e.m91332i("com.google.android.libraries.lens.view.infopanel.bq");

    /* renamed from: b */
    private final C25537t f73784b;

    public C27063bq(C25537t tVar) {
        this.f73784b = tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32510a(C25802e eVar) {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f73784b.mo30558i(intent, eVar);
    }

    /* renamed from: b */
    public final void mo32511b(C25802e eVar, Fragment fragment, View view) {
        this.f73784b.mo30554d(eVar, new C27062bp(fragment, view));
    }
}
