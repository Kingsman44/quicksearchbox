package com.google.android.libraries.lens.view.p2113h.p2114a;

import android.util.Range;
import android.util.Size;
import com.google.android.libraries.lens.view.p2056af.C25050av;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26764p;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.aaf;
import com.google.common.p4552o.aak;
import com.google.common.p4552o.aar;
import com.google.common.p4552o.aas;
import com.google.common.p4552o.acs;
import com.google.common.p4552o.act;
import com.google.common.p4552o.acu;
import com.google.common.p4552o.acv;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.lens.view.h.a.k */
/* compiled from: PG */
public final class C26650k implements C26764p {

    /* renamed from: a */
    private static final C58974d f72653a = C58974d.m91135i("CameraConfiguration");

    /* renamed from: b */
    private final aaf f72654b = ((aaf) aak.f158096n.createBuilder());

    /* renamed from: c */
    private final C26651l f72655c;

    /* renamed from: d */
    private final C26658s f72656d;

    public C26650k(C26658s sVar, C26651l lVar) {
        this.f72656d = sVar;
        this.f72655c = lVar;
    }

    /* renamed from: n */
    private static act m49243n(Range range) {
        acs acs = (acs) act.f158327d.createBuilder();
        int intValue = ((Integer) range.getLower()).intValue();
        acs.copyOnWrite();
        act act = (act) acs.instance;
        act.f158329a |= 1;
        act.f158330b = intValue;
        int intValue2 = ((Integer) range.getUpper()).intValue();
        acs.copyOnWrite();
        act act2 = (act) acs.instance;
        act2.f158329a |= 2;
        act2.f158331c = intValue2;
        return (act) acs.build();
    }

    /* renamed from: o */
    private static acv m49244o(Size size) {
        acu acu = (acu) acv.f158332d.createBuilder();
        int width = size.getWidth();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f158334a |= 1;
        acv.f158335b = width;
        int height = size.getHeight();
        acu.copyOnWrite();
        acv acv2 = (acv) acu.instance;
        acv2.f158334a |= 2;
        acv2.f158336c = height;
        return (acv) acu.build();
    }

    /* renamed from: a */
    public final void mo31936a() {
        aak aak = (aak) this.f72654b.build();
        C25050av avVar = this.f72656d.f72688a;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1209;
        aar aar = (aar) aas.f158145p.createBuilder();
        aar.copyOnWrite();
        aas aas = (aas) aar.instance;
        aak.getClass();
        aas.f158148b = aak;
        aas.f158147a |= 2;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        aas aas2 = (aas) aar.build();
        aas2.getClass();
        ufVar2.f164197by = aas2;
        ufVar2.f164253h |= 8;
        avVar.mo30241a((C60555uf) tzVar.build());
        this.f72655c.f72661e = aak;
    }

