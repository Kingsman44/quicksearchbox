package com.google.android.libraries.social.populous.p3296e;

import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
import com.google.android.libraries.social.populous.core.C42264aq;
import com.google.android.libraries.social.populous.core.C42291bq;
import com.google.android.libraries.social.populous.core.C42309ch;
import com.google.android.libraries.social.populous.core.TypeLimits;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.common.base.C58833ax;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.p4181bi.C55847i;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69314v;

/* renamed from: com.google.android.libraries.social.populous.e.i */
/* compiled from: PG */
public final /* synthetic */ class C42544i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C42549n f111583a;

    /* renamed from: b */
    public final /* synthetic */ C42551p f111584b;

    /* renamed from: c */
    public final /* synthetic */ boolean f111585c;

    public /* synthetic */ C42544i(C42549n nVar, C42551p pVar, boolean z) {
        this.f111583a = nVar;
        this.f111584b = pVar;
        this.f111585c = z;
    }

    public final void run() {
        C58485gu guVar;
        C42549n nVar = this.f111583a;
        C42551p pVar = this.f111584b;
        boolean z = this.f111585c;
        if (C69314v.m100612c() || !nVar.f111617n.mo45493b()) {
            int i = 0;
            if (nVar.f111607d.f110812f.mo56113h()) {
                TypeLimits typeLimits = (TypeLimits) nVar.f111607d.f110812f.mo56107c();
                C58485gu guVar2 = typeLimits.f110830a;
                int size = guVar2.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i2 += ((TypeLimits.TypeLimitSet) guVar2.get(i3)).f110832b;
                }
                int i4 = i2 - nVar.f111614k;
                if (pVar.f111629b.isEmpty() || i4 <= 0) {
                    guVar = C58485gu.m89845m();
                } else {
                    C58872ci b = nVar.f111611h.mo45632b();
                    C58480gp e = C58485gu.m89837e();
                    C58485gu guVar3 = pVar.f111629b;
                    int size2 = guVar3.size();
                    while (i < size2) {
                        C42405ab abVar = (C42405ab) guVar3.get(i);
                        C58833ax axVar = abVar.f111226a;
                        if (axVar.mo56113h()) {
                            C42309ch b2 = C42309ch.m74493b((C55847i) axVar.mo56107c());
                            int a = typeLimits.mo45171a(b2);
                            int a2 = typeLimits.mo45171a(b2);
                            Integer valueOf = a2 != -1 ? Integer.valueOf(((TypeLimits.TypeLimitSet) typeLimits.f110830a.get(a2)).f110832b) : null;
                            if (a >= 0) {
                                int[] iArr = nVar.f111616m;
                                if (a <= iArr.length - 1 && valueOf != null && iArr[a] < valueOf.intValue()) {
                                    if (nVar.f111615l.addAll(nVar.mo45555b(abVar))) {
                                        e.mo55395g(abVar);
                                        int i5 = nVar.f111614k;
                                        abVar.f111229d = i5;
                                        nVar.f111614k = i5 + 1;
                                        int[] iArr2 = nVar.f111616m;
                                        iArr2[a] = iArr2[a] + 1;
                                    }
                                }
                            }
                        }
                        i++;
                    }
                    nVar.f111611h.mo45638h(5, b, nVar.f111612i);
                    guVar = e.mo55394f();
                }
            } else {
                int b3 = nVar.f111609f.mo45105b() - nVar.f111614k;
                if (pVar.f111629b.isEmpty() || b3 <= 0) {
                    guVar = C58485gu.m89845m();
                } else {
                    C58872ci b4 = nVar.f111611h.mo45632b();
                    C58480gp e2 = C58485gu.m89837e();
                    C58485gu guVar4 = pVar.f111629b;
                    int size3 = guVar4.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        C42405ab abVar2 = (C42405ab) guVar4.get(i6);
                        if (abVar2.f111227b.mo56113h()) {
                            e2.mo55395g(abVar2);
                        } else {
                            if (nVar.f111615l.addAll(nVar.mo45555b(abVar2))) {
                                e2.mo55395g(abVar2);
                            }
                        }
                    }
                    C58485gu f = e2.mo55394f();
                    nVar.f111611h.mo45638h(5, b4, nVar.f111612i);
                    guVar = f.subList(0, Math.min(b3, ((C58724pq) f).f156474d));
                    while (i < guVar.size()) {
                        ((C42405ab) guVar.get(i)).f111229d = nVar.f111614k + i;
                        i++;
                    }
                    nVar.f111614k += guVar.size();
                }
            }
            C42264aq c = C42264aq.m74421c(pVar.f111633f, pVar.f111632e);
            C42448c m = C42500d.m74917m();
            C42385a aVar = (C42385a) m;
            aVar.f111155a = C58485gu.m89842j(C58485gu.m89845m());
            C42550o a3 = pVar.mo45557a();
            a3.f111623b = C58485gu.m89842j(guVar);
            aVar.f111156b = C58833ax.m90833j(a3.mo45556a());
            aVar.f111157c = c;
            m.mo45367c(z);
            int i7 = nVar.f111619p;
            nVar.f111619p = i7 + 1;
            m.mo45366b(i7);
            m.mo45369e(nVar.f111618o);
            aVar.f111158d = nVar;
            aVar.f111162h = C42291bq.m74450a(pVar.f111633f);
            aVar.f111160f = (Integer) pVar.f111628a.mo56111f();
            aVar.f111159e = (Long) pVar.f111630c.mo56111f();
            AutocompletionCallbackMetadata autocompletionCallbackMetadata = pVar.f111631d;
            if (C58833ax.m90833j(autocompletionCallbackMetadata).mo56113h()) {
                m.mo45368d((AutocompletionCallbackMetadata) C58833ax.m90833j(autocompletionCallbackMetadata).mo56107c());
            }
            nVar.f111608e.mo45234a(m.mo45365a());
            nVar.f111618o += guVar.size();
        }
    }
}
