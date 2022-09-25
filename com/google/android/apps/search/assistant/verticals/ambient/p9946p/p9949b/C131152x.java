package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b;

import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4535g.C59121an;
import com.google.common.p4535g.C59129av;
import com.google.common.p4535g.C59131ax;
import com.google.common.p4535g.C59132ay;
import com.google.common.p4535g.C59133az;
import com.google.common.p4535g.C59134b;
import com.google.common.p4535g.C59136bb;
import com.google.common.p4535g.C59137bc;
import com.google.common.p4535g.C59138bd;
import com.google.common.p4535g.C59139be;
import com.google.common.p4535g.C59140bf;
import com.google.common.p4535g.C59143bi;
import com.google.common.p4535g.C59161c;
import com.google.common.p4535g.C59164cc;
import com.google.common.p4535g.C59188d;
import com.google.common.p4575r.C60761r;
import com.google.p381aj.p382a.p383a.p384a.C8217af;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.b.x */
/* compiled from: PG */
public final /* synthetic */ class C131152x implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131152x f358664a = new C131152x();

    private /* synthetic */ C131152x() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C59143bi biVar;
        Iterator it;
        C59133az azVar;
        int i;
        int i2;
        int i3;
        C8217af afVar = (C8217af) obj;
        if (afVar != null) {
            try {
                C59188d dVar = new C59188d(afVar.f28851a.mo59041m());
                byte a = C59161c.m91744a(dVar.f157256a);
                if (a == 1) {
                    biVar = new C59143bi();
                    C59161c.m91744a(dVar.f157256a);
                    biVar.f157181e = C59161c.m91744a(dVar.f157256a) == 1;
                    biVar.f157182f = 0;
                    int a2 = dVar.mo56561a();
                    C58838bb.m90884s(a2 >= 0, "Can only decode polygons with up to 2^31 - 1 loops");
                    int i4 = 0;
                    while (i4 < a2) {
                        byte a3 = C59161c.m91744a(dVar.f157256a);
                        if (a3 == 1) {
                            int a4 = dVar.mo56561a();
                            C58838bb.m90884s(a4 >= 0, "Loops with more than 2^31 - 1 vertices not supported.");
                            ArrayList arrayList = new ArrayList(a4);
                            for (int i5 = 0; i5 < a4; i5++) {
                                arrayList.add(new C59136bb(Double.longBitsToDouble(C59188d.m91800b(dVar.f157256a)), Double.longBitsToDouble(C59188d.m91800b(dVar.f157256a)), Double.longBitsToDouble(C59188d.m91800b(dVar.f157256a))));
                            }
                            boolean z = C59161c.m91744a(dVar.f157256a) != 0;
                            int a5 = dVar.mo56561a();
                            C59133az azVar2 = new C59133az(arrayList, z, C59129av.m91621d(dVar));
                            azVar2.f157147h = a5;
                            if (a4 > 0) {
                                azVar2.mo56483k();
                            }
                            biVar.f157182f += azVar2.f157143d;
                            biVar.f157177a.add(azVar2);
                            i4++;
                        } else {
                            throw new IOException("Unknown S2Loop encoding version encountered during decoding: " + a3);
                        }
                    }
                    biVar.f157178b = C59129av.m91621d(dVar);
                    biVar.f157179c = C59121an.m91580a(biVar.f157178b);
                    biVar.mo56521e();
                } else if (a == 4) {
                    byte a6 = C59161c.m91744a(dVar.f157256a);
                    if (a6 <= 30) {
                        int c = (int) C59134b.m91661c(dVar.f157256a);
                        ArrayList arrayList2 = new ArrayList(c);
                        int i6 = 0;
                        while (i6 < c) {
                            int c2 = (int) C59134b.m91661c(dVar.f157256a);
                            ArrayList arrayList3 = new ArrayList(c2);
                            ArrayList arrayList4 = new ArrayList();
                            int i7 = 0;
                            while (i7 < c2) {
                                long c3 = C59134b.m91661c(dVar.f157256a);
                                C59138bd bdVar = new C59138bd((int) (c3 % 6), (int) (c3 / 6));
                                arrayList4.add(bdVar);
                                i7 += bdVar.f157169b;
                            }
                            Iterator it2 = arrayList4.iterator();
                            if (!it2.hasNext()) {
                                it = Collections.emptyList().iterator();
                            } else {
                                it = new C59137bc(it2);
                            }
                            C59139be beVar = new C59139be();
                            C59139be beVar2 = new C59139be();
                            int i8 = 0;
                            while (i8 < c2) {
                                if (i8 == 0) {
                                    int i9 = (a6 + 7) / 8;
                                    int i10 = i9 + i9;
                                    byte[] bArr = new byte[i10];
                                    if (dVar.f157256a.read(bArr) >= i10) {
                                        long reverseBytes = Long.reverseBytes(C60761r.m92757c(Arrays.copyOf(bArr, 8)));
                                        i = beVar.mo56509a(C59134b.m91660b(reverseBytes));
                                        i3 = beVar2.mo56509a(C59134b.m91660b(reverseBytes >>> 1));
                                        i2 = 0;
                                    } else {
                                        throw new IOException("EOF");
                                    }
                                } else {
                                    long c4 = C59134b.m91661c(dVar.f157256a);
                                    i = beVar.mo56509a(C59134b.m91659a(C59134b.m91660b(c4)));
                                    int a7 = beVar2.mo56509a(C59134b.m91659a(C59134b.m91660b(c4 >>> 1)));
                                    i2 = i8;
                                    i3 = a7;
                                }
                                arrayList3.add(C59136bb.m91671n(C59164cc.m91756k(((Integer) it.next()).intValue(), C59164cc.f157204f.mo56542c(C59140bf.m91684a(i, a6)), C59164cc.f157204f.mo56542c(C59140bf.m91684a(i3, a6)))));
                                i8 = i2 + 1;
                                beVar2 = beVar2;
                                it = it;
                                beVar = beVar;
                            }
                            int c5 = (int) C59134b.m91661c(dVar.f157256a);
                            if (c5 <= c2) {
                                for (int i11 = 0; i11 < c5; i11++) {
                                    arrayList3.set((int) C59134b.m91661c(dVar.f157256a), new C59136bb(Double.longBitsToDouble(C59188d.m91800b(dVar.f157256a)), Double.longBitsToDouble(C59188d.m91800b(dVar.f157256a)), Double.longBitsToDouble(C59188d.m91800b(dVar.f157256a))));
                                }
                                long c6 = C59134b.m91661c(dVar.f157256a);
                                int c7 = (int) C59134b.m91661c(dVar.f157256a);
                                if (C59132ay.m91637a(C59131ax.BOUND_ENCODED, c6)) {
                                    azVar = new C59133az(arrayList3, C59132ay.m91637a(C59131ax.ORIGIN_INSIDE, c6), C59129av.m91621d(dVar));
                                } else {
                                    azVar = new C59133az((List) arrayList3);
                                }
                                azVar.f157147h = c7;
                                arrayList2.add(azVar);
                                i6++;
                            } else {
                                throw new IOException("Number of off-center points is greater than total amount of points.");
                            }
                        }
                        biVar = new C59143bi();
                        biVar.f157177a.addAll(arrayList2);
                        biVar.mo56523f();
                    } else {
                        throw new IOException("Invalid level");
                    }
                } else {
                    throw new IOException("Unsupported S2Polygon encoding version " + a);
                }
                return Optional.m71637of(biVar);
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) C131129ae.f358624a.mo56226d()).mo56382g(e)).mo56372aa(39046)).mo56386p("Failed to convert encoded polygon to S2Polygon");
            }
        }
        return Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
