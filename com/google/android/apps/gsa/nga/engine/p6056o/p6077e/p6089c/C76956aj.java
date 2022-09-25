package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.C76534ab;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80310be;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80314bi;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80315bj;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.aj */
/* compiled from: PG */
public final /* synthetic */ class C76956aj implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76957ak f212462a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212463b;

    public /* synthetic */ C76956aj(C76957ak akVar, C74965n nVar) {
        this.f212462a = akVar;
        this.f212463b = nVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76957ak akVar = this.f212462a;
        C74965n nVar = this.f212463b;
        C76534ab abVar = (C76534ab) obj;
        C83320io k = nVar.mo71336k();
        Locale q = nVar.mo71342q();
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(71508);
        if (abVar.mo72226b().isEmpty()) {
            C81442m.m129557s(lVar, t.r(akVar.f212468e.mo75121a(q).getString(R.string.nga_no_screenshot_access, new Object[0])));
        } else {
            akVar.f212467d.mo71239e(k, abVar);
            C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
            C80310be beVar = (C80310be) C80315bj.f220396c.createBuilder();
            C80314bi biVar = C80314bi.f220394a;
            beVar.copyOnWrite();
            C80315bj bjVar = (C80315bj) beVar.instance;
            biVar.getClass();
            bjVar.f220399b = biVar;
            bjVar.f220398a = 1;
            aoVar.copyOnWrite();
            C80295aq aqVar = (C80295aq) aoVar.instance;
            C80315bj bjVar2 = (C80315bj) beVar.build();
            bjVar2.getClass();
            aqVar.f220360b = bjVar2;
            aqVar.f220359a = 12;
            C81442m.m129555q(lVar, aoVar);
            lVar.copyOnWrite();
            ((C80401n) lVar.instance).f220664g = C80403p.m128150a(3);
        }
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220663f = true;
        return (C80401n) lVar.build();
    }
}
