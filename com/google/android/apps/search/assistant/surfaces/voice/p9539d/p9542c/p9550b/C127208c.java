package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9550b;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.libraries.search.assistant.invocation.p2646l.p2647a.C33930a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.b.c */
/* compiled from: PG */
public final class C127208c implements C127369n {

    /* renamed from: a */
    public static final C33476a f350246a = new C33476a("assistant.api.params.MediaParams", C51450id.f133992h);

    /* renamed from: b */
    public static final C32836cd f350247b;

    /* renamed from: c */
    private final C71422aw f350248c;

    /* renamed from: d */
    private final C59071e f350249d = C59071e.m91331h();

    /* renamed from: e */
    private final C33930a f350250e;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("media");
        a.mo38319b(a2.mo38298a());
        f350247b = a.mo38318a();
    }

    public C127208c(C33930a aVar, C71422aw awVar) {
        C69664n.m101061g(aVar, "mediaContextAccessorFactory");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f350250e = aVar;
        this.f350248c = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350248c, (C71424ay) null, new C127206a(this, iVar, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107995b(com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9550b.C127207b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.voice.d.c.b.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9550b.C127207b) r0
            int r1 = r0.f350245d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350245d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.b.b r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.b.b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f350243b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350245d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.f350242a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0029 }
            goto L_0x0082
        L_0x0029:
            r8 = move-exception
            goto L_0x008d
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.assistant.invocation.l.a.a r8 = r6.f350250e     // Catch:{ all -> 0x008a }
            com.google.android.apps.search.assistant.surfaces.voice.d.d.n r7 = r7.f350567e     // Catch:{ all -> 0x008a }
            if (r7 != 0) goto L_0x003e
            com.google.android.apps.search.assistant.surfaces.voice.d.d.n r7 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127294n.f350576c     // Catch:{ all -> 0x008a }
        L_0x003e:
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = r7.f350579b     // Catch:{ all -> 0x008a }
            if (r7 != 0) goto L_0x0044
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x008a }
        L_0x0044:
            java.lang.String r2 = "queryContext.triggeringInfo.invocationToken"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "token"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r2)     // Catch:{ all -> 0x008a }
            com.google.android.apps.gsa.binaries.satin.app.apd r2 = r8.f90499b     // Catch:{ all -> 0x008a }
            com.google.android.libraries.search.assistant.invocation.l.c.b r8 = r8.f90498a     // Catch:{ all -> 0x008a }
            com.google.android.libraries.search.assistant.invocation.l.a.d r4 = new com.google.android.libraries.search.assistant.invocation.l.a.d     // Catch:{ all -> 0x008a }
            com.google.android.apps.gsa.binaries.satin.app.aqd r2 = r2.f199127a     // Catch:{ all -> 0x008a }
            com.google.android.apps.gsa.binaries.satin.app.aqy r2 = r2.a     // Catch:{ all -> 0x008a }
            g.a.a r2 = r2.H     // Catch:{ all -> 0x008a }
            java.lang.Object r2 = r2.mo17428b()     // Catch:{ all -> 0x008a }
            kotlinx.coroutines.aw r2 = (kotlinx.coroutines.C71422aw) r2     // Catch:{ all -> 0x008a }
            r4.<init>(r2, r8, r7)     // Catch:{ all -> 0x008a }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = r4.f90507d     // Catch:{ all -> 0x008a }
            com.google.frameworks.client.a.a.b r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r7)     // Catch:{ all -> 0x008a }
            kotlinx.coroutines.aw r8 = r4.f90505b     // Catch:{ all -> 0x008a }
            com.google.android.libraries.search.assistant.invocation.l.a.c r2 = new com.google.android.libraries.search.assistant.invocation.l.a.c     // Catch:{ all -> 0x008a }
            r5 = 0
            r2.<init>(r7, r4, r5)     // Catch:{ all -> 0x008a }
            r7 = 3
            com.google.common.util.concurrent.cx r7 = kotlinx.coroutines.p5578d.C71663i.m104692e(r8, r5, r2, r7)     // Catch:{ all -> 0x008a }
            r0.f350242a = r6     // Catch:{ all -> 0x008a }
            r0.f350245d = r3     // Catch:{ all -> 0x008a }
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)     // Catch:{ all -> 0x008a }
            if (r8 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r7 = r6
        L_0x0082:
            com.google.assistant.e.i.a.id r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51450id) r8     // Catch:{ all -> 0x0029 }
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.d.c.b.c r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9550b.C127208c) r0     // Catch:{ all -> 0x0029 }
            com.google.common.f.e r7 = r0.f350249d     // Catch:{ all -> 0x0029 }
            goto L_0x00b4
        L_0x008a:
            r7 = move-exception
            r8 = r7
            r7 = r6
        L_0x008d:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.b.c r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9550b.C127208c) r7
            com.google.common.f.e r7 = r7.f350249d
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.x r7 = r7.mo56382g(r8)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r8 = new com.google.common.f.n
            r0 = 37259(0x918b, float:5.2211E-41)
            r8.<init>(r0)
            r7.mo56379ah(r8)
            java.lang.String r8 = "[NonFatal]Error while getting media context"
            r7.mo56386p(r8)
            com.google.assistant.e.i.a.id r8 = com.google.assistant.p3897e.p3917i.p3918a.C51450id.f133992h
            java.lang.String r7 = "{\n      logger.atWarning…etDefaultInstance()\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r7)
        L_0x00b4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9550b.C127208c.mo107995b(com.google.android.apps.search.assistant.surfaces.voice.d.d.i, h.c.g):java.lang.Object");
    }
}
