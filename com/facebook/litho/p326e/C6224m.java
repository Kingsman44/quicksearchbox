package com.facebook.litho.p326e;

import com.facebook.litho.p326e.p327a.C6209a;
import com.facebook.litho.p326e.p327a.C6210b;
import com.facebook.litho.p326e.p327a.C6211c;
import com.facebook.litho.p326e.p327a.C6212d;
import com.google.common.p4535g.C59203do;
import java.util.Iterator;

/* renamed from: com.facebook.litho.e.m */
/* compiled from: PG */
public final class C6224m extends C6226o implements C6223l {

    /* renamed from: e */
    private final C6210b f18396e;

    /* renamed from: f */
    private long f18397f;

    public C6224m() {
        this((C6211c) null);
    }

    /* renamed from: a */
    public final float mo12765a(long j) {
        double d;
        boolean z;
        C6224m mVar = this;
        long j2 = j;
        if (mVar.f18397f == Long.MIN_VALUE) {
            mVar.f18397f = j2;
            float f = mVar.mo13186f("initial").f18404c;
            float f2 = mVar.mo13186f("end").f18404c;
            C6210b bVar = mVar.f18396e;
            bVar.f18360b.f18356a = (double) f;
            Iterator it = bVar.f18366h.iterator();
            while (it.hasNext()) {
                ((C6212d) it.next()).mo13176d();
            }
            C6209a aVar = bVar.f18360b;
            double d2 = aVar.f18356a;
            bVar.f18363e = d2;
            bVar.f18362d.f18356a = d2;
            aVar.f18357b = C59203do.f157270a;
            mVar.f18396e.mo13172b((double) f2);
            return f;
        }
        float f3 = mVar.mo13186f("end").f18404c;
        mVar.f18396e.mo13172b((double) f3);
        if (mVar.f18396e.mo13171a()) {
            return f3;
        }
        double d3 = (double) (j2 - mVar.f18397f);
        Double.isNaN(d3);
        double d4 = d3 / 1.0E9d;
        C6210b bVar2 = mVar.f18396e;
        boolean a = bVar2.mo13171a();
        if (!a || !bVar2.f18364f) {
            if (d4 > 0.064d) {
                d4 = 0.064d;
            }
            bVar2.f18365g += d4;
            C6211c cVar = bVar2.f18359a;
            double d5 = cVar.f18369c;
            double d6 = cVar.f18368b;
            C6209a aVar2 = bVar2.f18360b;
            double d7 = aVar2.f18356a;
            double d8 = aVar2.f18357b;
            C6209a aVar3 = bVar2.f18362d;
            double d9 = aVar3.f18356a;
            double d10 = aVar3.f18357b;
            while (true) {
                d = bVar2.f18365g;
                if (d < 0.001d) {
                    break;
                }
                double d11 = d - 4046.848d;
                bVar2.f18365g = d11;
                if (d11 < 0.001d) {
                    C6209a aVar4 = bVar2.f18361c;
                    aVar4.f18356a = d7;
                    aVar4.f18357b = d8;
                }
                double d12 = bVar2.f18363e;
                double d13 = ((d12 - d9) * 230.2d) - (d8 * 22.0d);
                double d14 = d8 + (d13 * 0.001d * 0.5d);
                double d15 = ((d12 - (d7 + ((d8 * 0.001d) * 0.5d))) * 230.2d) - (d14 * 22.0d);
                double d16 = d8 + (d15 * 0.001d * 0.5d);
                double d17 = ((d12 - (d7 + ((d14 * 0.001d) * 0.5d))) * 230.2d) - (d16 * 22.0d);
                double d18 = d7 + (d16 * 0.001d);
                double d19 = d8 + (d17 * 0.001d);
                double d20 = d14 + d16;
                double d21 = d15 + d17;
                d7 += (d8 + d20 + d20 + d19) * 0.16666666666666666d * 0.001d;
                d8 += (d13 + d21 + d21 + (((d12 - d18) * 230.2d) - (22.0d * d19))) * 0.16666666666666666d * 0.001d;
                d9 = d18;
                d10 = d19;
            }
            C6209a aVar5 = bVar2.f18362d;
            aVar5.f18356a = d9;
            aVar5.f18357b = d10;
            C6209a aVar6 = bVar2.f18360b;
            aVar6.f18356a = d7;
            aVar6.f18357b = d8;
            if (d > C59203do.f157270a) {
                double d22 = d / 0.001d;
                C6209a aVar7 = bVar2.f18361c;
                double d23 = 1.0d - d22;
                aVar6.f18356a = (d7 * d22) + (aVar7.f18356a * d23);
                aVar6.f18357b = (d8 * d22) + (aVar7.f18357b * d23);
            }
            boolean z2 = true;
            if (bVar2.mo13171a()) {
                C6209a aVar8 = bVar2.f18360b;
                aVar8.f18356a = bVar2.f18363e;
                if (aVar8.f18357b != C59203do.f157270a) {
                    aVar8.f18357b = C59203do.f157270a;
                }
                a = true;
            }
            if (bVar2.f18364f) {
                bVar2.f18364f = false;
                z = true;
            } else {
                z = false;
            }
            if (a) {
                bVar2.f18364f = true;
            } else {
                z2 = false;
            }
            Iterator it2 = bVar2.f18366h.iterator();
            while (it2.hasNext()) {
                C6212d dVar = (C6212d) it2.next();
                if (z) {
                    dVar.mo13173a();
                }
                dVar.mo13176d();
                if (z2) {
                    dVar.mo13174b();
                }
            }
            mVar = this;
            j2 = j;
        }
        mVar.f18397f = j2;
        return (float) mVar.f18396e.f18360b.f18356a;
    }

    /* renamed from: b */
    public final boolean mo13183b() {
        return this.f18396e.mo13171a();
    }

    public C6224m(C6211c cVar) {
        this.f18397f = Long.MIN_VALUE;
        C6210b bVar = new C6210b();
        this.f18396e = bVar;
        if (cVar != null) {
            bVar.f18359a = cVar;
        }
    }
}
