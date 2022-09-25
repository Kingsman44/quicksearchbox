package com.google.android.apps.search.googleapp.p10516t.p10522f;

import com.google.android.apps.search.googleapp.p10335j.C136374e;
import com.google.android.libraries.assistant.p1533o.C18435a;
import com.google.android.libraries.assistant.p1533o.p1534a.C18437b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62957cd;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5545c.p5548c.p5552d.C71147a;
import p5535j.p5536a.p5545c.p5548c.p5552d.C71148b;
import p5535j.p5536a.p5545c.p5548c.p5552d.C71149c;
import p5535j.p5536a.p5545c.p5548c.p5552d.C71150d;

/* renamed from: com.google.android.apps.search.googleapp.t.f.c */
/* compiled from: PG */
public final class C139708c {

    /* renamed from: a */
    public final AtomicReference f379734a;

    /* renamed from: b */
    public final String f379735b = "voiceSearch";

    /* renamed from: c */
    public volatile boolean f379736c;

    /* renamed from: d */
    public volatile boolean f379737d;

    /* renamed from: e */
    private final boolean f379738e;

    /* renamed from: f */
    private final C37215b f379739f;

    /* renamed from: g */
    private final Optional f379740g;

    /* renamed from: h */
    private final C136374e f379741h;

    public C139708c(boolean z, C37215b bVar, AtomicReference atomicReference, Optional optional, C136374e eVar) {
        C69664n.m101061g(bVar, "appFlowLogger");
        C69664n.m101061g(atomicReference, "voiceEntrySourceHolder");
        C69664n.m101061g(optional, "voiceSearchLoggingConsumer");
        this.f379738e = z;
        this.f379739f = bVar;
        this.f379734a = atomicReference;
        this.f379740g = optional;
        this.f379741h = eVar;
    }

    /* renamed from: a */
    public final void mo115174a() {
        this.f379734a.set(Optional.m71637of(C37182a.f97978dy));
        C37258g gVar = C37182a.f97978dy;
        C69664n.m101060f(gVar, "GOOGLEAPP_ERROR_CARD_VOICE_SEARCH_RETRY");
        mo115177d(gVar);
    }

    /* renamed from: b */
    public final void mo115175b(Duration duration) {
        C69664n.m101061g(duration, "elapsedTime");
        mo115176c(C37182a.f97869bv.mo40811d(duration.toNanos()));
    }

    /* renamed from: c */
    public final void mo115176c(C37252a aVar) {
        if (this.f379741h.mo112951a()) {
            if (this.f379738e && this.f379740g.isPresent()) {
                ((C139706a) this.f379740g.get()).mo113740a(aVar);
            }
            this.f379739f.mo19974a(aVar);
        }
    }

    /* renamed from: d */
    public final void mo115177d(C37254c cVar) {
        C37252a c = cVar.mo40779c();
        C69664n.m101060f(c, "event.toBuilder()");
        mo115176c(c);
    }

    /* renamed from: e */
    public final void mo115178e() {
        C37258g gVar = C37182a.f97870bw;
        C69664n.m101060f(gVar, "GOOGLEAPP_VOICE_SEARCH_COMMIT");
        mo115177d(gVar);
    }

    /* renamed from: f */
    public final void mo115179f(C139707b bVar, String str) {
        C69664n.m101061g(bVar, "status");
        mo115180g(bVar, str, (C18435a) null);
    }

    /* renamed from: g */
    public final void mo115180g(C139707b bVar, String str, C18435a aVar) {
        Object obj;
        C69664n.m101061g(bVar, "status");
        if (bVar == C139707b.SRP_SUCCESS) {
            this.f379736c = true;
        }
        if (bVar == C139707b.ASSISTANT_LAUNCHED) {
            this.f379737d = true;
        }
        C37252a a = C37182a.f97871bx.mo40803a(bVar.f379733q, this.f379735b);
        if (aVar != null) {
            C62940bt btVar = C71150d.f189800d;
            C71149c cVar = (C71149c) C71150d.f189799c.createBuilder();
            C71147a aVar2 = (C71147a) C71148b.f189792e.createBuilder();
            int i = aVar.mo23985b().f52330b;
            aVar2.copyOnWrite();
            C71148b bVar2 = (C71148b) aVar2.instance;
            bVar2.f189794a |= 1;
            bVar2.f189795b = i;
            C62940bt c = C62921ba.m95368a().mo58830c(C18437b.f52327e, aVar.mo23985b().f52330b);
            int i2 = 0;
            if (c != null && C18435a.m35910c(c)) {
                C18437b b = aVar.mo23985b();
                C62940bt r4 = C62942bv.checkIsLite(c);
                b.mo58887l(r4);
                Object l = b.f169962ag.mo58854l(r4.f169971d);
                if (l == null) {
                    obj = r4.f169969b;
                } else {
                    obj = r4.mo58889c(l);
                }
                C62957cd cdVar = (C62957cd) obj;
                cdVar.getClass();
                i2 = cdVar.getNumber();
            }
            aVar2.copyOnWrite();
            C71148b bVar3 = (C71148b) aVar2.instance;
            bVar3.f189794a |= 2;
            bVar3.f189796c = i2;
            String str2 = aVar.mo23985b().f52332d;
            aVar2.copyOnWrite();
            C71148b bVar4 = (C71148b) aVar2.instance;
            str2.getClass();
            bVar4.f189794a |= 4;
            bVar4.f189797d = str2;
            C71148b bVar5 = (C71148b) aVar2.build();
            cVar.copyOnWrite();
            C71150d dVar = (C71150d) cVar.instance;
            bVar5.getClass();
            dVar.f189803b = bVar5;
            dVar.f189802a |= 1;
            ((C37253b) a).mo40792p(btVar, cVar.build());
        }
        if (str != null) {
            ((C37253b) a).mo40794r(str);
        }
        mo115176c(a);
    }

    /* renamed from: h */
    public final void mo115181h() {
        this.f379734a.set(Optional.m71637of(C37182a.f97864bq));
        C37258g gVar = C37182a.f97864bq;
        C69664n.m101060f(gVar, "GOOGLEAPP_VOICE_PLATE_MIC_TAP");
        mo115177d(gVar);
    }
}
