package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a.C112297a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a.C112298b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a.C112299c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a.C112300d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a.C112302f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a.C112303g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a.C112304h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a.C112305i;
import com.google.assistant.p3781ad.p3789d.p3791b.C48668ac;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5182a.C66291n;
import com.google.research.p5181a.p5182a.C66294q;
import com.google.research.p5181a.p5183b.p5184a.C66307h;
import com.google.research.p5181a.p5185c.C66327r;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5187e.C66366p;
import com.google.research.p5181a.p5187e.C66367q;
import com.google.research.p5181a.p5187e.C66372v;
import com.google.research.p5181a.p5187e.C66374x;
import com.google.research.p5181a.p5188f.C66376a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.c */
/* compiled from: PG */
public final class C112359c extends C66374x {

    /* renamed from: a */
    public static final String f311759a;

    /* renamed from: f */
    private static final C48668ac f311760f;

    /* renamed from: b */
    protected final int f311761b;

    /* renamed from: c */
    protected final C112305i f311762c = new C112305i();

    /* renamed from: d */
    protected final C112299c f311763d;

    /* renamed from: e */
    protected final C112370d f311764e;

    /* renamed from: g */
    private final C58528ij f311765g = new C58759qy(f311759a);

    static {
        C48668ac acVar = C48668ac.LOGISTIC_PREDICTOR;
        f311760f = acVar;
        f311759a = acVar.name();
    }

