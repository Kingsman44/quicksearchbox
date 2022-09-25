package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9547ad;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.p2828y.p2862s.C37149e;
import com.google.assistant.p3897e.p3917i.p3918a.C51607nz;
import com.google.assistant.p3897e.p3917i.p3918a.C51609oa;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.ad.f */
/* compiled from: PG */
public final class C127202f implements C32597b {
    @Deprecated

    /* renamed from: a */
    public static final C33476a f350217a;
    @Deprecated

    /* renamed from: b */
    private static final C32836cd f350218b;

    /* renamed from: c */
    private final C68214a f350219c;

    /* renamed from: d */
    private final C37149e f350220d;

    /* renamed from: e */
    private final C71422aw f350221e;

    static {
        C51607nz nzVar = (C51607nz) C51609oa.f134502b.createBuilder();
        C69664n.m101060f(nzVar, "newBuilder()");
        f350217a = new C33476a("assistant.api.params.TopContactParams", C69664n.m101061g(nzVar, "builder").mo53658a());
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("asst.communication.top_contact");
        a.mo38319b(a2.mo38298a());
        f350218b = a.mo38318a();
    }

    public C127202f(C68214a aVar, C37149e eVar, C71422aw awVar) {
        C69664n.m101061g(aVar, "deviceContactsGuard");
        C69664n.m101061g(awVar, "backgroundScope");
        this.f350219c = aVar;
        this.f350220d = eVar;
        this.f350221e = awVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107994a(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9547ad.C127201e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.d.c.ad.e r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9547ad.C127201e) r0
            int r1 = r0.f350216d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350216d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.ad.e r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.ad.e
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f350214b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350216d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r0 = r0.f350213a
            java.io.Closeable r0 = (java.io.Closeable) r0
            p5462h.C69714l.m101134b(r7)     // Catch:{ all -> 0x002f }
            goto L_0x00a7
        L_0x002f:
            r7 = move-exception
            goto L_0x00b6
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003a:
            java.lang.Object r2 = r0.f350213a
            com.google.android.apps.search.assistant.surfaces.voice.d.c.ad.f r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9547ad.C127202f) r2
            p5462h.C69714l.m101134b(r7)
            goto L_0x0058
        L_0x0042:
            p5462h.C69714l.m101134b(r7)
            dagger.a r7 = r6.f350219c
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.search.assistant.surfaces.voice.d.c.ad.c r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9547ad.C127199c) r7
            r0.f350213a = r6
            r0.f350216d = r4
            java.lang.Object r7 = r7.mo107993a(r0)
            if (r7 == r1) goto L_0x00bc
            r2 = r6
        L_0x0058:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x0076
            com.google.assistant.e.i.a.oa r7 = com.google.assistant.p3897e.p3917i.p3918a.C51609oa.f134502b
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.i.a.nz r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51607nz) r7
            java.lang.String r0 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)
            com.google.assistant.e.i.a.ns r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            com.google.assistant.e.i.a.oa r7 = r7.mo53658a()
            return r7
        L_0x0076:
            com.google.android.libraries.search.m.b.b r7 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_ASSISTANT_VOICE
            java.lang.String r7 = com.google.android.libraries.search.p3047m.p3050b.C39227c.m68658b(r7)
            com.google.apps.tiktok.tracing.bi r7 = com.google.apps.tiktok.p3624b.C46356a.m82648a(r7)
            com.google.android.libraries.search.assistant.y.s.e r2 = r2.f350220d     // Catch:{ all -> 0x00b2 }
            com.google.android.libraries.search.assistant.y.s.a r4 = new com.google.android.libraries.search.assistant.y.s.a     // Catch:{ all -> 0x00b2 }
            r4.<init>()     // Catch:{ all -> 0x00b2 }
            r4.mo40613b()     // Catch:{ all -> 0x00b2 }
            r4.mo40614c()     // Catch:{ all -> 0x00b2 }
            com.google.android.libraries.search.assistant.y.s.d r4 = r4.mo40612a()     // Catch:{ all -> 0x00b2 }
            com.google.common.util.concurrent.cx r2 = r2.mo40647a(r4)     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = "topContactParamsFetcher\n…true).build()\n          )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)     // Catch:{ all -> 0x00b2 }
            r0.f350213a = r7     // Catch:{ all -> 0x00b2 }
            r0.f350216d = r3     // Catch:{ all -> 0x00b2 }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)     // Catch:{ all -> 0x00b2 }
            if (r0 == r1) goto L_0x00b1
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x00a7:
            java.lang.String r1 = "topContactParamsFetcher\n…     )\n          .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r1)     // Catch:{ all -> 0x002f }
            r1 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            return r7
        L_0x00b1:
            return r1
        L_0x00b2:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x00b6:
            throw r7     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r7)
            throw r1
        L_0x00bc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9547ad.C127202f.mo107994a(h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f350218b;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350221e, (C71424ay) null, new C127200d(this, (C69577g) null), 3);
    }
}
