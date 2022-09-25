package com.google.research.p5181a.p5185c;

import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5182a.C66291n;
import com.google.research.p5181a.p5182a.C66294q;
import com.google.research.p5181a.p5183b.p5184a.C66307h;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.research.a.c.q */
/* compiled from: PG */
public final class C66326q {

    /* renamed from: c */
    private static final long f180346c = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    protected final long f180347a = f180346c;

    /* renamed from: b */
    protected final Map f180348b = new HashMap();

    /* renamed from: d */
    private Long f180349d;

    /* renamed from: a */
    protected static int m96993a(C66376a aVar) {
        List c = aVar.mo59466i().mo59480c();
        for (int i = 0; i < c.size(); i++) {
            String b = C66291n.m96856b((C66307h) c.get(i), aVar.mo59466i().mo59478a());
            if (aVar.mo59460c() != null && b != null && aVar.mo59460c().equals(b)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    protected static boolean m96994c(C66376a aVar) {
        int f = aVar.mo59463f();
        if (f != 0) {
            if (f == 10 && aVar.mo59466i() != null) {
                aVar.mo59466i().mo59480c();
                if (aVar.mo59466i().mo59480c().isEmpty() || aVar.mo59466i().mo59480c().get(0) == null) {
                    return false;
                }
                return true;
            }
            return false;
        }
        throw null;
    }

    /* renamed from: b */
    public final List mo59530b(C66278a aVar, C66376a aVar2) {
        int i;
        long j;
        long j2;
        List list;
        String str;
        float f;
        float f2;
        float f3;
        long j3;
        long j4;
        int i2;
        int i3;
        float f4;
        int i4;
        int i5;
        int i6;
        long j5;
        int i7;
        C66326q qVar = this;
        C66278a aVar3 = aVar;
        qVar.f180348b.clear();
        long j6 = qVar.f180347a;
        HashMap hashMap = new HashMap();
        Iterator it = aVar2.mo59466i().mo59480c().iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            String a = C66291n.m96855a(((C66307h) it.next()).mo59490j());
            if (!hashMap.containsKey(a)) {
                hashMap.put(a, 1);
            }
        }
        qVar.f180349d = Long.valueOf(aVar2.mo59467j().mo59503c());
        int i8 = 0;
        while (true) {
            if (i8 >= aVar3.f180248b) {
                C66376a aVar4 = aVar2;
                break;
            }
            C66376a aVar5 = (C66376a) aVar3.mo59448a(i8);
            int f5 = aVar5.mo59463f();
            if (f5 != 0) {
                if (f5 != 10) {
                    int f6 = aVar5.mo59463f();
                    if (f6 == 0) {
                        throw null;
                    } else if (f6 != i) {
                        C66376a aVar6 = aVar2;
                        i7 = i8;
                        i8 = i7 + 1;
                        i = 1;
                    }
                }
                long a2 = C66294q.m96858a(aVar5, aVar2) - aVar5.mo59458a();
                if (a2 >= j6) {
                    break;
                }
                if (a2 >= 0) {
                    if (aVar5.mo59463f() == i) {
                        String a3 = C66291n.m96855a(aVar5.mo59460c());
                        if (hashMap.containsKey(a3)) {
                            if (qVar.f180348b.containsKey(a3)) {
                                ((C66324o) qVar.f180348b.get(a3)).f180337b += i;
                                ((C66324o) qVar.f180348b.get(a3)).f180336a = aVar5.mo59467j().mo59503c();
                                ((C66324o) qVar.f180348b.get(a3)).f180338c += aVar5.mo59458a();
                            } else {
                                qVar.f180348b.put(a3, C66324o.m96992a(aVar5));
                            }
                        }
                    } else if (m96994c(aVar5) && m96993a(aVar5) != -1) {
                        C66307h hVar = (C66307h) aVar5.mo59466i().mo59480c().get(m96993a(aVar5));
                        String a4 = C66291n.m96855a(hVar.mo59490j());
                        if (hashMap.containsKey(a4)) {
                            String b = aVar5.mo59466i().mo59479b();
                            String b2 = C66291n.m96856b(hVar, aVar5.mo59466i().mo59478a());
                            if (!qVar.f180348b.containsKey(a4)) {
                                qVar.f180348b.put(a4, C66324o.m96992a(aVar5));
                            } else {
                                C66324o oVar = (C66324o) qVar.f180348b.get(a4);
                                oVar.f180339d += i;
                                oVar.f180340e = aVar5.mo59467j().mo59503c();
                                oVar.f180337b += i;
                                oVar.f180336a = aVar5.mo59467j().mo59503c();
                                if (oVar.f180342g.isEmpty() || !oVar.f180342g.containsKey(b)) {
                                    oVar.f180342g.put(b, Integer.valueOf(i));
                                } else {
                                    Map map = oVar.f180342g;
                                    map.put(b, Integer.valueOf(((Integer) map.get(b)).intValue() + i));
                                }
                                Map map2 = oVar.f180341f;
                                if (map2.containsKey(b2)) {
                                    C66325p pVar = (C66325p) map2.get(b2);
                                    pVar.f180344b += i;
                                    pVar.f180343a = aVar5.mo59467j().mo59503c();
                                    if (pVar.f180345c.containsKey(b)) {
                                        Map map3 = pVar.f180345c;
                                        map3.put(b, Integer.valueOf(((Integer) map3.get(b)).intValue() + 1));
                                    } else {
                                        pVar.f180345c.put(b, 1);
                                    }
                                    map2.put(b2, pVar);
                                    i7 = i8;
                                } else {
                                    C66325p pVar2 = new C66325p();
                                    pVar2.f180344b = 1;
                                    i7 = i8;
                                    pVar2.f180343a = aVar5.mo59467j().mo59503c();
                                    pVar2.f180345c.put(aVar5.mo59466i().mo59479b(), 1);
                                    map2.put(b2, pVar2);
                                }
                                oVar.f180341f = map2;
                                qVar.f180348b.put(a4, oVar);
                                i8 = i7 + 1;
                                i = 1;
                            }
                        }
                    }
                }
                i7 = i8;
                i8 = i7 + 1;
                i = 1;
            } else {
                throw null;
            }
        }
        List c = aVar2.mo59466i().mo59480c();
        String b3 = aVar2.mo59466i().mo59479b();
        long longValue = qVar.f180349d.longValue() - f180346c;
        String a5 = aVar2.mo59466i().mo59478a();
        Iterator it2 = c.iterator();
        float f7 = 1.0f;
        float f8 = 1.0f;
        float f9 = 1.0f;
        float f10 = 1.0f;
        float f11 = 1.0f;
        float f12 = 1.0f;
        float f13 = 1.0f;
        float f14 = 1.0f;
        float f15 = 1.0f;
        while (it2.hasNext()) {
            C66307h hVar2 = (C66307h) it2.next();
            String a6 = C66291n.m96855a(hVar2.mo59490j());
            Iterator it3 = it2;
            String b4 = C66291n.m96856b(hVar2, a5);
            String str2 = a5;
            if (qVar.f180348b.containsKey(a6)) {
                f3 = f12;
                f2 = f13;
                f4 = f9;
                f = f10;
                long max = Math.max(((C66324o) qVar.f180348b.get(a6)).f180336a - longValue, 0);
                long max2 = Math.max(((C66324o) qVar.f180348b.get(a6)).f180340e - longValue, 0);
                long j7 = ((C66324o) qVar.f180348b.get(a6)).f180338c;
                long j8 = max2;
                int i9 = ((C66324o) qVar.f180348b.get(a6)).f180337b;
                int i10 = ((C66324o) qVar.f180348b.get(a6)).f180339d;
                int i11 = i9;
                int intValue = (((C66324o) qVar.f180348b.get(a6)).f180342g.isEmpty() || !((C66324o) qVar.f180348b.get(a6)).f180342g.containsKey(b3)) ? 0 : ((Integer) ((C66324o) qVar.f180348b.get(a6)).f180342g.get(b3)).intValue();
                if (((C66324o) qVar.f180348b.get(a6)).f180341f.isEmpty() || !((C66324o) qVar.f180348b.get(a6)).f180341f.containsKey(b4)) {
                    j2 = longValue;
                    j4 = max;
                    j = j8;
                    i2 = i11;
                    i3 = i10;
                    i5 = 0;
                    i4 = 0;
                    list = c;
                    str = b3;
                    j5 = j7;
                    i6 = intValue;
                    j3 = 0;
                } else {
                    int i12 = i10;
                    j2 = longValue;
                    long max3 = Math.max(((C66325p) ((C66324o) qVar.f180348b.get(a6)).f180341f.get(b4)).f180343a - longValue, 0);
                    i5 = ((C66325p) ((C66324o) qVar.f180348b.get(a6)).f180341f.get(b4)).f180344b;
                    if (((C66325p) ((C66324o) qVar.f180348b.get(a6)).f180341f.get(b4)).f180345c.containsKey(b3)) {
                        i4 = ((Integer) ((C66325p) ((C66324o) qVar.f180348b.get(a6)).f180341f.get(b4)).f180345c.get(b3)).intValue();
                        j = j8;
                        i2 = i11;
                        i3 = i12;
                    } else {
                        j = j8;
                        i2 = i11;
                        i3 = i12;
                        i4 = 0;
                    }
                    long j9 = max;
                    list = c;
                    str = b3;
                    j5 = j7;
                    i6 = intValue;
                    j3 = max3;
                    j4 = j9;
                }
            } else {
                j2 = longValue;
                f4 = f9;
                f = f10;
                f3 = f12;
                f2 = f13;
                list = c;
                str = b3;
                j5 = 0;
                i6 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
                i2 = 0;
                j4 = 0;
                j3 = 0;
                j = 0;
            }
            float f16 = (float) j4;
            if (f7 < f16) {
                f7 = f16;
            }
            float f17 = (float) j3;
            if (f8 < f17) {
                f8 = f17;
            }
            float f18 = (float) j5;
            if (f11 < f18) {
                f11 = f18;
            }
            float f19 = (float) i2;
            if (f4 < f19) {
                f4 = f19;
            }
            float f20 = (float) i5;
            if (f < f20) {
                f = f20;
            }
            float f21 = (float) i6;
            f13 = f2 < f21 ? f21 : f2;
            float f22 = (float) i4;
            f12 = f3 < f22 ? f22 : f3;
            float f23 = (float) i3;
            if (f15 < f23) {
                f15 = f23;
            }
            float f24 = f7;
            float f25 = f8;
            float f26 = (float) j;
            if (f14 < f26) {
                f14 = f26;
            }
            hVar2.mo59495o(f16);
            hVar2.mo59497q(f17);
            hVar2.mo59500t(f18);
            hVar2.mo59492l(f19);
            hVar2.mo59494n(f20);
            hVar2.mo59499s(f22);
            hVar2.mo59498r(f21);
            hVar2.mo59496p(f26);
            hVar2.mo59493m(f23);
            qVar = this;
            it2 = it3;
            f9 = f4;
            f7 = f24;
            f10 = f;
            b3 = str;
            c = list;
            f8 = f25;
            longValue = j2;
            a5 = str2;
        }
        List<C66307h> list2 = c;
        float f27 = f9;
        float f28 = f10;
        float f29 = f12;
        float f30 = f13;
        for (C66307h hVar3 : list2) {
            float d = hVar3.mo59484d();
            float f31 = hVar3.mo59486f();
            float e = hVar3.mo59485e();
            float a7 = hVar3.mo59481a();
            float c2 = hVar3.mo59483c();
            float b5 = hVar3.mo59482b();
            float i13 = hVar3.mo59489i();
            float g = hVar3.mo59487g();
            float h = hVar3.mo59488h();
            hVar3.mo59495o(d / f7);
            hVar3.mo59497q(f31 / f8);
            hVar3.mo59496p(e / f14);
            hVar3.mo59492l(a7 / f27);
            hVar3.mo59494n(c2 / f28);
            hVar3.mo59493m(b5 / f15);
            hVar3.mo59500t(i13 / f11);
            hVar3.mo59498r(g / f30);
            hVar3.mo59499s(h / f29);
        }
        return list2;
    }
}
