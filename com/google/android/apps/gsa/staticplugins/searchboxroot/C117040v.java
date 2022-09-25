package com.google.android.apps.gsa.staticplugins.searchboxroot;

import com.google.android.apps.gsa.search.core.google.C85919cm;
import com.google.android.apps.gsa.searchbox.p6942a.C88533b;
import com.google.android.apps.gsa.shared.p6968aa.C89034be;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6990an.C89213d;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.apd;
import com.google.p4184bj.C56032h;
import com.google.p4184bj.C56036l;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.v */
/* compiled from: PG */
final class C117040v {

    /* renamed from: a */
    Query f324927a;

    /* renamed from: b */
    C117039u f324928b;

    /* renamed from: c */
    final /* synthetic */ C117042x f324929c;

    /* renamed from: d */
    private final C68214a f324930d;

    public C117040v(C117042x xVar, C68214a aVar) {
        this.f324929c = xVar;
        this.f324930d = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo103108a() {
        int i;
        C117039u uVar = this.f324928b;
        if (uVar != null) {
            long j = uVar.f324924a;
            C56036l lVar = uVar.f324926c;
            C60455qr qrVar = (C60455qr) uVar.f324925b.toBuilder();
            this.f324928b = null;
            this.f324929c.mo103110D(qrVar);
            C60456qs qsVar = (C60456qs) qrVar.instance;
            if ((qsVar.f163604a & 4) != 0) {
                apd apd = qsVar.f163607d;
                if (apd == null) {
                    apd = apd.f159555aA;
                }
                amt amt = (amt) apd.toBuilder();
                C89213d.m145119a(amt);
                qrVar.copyOnWrite();
                C60456qs qsVar2 = (C60456qs) qrVar.instance;
                apd apd2 = (apd) amt.build();
                apd2.getClass();
                qsVar2.f163607d = apd2;
                qsVar2.f163604a |= 4;
            }
            qrVar.copyOnWrite();
            C60456qs qsVar3 = (C60456qs) qrVar.instance;
            qsVar3.f163604a &= -3;
            qsVar3.f163606c = C60456qs.f163602g.f163606c;
            qrVar.copyOnWrite();
            ((C60456qs) qrVar.instance).f163605b = C60456qs.emptyProtobufList();
            C60456qs qsVar4 = (C60456qs) qrVar.instance;
            if ((qsVar4.f163604a & 4) != 0) {
                apd apd3 = qsVar4.f163607d;
                if (apd3 == null) {
                    apd3 = apd.f159555aA;
                }
                amt amt2 = (amt) apd3.toBuilder();
                long max = Math.max(this.f324929c.f324959j.mo26871c() - j, 0);
                amt2.copyOnWrite();
                apd apd4 = (apd) amt2.instance;
                apd4.f159583a |= 16777216;
                apd4.f159631w = (int) max;
                apd apd5 = (apd) amt2.build();
                qrVar.copyOnWrite();
                C60456qs qsVar5 = (C60456qs) qrVar.instance;
                apd5.getClass();
                qsVar5.f163607d = apd5;
                qsVar5.f163604a |= 4;
            }
            C58976aa aaVar = C58975e.f156826a;
            Query query = this.f324927a;
            if (query == null) {
                i = 1;
            } else {
                i = query.mo84474eb();
            }
            C88533b bVar = (C88533b) this.f324930d.mo27525b();
            C60456qs qsVar6 = (C60456qs) qrVar.build();
            C89037bh bhVar = (C89037bh) this.f324929c.f324964o.mo27525b();
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 520;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164177be = i - 1;
            ufVar2.f164251f |= 268435456;
            if (bhVar != null) {
                int i2 = C89034be.m144791a(bhVar.mo27377b()).f181028z;
                tzVar.copyOnWrite();
                C60555uf ufVar3 = (C60555uf) tzVar.instance;
                ufVar3.f164093a |= 134217728;
                ufVar3.f164271z = i2;
            }
            bVar.mo82171b(tzVar, qsVar6);
            if (!this.f324929c.f324956g.mo79746e(C90085ej.f250106J)) {
                return;
            }
            if (this.f324929c.f324956g.mo79746e(C90085ej.f250120X)) {
                C116851f fVar = this.f324929c.f324963n;
                C56032h hVar = (C56032h) fVar.f324316b.toBuilder();
                hVar.copyOnWrite();
                C56036l lVar2 = (C56036l) hVar.instance;
                lVar2.f149230a |= 4;
                lVar2.f149233d = true;
                ((C85919cm) fVar.f324315a.mo27525b()).mo79547f((C56036l) hVar.build());
            } else if (lVar != null) {
                C56032h hVar2 = (C56032h) lVar.toBuilder();
                hVar2.copyOnWrite();
                C56036l lVar3 = (C56036l) hVar2.instance;
                lVar3.f149230a |= 4;
                lVar3.f149233d = true;
                ((C85919cm) this.f324929c.f324955f.mo27525b()).mo79547f((C56036l) hVar2.build());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo103109b(long j, C60456qs qsVar, C56036l lVar) {
        if (lVar == null) {
            C117039u uVar = this.f324928b;
            lVar = uVar == null ? null : uVar.f324926c;
        }
        this.f324928b = new C117039u(j, qsVar, lVar);
    }
}
