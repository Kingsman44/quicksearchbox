package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.p10272a;

import android.graphics.Bitmap;
import com.google.android.libraries.lens.sdk.avs.C24897n;
import com.google.android.libraries.lens.sdk.avs.data.C24870e;
import com.google.android.libraries.lens.sdk.avs.data.C24877l;
import com.google.android.libraries.lens.sdk.avs.data.C24882q;
import com.google.android.libraries.lens.sdk.avs.data.C24884s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.a.o */
/* compiled from: PG */
final class C135604o implements C24897n {

    /* renamed from: c */
    private static final C59071e f369379c = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.a.o");

    /* renamed from: a */
    public Bitmap f369380a;

    /* renamed from: b */
    public C24877l f369381b = new C24877l();

    /* renamed from: d */
    private final C135593d f369382d;

    public C135604o(C135593d dVar) {
        this.f369382d = dVar;
    }

    /* renamed from: a */
    public final void mo30121a(C24870e eVar) {
        ((C59052c) ((C59052c) f369379c.mo56225c()).mo56372aa(40600)).mo56389s("Visual Search Connection failed with error code %s", eVar.f67930a.containsKey("error_code") ? String.valueOf(eVar.mo30073a()) : "null");
    }

    /* renamed from: c */
    public final void mo30123c(C24882q qVar) {
        ((C59052c) ((C59052c) f369379c.mo56224b()).mo56372aa(40601)).mo56389s("Visual Search Session started with sessionId %s", qVar.mo30109a());
    }

    /* renamed from: d */
    public final void mo30124d(C24884s sVar) {
        ((C59052c) ((C59052c) f369379c.mo56224b()).mo56372aa(40602)).mo56389s("Visual Search Session ended with sessionId %s", sVar.f67965a.getString("session_id"));
    }

    /* renamed from: b */
    public final void mo30122b(C24877l lVar) {
        this.f369381b = lVar;
        C135593d dVar = this.f369382d;
        Bitmap bitmap = this.f369380a;
        bitmap.getClass();
        dVar.mo112401b(bitmap, lVar);
    }
}
