package com.google.android.libraries.search.assistant.p2517f.p2532b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32805b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32820bo;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32821bp;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4522b.C58495hd;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.C69692j;
import p5462h.C69702k;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5537a.p5539b.p5540a.C70918c;
import p5535j.p5536a.p5537a.p5539b.p5540a.C70920e;
import p5535j.p5536a.p5537a.p5539b.p5540a.C70921f;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70981ah;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70982ai;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70984ak;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70985al;

/* renamed from: com.google.android.libraries.search.assistant.f.b.b */
/* compiled from: PG */
public final class C32917b {

    /* renamed from: a */
    public final C37215b f88228a;

    /* renamed from: b */
    public final C32805b f88229b;

    /* renamed from: c */
    public final AtomicReference f88230c = new AtomicReference("UNKNOWN");

    /* renamed from: d */
    private final C32858d f88231d;

    /* renamed from: e */
    private final C32849cq f88232e;

    /* renamed from: f */
    private final AtomicInteger f88233f = new AtomicInteger();

    public C32917b(C37215b bVar, C32805b bVar2, C32858d dVar, C32849cq cqVar) {
        C69664n.m101061g(bVar2, "accessSessionKey");
        this.f88228a = bVar;
        this.f88229b = bVar2;
        this.f88231d = dVar;
        this.f88232e = cqVar;
    }

    /* renamed from: a */
    public final void mo38346a() {
        if (this.f88233f.incrementAndGet() >= 65) {
            mo38347b((Throwable) null, C62722b.RESOURCE_EXHAUSTED);
            mo38349d(C62722b.RESOURCE_EXHAUSTED, true);
        }
    }

    /* renamed from: b */
    public final void mo38347b(Throwable th, C62722b bVar) {
        C70984ak akVar;
        C37252a b = C37176a.f97007dS.mo40804b();
        if (bVar == null) {
            C32905a.m60896b(b, th);
        } else {
            b.mo40781e(bVar);
        }
        String str = (String) this.f88230c.get();
        C62940bt btVar = C70985al.f189288h;
        C70982ai aiVar = (C70982ai) C70985al.f189287g.createBuilder();
        C69664n.m101060f(aiVar, "newBuilder()");
        C70981ah a = C69664n.m101061g(aiVar, "builder");
        C58495hd hdVar = C32933k.f88251a;
        if (str == null) {
            akVar = C70984ak.UNKNOWN_NOT_PROVIDED;
        } else {
            Object orDefault = C32933k.f88251a.getOrDefault(str, C70984ak.UNKNOWN_PROVIDED);
            C69664n.m101060f(orDefault, "KNOWN_CLIENTS.getOrDefau…ourceId.UNKNOWN_PROVIDED)");
            akVar = (C70984ak) orDefault;
        }
        C69664n.m101061g(akVar, "value");
        C70982ai aiVar2 = a.f189277a;
        aiVar2.copyOnWrite();
        C70985al alVar = (C70985al) aiVar2.instance;
        alVar.f189294e = akVar.f189286g;
        alVar.f189290a |= 8;
        ((C37253b) b).mo40792p(btVar, a.mo62596a());
        C32905a.m60897c(b, this.f88229b);
        this.f88228a.mo19974a(b);
        this.f88233f.set(0);
    }

    /* renamed from: c */
    public final void mo38348c() {
        mo38349d(C62722b.OK, false);
    }

    /* renamed from: d */
    public final void mo38349d(C62722b bVar, boolean z) {
        C37252a i = C37176a.f97006dR.mo40815i(bVar);
        C32905a.m60897c(i, this.f88229b);
        C32858d dVar = this.f88231d;
        C32849cq cqVar = z ? null : this.f88232e;
        C62940bt btVar = C70985al.f189288h;
        C70982ai aiVar = (C70982ai) C70985al.f189287g.createBuilder();
        C69664n.m101060f(aiVar, "newBuilder()");
        C70981ah a = C69664n.m101061g(aiVar, "builder");
        if (dVar != null) {
            String a2 = C32941s.m60950a(dVar);
            C70982ai aiVar2 = a.f189277a;
            aiVar2.copyOnWrite();
            C70985al alVar = (C70985al) aiVar2.instance;
            alVar.f189290a |= 2;
            alVar.f189292c = a2;
        }
        if (cqVar != null) {
            String b = C32941s.m60951b(cqVar);
            C70982ai aiVar3 = a.f189277a;
            aiVar3.copyOnWrite();
            C70985al alVar2 = (C70985al) aiVar3.instance;
            alVar2.f189290a |= 1;
            alVar2.f189291b = b;
        }
        ((C37253b) i).mo40792p(btVar, a.mo62596a());
        this.f88228a.mo19974a(i);
        mo38346a();
    }

    /* renamed from: e */
    public final void mo38350e(long j, Object obj) {
        C37252a g = C37176a.f97009dU.mo40813g();
        C32905a.m60896b(g, C69702k.m101124a(obj));
        if (true == (obj instanceof C69692j)) {
            obj = null;
        }
        C32821bp bpVar = (C32821bp) obj;
        if (bpVar != null) {
            C62940bt btVar = C70985al.f189288h;
            C70982ai aiVar = (C70982ai) C70985al.f189287g.createBuilder();
            C69664n.m101060f(aiVar, "newBuilder()");
            C70981ah a = C69664n.m101061g(aiVar, "builder");
            C70918c cVar = (C70918c) C70921f.f189120e.createBuilder();
            C69664n.m101060f(cVar, "newBuilder()");
            C69664n.m101061g(cVar, "builder");
            C32820bo a2 = C32820bo.m60788a(bpVar.f88017b);
            if (a2 == null) {
                a2 = C32820bo.UNRECOGNIZED;
            }
            C70920e c = C32941s.m60952c(a2);
            C69664n.m101060f(c, "convertToLogsSource(internalContextResult.source)");
            C69664n.m101061g(c, "value");
            cVar.copyOnWrite();
            C70921f fVar = (C70921f) cVar.instance;
            fVar.f189123b = c.f189119e;
            fVar.f189122a = 1 | fVar.f189122a;
            C62910ar arVar = bpVar.f88018c;
            if (arVar == null) {
                arVar = C62910ar.f169858c;
            }
            C69664n.m101060f(arVar, "internalContextResult.fetchDuration");
            C69664n.m101061g(arVar, "value");
            cVar.copyOnWrite();
            C70921f fVar2 = (C70921f) cVar.instance;
            arVar.getClass();
            fVar2.f189124c = arVar;
            fVar2.f189122a |= 2;
            C32801aw awVar = bpVar.f88016a;
            if (awVar == null) {
                awVar = C32801aw.f87978c;
            }
            int serializedSize = awVar.getSerializedSize();
            cVar.copyOnWrite();
            C70921f fVar3 = (C70921f) cVar.instance;
            fVar3.f189122a |= 4;
            fVar3.f189125d = serializedSize;
            C62942bv build = cVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C70921f fVar4 = (C70921f) build;
            C69664n.m101061g(fVar4, "value");
            C70982ai aiVar2 = a.f189277a;
            aiVar2.copyOnWrite();
            C70985al alVar = (C70985al) aiVar2.instance;
            fVar4.getClass();
            alVar.f189295f = fVar4;
            alVar.f189290a |= 16;
            ((C37253b) g).mo40792p(btVar, a.mo62596a());
        }
        C32905a.m60898d(g, this.f88229b, j);
        this.f88228a.mo19974a(g);
        mo38346a();
    }
}
