package com.google.android.apps.search.googleapp.p10338l.p10339a;

import com.google.android.apps.search.googleapp.p10338l.C136376a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69514bd;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.l.a.aa */
/* compiled from: PG */
public final class C136378aa {

    /* renamed from: a */
    public final C69585o f371291a;

    /* renamed from: b */
    public final Map f371292b;

    /* renamed from: c */
    public final Map f371293c;

    /* renamed from: d */
    public final Map f371294d;

    /* renamed from: e */
    public final List f371295e;

    /* renamed from: f */
    private final C136380ac f371296f;

    public C136378aa(C136380ac acVar, C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        this.f371296f = acVar;
        this.f371291a = oVar;
        Map map = acVar.f371297a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C69505av.m100860b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(((C136388g) entry.getKey()).mo112968a(), entry.getValue());
        }
        this.f371292b = linkedHashMap;
        Map map2 = this.f371296f.f371298b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C69505av.m100860b(map2.size()));
        for (Map.Entry entry2 : map2.entrySet()) {
            linkedHashMap2.put(((C136377a) entry2.getKey()).mo112953a(), entry2.getValue());
        }
        this.f371293c = linkedHashMap2;
        List w = C69505av.m100882w(this.f371296f.f371299c);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object next : w) {
            String b = ((C136383b) ((C69685i) next).f186052a).mo112962b();
            Object obj = linkedHashMap3.get(b);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap3.put(b, obj);
            }
            ((List) obj).add(next);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(C69505av.m100860b(linkedHashMap3.size()));
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            Object key = entry3.getKey();
            List<C69685i> list = (List) entry3.getValue();
            ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
            for (C69685i iVar : list) {
                arrayList.add(new C69685i(((C136383b) iVar.f186052a).mo112961a(), (C136376a) iVar.f186053b));
            }
            linkedHashMap4.put(key, C69505av.m100874p(arrayList));
        }
        this.f371294d = linkedHashMap4;
        Set<String> keySet = this.f371292b.keySet();
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(keySet, 10));
        for (String qVar : keySet) {
            arrayList2.add(new C136398q(qVar));
        }
        Set<String> e = C69514bd.m100891e(this.f371293c.keySet(), this.f371294d.keySet());
        ArrayList arrayList3 = new ArrayList(C69540x.m100804k(e, 10));
        for (String pVar : e) {
            arrayList3.add(new C136397p(pVar));
        }
        this.f371295e = C69540x.m100831M(arrayList2, arrayList3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112954a(com.google.android.apps.search.googleapp.p10338l.p10339a.C136397p r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.p10338l.p10339a.C136402u
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.l.a.u r0 = (com.google.android.apps.search.googleapp.p10338l.p10339a.C136402u) r0
            int r1 = r0.f371353c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f371353c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.l.a.u r0 = new com.google.android.apps.search.googleapp.l.a.u
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f371351a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f371353c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r7)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            p5462h.C69714l.m101134b(r7)
            h.c.o r7 = r5.f371291a
            com.google.android.apps.search.googleapp.l.a.w r2 = new com.google.android.apps.search.googleapp.l.a.w
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f371353c = r3
            java.lang.Object r7 = kotlinx.coroutines.C71803m.m105040a(r7, r2, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            h.k r7 = (p5462h.C69702k) r7
            java.lang.Object r6 = r7.f186073a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10338l.p10339a.C136378aa.mo112954a(com.google.android.apps.search.googleapp.l.a.p, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112955b(com.google.android.apps.search.googleapp.p10338l.p10339a.C136399r r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.p10338l.p10339a.C136405x
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.l.a.x r0 = (com.google.android.apps.search.googleapp.p10338l.p10339a.C136405x) r0
            int r1 = r0.f371363c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f371363c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.l.a.x r0 = new com.google.android.apps.search.googleapp.l.a.x
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f371361a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f371363c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            p5462h.C69714l.m101134b(r7)
            h.k r7 = (p5462h.C69702k) r7
            java.lang.Object r6 = r7.f186073a
            goto L_0x0060
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            p5462h.C69714l.m101134b(r7)
            h.k r7 = (p5462h.C69702k) r7
            java.lang.Object r6 = r7.f186073a
            goto L_0x0050
        L_0x003e:
            p5462h.C69714l.m101134b(r7)
            boolean r7 = r6 instanceof com.google.android.apps.search.googleapp.p10338l.p10339a.C136398q
            if (r7 == 0) goto L_0x0051
            com.google.android.apps.search.googleapp.l.a.q r6 = (com.google.android.apps.search.googleapp.p10338l.p10339a.C136398q) r6
            r0.f371363c = r4
            java.lang.Object r6 = r5.mo112956c(r6, r0)
            if (r6 != r1) goto L_0x0050
            return r1
        L_0x0050:
            return r6
        L_0x0051:
            boolean r7 = r6 instanceof com.google.android.apps.search.googleapp.p10338l.p10339a.C136397p
            if (r7 == 0) goto L_0x0061
            com.google.android.apps.search.googleapp.l.a.p r6 = (com.google.android.apps.search.googleapp.p10338l.p10339a.C136397p) r6
            r0.f371363c = r3
            java.lang.Object r6 = r5.mo112954a(r6, r0)
            if (r6 != r1) goto L_0x0060
            return r1
        L_0x0060:
            return r6
        L_0x0061:
            h.g r6 = new h.g
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10338l.p10339a.C136378aa.mo112955b(com.google.android.apps.search.googleapp.l.a.r, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112956c(com.google.android.apps.search.googleapp.p10338l.p10339a.C136398q r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.p10338l.p10339a.C136406y
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.l.a.y r0 = (com.google.android.apps.search.googleapp.p10338l.p10339a.C136406y) r0
            int r1 = r0.f371366c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f371366c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.l.a.y r0 = new com.google.android.apps.search.googleapp.l.a.y
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f371364a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f371366c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r7)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            p5462h.C69714l.m101134b(r7)
            h.c.o r7 = r5.f371291a
            com.google.android.apps.search.googleapp.l.a.z r2 = new com.google.android.apps.search.googleapp.l.a.z
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f371366c = r3
            java.lang.Object r7 = kotlinx.coroutines.C71803m.m105040a(r7, r2, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            h.k r7 = (p5462h.C69702k) r7
            java.lang.Object r6 = r7.f186073a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10338l.p10339a.C136378aa.mo112956c(com.google.android.apps.search.googleapp.l.a.q, h.c.g):java.lang.Object");
    }
}
