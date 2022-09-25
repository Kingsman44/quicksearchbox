package com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125761aa;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125774an;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.b.r */
/* compiled from: PG */
final class C125288r extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C125290t f345628a;

    /* renamed from: b */
    final /* synthetic */ Instant f345629b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125288r(C125290t tVar, Instant instant) {
        super(0);
        this.f345628a = tVar;
        this.f345629b = instant;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        Duration between = Duration.between(this.f345629b, this.f345628a.f345633c.mo57444a());
        C125290t tVar = this.f345628a;
        C69664n.m101060f(between, "stallDuration");
        C125761aa aaVar = tVar.f345636f;
        Object obj = tVar.f345634d.get();
        if (obj == null) {
            obj = "<empty>";
        }
        long j = tVar.f345635e.get();
        C125774an anVar = aaVar.f346589a;
        C59052c cVar = (C59052c) C125774an.f346613a.mo56225c();
        cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.ASSISTANT_DICTATION_ORATION_PROCESSOR_STALLED_VALUE));
        ((C59052c) cVar.mo56372aa(36680)).mo56359L("Keyboard event handling stalling for %s, event: %s, in queue: %s [SD]", C126290c.m206496a(between), obj, C126290c.m206496a(Long.valueOf(j)));
        C46459k.m82829b(anVar.mo107110b(C63122a.FAILURE_ORATION_PROCESSOR_STALLED), "Failed to end dictation on stall. [SD]", new Object[0]);
        anVar.f346627n = anVar.mo107109a();
        return C69788q.f186170a;
    }
}
