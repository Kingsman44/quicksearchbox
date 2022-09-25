package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9050c.p9051a.C120082b;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9050c.p9051a.C120084d;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C122014ax;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c.C33509c;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c.C33510d;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2621b.C33731b;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2621b.C33732c;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33760a;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2627b.C33873a;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2628c.C33874a;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2630e.C33881a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71547cx;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71557dg;
import kotlinx.coroutines.p5574b.C71571du;
import kotlinx.coroutines.p5574b.C71574dx;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.ar */
/* compiled from: PG */
public final class C121892ar implements C33760a, C121899ay, C33509c, C33881a, C121986bu, C33874a {

    /* renamed from: a */
    public static final C59071e f338248a = C59071e.m91331h();

    /* renamed from: b */
    public final C71788b f338249b = new C71799m();

    /* renamed from: c */
    public C33514d f338250c;

    /* renamed from: d */
    public final C121895au f338251d;

    /* renamed from: e */
    private final C33732c f338252e;

    /* renamed from: f */
    private final C71422aw f338253f;

    /* renamed from: g */
    private final C33873a f338254g;

    /* renamed from: h */
    private final C121985bt f338255h;

    /* renamed from: i */
    private final C33731b f338256i;

    /* renamed from: j */
    private final C33510d f338257j;

    /* renamed from: k */
    private final NavigableMap f338258k;

    /* renamed from: l */
    private final C71548cy f338259l;

    /* renamed from: m */
    private final C71547cx f338260m;

    /* renamed from: n */
    private final C120084d f338261n;

    /* renamed from: o */
    private final C120082b f338262o;

