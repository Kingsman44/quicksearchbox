package com.google.android.libraries.componentview.p1680c.p1681a;

import com.google.android.libraries.componentview.components.base.p1687a.C19899a;
import com.google.android.libraries.componentview.components.base.p1687a.C19903ad;
import com.google.android.libraries.componentview.components.base.p1687a.C19904ae;
import com.google.android.libraries.componentview.components.base.p1687a.C19909aj;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.components.base.p1687a.C19988k;
import com.google.android.libraries.componentview.components.base.p1687a.C19991n;
import com.google.android.libraries.componentview.components.base.p1687a.C19994q;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.p4463ce.p4464a.p4465a.p4466a.p4469b.C58053a;
import p211b.p212a.p216d.C4655b;
import p211b.p212a.p216d.C4659f;
import p211b.p212a.p216d.C4661h;
import p211b.p212a.p216d.C4665l;
import p211b.p212a.p227o.C4689b;

/* renamed from: com.google.android.libraries.componentview.c.a.a */
/* compiled from: PG */
public final class C19752a {
    /* renamed from: a */
    public static C19926b m37608a(C4689b bVar) {
        C19899a aVar = (C19899a) C19926b.f55754e.createBuilder();
        boolean z = bVar.f14728a;
        aVar.copyOnWrite();
        C19926b bVar2 = (C19926b) aVar.instance;
        bVar2.f55756a |= 1;
        bVar2.f55757b = z;
        boolean z2 = bVar.f14729b;
        aVar.copyOnWrite();
        C19926b bVar3 = (C19926b) aVar.instance;
        bVar3.f55756a |= 2;
        bVar3.f55758c = z2;
        C4659f fVar = bVar.f14730c;
        if (fVar == null) {
            fVar = C4659f.f14603e;
        }
        C19995r b = m37609b(fVar);
        aVar.copyOnWrite();
        C19926b bVar4 = (C19926b) aVar.instance;
        b.getClass();
        bVar4.f55759d = b;
        bVar4.f55756a |= 4;
        return (C19926b) aVar.build();
    }

    /* renamed from: b */
    public static C19995r m37609b(C4659f fVar) {
        if (fVar.f14608d <= 0.0f) {
            return C19995r.f56032g;
        }
        C19994q qVar = (C19994q) C19995r.f56032g.createBuilder();
        float f = fVar.f14605a;
        qVar.copyOnWrite();
        C19995r rVar = (C19995r) qVar.instance;
        rVar.f56034a |= 1;
        rVar.f56035b = f;
        float f2 = fVar.f14607c;
        qVar.copyOnWrite();
        C19995r rVar2 = (C19995r) qVar.instance;
        rVar2.f56034a |= 4;
        rVar2.f56037d = f2;
        float f3 = fVar.f14606b;
        qVar.copyOnWrite();
        C19995r rVar3 = (C19995r) qVar.instance;
        rVar3.f56034a |= 2;
        rVar3.f56036c = f3;
        float f4 = fVar.f14608d;
        qVar.copyOnWrite();
        C19995r rVar4 = (C19995r) qVar.instance;
        rVar4.f56034a |= 8;
        rVar4.f56038e = f4;
        return (C19995r) qVar.build();
    }

