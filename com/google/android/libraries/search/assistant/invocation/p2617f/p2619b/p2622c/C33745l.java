package com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2622c;

import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33733c;
import com.google.android.libraries.search.assistant.invocation.p2634i.p2635a.C33887b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.common.p4526f.C59071e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69685i;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69723c;
import p5462h.p5482l.C69731k;
import p5462h.p5482l.C69734n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.b.c.l */
/* compiled from: PG */
public final class C33745l implements C33733c {

    /* renamed from: c */
    private static final C59071e f90118c = C59071e.m91331h();

    /* renamed from: a */
    public final C34043bf f90119a;

    /* renamed from: b */
    public final C34053bp f90120b;

    /* renamed from: d */
    private final C71422aw f90121d;

    /* renamed from: e */
    private final C71553dc f90122e;

    /* renamed from: f */
    private final List f90123f;

    /* renamed from: g */
    private final String f90124g = "EarconResource";

    /* renamed from: h */
    private final C71643cp f90125h;

    /* renamed from: i */
    private final Map f90126i;

    /* renamed from: j */
    private final C33887b f90127j;

    public C33745l(C71422aw awVar, C71553dc dcVar, C33887b bVar, C34043bf bfVar, C34053bp bpVar, List list) {
        this.f90121d = awVar;
        this.f90122e = dcVar;
        this.f90127j = bVar;
        this.f90119a = bfVar;
        this.f90120b = bpVar;
        this.f90123f = list;
        C69731k c = C69734n.m101177c(C69734n.m101143k(C69734n.m101141i(C69540x.m100847ac(list), new C33734a(this)), C33735b.f90096a));
        C69664n.m101061g(c, "<this>");
        C69664n.m101061g(c, "<this>");
        C69723c cVar = new C69723c(c);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator a = cVar.mo5191a();
        while (a.hasNext()) {
            C69685i iVar = (C69685i) a.next();
            C69685i iVar2 = new C69685i(iVar.f186052a, iVar.f186053b);
            linkedHashMap.put(iVar2.f186052a, iVar2.f186053b);
        }
        this.f90126i = linkedHashMap;
        this.f90125h = C71594u.m104517d(C71536cm.m104384b(new C33744k(new C33741h(C71471ab.m104286a(this.f90122e), this)), new C33736c(this, (C69577g) null)), this.f90121d);
    }

    /* renamed from: a */
    public final Object mo39054a(C69577g gVar) {
        Object c = mo39057c(gVar);
        return c == C69554a.COROUTINE_SUSPENDED ? c : C69788q.f186170a;
    }

    /* renamed from: b */
    public final Object mo39055b(C69577g gVar) {
        Object c = mo39057c(gVar);
        return c == C69554a.COROUTINE_SUSPENDED ? c : C69788q.f186170a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39057c(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2622c.C33737d
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.libraries.search.assistant.invocation.f.b.c.d r0 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2622c.C33737d) r0
            int r1 = r0.f90102c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f90102c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.f.b.c.d r0 = new com.google.android.libraries.search.assistant.invocation.f.b.c.d
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f90100a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f90102c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)     // Catch:{ CancellationException -> 0x0045 }
            goto L_0x0064
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            kotlinx.coroutines.cp r5 = r4.f90125h     // Catch:{ CancellationException -> 0x0045 }
            boolean r5 = r5.mo62867mj()     // Catch:{ CancellationException -> 0x0045 }
            if (r5 == 0) goto L_0x0064
            kotlinx.coroutines.cp r5 = r4.f90125h     // Catch:{ CancellationException -> 0x0045 }
            r0.f90102c = r3     // Catch:{ CancellationException -> 0x0045 }
            java.lang.Object r5 = kotlinx.coroutines.C71647ct.m104637a(r5, r0)     // Catch:{ CancellationException -> 0x0045 }
            if (r5 != r1) goto L_0x0064
            return r1
        L_0x0045:
            com.google.common.f.e r5 = f90118c
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "INV.Earcon.Resource"
            r5.mo56378ag(r0, r1)
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 51274(0xc84a, float:7.185E-41)
            r0.<init>(r1)
            r5.mo56379ah(r0)
            java.lang.String r0 = "Error cancelling mic updates collection job"
            r5.mo56386p(r0)
        L_0x0064:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2622c.C33745l.mo39057c(h.c.g):java.lang.Object");
    }

    /* renamed from: d */
    public final String mo39056d() {
        return this.f90124g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39058e(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34029as r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2622c.C33738e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.libraries.search.assistant.invocation.f.b.c.e r0 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2622c.C33738e) r0
            int r1 = r0.f90105c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f90105c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.f.b.c.e r0 = new com.google.android.libraries.search.assistant.invocation.f.b.c.e
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f90103a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f90105c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0072
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            p5462h.C69714l.m101134b(r7)
            goto L_0x0058
        L_0x0036:
            p5462h.C69714l.m101134b(r7)
            java.util.Map r7 = r5.f90126i
            boolean r7 = r7.containsKey(r6)
            if (r7 == 0) goto L_0x0099
            int r7 = r6.f90686a
            if (r7 != r4) goto L_0x005d
            com.google.android.libraries.search.assistant.invocation.i.a.b r6 = r5.f90127j
            r0.f90105c = r4
            com.google.android.libraries.search.c.gg r7 = com.google.android.libraries.search.p2904c.C37628gg.EVENT_OPEN
            java.lang.Object r6 = r6.mo39118a(r7)
            h.c.a.a r7 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r6 == r7) goto L_0x0055
            h.q r6 = p5462h.C69788q.f186170a
        L_0x0055:
            if (r6 != r1) goto L_0x0058
            return r1
        L_0x0058:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x005d:
            if (r7 != r3) goto L_0x0077
            com.google.android.libraries.search.assistant.invocation.i.a.b r6 = r5.f90127j
            r0.f90105c = r3
            com.google.android.libraries.search.c.gg r7 = com.google.android.libraries.search.p2904c.C37628gg.EVENT_SUCCESS
            java.lang.Object r6 = r6.mo39118a(r7)
            h.c.a.a r7 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r6 == r7) goto L_0x006f
            h.q r6 = p5462h.C69788q.f186170a
        L_0x006f:
            if (r6 != r1) goto L_0x0072
            return r1
        L_0x0072:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0077:
            com.google.common.f.e r7 = f90118c
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "INV.Earcon.Resource"
            r7.mo56378ag(r0, r1)
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 51275(0xc84b, float:7.1852E-41)
            r0.<init>(r1)
            r7.mo56379ah(r0)
            java.lang.String r0 = "No default sound for the earcon event %s available"
            r7.mo56389s(r0, r6)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0099:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2622c.C33745l.mo39058e(com.google.android.libraries.search.assistant.invocation.o.a.as, h.c.g):java.lang.Object");
    }
}
