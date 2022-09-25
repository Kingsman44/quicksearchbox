package com.google.android.apps.gsa.staticplugins.opa.p8410s.p8411a;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107474am;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107475an;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.common.base.C58833ax;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4908a.C64110b;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import p5488io.p5490b.C69807c;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69872g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.s.a.t */
/* compiled from: PG */
public final /* synthetic */ class C109979t implements C69807c {

    /* renamed from: a */
    public final /* synthetic */ C109981v f306433a;

    /* renamed from: b */
    public final /* synthetic */ C64110b f306434b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f306435c;

    public /* synthetic */ C109979t(C109981v vVar, C64110b bVar, C58833ax axVar) {
        this.f306433a = vVar;
        this.f306434b = bVar;
        this.f306435c = axVar;
    }

    /* renamed from: a */
    public final void mo25806a(C69872g gVar) {
        String str;
        C109981v vVar = this.f306433a;
        C64110b bVar = this.f306434b;
        C58833ax axVar = this.f306435c;
        C107474am amVar = (C107474am) C107475an.f299054e.createBuilder();
        amVar.copyOnWrite();
        C107475an anVar = (C107475an) amVar.instance;
        anVar.f299056a |= 4;
        anVar.f299059d = true;
        vVar.f306441b.mo96219b(C109981v.m183176d((C107475an) amVar.build()));
        C107710u uVar = vVar.f306443d;
        uVar.mo96220c(new C109980u(vVar.f306440a, bVar.f173329f, gVar, uVar), C88244um.TTS_PLAYBACK_STARTED, C88244um.TTS_PLAYBACK_DONE);
        C67187ae aeVar = (C67187ae) axVar.mo56107c();
        if ((bVar.f173324a & 8) != 0) {
            str = bVar.f173328e;
        } else {
            str = ((bm) vVar.f306442c.mo27525b()).b();
        }
        if ((((C67190ah) aeVar.instance).f182622a & 8192) == 0) {
            aeVar.copyOnWrite();
            C67190ah ahVar = (C67190ah) aeVar.instance;
            str.getClass();
            ahVar.f182622a |= 8192;
            ahVar.f182632k = str;
        }
        C107474am amVar2 = (C107474am) C107475an.f299054e.createBuilder();
        C67190ah ahVar2 = (C67190ah) aeVar.build();
        amVar2.copyOnWrite();
        C107475an anVar2 = (C107475an) amVar2.instance;
        ahVar2.getClass();
        anVar2.f299058c = ahVar2;
        anVar2.f299057b = 2;
        vVar.f306441b.mo96219b(C109981v.m183176d((C107475an) amVar2.build()));
    }
}
