package com.google.android.apps.gsa.p8889z.p8909e.p8910a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6816p.C86196af;
import com.google.android.apps.gsa.search.core.p6816p.C86197ag;
import com.google.android.apps.gsa.search.core.p6816p.C86198ah;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.p4449cd.p4456g.p4457a.C57978d;
import com.google.p4449cd.p4456g.p4458b.C57982a;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.z.e.a.h */
/* compiled from: PG */
public final class C119052h {

    /* renamed from: a */
    public final C86197ag f332120a;

    /* renamed from: b */
    public final C86197ag f332121b;

    /* renamed from: c */
    public final C86197ag f332122c;

    /* renamed from: d */
    public final C86197ag f332123d;

    /* renamed from: e */
    public final C86197ag f332124e;

    /* renamed from: f */
    public final C86197ag f332125f;

    /* renamed from: g */
    public final C86197ag f332126g;

    /* renamed from: h */
    public final C86197ag f332127h;

    /* renamed from: i */
    public final C86197ag f332128i;

    /* renamed from: j */
    public final C86197ag f332129j;

    /* renamed from: k */
    public final C86197ag f332130k;

    /* renamed from: l */
    public final C86197ag f332131l;

    /* renamed from: m */
    public final C86197ag f332132m;

    /* renamed from: n */
    public final C86197ag f332133n;

    /* renamed from: o */
    public final C57982a f332134o;

    /* renamed from: p */
    public final C57978d f332135p;

    /* renamed from: q */
    public final C57982a f332136q;

    /* renamed from: r */
    public final C57978d f332137r;

    /* renamed from: s */
    private final C86196af f332138s;

    /* renamed from: t */
    private final C86198ah f332139t;

    public C119052h() {
        C86196af afVar = new C86196af();
        this.f332138s = afVar;
        this.f332120a = afVar.mo79830a("search result", false);
        this.f332121b = afVar.mo79830a("tts result", false);
        this.f332122c = afVar.mo79830a("strucuted data contain audio bytes and data associated with tts, e.g. timepoints", false);
        this.f332123d = afVar.mo79830a("voice search results done", false);
        this.f332124e = afVar.mo79830a("no speech detected done", false);
        this.f332125f = afVar.mo79830a("query with recognized text", false);
        this.f332126g = afVar.mo79830a("audio capture cancelled", false);
        this.f332127h = afVar.mo79830a("audio capture started", false);
        this.f332128i = afVar.mo79830a("audio capture stopped", false);
        this.f332129j = afVar.mo79830a("start of speech detected", false);
        this.f332130k = afVar.mo79830a("no speech detected for SpeechCallbacks", false);
        this.f332131l = afVar.mo79830a("suppress results", false);
        this.f332132m = afVar.mo79830a("recognize exception", false);
        this.f332133n = afVar.mo79830a("limited connectivity detected", false);
        this.f332139t = new C86198ah(afVar);
        C57982a aVar = new C57982a();
        this.f332134o = aVar;
        C57978d dVar = new C57978d();
        this.f332135p = dVar;
        C57982a aVar2 = new C57982a();
        this.f332136q = aVar2;
        C57978d dVar2 = new C57978d();
        this.f332137r = dVar2;
        aVar.mo20440jJ(dVar);
        aVar2.mo20440jJ(dVar2);
    }

    /* renamed from: a */
    public final void mo104089a() {
        this.f332126g.mo79832b(C118826c.f331422a);
        this.f332136q.mo54589f(true);
    }

    /* renamed from: b */
    public final void mo104090b() {
        if (!this.f332127h.f232931a.isDone()) {
            this.f332127h.mo79832b(C118826c.f331422a);
        }
    }

    /* renamed from: c */
    public final void mo104091c() {
        this.f332128i.mo79832b(C118826c.f331422a);
    }

    /* renamed from: d */
    public final void mo104092d(C58833ax axVar) {
        if (!this.f332122c.f232931a.isDone()) {
            this.f332122c.mo79832b((C90606n) ((C58847bk) axVar).f156646a);
        }
    }

    /* renamed from: e */
    public final void mo104093e(C90456c cVar) {
        if (!this.f332132m.f232931a.isDone()) {
            this.f332132m.mo79832b(cVar);
        }
        C86198ah ahVar = this.f332139t;
        cVar.mo79845c();
        ahVar.mo79834a((Exception) cVar);
    }

    /* renamed from: f */
    public final void mo104094f() {
        this.f332133n.mo79832b(C118826c.f331422a);
    }

    /* renamed from: g */
    public final void mo104095g() {
        if (!this.f332124e.f232931a.isDone()) {
            this.f332124e.mo79832b(C118826c.f331422a);
        }
        this.f332136q.mo54589f(true);
    }

    /* renamed from: h */
    public final void mo104096h(C58833ax axVar) {
        this.f332125f.mo79832b((Query) ((C58847bk) axVar).f156646a);
    }

    /* renamed from: i */
    public final void mo104097i() {
        this.f332130k.mo79832b(C118826c.f331422a);
    }

    /* renamed from: j */
    public final void mo104098j() {
        this.f332129j.mo79832b(C118826c.f331422a);
    }

    /* renamed from: k */
    public final void mo104099k(Query query) {
        if (!this.f332131l.f232931a.isDone()) {
            this.f332131l.mo79832b(query);
        }
    }

    /* renamed from: l */
    public final void mo104100l(C58833ax axVar) {
        if (!this.f332121b.f232931a.isDone()) {
            this.f332121b.mo79832b((C63088z) ((C58847bk) axVar).f156646a);
        }
    }

    /* renamed from: m */
    public final void mo104101m() {
        if (!this.f332123d.f232931a.isDone()) {
            this.f332123d.mo79832b(C118826c.f331422a);
        }
        if (!this.f332121b.f232931a.isDone()) {
            this.f332121b.mo79833c();
        }
        this.f332136q.mo54589f(true);
    }
}
