package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9570v;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2828y.p2830b.p2831a.p2832a.C36851a;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.v.c */
/* compiled from: PG */
public final class C127269c implements C32597b {

    /* renamed from: a */
    public static final /* synthetic */ int f350502a = 0;

    /* renamed from: b */
    private static final C32836cd f350503b;

    /* renamed from: c */
    private final C71422aw f350504c;

    /* renamed from: d */
    private final C68214a f350505d;

    /* renamed from: e */
    private final C32601f f350506e = new C32601f();

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        int i = C36851a.ASSISTANT_HISTORY_TYPED_NGRAMS.f95994c;
        C32788aj ajVar2 = a2.f87977a;
        ajVar2.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar2.instance;
        arVar.f87975a = 3;
        arVar.f87976b = Integer.valueOf(i);
        a.mo38319b(a2.mo38298a());
        f350503b = a.mo38318a();
    }

    public C127269c(C71422aw awVar, C68214a aVar) {
        C69664n.m101061g(awVar, "backgroundScope");
        C69664n.m101061g(aVar, "fetcher");
        this.f350504c = awVar;
        this.f350505d = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108007a(p5462h.p5466c.C69577g r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9570v.C127268b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.surfaces.voice.d.c.v.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9570v.C127268b) r0
            int r1 = r0.f350501c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350501c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.v.b r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.v.b
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f350499a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350501c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r11)
            goto L_0x005e
        L_0x0027:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x002f:
            p5462h.C69714l.m101134b(r11)
            dagger.a r11 = r10.f350505d
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.libraries.search.assistant.y.b.a.f r11 = (com.google.android.libraries.search.assistant.p2828y.p2830b.p2831a.C36858f) r11
            com.google.android.libraries.search.i.m r4 = r11.f96004b
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.ASSISTANT_HISTORY
            com.google.protos.ap.a.a.ac r7 = com.google.protos.p4874ap.p4875a.p4876a.C63662ac.f172144a
            com.google.protos.p.b.n r9 = com.google.protos.p5129p.p5131b.C65845n.f178992c
            r6 = 0
            r8 = 60
            com.google.common.util.concurrent.cx r2 = r4.mo41433d(r5, r6, r7, r8, r9)
            com.google.android.libraries.search.assistant.y.b.a.e r4 = com.google.android.libraries.search.assistant.p2828y.p2830b.p2831a.C36857e.f96002a
            java.util.concurrent.Executor r11 = r11.f96005c
            com.google.common.base.ah r4 = com.google.apps.tiktok.tracing.C47810es.m84963c(r4)
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60922j.m93044g(r2, r4, r11)
            r0.f350501c = r3
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r0)
            if (r11 != r1) goto L_0x005e
            return r1
        L_0x005e:
            java.lang.String r0 = "fetcher.get().fetchAssis…toryTypedNgrams().await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9570v.C127269c.mo108007a(h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final C32601f mo38173c() {
        return this.f350506e;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f350503b;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350504c, (C71424ay) null, new C127267a(this, (C69577g) null), 3);
    }
}
