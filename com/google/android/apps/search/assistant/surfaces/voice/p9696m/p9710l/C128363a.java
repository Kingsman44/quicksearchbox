package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import com.google.speech.p5224k.p5225a.C67194al;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.l.a */
/* compiled from: PG */
public final class C128363a implements C57974a {

    /* renamed from: a */
    final /* synthetic */ C128377i f353032a;

    public C128363a(C128377i iVar) {
        this.f353032a = iVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C67194al alVar = (C67194al) obj;
        C69664n.m101061g(alVar, "ttsTimepoint");
        C128377i iVar = this.f353032a;
        C59071e eVar = C128377i.f353069a;
        iVar.f353078i.mo108405b(alVar);
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        C69664n.m101061g(cVar, "stream");
        C59052c cVar2 = (C59052c) C128377i.f353069a.mo56224b();
        cVar2.mo56379ah(new C59094n(37862));
        cVar2.mo56386p("TtsTimepoint stream started.");
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C59052c cVar = (C59052c) C128377i.f353069a.mo56224b();
        cVar.mo56379ah(new C59094n(37860));
        cVar.mo56386p("TtsTimepoint stream ended.");
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        C69664n.m101061g(th, "cause");
        C59052c cVar = (C59052c) ((C59052c) C128377i.f353069a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(37861));
        cVar.mo56386p("TtsTimepoint stream failed.");
    }
}
