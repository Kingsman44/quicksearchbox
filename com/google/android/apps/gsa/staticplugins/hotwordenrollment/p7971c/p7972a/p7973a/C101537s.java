package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.android.apps.gsa.speech.audio.C92195f;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92372e;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.speech.p5208h.C66595bu;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.s */
/* compiled from: PG */
public final /* synthetic */ class C101537s implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C101510ae f283361a;

    /* renamed from: b */
    public final /* synthetic */ C92372e f283362b;

    public /* synthetic */ C101537s(C101510ae aeVar, C92372e eVar) {
        this.f283361a = aeVar;
        this.f283362b = eVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C101510ae aeVar = this.f283361a;
        if (this.f283362b.mo87036a(aeVar.f283280g, (C66595bu) aeVar.f283275b.mo87020a().mo56111f(), C92195f.m151371a(aeVar.f283282i.mo83828q()))) {
            return null;
        }
        throw new Exception("Failed to send utterances to S3.");
    }
}