    public C121892ar(C33732c cVar, C120084d dVar, C120082b bVar, C71422aw awVar, C33873a aVar, C121985bt btVar, C121895au auVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "triggeringApiEntrypoint");
        C69664n.m101061g(btVar, "sessionIdGenerator");
        C69664n.m101061g(auVar, "eventCollector");
        this.f338252e = cVar;
        this.f338261n = dVar;
        this.f338262o = bVar;
        this.f338253f = awVar;
        this.f338254g = aVar;
        this.f338255h = btVar;
        this.f338251d = auVar;
        this.f338256i = cVar.mo39053a(1);
        this.f338257j = new C33510d(this);
        this.f338258k = new TreeMap(new C121889ao());
        this.f338259l = C71574dx.m104480b(C122014ax.UNKNOWN_STATE);
        this.f338260m = C71557dg.m104447e(0, 0, (C71387t) null, 7);
    }

    /* renamed from: B */
    private final C121981bp m201330B(Bundle bundle, int i) {
        return new C121981bp(C120082b.m199006a(bundle), bundle, i);
    }

    /* renamed from: C */
    private final C121984bs m201331C(C33514d dVar) {
        C121984bs bsVar = (C121984bs) this.f338258k.get(dVar);
        if (bsVar != null) {
            return bsVar;
        }
        throw new C121896av("Requesting Voice Interaction Session resource for unknown session id.");
    }

    /* renamed from: D */
    private final C33514d m201332D() {
        C58976aa aaVar = C58975e.f156826a;
        C33514d dVar = new C33514d(this.f338255h.f338514a.incrementAndGet());
        this.f338258k.put(dVar, new C121984bs(this.f338252e));
        return dVar;
    }

    /* renamed from: E */
    private final void m201333E() {
        C121984bs bsVar;
        C33514d dVar = this.f338250c;
        while (true) {
            NavigableMap navigableMap = this.f338258k;
            if (!(dVar == null || (bsVar = (C121984bs) navigableMap.remove(dVar)) == null)) {
                C58976aa aaVar = C58975e.f156826a;
                bsVar.mo105510a();
                dVar = (C33514d) this.f338258k.lowerKey(dVar);
            }
        }
        this.f338250c = null;
    }

    /* renamed from: A */
    public final void mo105411A(C69626l lVar) {
        try {
            C121984bs bsVar = (C121984bs) this.f338258k.get(this.f338250c);
            if (bsVar != null) {
                lVar.mo5761a(bsVar);
                return;
            }
            throw new C121896av("No active or pending session.");
        } catch (C121896av e) {
            C59052c cVar = (C59052c) f338248a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "INV.ApaVIHandler");
            C59052c cVar2 = (C59052c) cVar.mo56382g(e);
            cVar2.mo56379ah(new C59094n(36012));
            cVar2.mo56386p("No active or pending session.");
        }
    }

    /* renamed from: a */
    public final void mo38938a(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, Optional optional, Optional optional2) {
        C69664n.m101061g(optional, "activityId");
        C69664n.m101061g(optional2, "mappedActivityId");
        C46459k.m82829b(C71663i.m104692e(this.f338253f, (C71424ay) null, new C121879ae(this, assistContent, optional2, bundle, assistStructure, (C69577g) null), 3), "Failed to populate assist state data", new Object[0]);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078 A[Catch:{ all -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105419u(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121888an
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.c.an r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121888an) r0
            int r1 = r0.f338236f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338236f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.an r0 = new com.google.android.apps.search.assistant.platform.j.b.c.an
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f338234d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338236f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r7 = r0.f338233c
            java.lang.Object r1 = r0.f338232b
            java.lang.Object r0 = r0.f338231a
            p5462h.C69714l.m101134b(r8)
            r8 = r7
            r7 = r1
            goto L_0x004c
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r6.f338249b
            r0.f338231a = r6
            r0.f338232b = r7
            r0.f338233c = r8
            r0.f338236f = r3
            java.lang.Object r0 = r8.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x0094
            r0 = r6
        L_0x004c:
            com.google.common.f.e r1 = f338248a     // Catch:{ all -> 0x008f }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x008f }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x008f }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "INV.ApaVIHandler"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "#releaseResources for session(%s)."
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x008f }
            r5 = 36006(0x8ca6, float:5.0455E-41)
            r3.<init>(r5)     // Catch:{ all -> 0x008f }
            r1.mo56379ah(r3)     // Catch:{ all -> 0x008f }
            r1.mo56389s(r2, r7)     // Catch:{ all -> 0x008f }
            r1 = r0
            com.google.android.apps.search.assistant.platform.j.b.c.ar r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r1     // Catch:{ all -> 0x008f }
            java.util.NavigableMap r1 = r1.f338258k     // Catch:{ all -> 0x008f }
            java.lang.Object r1 = r1.remove(r7)     // Catch:{ all -> 0x008f }
            com.google.android.apps.search.assistant.platform.j.b.c.bs r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121984bs) r1     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x007b
            r1.mo105510a()     // Catch:{ all -> 0x008f }
        L_0x007b:
            com.google.android.apps.search.assistant.platform.j.b.c.bo r1 = new com.google.android.apps.search.assistant.platform.j.b.c.bo     // Catch:{ all -> 0x008f }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r7 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r7     // Catch:{ all -> 0x008f }
            r1.<init>(r7)     // Catch:{ all -> 0x008f }
            com.google.android.apps.search.assistant.platform.j.b.c.ar r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r0     // Catch:{ all -> 0x008f }
            com.google.android.apps.search.assistant.platform.j.b.c.au r7 = r0.f338251d     // Catch:{ all -> 0x008f }
            r7.mo105424a(r1)     // Catch:{ all -> 0x008f }
            r8.mo63026c(r4)
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x008f:
            r7 = move-exception
            r8.mo63026c(r4)
            throw r7
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo105419u(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39108v(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2594d.C33516b r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121890ap
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.c.ap r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121890ap) r0
            int r1 = r0.f338242f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338242f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.ap r0 = new com.google.android.apps.search.assistant.platform.j.b.c.ap
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f338240d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338242f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r7 = r0.f338237a
            kotlinx.coroutines.j.b r7 = (kotlinx.coroutines.p5584j.C71788b) r7
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x002f }
            goto L_0x006b
        L_0x002f:
            r8 = move-exception
            goto L_0x0072
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            java.lang.Object r7 = r0.f338239c
            java.lang.Object r2 = r0.f338238b
            java.lang.Object r4 = r0.f338237a
            com.google.android.apps.search.assistant.platform.j.b.c.ar r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r4
            p5462h.C69714l.m101134b(r8)
            goto L_0x005b
        L_0x0045:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r6.f338249b
            r0.f338237a = r6
            r0.f338238b = r7
            r0.f338239c = r8
            r0.f338242f = r4
            java.lang.Object r2 = r8.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x0076
            r4 = r6
            r2 = r7
            r7 = r8
        L_0x005b:
            r0.f338237a = r7     // Catch:{ all -> 0x002f }
            r0.f338238b = r5     // Catch:{ all -> 0x002f }
            r0.f338239c = r5     // Catch:{ all -> 0x002f }
            r0.f338242f = r3     // Catch:{ all -> 0x002f }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d.b r2 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2594d.C33516b) r2     // Catch:{ all -> 0x002f }
            java.lang.Object r8 = r4.mo105420w(r2, r0)     // Catch:{ all -> 0x002f }
            if (r8 == r1) goto L_0x0071
        L_0x006b:
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r8 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r8     // Catch:{ all -> 0x002f }
            r7.mo63026c(r5)
            return r8
        L_0x0071:
            return r1
        L_0x0072:
            r7.mo63026c(r5)
            throw r8
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo39108v(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d.b, h.c.g):java.lang.Object");
    }

    /* renamed from: x */
    public final String mo105421x(AssistContent assistContent) {
        ComponentName component;
        Intent intent = assistContent.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return null;
        }
        return component.getPackageName();
    }

    /* renamed from: y */
    public final /* synthetic */ C71587n mo105422y() {
        return this.f338260m;
    }

    /* renamed from: z */
    public final /* synthetic */ C71571du mo105423z() {
        return this.f338259l;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39064i(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122065y
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.c.y r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122065y) r0
            int r1 = r0.f338657e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338657e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.y r0 = new com.google.android.apps.search.assistant.platform.j.b.c.y
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f338655c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338657e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f338654b
            java.lang.Object r0 = r0.f338653a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x002f }
            goto L_0x0088
        L_0x002f:
            r8 = move-exception
            goto L_0x009b
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            java.lang.Object r2 = r0.f338654b
            java.lang.Object r4 = r0.f338653a
            p5462h.C69714l.m101134b(r8)
            r8 = r2
            goto L_0x0073
        L_0x0042:
            p5462h.C69714l.m101134b(r8)
            com.google.common.f.e r8 = f338248a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "INV.ApaVIHandler"
            r8.mo56378ag(r2, r6)
            com.google.common.f.n r2 = new com.google.common.f.n
            r6 = 35996(0x8c9c, float:5.0441E-41)
            r2.<init>(r6)
            r8.mo56379ah(r2)
            java.lang.String r2 = "onCloseSystemDialogs"
            r8.mo56386p(r2)
            kotlinx.coroutines.j.b r8 = r7.f338249b
            r0.f338653a = r7
            r0.f338654b = r8
            r0.f338657e = r4
            java.lang.Object r2 = r8.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x009f
            r4 = r7
        L_0x0073:
            r2 = r4
            com.google.android.apps.search.assistant.platform.j.b.c.ar r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r2     // Catch:{ all -> 0x0098 }
            kotlinx.coroutines.b.cx r2 = r2.f338260m     // Catch:{ all -> 0x0098 }
            com.google.android.apps.search.assistant.platform.j.b.c.c.aw r6 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C122013aw.CLOSE_SYSTEM_DIALOGS_REQUESTED     // Catch:{ all -> 0x0098 }
            r0.f338653a = r4     // Catch:{ all -> 0x0098 }
            r0.f338654b = r8     // Catch:{ all -> 0x0098 }
            r0.f338657e = r3     // Catch:{ all -> 0x0098 }
            java.lang.Object r0 = r2.mo20883a(r6, r0)     // Catch:{ all -> 0x0098 }
            if (r0 == r1) goto L_0x0097
            r1 = r8
            r0 = r4
        L_0x0088:
            com.google.android.apps.search.assistant.platform.j.b.c.az r8 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121900az.f338270a     // Catch:{ all -> 0x002f }
            com.google.android.apps.search.assistant.platform.j.b.c.ar r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r0     // Catch:{ all -> 0x002f }
            com.google.android.apps.search.assistant.platform.j.b.c.au r0 = r0.f338251d     // Catch:{ all -> 0x002f }
            r0.mo105424a(r8)     // Catch:{ all -> 0x002f }
            r1.mo63026c(r5)
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0097:
            return r1
        L_0x0098:
            r0 = move-exception
            r1 = r8
            r8 = r0
        L_0x009b:
            r1.mo63026c(r5)
            throw r8
        L_0x009f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo39064i(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39065j(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122066z
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.c.z r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122066z) r0
            int r1 = r0.f338662e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338662e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.z r0 = new com.google.android.apps.search.assistant.platform.j.b.c.z
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f338660c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338662e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f338659b
            java.lang.Object r0 = r0.f338658a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x002f }
            goto L_0x006b
        L_0x002f:
            r8 = move-exception
            goto L_0x007e
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            java.lang.Object r2 = r0.f338659b
            java.lang.Object r4 = r0.f338658a
            p5462h.C69714l.m101134b(r8)
            r8 = r2
            goto L_0x0054
        L_0x0042:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r7.f338249b
            r0.f338658a = r7
            r0.f338659b = r8
            r0.f338662e = r4
            java.lang.Object r2 = r8.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x0082
            r4 = r7
        L_0x0054:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x007b }
            r2 = r4
            com.google.android.apps.search.assistant.platform.j.b.c.ar r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r2     // Catch:{ all -> 0x007b }
            kotlinx.coroutines.b.cx r2 = r2.f338260m     // Catch:{ all -> 0x007b }
            com.google.android.apps.search.assistant.platform.j.b.c.c.aw r6 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C122013aw.CONFIGURATION_CHANGED     // Catch:{ all -> 0x007b }
            r0.f338658a = r4     // Catch:{ all -> 0x007b }
            r0.f338659b = r8     // Catch:{ all -> 0x007b }
            r0.f338662e = r3     // Catch:{ all -> 0x007b }
            java.lang.Object r0 = r2.mo20883a(r6, r0)     // Catch:{ all -> 0x007b }
            if (r0 == r1) goto L_0x007a
            r1 = r8
            r0 = r4
        L_0x006b:
            com.google.android.apps.search.assistant.platform.j.b.c.ba r8 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121966ba.f338479a     // Catch:{ all -> 0x002f }
            com.google.android.apps.search.assistant.platform.j.b.c.ar r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r0     // Catch:{ all -> 0x002f }
            com.google.android.apps.search.assistant.platform.j.b.c.au r0 = r0.f338251d     // Catch:{ all -> 0x002f }
            r0.mo105424a(r8)     // Catch:{ all -> 0x002f }
            r1.mo63026c(r5)
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x007a:
            return r1
        L_0x007b:
            r0 = move-exception
            r1 = r8
            r8 = r0
        L_0x007e:
            r1.mo63026c(r5)
            throw r8
        L_0x0082:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo39065j(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39071p(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121883ai
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.c.ai r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121883ai) r0
            int r1 = r0.f338207e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338207e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.ai r0 = new com.google.android.apps.search.assistant.platform.j.b.c.ai
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f338205c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338207e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f338204b
            java.lang.Object r0 = r0.f338203a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x002f }
            goto L_0x0074
        L_0x002f:
            r8 = move-exception
            goto L_0x0087
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            java.lang.Object r2 = r0.f338204b
            java.lang.Object r4 = r0.f338203a
            p5462h.C69714l.m101134b(r8)
            r8 = r2
            goto L_0x0054
        L_0x0042:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r7.f338249b
            r0.f338203a = r7
            r0.f338204b = r8
            r0.f338207e = r4
            java.lang.Object r2 = r8.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x008b
            r4 = r7
        L_0x0054:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0084 }
            r2 = r4
            com.google.android.apps.search.assistant.platform.j.b.c.ar r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r2     // Catch:{ all -> 0x0084 }
            r2.m201333E()     // Catch:{ all -> 0x0084 }
            r2 = r4
            com.google.android.apps.search.assistant.platform.j.b.c.ar r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r2     // Catch:{ all -> 0x0084 }
            kotlinx.coroutines.b.cy r2 = r2.f338259l     // Catch:{ all -> 0x0084 }
            com.google.android.apps.search.assistant.platform.j.b.c.c.ax r6 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C122014ax.HIDDEN     // Catch:{ all -> 0x0084 }
            r0.f338203a = r4     // Catch:{ all -> 0x0084 }
            r0.f338204b = r8     // Catch:{ all -> 0x0084 }
            r0.f338207e = r3     // Catch:{ all -> 0x0084 }
            kotlinx.coroutines.b.dw r2 = (kotlinx.coroutines.p5574b.C71573dw) r2     // Catch:{ all -> 0x0084 }
            r2.mo62807f(r6)     // Catch:{ all -> 0x0084 }
            h.q r0 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x0084 }
            if (r0 == r1) goto L_0x0083
            r1 = r8
            r0 = r4
        L_0x0074:
            com.google.android.apps.search.assistant.platform.j.b.c.bh r8 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121973bh.f338493a     // Catch:{ all -> 0x002f }
            com.google.android.apps.search.assistant.platform.j.b.c.ar r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r0     // Catch:{ all -> 0x002f }
            com.google.android.apps.search.assistant.platform.j.b.c.au r0 = r0.f338251d     // Catch:{ all -> 0x002f }
            r0.mo105424a(r8)     // Catch:{ all -> 0x002f }
            r1.mo63026c(r5)
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0083:
            return r1
        L_0x0084:
            r0 = move-exception
            r1 = r8
            r8 = r0
        L_0x0087:
            r1.mo63026c(r5)
            throw r8
        L_0x008b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo39071p(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r10 = th;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bd, code lost:
        r7 = r10;
        r10 = r9;
        r9 = r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x002b, B:22:0x005c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105415e(boolean r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122061u
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.platform.j.b.c.u r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122061u) r0
            int r1 = r0.f338642f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338642f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.u r0 = new com.google.android.apps.search.assistant.platform.j.b.c.u
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f338640d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338642f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r9 = r0.f338638b
            java.lang.Object r0 = r0.f338637a
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x002f }
            goto L_0x0098
        L_0x002f:
            r10 = move-exception
            goto L_0x00d3
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003a:
            boolean r9 = r0.f338639c
            java.lang.Object r2 = r0.f338638b
            java.lang.Object r4 = r0.f338637a
            p5462h.C69714l.m101134b(r10)
            r10 = r2
            goto L_0x0059
        L_0x0045:
            p5462h.C69714l.m101134b(r10)
            kotlinx.coroutines.j.b r10 = r8.f338249b
            r0.f338637a = r8
            r0.f338638b = r10
            r0.f338639c = r9
            r0.f338642f = r4
            java.lang.Object r2 = r10.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x00d7
            r4 = r8
        L_0x0059:
            if (r9 == 0) goto L_0x00c1
            r9 = r4
            com.google.android.apps.search.assistant.platform.j.b.c.ar r9 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r9     // Catch:{ all -> 0x00bc }
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r9 = r9.f338256i     // Catch:{ all -> 0x00bc }
            com.google.common.util.concurrent.cx r9 = r9.mo39049a()     // Catch:{ all -> 0x00bc }
            boolean r9 = r9.isCancelled()     // Catch:{ all -> 0x00bc }
            if (r9 == 0) goto L_0x00c1
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d.b r9 = new com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d.b     // Catch:{ all -> 0x00bc }
            com.google.android.libraries.search.assistant.invocation.o.a.db r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34093db.f90828c     // Catch:{ all -> 0x00bc }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x00bc }
            com.google.android.libraries.search.assistant.invocation.o.a.da r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34092da) r2     // Catch:{ all -> 0x00bc }
            java.lang.String r6 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)     // Catch:{ all -> 0x00bc }
            com.google.android.libraries.search.assistant.invocation.o.a.dd r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")     // Catch:{ all -> 0x00bc }
            com.google.android.libraries.search.assistant.invocation.o.a.db r2 = r2.mo39213a()     // Catch:{ all -> 0x00bc }
            r6 = 0
            r9.<init>(r6, r6, r2)     // Catch:{ all -> 0x00bc }
            r0.f338637a = r4     // Catch:{ all -> 0x00bc }
            r0.f338638b = r10     // Catch:{ all -> 0x00bc }
            r0.f338642f = r3     // Catch:{ all -> 0x00bc }
            r2 = r4
            com.google.android.apps.search.assistant.platform.j.b.c.ar r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r2     // Catch:{ all -> 0x00bc }
            java.lang.Object r9 = r2.mo105420w(r9, r0)     // Catch:{ all -> 0x00bc }
            if (r9 == r1) goto L_0x00bb
            r0 = r4
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0098:
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r10 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r10     // Catch:{ all -> 0x002f }
            com.google.common.f.e r1 = f338248a     // Catch:{ all -> 0x002f }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x002f }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x002f }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x002f }
            java.lang.String r3 = "INV.ApaVIHandler"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x002f }
            java.lang.String r2 = "Resource was cancelled starting new ViSession. session id: %s"
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x002f }
            r4 = 35995(0x8c9b, float:5.044E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x002f }
            r1.mo56379ah(r3)     // Catch:{ all -> 0x002f }
            r1.mo56389s(r2, r10)     // Catch:{ all -> 0x002f }
            r4 = r0
            goto L_0x00c2
        L_0x00bb:
            return r1
        L_0x00bc:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00d3
        L_0x00c1:
            r9 = r10
        L_0x00c2:
            com.google.android.apps.search.assistant.platform.j.b.c.ar r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r4     // Catch:{ all -> 0x002f }
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r10 = r4.f338256i     // Catch:{ all -> 0x002f }
            com.google.common.util.concurrent.cx r10 = r10.mo39049a()     // Catch:{ all -> 0x002f }
            java.lang.String r0 = "viSession.resourceFuture()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)     // Catch:{ all -> 0x002f }
            r9.mo63026c(r5)
            return r10
        L_0x00d3:
            r9.mo63026c(r5)
            throw r10
        L_0x00d7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo105415e(boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39101f(boolean r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122062v
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.platform.j.b.c.v r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122062v) r0
            int r1 = r0.f338645c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338645c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.v r0 = new com.google.android.apps.search.assistant.platform.j.b.c.v
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f338643a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338645c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r7)
            goto L_0x004c
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            p5462h.C69714l.m101134b(r7)
            goto L_0x0041
        L_0x0036:
            p5462h.C69714l.m101134b(r7)
            r0.f338645c = r4
            java.lang.Object r7 = r5.mo105415e(r6, r0)
            if (r7 == r1) goto L_0x0051
        L_0x0041:
            com.google.common.util.concurrent.cx r7 = (com.google.common.util.concurrent.C60870cx) r7
            r0.f338645c = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            com.google.android.apps.search.assistant.platform.j.b.c.br r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121983br) r7
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj r6 = r7.f338508a
            return r6
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo39101f(boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105416g(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122063w
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.platform.j.b.c.w r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122063w) r0
            int r1 = r0.f338648c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338648c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.w r0 = new com.google.android.apps.search.assistant.platform.j.b.c.w
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f338646a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338648c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r6)
            goto L_0x004c
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            p5462h.C69714l.m101134b(r6)
            goto L_0x0041
        L_0x0036:
            p5462h.C69714l.m101134b(r6)
            r0.f338648c = r4
            java.lang.Object r6 = r5.mo105415e(r4, r0)
            if (r6 == r1) goto L_0x0051
        L_0x0041:
            com.google.common.util.concurrent.cx r6 = (com.google.common.util.concurrent.C60870cx) r6
            r0.f338648c = r3
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            com.google.android.apps.search.assistant.platform.j.b.c.br r6 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121983br) r6
            android.os.IBinder r6 = r6.f338509b
            return r6
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo105416g(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39067l(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121876ab
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.c.ab r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121876ab) r0
            int r1 = r0.f338168e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338168e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.ab r0 = new com.google.android.apps.search.assistant.platform.j.b.c.ab
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f338166c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338168e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r0 = r0.f338164a
            kotlinx.coroutines.j.b r0 = (kotlinx.coroutines.p5584j.C71788b) r0
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x002f }
            goto L_0x0066
        L_0x002f:
            r8 = move-exception
            goto L_0x0071
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            java.lang.Object r2 = r0.f338165b
            java.lang.Object r4 = r0.f338164a
            com.google.android.apps.search.assistant.platform.j.b.c.ar r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r4
            p5462h.C69714l.m101134b(r8)
            r8 = r2
            goto L_0x0057
        L_0x0044:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r7.f338249b
            r0.f338164a = r7
            r0.f338165b = r8
            r0.f338168e = r4
            java.lang.Object r2 = r8.mo63025b(r5, r0)
            if (r2 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r4 = r7
        L_0x0057:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x006d }
            r0.f338164a = r8     // Catch:{ all -> 0x006d }
            r0.f338165b = r5     // Catch:{ all -> 0x006d }
            r0.f338168e = r3     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r4.mo105417h(r0)     // Catch:{ all -> 0x006d }
            if (r0 == r1) goto L_0x006c
            r0 = r8
        L_0x0066:
            r0.mo63026c(r5)
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x006c:
            return r1
        L_0x006d:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x0071:
            r0.mo63026c(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo39067l(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: android.os.Bundle} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39072q(android.os.Bundle r8, int r9, p5462h.p5466c.C69577g r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121884aj
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.platform.j.b.c.aj r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121884aj) r0
            int r1 = r0.f338214g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338214g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.aj r0 = new com.google.android.apps.search.assistant.platform.j.b.c.aj
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f338212e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338214g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.f338208a
            kotlinx.coroutines.j.b r8 = (kotlinx.coroutines.p5584j.C71788b) r8
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x002f }
            goto L_0x0076
        L_0x002f:
            r9 = move-exception
            goto L_0x007e
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            int r9 = r0.f338211d
            java.lang.Object r8 = r0.f338210c
            java.lang.Object r2 = r0.f338209b
            java.lang.Object r4 = r0.f338208a
            com.google.android.apps.search.assistant.platform.j.b.c.ar r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r4
            p5462h.C69714l.m101134b(r10)
            r10 = r8
            r8 = r2
            goto L_0x005f
        L_0x0049:
            p5462h.C69714l.m101134b(r10)
            kotlinx.coroutines.j.b r10 = r7.f338249b
            r0.f338208a = r7
            r0.f338209b = r8
            r0.f338210c = r10
            r0.f338211d = r9
            r0.f338214g = r4
            java.lang.Object r2 = r10.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x0082
            r4 = r7
        L_0x005f:
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ all -> 0x007b }
            com.google.android.apps.search.assistant.platform.j.b.c.bp r8 = r4.m201330B(r8, r9)     // Catch:{ all -> 0x007b }
            r0.f338208a = r10     // Catch:{ all -> 0x007b }
            r0.f338209b = r5     // Catch:{ all -> 0x007b }
            r0.f338210c = r5     // Catch:{ all -> 0x007b }
            r0.f338214g = r3     // Catch:{ all -> 0x007b }
            java.lang.Object r8 = r4.mo105418t(r8, r0)     // Catch:{ all -> 0x007b }
            if (r8 == r1) goto L_0x007a
            r6 = r10
            r10 = r8
            r8 = r6
        L_0x0076:
            r8.mo63026c(r5)
            return r10
        L_0x007a:
            return r1
        L_0x007b:
            r8 = move-exception
            r9 = r8
            r8 = r10
        L_0x007e:
            r8.mo63026c(r5)
            throw r9
        L_0x0082:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo39072q(android.os.Bundle, int, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39073r(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121885ak
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.c.ak r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121885ak) r0
            int r1 = r0.f338219e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338219e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.ak r0 = new com.google.android.apps.search.assistant.platform.j.b.c.ak
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f338217c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338219e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r0 = r0.f338215a
            kotlinx.coroutines.j.b r0 = (kotlinx.coroutines.p5584j.C71788b) r0
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x002f }
            goto L_0x0066
        L_0x002f:
            r8 = move-exception
            goto L_0x0071
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            java.lang.Object r2 = r0.f338216b
            java.lang.Object r4 = r0.f338215a
            com.google.android.apps.search.assistant.platform.j.b.c.ar r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r4
            p5462h.C69714l.m101134b(r8)
            r8 = r2
            goto L_0x0057
        L_0x0044:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r7.f338249b
            r0.f338215a = r7
            r0.f338216b = r8
            r0.f338219e = r4
            java.lang.Object r2 = r8.mo63025b(r5, r0)
            if (r2 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r4 = r7
        L_0x0057:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x006d }
            r0.f338215a = r8     // Catch:{ all -> 0x006d }
            r0.f338216b = r5     // Catch:{ all -> 0x006d }
            r0.f338219e = r3     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r4.mo105417h(r0)     // Catch:{ all -> 0x006d }
            if (r0 == r1) goto L_0x006c
            r0 = r8
        L_0x0066:
            r0.mo63026c(r5)
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x006c:
            return r1
        L_0x006d:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x0071:
            r0.mo63026c(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo39073r(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1 A[SYNTHETIC, Splitter:B:36:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7 A[Catch:{ all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e A[Catch:{ all -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0151 A[Catch:{ all -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39074s(android.os.Bundle r18, int r19, p5462h.p5466c.C69577g r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            boolean r2 = r0 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121886al
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.apps.search.assistant.platform.j.b.c.al r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121886al) r2
            int r3 = r2.f338226g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f338226g = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.platform.j.b.c.al r2 = new com.google.android.apps.search.assistant.platform.j.b.c.al
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f338224e
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f338226g
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0069
            if (r4 == r7) goto L_0x0053
            if (r4 == r6) goto L_0x0042
            if (r4 != r5) goto L_0x003a
            java.lang.Object r2 = r2.f338220a
            kotlinx.coroutines.j.b r2 = (kotlinx.coroutines.p5584j.C71788b) r2
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0037 }
            goto L_0x0199
        L_0x0037:
            r0 = move-exception
            goto L_0x01a2
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0042:
            java.lang.Object r4 = r2.f338221b
            kotlinx.coroutines.j.b r4 = (kotlinx.coroutines.p5584j.C71788b) r4
            java.lang.Object r6 = r2.f338220a
            com.google.android.apps.search.assistant.platform.j.b.c.ar r6 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r6
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x004f }
            goto L_0x0128
        L_0x004f:
            r0 = move-exception
            r2 = r4
            goto L_0x01a2
        L_0x0053:
            int r4 = r2.f338223d
            java.lang.Object r9 = r2.f338222c
            java.lang.Object r10 = r2.f338221b
            android.os.Bundle r10 = (android.os.Bundle) r10
            java.lang.Object r11 = r2.f338220a
            com.google.android.apps.search.assistant.platform.j.b.c.ar r11 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r11
            p5462h.C69714l.m101134b(r0)
            r16 = r9
            r9 = r4
            r4 = r10
            r10 = r16
            goto L_0x0084
        L_0x0069:
            p5462h.C69714l.m101134b(r0)
            kotlinx.coroutines.j.b r0 = r1.f338249b
            r2.f338220a = r1
            r4 = r18
            r2.f338221b = r4
            r2.f338222c = r0
            r9 = r19
            r2.f338223d = r9
            r2.f338226g = r7
            java.lang.Object r10 = r0.mo63025b(r8, r2)
            if (r10 == r3) goto L_0x01a6
            r10 = r0
            r11 = r1
        L_0x0084:
            if (r4 == 0) goto L_0x0092
            java.lang.String r0 = "SHOW_UI_ONLY"
            r12 = 0
            boolean r0 = r4.getBoolean(r0, r12)     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x0092
            com.google.android.apps.search.assistant.platform.j.b.c.bk r0 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121976bk.f338498a     // Catch:{ all -> 0x01a0 }
            goto L_0x009b
        L_0x0092:
            com.google.android.apps.search.assistant.platform.j.b.c.bj r0 = new com.google.android.apps.search.assistant.platform.j.b.c.bj     // Catch:{ all -> 0x01a0 }
            com.google.android.apps.search.assistant.platform.j.b.c.bp r4 = r11.m201330B(r4, r9)     // Catch:{ all -> 0x01a0 }
            r0.<init>(r4)     // Catch:{ all -> 0x01a0 }
        L_0x009b:
            boolean r4 = r0 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121976bk     // Catch:{ all -> 0x01a0 }
            java.lang.String r9 = "INV.ApaVIHandler"
            if (r4 == 0) goto L_0x00c7
            com.google.common.f.e r0 = f338248a     // Catch:{ all -> 0x01a0 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x01a0 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01a0 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01a0 }
            r0.mo56378ag(r4, r9)     // Catch:{ all -> 0x01a0 }
            java.lang.String r4 = "#onShow(UiOnly)"
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x01a0 }
            r7 = 36011(0x8cab, float:5.0462E-41)
            r6.<init>(r7)     // Catch:{ all -> 0x01a0 }
            r0.mo56379ah(r6)     // Catch:{ all -> 0x01a0 }
            r0.mo56386p(r4)     // Catch:{ all -> 0x01a0 }
            com.google.android.apps.search.assistant.platform.j.b.c.bn r0 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121979bn.f338502a     // Catch:{ all -> 0x01a0 }
            com.google.android.apps.search.assistant.platform.j.b.c.au r4 = r11.f338251d     // Catch:{ all -> 0x01a0 }
            r4.mo105424a(r0)     // Catch:{ all -> 0x01a0 }
            goto L_0x0181
        L_0x00c7:
            boolean r4 = r0 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121975bj     // Catch:{ all -> 0x01a0 }
            if (r4 == 0) goto L_0x0181
            com.google.android.apps.search.assistant.platform.j.b.c.bj r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121975bj) r0     // Catch:{ all -> 0x01a0 }
            com.google.android.apps.search.assistant.platform.j.b.c.bp r4 = r0.f338497a     // Catch:{ all -> 0x01a0 }
            com.google.common.f.e r12 = f338248a     // Catch:{ all -> 0x01a0 }
            com.google.common.f.x r12 = r12.mo56224b()     // Catch:{ all -> 0x01a0 }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ all -> 0x01a0 }
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01a0 }
            r12.mo56378ag(r13, r9)     // Catch:{ all -> 0x01a0 }
            java.lang.String r9 = "#onShow(sessionId=%s, assistDataRequested=%s, screenshotRequested=%s)."
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r13 = r4.f338504a     // Catch:{ all -> 0x01a0 }
            int r14 = r4.f338506c     // Catch:{ all -> 0x01a0 }
            boolean r15 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121897aw.m201364a(r14)     // Catch:{ all -> 0x01a0 }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)     // Catch:{ all -> 0x01a0 }
            boolean r14 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121897aw.m201365b(r14)     // Catch:{ all -> 0x01a0 }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x01a0 }
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ all -> 0x01a0 }
            r7 = 36010(0x8caa, float:5.0461E-41)
            r5.<init>(r7)     // Catch:{ all -> 0x01a0 }
            r12.mo56379ah(r5)     // Catch:{ all -> 0x01a0 }
            r12.mo56359L(r9, r13, r15, r14)     // Catch:{ all -> 0x01a0 }
            com.google.android.apps.search.assistant.platform.j.b.c.bm r5 = new com.google.android.apps.search.assistant.platform.j.b.c.bm     // Catch:{ all -> 0x01a0 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r7 = r4.f338504a     // Catch:{ all -> 0x01a0 }
            int r4 = r4.f338506c     // Catch:{ all -> 0x01a0 }
            boolean r9 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121897aw.m201364a(r4)     // Catch:{ all -> 0x01a0 }
            boolean r4 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121897aw.m201365b(r4)     // Catch:{ all -> 0x01a0 }
            r5.<init>(r7, r9, r4)     // Catch:{ all -> 0x01a0 }
            com.google.android.apps.search.assistant.platform.j.b.c.au r4 = r11.f338251d     // Catch:{ all -> 0x01a0 }
            r4.mo105424a(r5)     // Catch:{ all -> 0x01a0 }
            com.google.android.apps.search.assistant.platform.j.b.c.bp r0 = r0.f338497a     // Catch:{ all -> 0x01a0 }
            r2.f338220a = r11     // Catch:{ all -> 0x01a0 }
            r2.f338221b = r10     // Catch:{ all -> 0x01a0 }
            r2.f338222c = r8     // Catch:{ all -> 0x01a0 }
            r2.f338226g = r6     // Catch:{ all -> 0x01a0 }
            java.lang.Object r0 = r11.mo105418t(r0, r2)     // Catch:{ all -> 0x01a0 }
            if (r0 == r3) goto L_0x0180
            r4 = r10
            r6 = r11
        L_0x0128:
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r0 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r0     // Catch:{ all -> 0x004f }
            r6.f338250c = r0     // Catch:{ all -> 0x004f }
            if (r0 != 0) goto L_0x012f
            goto L_0x0179
        L_0x012f:
            java.util.NavigableMap r5 = r6.f338258k     // Catch:{ all -> 0x004f }
            java.lang.Object r0 = r5.lowerKey(r0)     // Catch:{ all -> 0x004f }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r0 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r0     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x0179
            java.util.NavigableMap r5 = r6.f338258k     // Catch:{ all -> 0x004f }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x004f }
            com.google.android.apps.search.assistant.platform.j.b.c.bs r5 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121984bs) r5     // Catch:{ all -> 0x004f }
            if (r5 == 0) goto L_0x0179
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x004f }
            java.util.List r5 = r5.f338513d     // Catch:{ all -> 0x004f }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x004f }
        L_0x014b:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x004f }
            if (r7 == 0) goto L_0x012f
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x004f }
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r7 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2621b.C33731b) r7     // Catch:{ all -> 0x004f }
            com.google.common.util.concurrent.cx r9 = r7.f90091d     // Catch:{ all -> 0x004f }
            r10 = 1
            r9.cancel(r10)     // Catch:{ all -> 0x004f }
            java.util.Set r9 = r7.f90090c     // Catch:{ all -> 0x004f }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x004f }
        L_0x0163:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x004f }
            if (r11 == 0) goto L_0x0173
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x004f }
            androidx.d.a.c r11 = (androidx.p104d.p105a.C2164c) r11     // Catch:{ all -> 0x004f }
            r11.mo5438c()     // Catch:{ all -> 0x004f }
            goto L_0x0163
        L_0x0173:
            java.util.Set r7 = r7.f90090c     // Catch:{ all -> 0x004f }
            r7.clear()     // Catch:{ all -> 0x004f }
            goto L_0x014b
        L_0x0179:
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.c.d r0 = r6.f338257j     // Catch:{ all -> 0x004f }
            r0.mo38941c()     // Catch:{ all -> 0x004f }
            r11 = r6
            goto L_0x0182
        L_0x0180:
            return r3
        L_0x0181:
            r4 = r10
        L_0x0182:
            kotlinx.coroutines.b.cy r0 = r11.f338259l     // Catch:{ all -> 0x004f }
            com.google.android.apps.search.assistant.platform.j.b.c.c.ax r5 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C122014ax.SHOWN     // Catch:{ all -> 0x004f }
            r2.f338220a = r4     // Catch:{ all -> 0x004f }
            r2.f338221b = r8     // Catch:{ all -> 0x004f }
            r2.f338222c = r8     // Catch:{ all -> 0x004f }
            r6 = 3
            r2.f338226g = r6     // Catch:{ all -> 0x004f }
            kotlinx.coroutines.b.dw r0 = (kotlinx.coroutines.p5574b.C71573dw) r0     // Catch:{ all -> 0x004f }
            r0.mo62807f(r5)     // Catch:{ all -> 0x004f }
            h.q r0 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x004f }
            if (r0 == r3) goto L_0x019f
            r2 = r4
        L_0x0199:
            r2.mo63026c(r8)
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x019f:
            return r3
        L_0x01a0:
            r0 = move-exception
            r2 = r10
        L_0x01a2:
            r2.mo63026c(r8)
            throw r0
        L_0x01a6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo39074s(android.os.Bundle, int, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105418t(com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121981bp r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121887am
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.platform.j.b.c.am r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121887am) r0
            int r1 = r0.f338230d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338230d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.am r0 = new com.google.android.apps.search.assistant.platform.j.b.c.am
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f338228b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338230d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r5 = r0.f338227a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0063
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r6 = r5.f338504a
            if (r6 == 0) goto L_0x0039
            return r6
        L_0x0039:
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r6 = r4.m201332D()
            r0.f338227a = r6
            r0.f338230d = r3
            com.google.android.libraries.search.assistant.invocation.f.c.a.b.a r0 = r4.f338254g
            android.os.Bundle r2 = r5.f338505b
            int r3 = r5.f338506c
            r0.mo39100a(r6, r2, r3)
            com.google.android.apps.search.assistant.platform.j.b.c.bi r0 = new com.google.android.apps.search.assistant.platform.j.b.c.bi
            int r5 = r5.f338506c
            boolean r2 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121897aw.m201364a(r5)
            boolean r5 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121897aw.m201365b(r5)
            r0.<init>(r6, r2, r5)
            com.google.android.apps.search.assistant.platform.j.b.c.au r5 = r4.f338251d
            r5.mo105424a(r0)
            h.q r5 = p5462h.C69788q.f186170a
            if (r5 == r1) goto L_0x0064
            r5 = r6
        L_0x0063:
            return r5
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo105418t(com.google.android.apps.search.assistant.platform.j.b.c.bp, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj, code=java.lang.Object, for r9v0, types: [java.lang.Object, com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076 A[Catch:{ all -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39066k(java.lang.Object r9, android.os.IBinder r10, p5462h.p5466c.C69577g r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121875aa
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.platform.j.b.c.aa r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121875aa) r0
            int r1 = r0.f338163g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338163g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.aa r0 = new com.google.android.apps.search.assistant.platform.j.b.c.aa
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f338161e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338163g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004f
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r9 = r0.f338159c
            kotlinx.coroutines.j.b r9 = (kotlinx.coroutines.p5584j.C71788b) r9
            java.lang.Object r10 = r0.f338158b
            java.lang.Object r0 = r0.f338157a
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x0034 }
            goto L_0x00ab
        L_0x0034:
            r10 = move-exception
            goto L_0x00c5
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003f:
            java.lang.Object r9 = r0.f338160d
            java.lang.Object r10 = r0.f338159c
            android.os.IBinder r10 = (android.os.IBinder) r10
            java.lang.Object r2 = r0.f338158b
            java.lang.Object r4 = r0.f338157a
            p5462h.C69714l.m101134b(r11)
            r11 = r9
            r9 = r2
            goto L_0x0067
        L_0x004f:
            p5462h.C69714l.m101134b(r11)
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            kotlinx.coroutines.j.b r11 = r8.f338249b
            r0.f338157a = r8
            r0.f338158b = r9
            r0.f338159c = r10
            r0.f338160d = r11
            r0.f338163g = r4
            java.lang.Object r2 = r11.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x00c9
            r4 = r8
        L_0x0067:
            r2 = r4
            com.google.android.apps.search.assistant.platform.j.b.c.ar r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r2     // Catch:{ all -> 0x00c2 }
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r2 = r2.f338256i     // Catch:{ all -> 0x00c2 }
            com.google.common.util.concurrent.cx r2 = r2.mo39049a()     // Catch:{ all -> 0x00c2 }
            boolean r2 = r2.isCancelled()     // Catch:{ all -> 0x00c2 }
            if (r2 == 0) goto L_0x007e
            r2 = r4
            com.google.android.apps.search.assistant.platform.j.b.c.ar r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r2     // Catch:{ all -> 0x00c2 }
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r2 = r2.f338256i     // Catch:{ all -> 0x00c2 }
            r2.mo39052d()     // Catch:{ all -> 0x00c2 }
        L_0x007e:
            r2 = r4
            com.google.android.apps.search.assistant.platform.j.b.c.ar r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r2     // Catch:{ all -> 0x00c2 }
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r2 = r2.f338256i     // Catch:{ all -> 0x00c2 }
            com.google.android.apps.search.assistant.platform.j.b.c.br r6 = new com.google.android.apps.search.assistant.platform.j.b.c.br     // Catch:{ all -> 0x00c2 }
            r7 = r9
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj r7 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33824cj) r7     // Catch:{ all -> 0x00c2 }
            r6.<init>(r7, r10)     // Catch:{ all -> 0x00c2 }
            r2.mo39051c(r6)     // Catch:{ all -> 0x00c2 }
            r10 = r4
            com.google.android.apps.search.assistant.platform.j.b.c.ar r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r10     // Catch:{ all -> 0x00c2 }
            kotlinx.coroutines.b.cy r10 = r10.f338259l     // Catch:{ all -> 0x00c2 }
            com.google.android.apps.search.assistant.platform.j.b.c.c.ax r2 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C122014ax.CREATED     // Catch:{ all -> 0x00c2 }
            r0.f338157a = r4     // Catch:{ all -> 0x00c2 }
            r0.f338158b = r9     // Catch:{ all -> 0x00c2 }
            r0.f338159c = r11     // Catch:{ all -> 0x00c2 }
            r0.f338160d = r5     // Catch:{ all -> 0x00c2 }
            r0.f338163g = r3     // Catch:{ all -> 0x00c2 }
            kotlinx.coroutines.b.dw r10 = (kotlinx.coroutines.p5574b.C71573dw) r10     // Catch:{ all -> 0x00c2 }
            r10.mo62807f(r2)     // Catch:{ all -> 0x00c2 }
            h.q r10 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x00c2 }
            if (r10 == r1) goto L_0x00c1
            r10 = r9
            r9 = r11
            r0 = r4
        L_0x00ab:
            com.google.android.apps.search.assistant.platform.j.b.c.bb r11 = new com.google.android.apps.search.assistant.platform.j.b.c.bb     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj r10 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33824cj) r10     // Catch:{ all -> 0x0034 }
            r11.<init>(r10)     // Catch:{ all -> 0x0034 }
            com.google.android.apps.search.assistant.platform.j.b.c.ar r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r0     // Catch:{ all -> 0x0034 }
            com.google.android.apps.search.assistant.platform.j.b.c.au r10 = r0.f338251d     // Catch:{ all -> 0x0034 }
            r10.mo105424a(r11)     // Catch:{ all -> 0x0034 }
            r9.mo63026c(r5)
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x00c1:
            return r1
        L_0x00c2:
            r9 = move-exception
            r10 = r9
            r9 = r11
        L_0x00c5:
            r9.mo63026c(r5)
            throw r10
        L_0x00c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo39066k(com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj, android.os.IBinder, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105417h(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122064x
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.platform.j.b.c.x r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122064x) r0
            int r1 = r0.f338652d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338652d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.x r0 = new com.google.android.apps.search.assistant.platform.j.b.c.x
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f338650b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338652d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f338649a
            p5462h.C69714l.m101134b(r5)
            goto L_0x004f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r5)
            r4.m201333E()
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r5 = r4.f338256i
            r5.mo39050b()
            kotlinx.coroutines.b.cy r5 = r4.f338259l
            com.google.android.apps.search.assistant.platform.j.b.c.c.ax r2 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C122014ax.DESTROYED
            r0.f338649a = r4
            r0.f338652d = r3
            kotlinx.coroutines.b.dw r5 = (kotlinx.coroutines.p5574b.C71573dw) r5
            r5.mo62807f(r2)
            h.q r5 = p5462h.C69788q.f186170a
            if (r5 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r0 = r4
        L_0x004f:
            com.google.android.apps.search.assistant.platform.j.b.c.bc r5 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121968bc.f338481a
            com.google.android.apps.search.assistant.platform.j.b.c.ar r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r0
            com.google.android.apps.search.assistant.platform.j.b.c.au r0 = r0.f338251d
            r0.mo105424a(r5)
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo105417h(h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105412b(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122058r
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.c.r r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122058r) r0
            int r1 = r0.f338624f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338624f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.r r0 = new com.google.android.apps.search.assistant.platform.j.b.c.r
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f338622d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338624f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r7 = r0.f338619a
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r7 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r7
            p5462h.C69714l.m101134b(r8)
            goto L_0x007f
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            java.lang.Object r7 = r0.f338621c
            java.lang.Object r2 = r0.f338620b
            java.lang.Object r4 = r0.f338619a
            com.google.android.apps.search.assistant.platform.j.b.c.ar r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r4
            p5462h.C69714l.m101134b(r8)
            r8 = r7
            r7 = r2
            goto L_0x0059
        L_0x0045:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r6.f338249b
            r0.f338619a = r6
            r0.f338620b = r7
            r0.f338621c = r8
            r0.f338624f = r4
            java.lang.Object r2 = r8.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x008a
            r4 = r6
        L_0x0059:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0085 }
            r2 = r7
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r2 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r2     // Catch:{ all -> 0x0085 }
            com.google.android.apps.search.assistant.platform.j.b.c.bs r2 = r4.m201331C(r2)     // Catch:{ all -> 0x0085 }
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r2 = r2.f338512c     // Catch:{ all -> 0x0085 }
            com.google.common.util.concurrent.cx r2 = r2.mo39049a()     // Catch:{ all -> 0x0085 }
            r8.mo63026c(r5)
            java.lang.String r8 = "mutex\n      .withLock {\n….resourceFuture()\n      }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r8)
            r0.f338619a = r7
            r0.f338620b = r5
            r0.f338621c = r5
            r0.f338624f = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)
            if (r8 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r7 = r8
            java.lang.String r7 = (java.lang.String) r7
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r8
        L_0x0085:
            r7 = move-exception
            r8.mo63026c(r5)
            throw r7
        L_0x008a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo105412b(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d, h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105414d(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122060t
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.c.t r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122060t) r0
            int r1 = r0.f338636f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338636f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.t r0 = new com.google.android.apps.search.assistant.platform.j.b.c.t
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f338634d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338636f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r7 = r0.f338631a
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r7 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r7
            p5462h.C69714l.m101134b(r8)
            goto L_0x007f
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            java.lang.Object r7 = r0.f338633c
            java.lang.Object r2 = r0.f338632b
            java.lang.Object r4 = r0.f338631a
            com.google.android.apps.search.assistant.platform.j.b.c.ar r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r4
            p5462h.C69714l.m101134b(r8)
            r8 = r7
            r7 = r2
            goto L_0x0059
        L_0x0045:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r6.f338249b
            r0.f338631a = r6
            r0.f338632b = r7
            r0.f338633c = r8
            r0.f338636f = r4
            java.lang.Object r2 = r8.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x008f
            r4 = r6
        L_0x0059:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x008a }
            r2 = r7
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r2 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r2     // Catch:{ all -> 0x008a }
            com.google.android.apps.search.assistant.platform.j.b.c.bs r2 = r4.m201331C(r2)     // Catch:{ all -> 0x008a }
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r2 = r2.f338511b     // Catch:{ all -> 0x008a }
            com.google.common.util.concurrent.cx r2 = r2.mo39049a()     // Catch:{ all -> 0x008a }
            r8.mo63026c(r5)
            java.lang.String r8 = "mutex\n      .withLock {\n….resourceFuture()\n      }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r8)
            r0.f338631a = r7
            r0.f338632b = r5
            r0.f338633c = r5
            r0.f338636f = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)
            if (r8 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r7 = r8
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "mutex\n      .withLock {\n…%s) ready.\", sessionId) }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r7)
            return r8
        L_0x008a:
            r7 = move-exception
            r8.mo63026c(r5)
            throw r7
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo105414d(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d, h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39068m(java.lang.String r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121877ac
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.c.ac r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121877ac) r0
            int r1 = r0.f338173e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338173e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.ac r0 = new com.google.android.apps.search.assistant.platform.j.b.c.ac
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f338171c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338173e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r7 = r0.f338170b
            java.lang.Object r0 = r0.f338169a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0065
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            p5462h.C69714l.m101134b(r8)
            com.google.common.f.e r8 = f338248a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "INV.ApaVIHandler"
            r8.mo56378ag(r2, r5)
            com.google.common.f.n r2 = new com.google.common.f.n
            r5 = 36001(0x8ca1, float:5.0448E-41)
            r2.<init>(r5)
            r8.mo56379ah(r2)
            java.lang.String r2 = "ApaVoiceInteractionHandler#onDirectActionsInvalidated activityId=%s"
            r8.mo56389s(r2, r7)
            kotlinx.coroutines.j.b r7 = r6.f338249b
            r0.f338169a = r6
            r0.f338170b = r7
            r0.f338173e = r3
            java.lang.Object r8 = r7.mo63025b(r4, r0)
            if (r8 == r1) goto L_0x0081
            r0 = r6
        L_0x0065:
            com.google.android.apps.search.assistant.platform.j.b.c.bd r8 = new com.google.android.apps.search.assistant.platform.j.b.c.bd     // Catch:{ all -> 0x007c }
            r1 = r0
            com.google.android.apps.search.assistant.platform.j.b.c.ar r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r1     // Catch:{ all -> 0x007c }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r1 = r1.f338250c     // Catch:{ all -> 0x007c }
            r8.<init>(r1)     // Catch:{ all -> 0x007c }
            com.google.android.apps.search.assistant.platform.j.b.c.ar r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r0     // Catch:{ all -> 0x007c }
            com.google.android.apps.search.assistant.platform.j.b.c.au r0 = r0.f338251d     // Catch:{ all -> 0x007c }
            r0.mo105424a(r8)     // Catch:{ all -> 0x007c }
            r7.mo63026c(r4)
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x007c:
            r8 = move-exception
            r7.mo63026c(r4)
            throw r8
        L_0x0081:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo39068m(java.lang.String, h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105413c(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122059s
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.platform.j.b.c.s r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122059s) r0
            int r1 = r0.f338630f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338630f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.s r0 = new com.google.android.apps.search.assistant.platform.j.b.c.s
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f338628d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338630f
            java.lang.String r3 = "INV.ApaVIHandler"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r11 = r0.f338625a
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r11 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r11
            p5462h.C69714l.m101134b(r12)
            goto L_0x009b
        L_0x0031:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0039:
            java.lang.Object r11 = r0.f338627c
            java.lang.Object r2 = r0.f338626b
            java.lang.Object r5 = r0.f338625a
            com.google.android.apps.search.assistant.platform.j.b.c.ar r5 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r5
            p5462h.C69714l.m101134b(r12)
            r12 = r11
            r11 = r2
            goto L_0x005b
        L_0x0047:
            p5462h.C69714l.m101134b(r12)
            kotlinx.coroutines.j.b r12 = r10.f338249b
            r0.f338625a = r10
            r0.f338626b = r11
            r0.f338627c = r12
            r0.f338630f = r5
            java.lang.Object r2 = r12.mo63025b(r6, r0)
            if (r2 == r1) goto L_0x00c7
            r5 = r10
        L_0x005b:
            com.google.common.f.e r2 = f338248a     // Catch:{ all -> 0x00c2 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x00c2 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00c2 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c2 }
            r2.mo56378ag(r7, r3)     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = "#getAssistData(sessionId=%s)."
            com.google.common.f.n r8 = new com.google.common.f.n     // Catch:{ all -> 0x00c2 }
            r9 = 35991(0x8c97, float:5.0434E-41)
            r8.<init>(r9)     // Catch:{ all -> 0x00c2 }
            r2.mo56379ah(r8)     // Catch:{ all -> 0x00c2 }
            r2.mo56389s(r7, r11)     // Catch:{ all -> 0x00c2 }
            r2 = r11
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r2 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r2     // Catch:{ all -> 0x00c2 }
            com.google.android.apps.search.assistant.platform.j.b.c.bs r2 = r5.m201331C(r2)     // Catch:{ all -> 0x00c2 }
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r2 = r2.f338510a     // Catch:{ all -> 0x00c2 }
            com.google.common.util.concurrent.cx r2 = r2.mo39049a()     // Catch:{ all -> 0x00c2 }
            r12.mo63026c(r6)
            java.lang.String r12 = "mutex\n      .withLock {\n….resourceFuture()\n      }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r12)
            r0.f338625a = r11
            r0.f338626b = r6
            r0.f338627c = r6
            r0.f338630f = r4
            java.lang.Object r12 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)
            if (r12 == r1) goto L_0x00c1
        L_0x009b:
            r0 = r12
            com.google.android.libraries.search.assistant.invocation.assistdata.api.AssistStateResult r0 = (com.google.android.libraries.search.assistant.invocation.assistdata.api.AssistStateResult) r0
            com.google.common.f.e r0 = f338248a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r3)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 35992(0x8c98, float:5.0436E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "#getAssistData(sessionId=%s) ready."
            r0.mo56389s(r1, r11)
            java.lang.String r11 = "mutex\n      .withLock {\n…%s) ready.\", sessionId) }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r11)
            return r12
        L_0x00c1:
            return r1
        L_0x00c2:
            r11 = move-exception
            r12.mo63026c(r6)
            throw r11
        L_0x00c7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo105413c(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d, h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=android.graphics.Bitmap, code=java.lang.Object, for r9v0, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[Catch:{ all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060 A[Catch:{ all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39070o(java.lang.Object r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121881ag
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.platform.j.b.c.ag r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121881ag) r0
            int r1 = r0.f338201f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338201f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.ag r0 = new com.google.android.apps.search.assistant.platform.j.b.c.ag
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f338199d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338201f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r9 = r0.f338198c
            java.lang.Object r1 = r0.f338197b
            java.lang.Object r0 = r0.f338196a
            p5462h.C69714l.m101134b(r10)
            r10 = r9
            r9 = r1
            goto L_0x004c
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            p5462h.C69714l.m101134b(r10)
            kotlinx.coroutines.j.b r10 = r8.f338249b
            r0.f338196a = r8
            r0.f338197b = r9
            r0.f338198c = r10
            r0.f338201f = r4
            java.lang.Object r0 = r10.mo63025b(r3, r0)
            if (r0 == r1) goto L_0x009d
            r0 = r8
        L_0x004c:
            com.google.common.f.e r1 = f338248a     // Catch:{ all -> 0x0098 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0098 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0098 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0098 }
            java.lang.String r5 = "INV.ApaVIHandler"
            r1.mo56378ag(r2, r5)     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = "#onHandleScreenshot(screenshot present=%s, sessionId=%s)"
            if (r9 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r4 = 0
        L_0x0061:
            r5 = r0
            com.google.android.apps.search.assistant.platform.j.b.c.ar r5 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r5     // Catch:{ all -> 0x0098 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r5 = r5.f338250c     // Catch:{ all -> 0x0098 }
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x0098 }
            r7 = 36003(0x8ca3, float:5.0451E-41)
            r6.<init>(r7)     // Catch:{ all -> 0x0098 }
            r1.mo56379ah(r6)     // Catch:{ all -> 0x0098 }
            r1.mo56357J(r2, r4, r5)     // Catch:{ all -> 0x0098 }
            com.google.android.apps.search.assistant.platform.j.b.c.ah r1 = new com.google.android.apps.search.assistant.platform.j.b.c.ah     // Catch:{ all -> 0x0098 }
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9     // Catch:{ all -> 0x0098 }
            r1.<init>(r9)     // Catch:{ all -> 0x0098 }
            r9 = r0
            com.google.android.apps.search.assistant.platform.j.b.c.ar r9 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r9     // Catch:{ all -> 0x0098 }
            r9.mo105411A(r1)     // Catch:{ all -> 0x0098 }
            com.google.android.apps.search.assistant.platform.j.b.c.bg r9 = new com.google.android.apps.search.assistant.platform.j.b.c.bg     // Catch:{ all -> 0x0098 }
            r1 = r0
            com.google.android.apps.search.assistant.platform.j.b.c.ar r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r1     // Catch:{ all -> 0x0098 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r1 = r1.f338250c     // Catch:{ all -> 0x0098 }
            r9.<init>(r1, r4)     // Catch:{ all -> 0x0098 }
            com.google.android.apps.search.assistant.platform.j.b.c.ar r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r0     // Catch:{ all -> 0x0098 }
            com.google.android.apps.search.assistant.platform.j.b.c.au r0 = r0.f338251d     // Catch:{ all -> 0x0098 }
            r0.mo105424a(r9)     // Catch:{ all -> 0x0098 }
            r10.mo63026c(r3)
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x0098:
            r9 = move-exception
            r10.mo63026c(r3)
            throw r9
        L_0x009d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo39070o(android.graphics.Bitmap, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105420w(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2594d.C33516b r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121891aq
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.platform.j.b.c.aq r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121891aq) r0
            int r1 = r0.f338247e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338247e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.aq r0 = new com.google.android.apps.search.assistant.platform.j.b.c.aq
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f338245c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338247e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r9 = r0.f338244b
            java.lang.Object r0 = r0.f338243a
            p5462h.C69714l.m101134b(r10)
            goto L_0x0086
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            p5462h.C69714l.m101134b(r10)
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r10 = r8.f338256i
            com.google.common.util.concurrent.cx r10 = r10.mo39049a()
            boolean r10 = r10.isCancelled()
            if (r10 == 0) goto L_0x0047
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r10 = r8.f338256i
            r10.mo39052d()
        L_0x0047:
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r10 = r8.m201332D()
            com.google.common.f.e r2 = f338248a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "INV.ApaVIHandler"
            r2.mo56378ag(r4, r5)
            boolean r4 = r9.f89677a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r5 = r9.f89678b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            com.google.common.f.n r6 = new com.google.common.f.n
            r7 = 36007(0x8ca7, float:5.0457E-41)
            r6.<init>(r7)
            r2.mo56379ah(r6)
            java.lang.String r6 = "#startSession(sessionId=%s, withAssistData=%s, withScreenshot=%s)."
            r2.mo56359L(r6, r10, r4, r5)
            com.google.android.apps.search.assistant.platform.c.a.a.a.c.a.d r2 = r8.f338261n
            r0.f338243a = r8
            r0.f338244b = r10
            r0.f338247e = r3
            java.lang.Object r9 = r2.mo104658a(r10, r9, r0)
            if (r9 == r1) goto L_0x0096
            r0 = r8
            r9 = r10
        L_0x0086:
            com.google.android.apps.search.assistant.platform.j.b.c.bq r10 = new com.google.android.apps.search.assistant.platform.j.b.c.bq
            r1 = r9
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r1 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d) r1
            r10.<init>(r1)
            com.google.android.apps.search.assistant.platform.j.b.c.ar r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r0
            com.google.android.apps.search.assistant.platform.j.b.c.au r0 = r0.f338251d
            r0.mo105424a(r10)
            return r9
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo105420w(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d.b, h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a1 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b4 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39069n(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121880af
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.platform.j.b.c.af r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121880af) r0
            int r1 = r0.f338195f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338195f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.af r0 = new com.google.android.apps.search.assistant.platform.j.b.c.af
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f338193d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338195f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r11 = r0.f338192c
            java.lang.Object r1 = r0.f338191b
            java.lang.Object r0 = r0.f338190a
            p5462h.C69714l.m101134b(r12)
            r12 = r11
            r11 = r1
            goto L_0x004c
        L_0x0030:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0038:
            p5462h.C69714l.m101134b(r12)
            kotlinx.coroutines.j.b r12 = r10.f338249b
            r0.f338190a = r10
            r0.f338191b = r11
            r0.f338192c = r12
            r0.f338195f = r4
            java.lang.Object r0 = r12.mo63025b(r3, r0)
            if (r0 == r1) goto L_0x00cb
            r0 = r10
        L_0x004c:
            com.google.common.f.e r1 = f338248a     // Catch:{ all -> 0x00c6 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00c6 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = "INV.ApaVIHandler"
            r1.mo56378ag(r2, r5)     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "#onHandleAssist(foregroundApp=%s, activityIdHash=%s, session=%d)"
            r5 = r11
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat r5 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat) r5     // Catch:{ all -> 0x00c6 }
            android.app.assist.AssistContent r5 = r5.f89671c     // Catch:{ all -> 0x00c6 }
            if (r5 == 0) goto L_0x006c
            r6 = r0
            com.google.android.apps.search.assistant.platform.j.b.c.ar r6 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r6     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = r6.mo105421x(r5)     // Catch:{ all -> 0x00c6 }
            goto L_0x006d
        L_0x006c:
            r5 = r3
        L_0x006d:
            r6 = r11
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat r6 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat) r6     // Catch:{ all -> 0x00c6 }
            java.lang.String r6 = r6.f89674f     // Catch:{ all -> 0x00c6 }
            r7 = r0
            com.google.android.apps.search.assistant.platform.j.b.c.ar r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r7     // Catch:{ all -> 0x00c6 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r7 = r7.f338250c     // Catch:{ all -> 0x00c6 }
            com.google.common.f.n r8 = new com.google.common.f.n     // Catch:{ all -> 0x00c6 }
            r9 = 36002(0x8ca2, float:5.045E-41)
            r8.<init>(r9)     // Catch:{ all -> 0x00c6 }
            r1.mo56379ah(r8)     // Catch:{ all -> 0x00c6 }
            r1.mo56359L(r2, r5, r6, r7)     // Catch:{ all -> 0x00c6 }
            r1 = r0
            com.google.android.apps.search.assistant.platform.j.b.c.ar r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r1     // Catch:{ all -> 0x00c6 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.c.d r1 = r1.f338257j     // Catch:{ all -> 0x00c6 }
            com.google.common.f.a.d r2 = com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c.C33510d.f89661a     // Catch:{ all -> 0x00c6 }
            r2 = r11
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat r2 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat) r2     // Catch:{ all -> 0x00c6 }
            r1.mo38939a(r2, r3)     // Catch:{ all -> 0x00c6 }
            com.google.android.apps.search.assistant.platform.j.b.c.bf r1 = new com.google.android.apps.search.assistant.platform.j.b.c.bf     // Catch:{ all -> 0x00c6 }
            r2 = r0
            com.google.android.apps.search.assistant.platform.j.b.c.ar r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r2     // Catch:{ all -> 0x00c6 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r2 = r2.f338250c     // Catch:{ all -> 0x00c6 }
            r5 = r11
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat r5 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat) r5     // Catch:{ all -> 0x00c6 }
            android.os.Bundle r5 = r5.f89669a     // Catch:{ all -> 0x00c6 }
            r6 = 0
            if (r5 == 0) goto L_0x00a3
            r5 = 1
            goto L_0x00a4
        L_0x00a3:
            r5 = 0
        L_0x00a4:
            r7 = r11
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat r7 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat) r7     // Catch:{ all -> 0x00c6 }
            android.app.assist.AssistStructure r7 = r7.f89670b     // Catch:{ all -> 0x00c6 }
            if (r7 == 0) goto L_0x00ad
            r7 = 1
            goto L_0x00ae
        L_0x00ad:
            r7 = 0
        L_0x00ae:
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat r11 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat) r11     // Catch:{ all -> 0x00c6 }
            android.app.assist.AssistContent r11 = r11.f89671c     // Catch:{ all -> 0x00c6 }
            if (r11 == 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r4 = 0
        L_0x00b6:
            r1.<init>(r2, r5, r7, r4)     // Catch:{ all -> 0x00c6 }
            com.google.android.apps.search.assistant.platform.j.b.c.ar r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r0     // Catch:{ all -> 0x00c6 }
            com.google.android.apps.search.assistant.platform.j.b.c.au r11 = r0.f338251d     // Catch:{ all -> 0x00c6 }
            r11.mo105424a(r1)     // Catch:{ all -> 0x00c6 }
            r12.mo63026c(r3)
            h.q r11 = p5462h.C69788q.f186170a
            return r11
        L_0x00c6:
            r11 = move-exception
            r12.mo63026c(r3)
            throw r11
        L_0x00cb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.mo39069n(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat, h.c.g):java.lang.Object");
    }
}
