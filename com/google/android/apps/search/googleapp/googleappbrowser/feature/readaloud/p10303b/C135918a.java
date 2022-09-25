package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10303b;

import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135911d;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135912e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.b.a */
/* compiled from: PG */
public final /* synthetic */ class C135918a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C135923f f370175a;

    /* renamed from: b */
    public final /* synthetic */ String f370176b;

    public /* synthetic */ C135918a(C135923f fVar, String str) {
        this.f370175a = fVar;
        this.f370176b = str;
    }

    public final C60870cx apply(Object obj) {
        C135923f fVar = this.f370175a;
        String str = this.f370176b;
        if (((Boolean) obj).booleanValue()) {
            return fVar.f370183c.mo112624a(str);
        }
        C135911d dVar = (C135911d) C135912e.f370156c.createBuilder();
        dVar.copyOnWrite();
        C135912e eVar = (C135912e) dVar.instance;
        eVar.f370159b = 3;
        eVar.f370158a |= 1;
        return C60856cj.m92900i((C135912e) dVar.build());
    }
}
