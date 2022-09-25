package com.google.android.apps.gsa.staticplugins.recently.p8684g;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4570p.C60345aa;
import com.google.common.p4552o.p4570p.C60346ab;
import com.google.common.p4552o.p4570p.C60351ag;
import com.google.common.p4552o.p4570p.C60352ah;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.g.a */
/* compiled from: PG */
public final class C116090a {

    /* renamed from: a */
    public static final C59071e f321888a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.recently.g.a");

    /* renamed from: b */
    public final C21370a f321889b;

    /* renamed from: c */
    private final C89037bh f321890c;

    public C116090a(C89037bh bhVar, C21370a aVar) {
        this.f321890c = bhVar;
        this.f321889b = aVar;
    }

    /* renamed from: a */
    public final void mo102475a(int i, long j) {
        if (j <= TimeUnit.MINUTES.toMillis(10)) {
            C60345aa aaVar = (C60345aa) C60346ab.f163331j.createBuilder();
            aaVar.copyOnWrite();
            C60346ab abVar = (C60346ab) aaVar.instance;
            abVar.f163338f = 8;
            abVar.f163333a |= 64;
            C60351ag agVar = (C60351ag) C60352ah.f163349d.createBuilder();
            agVar.copyOnWrite();
            C60352ah ahVar = (C60352ah) agVar.instance;
            ahVar.f163351a |= 1;
            ahVar.f163352b = i;
            agVar.copyOnWrite();
            C60352ah ahVar2 = (C60352ah) agVar.instance;
            ahVar2.f163351a |= 2;
            ahVar2.f163353c = j;
            aaVar.copyOnWrite();
            C60346ab abVar2 = (C60346ab) aaVar.instance;
            C60352ah ahVar3 = (C60352ah) agVar.build();
            ahVar3.getClass();
            abVar2.f163341i = ahVar3;
            abVar2.f163333a |= 512;
            mo102476b((C60346ab) aaVar.build());
        }
    }

    /* renamed from: b */
    public final void mo102476b(C60346ab abVar) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 866;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        abVar.getClass();
        ufVar2.f164182bj = abVar;
        ufVar2.f164252g |= 4096;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: c */
    public final boolean mo102477c() {
        C89062r b = this.f321890c.mo27377b();
        return b != null && b.mo83040a();
    }
}