    /* renamed from: c */
    public static C19916aq m37610c(C4665l lVar) {
        C19909aj ajVar = (C19909aj) C19916aq.f55703s.createBuilder();
        if ((lVar.f14621a & 1) != 0) {
            C4659f fVar = lVar.f14626f;
            if (fVar == null) {
                fVar = C4659f.f14603e;
            }
            C19995r b = m37609b(fVar);
            ajVar.copyOnWrite();
            C19916aq aqVar = (C19916aq) ajVar.instance;
            b.getClass();
            aqVar.f55710f = b;
            aqVar.f55705a |= 1;
        }
        if ((lVar.f14621a & 2) != 0) {
            C4661h hVar = lVar.f14627g;
            if (hVar == null) {
                hVar = C4661h.f14610f;
            }
            C19903ad adVar = (C19903ad) C19904ae.f55685f.createBuilder();
            if ((hVar.f14612a & 1) != 0) {
                int i = hVar.f14613b;
                adVar.copyOnWrite();
                C19904ae aeVar = (C19904ae) adVar.instance;
                aeVar.f55687a |= 1;
                aeVar.f55688b = (float) i;
            }
            if ((hVar.f14612a & 4) != 0) {
                int i2 = hVar.f14615d;
                adVar.copyOnWrite();
                C19904ae aeVar2 = (C19904ae) adVar.instance;
                aeVar2.f55687a |= 4;
                aeVar2.f55690d = (float) i2;
            }
            if ((hVar.f14612a & 2) != 0) {
                int i3 = hVar.f14614c;
                adVar.copyOnWrite();
                C19904ae aeVar3 = (C19904ae) adVar.instance;
                aeVar3.f55687a |= 2;
                aeVar3.f55689c = (float) i3;
            }
            if ((hVar.f14612a & 8) != 0) {
                int i4 = hVar.f14616e;
                adVar.copyOnWrite();
                C19904ae aeVar4 = (C19904ae) adVar.instance;
                aeVar4.f55687a |= 8;
                aeVar4.f55691e = (float) i4;
            }
            ajVar.copyOnWrite();
            C19916aq aqVar2 = (C19916aq) ajVar.instance;
            C19904ae aeVar5 = (C19904ae) adVar.build();
            aeVar5.getClass();
            aqVar2.f55712h = aeVar5;
            aqVar2.f55705a |= 32;
        }
        if ((lVar.f14621a & 128) != 0 || lVar.f14624d == 6) {
            C19988k kVar = (C19988k) C19991n.f56019e.createBuilder();
            if ((lVar.f14621a & 128) != 0) {
                C4659f fVar2 = lVar.f14629i;
                if (fVar2 == null) {
                    fVar2 = C4659f.f14603e;
                }
                int a = C58053a.m88812a(fVar2);
                kVar.copyOnWrite();
                C19991n nVar = (C19991n) kVar.instance;
                nVar.f56021a |= 2;
                nVar.f56023c = a;
            }
            if (lVar.f14624d == 6) {
                float floatValue = ((Float) lVar.f14625e).floatValue();
                kVar.copyOnWrite();
                C19991n nVar2 = (C19991n) kVar.instance;
                nVar2.f56021a |= 1;
                nVar2.f56022b = floatValue;
            }
            ajVar.copyOnWrite();
            C19916aq aqVar3 = (C19916aq) ajVar.instance;
            C19991n nVar3 = (C19991n) kVar.build();
            nVar3.getClass();
            aqVar3.f55709e = nVar3;
            aqVar3.f55708d = 13;
        }
        if (lVar.f14622b == 11 && ((Boolean) lVar.f14623c).booleanValue()) {
            ajVar.copyOnWrite();
            C19916aq aqVar4 = (C19916aq) ajVar.instance;
            aqVar4.f55706b = 18;
            aqVar4.f55707c = true;
        } else if (lVar.f14622b == 3) {
            float floatValue2 = ((Float) lVar.f14623c).floatValue();
            ajVar.copyOnWrite();
            C19916aq aqVar5 = (C19916aq) ajVar.instance;
            aqVar5.f55706b = 2;
            aqVar5.f55707c = Float.valueOf(floatValue2);
        }
        if ((lVar.f14621a & 32) != 0) {
            float f = lVar.f14628h;
            ajVar.copyOnWrite();
            C19916aq aqVar6 = (C19916aq) ajVar.instance;
            aqVar6.f55705a |= 16;
            aqVar6.f55711g = f;
        }
        C4655b bVar = lVar.f14630j;
        if (bVar == null) {
            bVar = C4655b.f14597c;
        }
        if ((bVar.f14599a & 1) != 0) {
            C4655b bVar2 = lVar.f14630j;
            if (bVar2 == null) {
                bVar2 = C4655b.f14597c;
            }
            String str = bVar2.f14600b;
            ajVar.copyOnWrite();
            C19916aq aqVar7 = (C19916aq) ajVar.instance;
            str.getClass();
            aqVar7.f55705a |= 64;
            aqVar7.f55713i = str;
        }
        return (C19916aq) ajVar.build();
    }
}