    /* renamed from: b */
    public final void mo31937b(C58485gu guVar) {
        aaf aaf = this.f72654b;
        aaf.copyOnWrite();
        aak aak = aak.f158096n;
        ((aak) aaf.instance).f158100c = aak.emptyProtobufList();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            aaf aaf2 = this.f72654b;
            acv o = m49244o((Size) guVar.get(i));
            aaf2.copyOnWrite();
            aak aak2 = (aak) aaf2.instance;
            o.getClass();
            C62971cq cqVar = aak2.f158100c;
            if (!cqVar.mo58948c()) {
                aak2.f158100c = C62942bv.mutableCopy(cqVar);
            }
            aak2.f158100c.add(o);
        }
    }

    /* renamed from: c */
    public final void mo31938c(C58485gu guVar) {
        aaf aaf = this.f72654b;
        aaf.copyOnWrite();
        aak aak = aak.f158096n;
        ((aak) aaf.instance).f158104g = aak.emptyProtobufList();
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            aaf aaf2 = this.f72654b;
            act n = m49243n((Range) guVar.get(i2));
            aaf2.copyOnWrite();
            aak aak2 = (aak) aaf2.instance;
            n.getClass();
            C62971cq cqVar = aak2.f158104g;
            if (!cqVar.mo58948c()) {
                aak2.f158104g = C62942bv.mutableCopy(cqVar);
            }
            aak2.f158104g.add(n);
        }
    }

    /* renamed from: d */
    public final void mo31939d(Range range) {
        aaf aaf = this.f72654b;
        act n = m49243n(range);
        aaf.copyOnWrite();
        aak aak = (aak) aaf.instance;
        aak aak2 = aak.f158096n;
        n.getClass();
        aak.f158105h = n;
        aak.f158098a |= 16;
    }

    /* renamed from: f */
    public final void mo31941f(String str) {
        aaf aaf = this.f72654b;
        aaf.copyOnWrite();
        aak aak = (aak) aaf.instance;
        aak aak2 = aak.f158096n;
        str.getClass();
        aak.f158098a |= 1;
        aak.f158099b = str;
    }

    /* renamed from: g */
    public final void mo31942g(boolean z) {
        aaf aaf = this.f72654b;
        aaf.copyOnWrite();
        aak aak = (aak) aaf.instance;
        aak aak2 = aak.f158096n;
        aak.f158098a |= 32;
        aak.f158106i = z;
    }

    /* renamed from: h */
    public final void mo31943h(Size size) {
        aaf aaf = this.f72654b;
        acv o = m49244o(size);
        aaf.copyOnWrite();
        aak aak = (aak) aaf.instance;
        aak aak2 = aak.f158096n;
        o.getClass();
        aak.f158101d = o;
        aak.f158098a |= 2;
    }

    /* renamed from: i */
    public final void mo31944i(Size size) {
        aaf aaf = this.f72654b;
        acv o = m49244o(size);
        aaf.copyOnWrite();
        aak aak = (aak) aaf.instance;
        aak aak2 = aak.f158096n;
        o.getClass();
        aak.f158102e = o;
        aak.f158098a |= 4;
    }

    /* renamed from: j */
    public final void mo31945j(Size size) {
        aaf aaf = this.f72654b;
        acv o = m49244o(size);
        aaf.copyOnWrite();
        aak aak = (aak) aaf.instance;
        aak aak2 = aak.f158096n;
        o.getClass();
        aak.f158103f = o;
        aak.f158098a |= 8;
    }

    /* renamed from: k */
    public final void mo31946k(boolean z) {
        if (z) {
            aaf aaf = this.f72654b;
            aaf.copyOnWrite();
            aak aak = (aak) aaf.instance;
            aak aak2 = aak.f158096n;
            aak.f158108k = 2;
            aak.f158098a |= 128;
            return;
        }
        aaf aaf2 = this.f72654b;
        aaf2.copyOnWrite();
        aak aak3 = (aak) aaf2.instance;
        aak aak4 = aak.f158096n;
        aak3.f158108k = 3;
        aak3.f158098a |= 128;
    }

    /* renamed from: l */
    public final void mo31947l(int i) {
        aaf aaf = this.f72654b;
        aaf.copyOnWrite();
        aak aak = (aak) aaf.instance;
        aak aak2 = aak.f158096n;
        aak.f158107j = i - 1;
        aak.f158098a |= 64;
    }

    /* renamed from: m */
    public final void mo31948m(int i) {
        aaf aaf = this.f72654b;
        aaf.copyOnWrite();
        aak aak = (aak) aaf.instance;
        aak aak2 = aak.f158096n;
        aak.f158109l = i - 1;
        aak.f158098a |= 256;
    }

    /* renamed from: e */
    public final void mo31940e(int i) {
        if (i == 0) {
            aaf aaf = this.f72654b;
            aaf.copyOnWrite();
            aak aak = (aak) aaf.instance;
            aak aak2 = aak.f158096n;
            aak.f158110m = 2;
            aak.f158098a |= 512;
        } else if (i == 1) {
            aaf aaf2 = this.f72654b;
            aaf2.copyOnWrite();
            aak aak3 = (aak) aaf2.instance;
            aak aak4 = aak.f158096n;
            aak3.f158110m = 3;
            aak3.f158098a |= 512;
        } else if (i == 2) {
            aaf aaf3 = this.f72654b;
            aaf3.copyOnWrite();
            aak aak5 = (aak) aaf3.instance;
            aak aak6 = aak.f158096n;
            aak5.f158110m = 1;
            aak5.f158098a |= 512;
        } else if (i == 3) {
            aaf aaf4 = this.f72654b;
            aaf4.copyOnWrite();
            aak aak7 = (aak) aaf4.instance;
            aak aak8 = aak.f158096n;
            aak7.f158110m = 4;
            aak7.f158098a |= 512;
        } else if (i != 4) {
            ((C58970a) ((C58970a) f72653a.mo56226d()).mo56372aa(49017)).mo56387q("Supported hardware level %s is unknown.", i);
            aaf aaf5 = this.f72654b;
            aaf5.copyOnWrite();
            aak aak9 = (aak) aaf5.instance;
            aak aak10 = aak.f158096n;
            aak9.f158110m = 0;
            aak9.f158098a |= 512;
        } else {
            aaf aaf6 = this.f72654b;
            aaf6.copyOnWrite();
            aak aak11 = (aak) aaf6.instance;
            aak aak12 = aak.f158096n;
            aak11.f158110m = 5;
            aak11.f158098a |= 512;
        }
    }
}
