package com.google.android.libraries.lens.view.p2056af;

import com.google.android.libraries.lens.p2014e.C24203af;
import com.google.android.libraries.lens.view.p2078at.p2079a.p2080a.C25486d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59892ba;
import com.google.common.p4552o.p4563i.C59895bd;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.libraries.lens.view.af.c */
/* compiled from: PG */
public final class C25073c {

    /* renamed from: a */
    public C24203af f68322a;

    /* renamed from: b */
    public final C37215b f68323b;

    /* renamed from: c */
    public int f68324c = 1;

    /* renamed from: d */
    private C24203af f68325d;

    public C25073c(C37215b bVar) {
        this.f68323b = bVar;
    }

    /* renamed from: a */
    public final void mo30252a(C62722b bVar, C59895bd bdVar) {
        if (mo30253b()) {
            C37215b bVar2 = this.f68323b;
            C37252a c = C37194a.f98558cO.mo40805c(bVar);
            C62940bt btVar = C59898bg.f161867w;
            C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
            afVar.copyOnWrite();
            C59898bg bgVar = (C59898bg) afVar.instance;
            bdVar.getClass();
            bgVar.f161886r = bdVar;
            bgVar.f161869a |= 65536;
            ((C37253b) c).mo40792p(btVar, (C59898bg) afVar.build());
            bVar2.mo19974a(c);
            bVar.name();
            int i = bdVar.f161857b;
            int i2 = bdVar.f161858c;
            this.f68324c = 4;
        }
    }

    /* renamed from: b */
    public final boolean mo30253b() {
        return this.f68324c == 3;
    }

    /* renamed from: c */
    public final boolean mo30254c(C25486d dVar) {
        C24203af afVar = this.f68322a;
        if (afVar != null) {
            boolean equals = dVar.f69441b.equals(afVar.toString());
            if (!equals) {
                String str = dVar.f69441b;
            }
            return equals;
        }
        String str2 = dVar.f69441b;
        return false;
    }

    /* renamed from: d */
    public final void mo30255d(C62722b bVar, C24203af afVar, int i) {
        if (afVar == null || !afVar.equals(this.f68325d)) {
            this.f68325d = afVar;
            if (this.f68324c == 2) {
                C37215b bVar2 = this.f68323b;
                C37252a i2 = C37194a.f98557cN.mo40815i(bVar);
                C62940bt btVar = C59898bg.f161867w;
                C59870af afVar2 = (C59870af) C59898bg.f161866v.createBuilder();
                C59892ba baVar = (C59892ba) C59895bd.f161854d.createBuilder();
                baVar.copyOnWrite();
                C59895bd bdVar = (C59895bd) baVar.instance;
                int i3 = i - 1;
                bdVar.f161857b = i3;
                bdVar.f161856a |= 1;
                C59895bd bdVar2 = (C59895bd) baVar.build();
                afVar2.copyOnWrite();
                C59898bg bgVar = (C59898bg) afVar2.instance;
                bdVar2.getClass();
                bgVar.f161886r = bdVar2;
                bgVar.f161869a |= 65536;
                C37253b bVar3 = (C37253b) i2;
                bVar3.mo40792p(btVar, (C59898bg) afVar2.build());
                bVar3.mo40795s("lens_query_id", afVar.toString());
                bVar2.mo19974a(i2);
                bVar.name();
                this.f68324c = 3;
                if (bVar != C62722b.OK) {
                    C59892ba baVar2 = (C59892ba) C59895bd.f161854d.createBuilder();
                    baVar2.copyOnWrite();
                    C59895bd bdVar3 = (C59895bd) baVar2.instance;
                    bdVar3.f161857b = i3;
                    bdVar3.f161856a |= 1;
                    mo30252a(bVar, (C59895bd) baVar2.build());
                }
            }
        }
    }
}
