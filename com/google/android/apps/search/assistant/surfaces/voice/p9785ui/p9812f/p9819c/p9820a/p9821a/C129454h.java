package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.p9820a.p9821a;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127120a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127173g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.a.a.h */
/* compiled from: PG */
public final class C129454h implements C46689ag {

    /* renamed from: a */
    public static final Duration f355437a = Duration.ofMillis(150);

    /* renamed from: b */
    public final C21370a f355438b;

    /* renamed from: c */
    public final C129448b f355439c;

    /* renamed from: d */
    public final C127173g f355440d;

    /* renamed from: e */
    private final Set f355441e;

    /* renamed from: f */
    private final C71422aw f355442f;

    /* renamed from: g */
    private final C71422aw f355443g;

    public C129454h(C127173g gVar, Set set, C21370a aVar, C129448b bVar, C71422aw awVar, C71422aw awVar2) {
        C69664n.m101061g(set, "features");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(bVar, "cache");
        C69664n.m101061g(awVar, "backgroundScope");
        C69664n.m101061g(awVar2, "lightweightScope");
        this.f355440d = gVar;
        this.f355441e = set;
        this.f355438b = aVar;
        this.f355439c = bVar;
        this.f355442f = awVar;
        this.f355443g = awVar2;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        return new C46463o(new C60817ay(C71663i.m104692e(this.f355443g, (C71424ay) null, new C129453g(this, (C69577g) null), 3)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return C71663i.m104692e(this.f355442f, (C71424ay) null, new C129452f(this, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18088c() {
        C46690ah ahVar = C127120a.f350019a;
        C69664n.m101060f(ahVar, "TRANSCRIPTION_KEY");
        return ahVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7 A[LOOP:2: B:25:0x00a1->B:27:0x00a7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0137 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109039d(p5462h.p5466c.C69577g r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.p9820a.p9821a.C129451e
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.a.a.e r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.p9820a.p9821a.C129451e) r0
            int r1 = r0.f355432c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f355432c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.a.a.e r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.a.a.e
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f355430a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f355432c
            r3 = 10
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            p5462h.C69714l.m101134b(r10)
            goto L_0x006a
        L_0x002a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0032:
            p5462h.C69714l.m101134b(r10)
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.util.Set r10 = r9.f355441e
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = p5462h.p5463a.C69540x.m100804k(r10, r3)
            r2.<init>(r6)
            java.util.Iterator r10 = r10.iterator()
        L_0x0046:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x0062
            java.lang.Object r6 = r10.next()
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.a r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129446a) r6
            kotlinx.coroutines.aw r7 = r9.f355442f
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.a.a.d r8 = new com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.a.a.d
            r8.<init>(r6, r5)
            r6 = 3
            kotlinx.coroutines.be r6 = kotlinx.coroutines.C71803m.m105042c(r7, r5, r5, r8, r6)
            r2.add(r6)
            goto L_0x0046
        L_0x0062:
            r0.f355432c = r4
            java.lang.Object r10 = kotlinx.coroutines.C71760h.m104949a(r2, r0)
            if (r10 == r1) goto L_0x0138
        L_0x006a:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = p5462h.p5463a.C69540x.m100828J(r10)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0079:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0094
            java.lang.Object r1 = r10.next()
            r2 = r1
            h.i r2 = (p5462h.C69685i) r2
            java.lang.Object r2 = r2.f186053b
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0079
            r0.add(r1)
            goto L_0x0079
        L_0x0094:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r1 = p5462h.p5463a.C69540x.m100804k(r0, r3)
            r10.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x00a1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b9
            java.lang.Object r1 = r0.next()
            h.i r1 = (p5462h.C69685i) r1
            java.lang.Object r1 = r1.f186052a
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.a r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129446a) r1
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.g r1 = r1.mo108219a()
            r10.add(r1)
            goto L_0x00a1
        L_0x00b9:
            java.util.Iterator r10 = r10.iterator()
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto L_0x00c4
            goto L_0x00fe
        L_0x00c4:
            java.lang.Object r5 = r10.next()
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto L_0x00cf
            goto L_0x00fe
        L_0x00cf:
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.g r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129460g) r0
            int r0 = r0.f355455b
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.f r0 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129459f.m211358a(r0)
            if (r0 != 0) goto L_0x00dc
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.f r0 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129459f.TRY_SAYING
        L_0x00dc:
            java.lang.Object r1 = r10.next()
            r2 = r1
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.g r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129460g) r2
            int r2 = r2.f355455b
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.f r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129459f.m211358a(r2)
            if (r2 != 0) goto L_0x00ed
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.f r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129459f.TRY_SAYING
        L_0x00ed:
            int r3 = r0.compareTo(r2)
            if (r3 <= 0) goto L_0x00f4
            r0 = r2
        L_0x00f4:
            if (r3 <= 0) goto L_0x00f7
            r5 = r1
        L_0x00f7:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00fe
            goto L_0x00dc
        L_0x00fe:
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.g r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129460g) r5
            if (r5 != 0) goto L_0x0137
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.g r10 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129460g.f355452c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.d r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129457d) r10
            java.lang.String r0 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            java.lang.String r0 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.f r0 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129459f.DEFAULT_NOT_VISIBLE
            java.lang.String r1 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)
            r10.copyOnWrite()
            com.google.protobuf.bv r1 = r10.instance
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.g r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129460g) r1
            int r0 = r0.f355451d
            r1.f355455b = r0
            int r0 = r1.f355454a
            r0 = r0 | r4
            r1.f355454a = r0
            com.google.protobuf.bv r10 = r10.build()
            java.lang.String r0 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.g r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129460g) r10
            return r10
        L_0x0137:
            return r5
        L_0x0138:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.p9820a.p9821a.C129454h.mo109039d(h.c.g):java.lang.Object");
    }
}
