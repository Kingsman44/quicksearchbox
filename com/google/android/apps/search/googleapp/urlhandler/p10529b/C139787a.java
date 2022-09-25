package com.google.android.apps.search.googleapp.urlhandler.p10529b;

import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5545c.p5555f.C71166a;
import p5535j.p5536a.p5545c.p5555f.C71167b;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.b.a */
/* compiled from: PG */
public final class C139787a {

    /* renamed from: a */
    public final C37215b f379927a;

    public C139787a(C37215b bVar) {
        C69664n.m101061g(bVar, "appFlowLogger");
        this.f379927a = bVar;
    }

    /* renamed from: h */
    public static final void m227254h(C37252a aVar, C139789b bVar) {
        C62940bt btVar = C71167b.f189862e;
        C71166a aVar2 = (C71166a) C71167b.f189861d.createBuilder();
        long j = bVar.f379931b;
        aVar2.copyOnWrite();
        C71167b bVar2 = (C71167b) aVar2.instance;
        bVar2.f189864a |= 1;
        bVar2.f189865b = j;
        boolean z = bVar.f379932c;
        aVar2.copyOnWrite();
        C71167b bVar3 = (C71167b) aVar2.instance;
        bVar3.f189864a |= 2;
        bVar3.f189866c = z;
        ((C37253b) aVar).mo40792p(btVar, aVar2.build());
    }

    /* renamed from: a */
    public final void mo115238a(C139789b bVar) {
        C69664n.m101061g(bVar, "loggingData");
        C37215b bVar2 = this.f379927a;
        C37252a c = C37182a.f97855bh.mo40805c(C62722b.OK);
        m227254h(c, bVar);
        bVar2.mo19974a(c);
    }

    /* renamed from: b */
    public final void mo115239b() {
        this.f379927a.mo19974a(C37182a.f97858bk);
    }

    /* renamed from: c */
    public final void mo115240c(C139789b bVar) {
        C69664n.m101061g(bVar, "loggingData");
        C37215b bVar2 = this.f379927a;
        C37252a c = C37182a.f97859bl.mo40805c(C62722b.CANCELLED);
        m227254h(c, bVar);
        bVar2.mo19974a(c);
    }

    /* renamed from: d */
    public final void mo115241d(C139789b bVar) {
        C69664n.m101061g(bVar, "loggingData");
        C37215b bVar2 = this.f379927a;
        C37252a c = C37182a.f97859bl.mo40805c(C62722b.UNAVAILABLE);
        m227254h(c, bVar);
        bVar2.mo19974a(c);
    }

    /* renamed from: e */
    public final void mo115242e(C139789b bVar) {
        C69664n.m101061g(bVar, "loggingData");
        C37215b bVar2 = this.f379927a;
        C37252a c = C37182a.f97859bl.mo40805c(C62722b.OK);
        m227254h(c, bVar);
        bVar2.mo19974a(c);
    }

    /* renamed from: f */
    public final void mo115243f() {
        this.f379927a.mo19974a(C37182a.f97857bj);
    }

    /* renamed from: g */
    public final void mo115244g(C139851q qVar, Duration duration) {
        C37252a aVar;
        C69664n.m101061g(qVar, "source");
        C37215b bVar = this.f379927a;
        C139851q qVar2 = C139851q.UNKNOWN;
        switch (qVar.ordinal()) {
            case 0:
                aVar = C37182a.f97854bg.mo40779c();
                break;
            case 1:
                aVar = C37182a.f97794aZ.mo40779c();
                break;
            case 2:
                aVar = C37182a.f97851bd.mo40779c();
                break;
            case 3:
                aVar = C37182a.f97848ba.mo40779c();
                break;
            case 4:
                aVar = C37182a.f97849bb.mo40779c();
                break;
            case 5:
                aVar = C37182a.f97850bc.mo40779c();
                break;
            case 6:
                aVar = C37182a.f97852be.mo40779c();
                break;
            case 7:
                aVar = C37182a.f97853bf.mo40779c();
                break;
            case 8:
                aVar = C37182a.f97905ce.mo40779c();
                break;
            case 9:
                aVar = C37182a.f98089gC.mo40779c();
                break;
            case 10:
                aVar = C37182a.f98090gD.mo40779c();
                break;
            case 11:
                aVar = C37182a.f98171hf.mo40779c();
                break;
            default:
                throw new AssertionError("Unhandled enum value");
        }
        if (duration != null) {
            ((C37253b) aVar).mo40791o(duration.toNanos());
        }
        bVar.mo19974a(aVar);
    }
}
