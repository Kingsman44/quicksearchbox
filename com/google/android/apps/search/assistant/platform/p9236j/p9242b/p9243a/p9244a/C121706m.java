package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.C121670a;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33733c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5574b.C71521by;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71571du;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.m */
/* compiled from: PG */
public final class C121706m implements C121670a {

    /* renamed from: a */
    public final C34053bp f337671a;

    /* renamed from: b */
    public final C33729b f337672b;

    /* renamed from: c */
    public final C33514d f337673c;

    /* renamed from: d */
    public final C71548cy f337674d;

    /* renamed from: e */
    public final C71571du f337675e;

    /* renamed from: f */
    public final C33729b f337676f;

    /* renamed from: g */
    public final C71604be f337677g;

    /* renamed from: h */
    private final C71422aw f337678h;

    public C121706m(C34053bp bpVar, C33729b bVar, C33514d dVar, Set set, C71422aw awVar) {
        C69664n.m101061g(bpVar, "token");
        C69664n.m101061g(bVar, "params");
        C69664n.m101061g(set, "initialResources");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f337671a = bpVar;
        this.f337672b = bVar;
        this.f337673c = dVar;
        this.f337678h = awVar;
        C121700g gVar = bVar.f90083d ? C121700g.IMPLICIT : C121700g.EXPLICIT;
        int b = C69505av.m100860b(C69540x.m100804k(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(b < 16 ? 16 : b);
        for (Object next : set) {
            Class<?> cls = ((C33733c) next).getClass();
            int i = C69649af.f186028a;
            linkedHashMap.put(new C69657g(cls), next);
        }
        C71548cy b2 = C71574dx.m104480b(new C121699f(gVar, linkedHashMap));
        this.f337674d = b2;
        this.f337675e = C71521by.m104365c(b2);
        this.f337676f = this.f337672b;
        this.f337677g = C71803m.m105042c(this.f337678h, (C69585o) null, (C71424ay) null, new C121705l(this, (C69577g) null), 3);
    }

    /* renamed from: a */
    public final C34053bp mo105283a() {
        return this.f337671a;
    }

    /* renamed from: b */
    public final /* synthetic */ C34119a mo105284b() {
        return this.f337676f.f90080a;
    }

    /* renamed from: c */
    public final C71604be mo105285c() {
        return this.f337677g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.util.Iterator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105314d(com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121700g r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121701h
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.platform.j.b.a.a.h r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121701h) r0
            int r1 = r0.f337663d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337663d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.a.a.h r0 = new com.google.android.apps.search.assistant.platform.j.b.a.a.h
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f337661b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337663d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r8 = r0.f337660a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0062
        L_0x0029:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0031:
            p5462h.C69714l.m101134b(r9)
            h.f.b.ae r9 = new h.f.b.ae
            r9.<init>()
            kotlinx.coroutines.b.cy r2 = r7.f337674d
        L_0x003b:
            java.lang.Object r4 = r2.mo62784e()
            r5 = r4
            com.google.android.apps.search.assistant.platform.j.b.a.a.f r5 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121699f) r5
            java.util.Map r5 = r5.f337651b
            java.util.Collection r5 = r5.values()
            r9.f186027a = r5
            com.google.android.apps.search.assistant.platform.j.b.a.a.f r5 = new com.google.android.apps.search.assistant.platform.j.b.a.a.f
            h.a.an r6 = p5462h.p5463a.C69497an.f185919a
            r5.<init>(r8, r6)
            boolean r4 = r2.mo62808g(r4, r5)
            if (r4 == 0) goto L_0x003b
            java.lang.Object r8 = r9.f186027a
            p5462h.p5473f.p5475b.C69664n.m101058d(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0062:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x007a
            java.lang.Object r9 = r8.next()
            com.google.android.libraries.search.assistant.invocation.f.b.c r9 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33733c) r9
            r0.f337660a = r8
            r0.f337663d = r3
            java.lang.Object r9 = r9.mo39055b(r0)
            if (r9 == r1) goto L_0x0079
            goto L_0x0062
        L_0x0079:
            return r1
        L_0x007a:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121706m.mo105314d(com.google.android.apps.search.assistant.platform.j.b.a.a.g, h.c.g):java.lang.Object");
    }

    public final String toString() {
        C61301b a = C34711b.m63445a(this.f337671a);
        C34119a aVar = this.f337676f.f90080a;
        return "InvocationDetails(token=" + a + ", client=" + aVar + ")";
    }
}