    public C112359c() {
        C112299c g = C112299c.m186142g();
        g.mo99489h(new C66327r());
        g.mo99489h(new C112300d());
        g.mo99489h(new C112297a());
        g.mo99489h(new C112298b());
        this.f311763d = g;
        int i = g.f311640c + 9;
        this.f311761b = i;
        this.f311764e = new C112370d(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo59576a(C66376a aVar) {
        List c = aVar.mo59466i().mo59480c();
        for (int i = 0; i < c.size(); i++) {
            if (C58832aw.m90831a(aVar.mo59460c(), ((C66307h) c.get(i)).mo59491k())) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C66343o mo59577b(C66376a aVar) {
        long j;
        long j2;
        int i;
        int i2;
        C112305i iVar;
        C66307h hVar;
        List list;
        long j3;
        long j4;
        int i3;
        int i4;
        int i5;
        long j5;
        int i6;
        C66376a aVar2 = aVar;
        C112305i iVar2 = this.f311762c;
        C66278a aVar3 = this.f180447l.f180433a;
        iVar2.f311660c.clear();
        long j6 = iVar2.f311659b;
        C58528ij ijVar = (C58528ij) Collection.EL.stream(aVar.mo59466i().mo59480c()).map(C112302f.f311647a).collect(C58370cn.f155947b);
        int i7 = 0;
        while (i7 < aVar3.f180248b) {
            C66376a aVar4 = (C66376a) aVar3.mo59448a(i7);
            long a = C66294q.m96858a(aVar4, aVar2) - aVar4.mo59458a();
            if (a >= j6) {
                break;
            }
            if (a >= 0) {
                int a2 = C112305i.m186165a(aVar4);
                if (aVar4.mo59463f() == 1) {
                    String c = aVar4.mo59460c();
                    if (ijVar.contains(c)) {
                        if (iVar2.f311660c.containsKey(c)) {
                            ((C112303g) iVar2.f311660c.get(c)).f311649b++;
                            ((C112303g) iVar2.f311660c.get(c)).f311648a = aVar4.mo59467j().mo59503c();
                            ((C112303g) iVar2.f311660c.get(c)).f311650c += aVar4.mo59458a();
                        } else {
                            iVar2.f311660c.put(c, C112303g.m186164a(aVar4));
                        }
                    }
                } else if (C112305i.m186166b(aVar4) && a2 != -1) {
                    String j7 = ((C66307h) aVar4.mo59466i().mo59480c().get(a2)).mo59490j();
                    if (ijVar.contains(j7)) {
                        String b = aVar4.mo59466i().mo59479b();
                        String c2 = aVar4.mo59460c();
                        if (!iVar2.f311660c.containsKey(j7)) {
                            iVar2.f311660c.put(j7, C112303g.m186164a(aVar4));
                        } else {
                            C112303g gVar = (C112303g) iVar2.f311660c.get(j7);
                            gVar.f311651d++;
                            i6 = i7;
                            gVar.f311652e = aVar4.mo59467j().mo59503c();
                            gVar.f311649b++;
                            gVar.f311648a = aVar4.mo59467j().mo59503c();
                            if (gVar.f311654g.isEmpty() || !gVar.f311654g.containsKey(b)) {
                                gVar.f311654g.put(b, 1);
                            } else {
                                Map map = gVar.f311654g;
                                map.put(b, Integer.valueOf(((Integer) map.get(b)).intValue() + 1));
                            }
                            Map map2 = gVar.f311653f;
                            if (map2.containsKey(c2)) {
                                C112304h hVar2 = (C112304h) map2.get(c2);
                                hVar2.f311656b++;
                                String str = c2;
                                hVar2.f311655a = aVar4.mo59467j().mo59503c();
                                if (hVar2.f311657c.containsKey(b)) {
                                    Map map3 = hVar2.f311657c;
                                    map3.put(b, Integer.valueOf(((Integer) map3.get(b)).intValue() + 1));
                                } else {
                                    hVar2.f311657c.put(b, 1);
                                }
                                map2.put(str, hVar2);
                            } else {
                                C112304h hVar3 = new C112304h();
                                hVar3.f311656b = 1;
                                hVar3.f311655a = aVar4.mo59467j().mo59503c();
                                hVar3.f311657c.put(aVar4.mo59466i().mo59479b(), 1);
                                map2.put(c2, hVar3);
                                gVar = gVar;
                            }
                            gVar.f311653f = map2;
                            iVar2.f311660c.put(j7, gVar);
                            i7 = i6 + 1;
                        }
                    }
                }
            }
            i6 = i7;
            i7 = i6 + 1;
        }
        List c3 = aVar.mo59466i().mo59480c();
        String b2 = aVar.mo59466i().mo59479b();
        long c4 = aVar.mo59467j().mo59503c() - C112305i.f311658a;
        Iterator it = c3.iterator();
        float f = 1.0f;
        float f2 = 1.0f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        float f5 = 1.0f;
        float f6 = 1.0f;
        float f7 = 1.0f;
        float f8 = 1.0f;
        float f9 = 1.0f;
        while (it.hasNext()) {
            C66307h hVar4 = (C66307h) it.next();
            String j8 = hVar4.mo59490j();
            Iterator it2 = it;
            String k = hVar4.mo59491k();
            C112303g gVar2 = (C112303g) iVar2.f311660c.get(j8);
            if (gVar2 != null) {
                list = c3;
                hVar = hVar4;
                iVar = iVar2;
                long max = Math.max(gVar2.f311648a - c4, 0);
                long max2 = Math.max(gVar2.f311652e - c4, 0);
                long j9 = gVar2.f311650c;
                long j10 = max2;
                int i8 = gVar2.f311649b;
                int i9 = gVar2.f311651d;
                int i10 = i8;
                int intValue = gVar2.f311654g.containsKey(b2) ? ((Integer) gVar2.f311654g.get(b2)).intValue() : 0;
                C112304h hVar5 = (C112304h) gVar2.f311653f.get(k);
                if (hVar5 != null) {
                    int i11 = intValue;
                    int i12 = i9;
                    j2 = c4;
                    long max3 = Math.max(hVar5.f311655a - c4, 0);
                    i3 = hVar5.f311656b;
                    if (hVar5.f311657c.containsKey(b2)) {
                        j = j10;
                        long j11 = max;
                        i = ((Integer) hVar5.f311657c.get(b2)).intValue();
                        i2 = i12;
                        j5 = j9;
                        j3 = j11;
                    } else {
                        j5 = j9;
                        j3 = max;
                        j = j10;
                        i = 0;
                        i2 = i12;
                    }
                    j4 = max3;
                    i5 = i10;
                    i4 = i11;
                } else {
                    int i13 = intValue;
                    int i14 = i9;
                    j2 = c4;
                    j5 = j9;
                    j3 = max;
                    j = j10;
                    i5 = i10;
                    i4 = i13;
                    i3 = 0;
                    i = 0;
                    i2 = i14;
                    j4 = 0;
                }
            } else {
                iVar = iVar2;
                list = c3;
                j2 = c4;
                hVar = hVar4;
                j5 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
                j4 = 0;
                j3 = 0;
                i2 = 0;
                i = 0;
                j = 0;
            }
            float f10 = (float) j3;
            if (f < f10) {
                f = f10;
            }
            float f11 = (float) j4;
            if (f2 < f11) {
                f2 = f11;
            }
            float f12 = (float) j5;
            if (f5 < f12) {
                f5 = f12;
            }
            float f13 = (float) i5;
            if (f3 < f13) {
                f3 = f13;
            }
            float f14 = (float) i3;
            if (f4 < f14) {
                f4 = f14;
            }
            float f15 = (float) i4;
            if (f7 < f15) {
                f7 = f15;
            }
            float f16 = (float) i;
            if (f6 < f16) {
                f6 = f16;
            }
            float f17 = (float) i2;
            if (f9 < f17) {
                f9 = f17;
            }
            float f18 = f;
            float f19 = f2;
            float f20 = (float) j;
            if (f8 < f20) {
                f8 = f20;
            }
            C66307h hVar6 = hVar;
            hVar6.mo59495o(f10);
            hVar6.mo59497q(f11);
            hVar6.mo59500t(f12);
            hVar6.mo59492l(f13);
            hVar6.mo59494n(f14);
            hVar6.mo59499s(f16);
            hVar6.mo59498r(f15);
            hVar6.mo59496p(f20);
            hVar6.mo59493m(f17);
            C66376a aVar5 = aVar;
            f = f18;
            it = it2;
            c3 = list;
            iVar2 = iVar;
            f2 = f19;
            c4 = j2;
        }
        List<C66307h> list2 = c3;
        for (C66307h hVar7 : list2) {
            float d = hVar7.mo59484d();
            float f21 = hVar7.mo59486f();
            float e = hVar7.mo59485e();
            float a3 = hVar7.mo59481a();
            float c5 = hVar7.mo59483c();
            float b3 = hVar7.mo59482b();
            float i15 = hVar7.mo59489i();
            float g = hVar7.mo59487g();
            float h = hVar7.mo59488h();
            hVar7.mo59495o(d / f);
            hVar7.mo59497q(f21 / f2);
            hVar7.mo59496p(e / f8);
            hVar7.mo59492l(a3 / f3);
            hVar7.mo59494n(c5 / f4);
            hVar7.mo59493m(b3 / f9);
            hVar7.mo59500t(i15 / f5);
            hVar7.mo59498r(g / f7);
            hVar7.mo59499s(h / f6);
        }
        return C66291n.m96857c(list2, this.f311763d.mo59527p(this.f180447l.f180433a, aVar));
    }

    /* renamed from: c */
    public final C66367q mo59571c(C66376a aVar) {
        C66367q c = super.mo59571c(aVar);
        C58976aa aaVar = C58975e.f156826a;
        return c;
    }

    /* renamed from: d */
    public final C66372v mo59578d() {
        return this.f311764e;
    }

    /* renamed from: e */
    public final String mo59575e() {
        return f311759a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final ArrayList mo59579f(C66376a aVar, float[] fArr) {
        List c = aVar.mo59466i().mo59480c();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c.size(); i++) {
            arrayList.add(new C66366p(((C66307h) aVar.mo59466i().mo59480c().get(i)).mo59491k(), fArr[i], (Set) this.f311765g));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final void mo59580g(DataInputStream dataInputStream, C66376a aVar) {
        C112370d dVar = this.f311764e;
        dVar.f180440b = new double[this.f311761b];
        dVar.f180441c = dataInputStream.readInt();
        dVar.f180439a = dataInputStream.readDouble();
        for (int i = 0; i < dVar.f180441c; i++) {
            dVar.f180440b[i] = dataInputStream.readDouble();
        }
        String readUTF = dataInputStream.readUTF();
        String str = f311759a;
        if (readUTF.equals(str)) {
            try {
                if (dataInputStream.readInt() != 9) {
                    throw new IOException("Suggestion extractor changed.  Retrain required.");
                }
            } catch (IOException unused) {
            }
        } else {
            throw new IOException("Inconsistent ending: [" + readUTF + "] expected: [" + str + "]");
        }
    }

    /* renamed from: h */
    public final void mo59581h(DataOutputStream dataOutputStream) {
        this.f311764e.mo59587c(dataOutputStream);
        dataOutputStream.writeUTF(f311759a);
        dataOutputStream.writeInt(9);
    }

    /* renamed from: i */
    public final boolean mo59582i(C66376a aVar) {
        return aVar.mo59463f() == 6;
    }
}
