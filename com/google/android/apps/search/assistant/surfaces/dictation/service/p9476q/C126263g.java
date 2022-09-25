package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.unifiedime.C118589g;
import com.google.android.apps.gsa.unifiedime.C118590h;
import com.google.android.apps.gsa.unifiedime.C118605w;
import com.google.android.apps.gsa.unifiedime.C118606x;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125064as;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125191ai;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2904c.p2952o.p2959e.C37935b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.g */
/* compiled from: PG */
final class C126263g implements C125191ai {

    /* renamed from: a */
    final /* synthetic */ C126264h f347911a;

    public C126263g(C126264h hVar) {
        this.f347911a = hVar;
    }

    /* renamed from: a */
    public final void mo106836a() {
        this.f347911a.f347919h.mo107427z();
    }

    /* renamed from: b */
    public final void mo106837b(String str, boolean z, C58485gu guVar) {
        if (this.f347911a.f347916e.get()) {
            ((C59052c) ((C59052c) C126264h.f347912a.mo56226d()).mo56372aa(36876)).mo56386p("Received recognition result after stop() was called. [SD]");
            return;
        }
        C118605w wVar = (C118605w) C118606x.f330892g.createBuilder();
        wVar.copyOnWrite();
        C118606x xVar = (C118606x) wVar.instance;
        xVar.f330894a |= 1;
        xVar.f330895b = str;
        String languageTag = this.f347911a.f347920i.f345456b.f345547a.toLanguageTag();
        wVar.copyOnWrite();
        C118606x xVar2 = (C118606x) wVar.instance;
        languageTag.getClass();
        xVar2.f330894a |= 4;
        xVar2.f330897d = languageTag;
        wVar.copyOnWrite();
        C118606x xVar3 = (C118606x) wVar.instance;
        xVar3.f330894a |= 2;
        xVar3.f330896c = z;
        if (!guVar.isEmpty()) {
            C58838bb.m90869d(!guVar.isEmpty(), "resultAlternatives cannot be empty");
            C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).map(C126265i.f347921a).collect(C58370cn.f155946a);
            int asInt = Collection.EL.stream(guVar2).mapToInt(C126185a.f347710a).max().getAsInt();
            C118589g gVar = (C118589g) C118590h.f330865d.createBuilder();
            gVar.copyOnWrite();
            C118590h hVar = (C118590h) gVar.instance;
            hVar.f330867a |= 1;
            hVar.f330869c = asInt;
            gVar.mo103774a(guVar2);
            C118590h hVar2 = (C118590h) gVar.build();
            wVar.copyOnWrite();
            C118606x xVar4 = (C118606x) wVar.instance;
            hVar2.getClass();
            xVar4.f330899f = hVar2;
            xVar4.f330894a |= 8;
        }
        C126267k kVar = this.f347911a.f347918g;
        C125064as asVar = (C125064as) C125065at.f345040b.createBuilder();
        asVar.mo106794b(wVar);
        kVar.mo107497c((C125065at) asVar.build());
    }

    /* renamed from: c */
    public final void mo106838c(int i) {
        C59052c cVar = (C59052c) C126264h.f347912a.mo56225c();
        cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.ASSISTANT_DICTATION_ASR_AIAI_RECOGNIZER_ERROR_VALUE));
        ((C59052c) cVar.mo56372aa(36877)).mo56389s("Received error from AiAi ASR: %s. [SD]", C126290c.m206496a(Integer.valueOf(i)));
        if (this.f347911a.f347916e.get()) {
            ((C59052c) ((C59052c) C126264h.f347912a.mo56224b()).mo56372aa(36878)).mo56386p("Ignoring error after stop(). [SD]");
            return;
        }
        C126264h hVar = this.f347911a;
        hVar.f347913b.mo106881c(hVar.f347920i.f345456b);
        this.f347911a.f347918g.mo107496b((Throwable) null);
    }

    /* renamed from: d */
    public final void mo106839d(float f) {
        int d = C37935b.m66966d(f);
        C126264h hVar = this.f347911a;
        if (hVar.f347916e.get()) {
            ((C59052c) ((C59052c) C126264h.f347912a.mo56226d()).mo56372aa(36881)).mo56386p("Ignored audio level update because session is already finished. [SD]");
        } else {
            hVar.f347918g.mo107495a(d);
        }
    }

    /* renamed from: e */
    public final void mo106840e() {
        this.f347911a.f347918g.mo107500f();
    }

    /* renamed from: f */
    public final void mo106841f(Throwable th) {
        C126264h hVar = this.f347911a;
        hVar.f347913b.mo106881c(hVar.f347920i.f345456b);
        this.f347911a.f347918g.mo107496b(th);
    }

    /* renamed from: g */
    public final void mo106842g() {
        this.f347911a.f347918g.mo107499e();
    }

    /* renamed from: h */
    public final void mo106843h() {
        C126264h hVar = this.f347911a;
        hVar.f347913b.mo106881c(hVar.f347920i.f345456b);
        this.f347911a.f347918g.mo107498d();
    }

    /* renamed from: i */
    public final int mo106844i() {
        return 1;
    }
}
