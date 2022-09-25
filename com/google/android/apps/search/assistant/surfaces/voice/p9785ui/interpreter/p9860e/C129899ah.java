package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.p9862b.C129925g;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.ah */
/* compiled from: PG */
public final class C129899ah implements C129895ad {

    /* renamed from: b */
    public final C129925g f356341b;

    /* renamed from: c */
    public final C46778cv f356342c;

    /* renamed from: d */
    public final C71788b f356343d = new C71799m();

    /* renamed from: e */
    public final C129943br f356344e;

    /* renamed from: f */
    private final C71422aw f356345f;

    public C129899ah(C129925g gVar, C71422aw awVar, C46778cv cvVar, C129943br brVar) {
        C69664n.m101061g(awVar, "lightWeightScope");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(brVar, "storeAccessor");
        this.f356341b = gVar;
        this.f356345f = awVar;
        this.f356342c = cvVar;
        this.f356344e = brVar;
    }

    /* renamed from: a */
    public final C60870cx mo109334a() {
        return C71663i.m104692e(this.f356345f, (C71424ay) null, new C129896ae(this, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final C60870cx mo109335b(C129940bo boVar) {
        C69664n.m101061g(boVar, "stateUpdateEvent");
        return C71663i.m104692e(this.f356345f, (C71424ay) null, new C129898ag(this, boVar, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109336c(com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129966q r6, java.lang.String r7, java.lang.String r8, p5462h.p5466c.C69577g r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129897af
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.af r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129897af) r0
            int r1 = r0.f356334d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f356334d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.af r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.af
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f356332b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f356334d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r6 = r0.f356331a
            p5462h.C69714l.m101134b(r9)
            goto L_0x006a
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            p5462h.C69714l.m101134b(r9)
            int r6 = r6.f356473f
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.b r6 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129918b.m212112a(r6)
            if (r6 != 0) goto L_0x003e
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.b r6 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129918b.UNRECOGNIZED
        L_0x003e:
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.b r9 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129918b.MODE_NOT_SELECTED
            if (r6 == r9) goto L_0x0045
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0045:
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.b.g r6 = r5.f356341b
            java.lang.String r9 = "sourceLocale"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r9)
            java.lang.String r9 = "targetLocale"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r9)
            kotlinx.coroutines.aw r9 = r6.f356385b
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.b.e r2 = new com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.b.e
            r4 = 0
            r2.<init>(r7, r8, r6, r4)
            r6 = 3
            com.google.common.util.concurrent.cx r6 = kotlinx.coroutines.p5578d.C71663i.m104692e(r9, r4, r2, r6)
            r0.f356331a = r5
            r0.f356334d = r3
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r9 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r6 = r5
        L_0x006a:
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.b r9 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129918b) r9
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.ah r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129899ah) r6
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.br r6 = r6.f356344e
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.aj r7 = r6.f356412a
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.bo r8 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo.f356407c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.bn r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129939bn) r8
            java.lang.String r0 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r0)
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.bq r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.bg r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129932bg.f356393b
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.bf r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129931bf) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r0)
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.bi r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            r0.mo109347b(r9)
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.bg r9 = r0.mo109346a()
            r8.mo109351d(r9)
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.bo r8 = r8.mo109348a()
            com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.aj r7 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.p9863c.C129952h.m212138a(r7, r8)
            r6.mo109352a(r7)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129899ah.mo109336c(com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.q, java.lang.String, java.lang.String, h.c.g):java.lang.Object");
    }
}
