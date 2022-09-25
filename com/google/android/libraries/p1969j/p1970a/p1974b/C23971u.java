package com.google.android.libraries.p1969j.p1970a.p1974b;

import android.accounts.Account;
import android.app.Application;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2352b;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1973b.C23940a;
import com.google.common.base.C58838bb;
import com.google.common.base.C58851bo;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60895di;
import com.google.common.util.concurrent.C60922j;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55915a;
import com.google.p4184bj.p4193c.p4197c.C55927aa;
import com.google.p4184bj.p4193c.p4197c.C55928ab;
import com.google.p4184bj.p4193c.p4197c.C55951ay;
import com.google.p4184bj.p4193c.p4197c.C55960bg;
import com.google.p4184bj.p4193c.p4197c.C55961bh;
import com.google.p4184bj.p4193c.p4197c.C55962bi;
import com.google.p4184bj.p4193c.p4197c.C55963bj;
import com.google.p4184bj.p4193c.p4197c.C55964bk;
import com.google.p4184bj.p4193c.p4197c.C55970f;
import com.google.p4184bj.p4193c.p4197c.C55971g;
import com.google.p4184bj.p4193c.p4197c.C55977m;
import com.google.p4184bj.p4193c.p4197c.C55979o;
import com.google.protobuf.C63088z;
import java.util.concurrent.Executors;
import p5304e.p5305a.p5306a.p5388m.p5389a.C68820a;

/* renamed from: com.google.android.libraries.j.a.b.u */
/* compiled from: PG */
public final class C23971u extends C2352b {

    /* renamed from: b */
    public final C2332ag f65547b = new C2332ag();

    /* renamed from: c */
    public final C23953c f65548c;

    /* renamed from: d */
    public C55951ay f65549d;

    /* renamed from: e */
    public final int f65550e;

    /* renamed from: f */
    final Account f65551f;

    /* renamed from: g */
    final C55912b f65552g;

    /* renamed from: h */
    final C55960bg f65553h;

    /* renamed from: i */
    private final C23948af f65554i;

    public C23971u(Application application, Account account, C55912b bVar, C55960bg bgVar, C23948af afVar) {
        super(application);
        this.f65551f = account;
        this.f65552g = bVar;
        this.f65553h = bgVar;
        this.f65554i = afVar;
        int nextInt = C58851bo.f156649a.nextInt();
        this.f65550e = nextInt;
        this.f65548c = C23952b.m44541a(application, Integer.valueOf(nextInt), bgVar, account, bVar);
    }

    /* renamed from: a */
    public final void mo29380a(C23968r rVar) {
        C60870cx cxVar;
        C23968r rVar2 = (C23968r) this.f65547b.mo3842a();
        this.f65547b.mo5708l(rVar);
        C23950ah ahVar = C23950ah.ALREADY_CONSENTED;
        C23968r rVar3 = C23968r.CONSENT_DATA_LOADING;
        boolean z = false;
        switch (rVar.ordinal()) {
            case 0:
                if (rVar2 == null || rVar2 == C23968r.CONSENT_DATA_LOADING_FAILED) {
                    z = true;
                }
                C58838bb.m90883r(z);
                C23948af afVar = this.f65554i;
                Application application = this.f6558a;
                C60856cj.m92911t(afVar.mo29362b(application, this.f65551f, this.f65552g, C23940a.m44522a(application).toLanguageTag(), this.f65553h, false), new C23967q(this), new C23970t());
                return;
            case 1:
                if (rVar2 == C23968r.CONSENT_DATA_LOADING || rVar2 == C23968r.CONSENT_WRITE_IN_PROGRESS) {
                    z = true;
                }
                C58838bb.m90883r(z);
                if (rVar2 != C23968r.CONSENT_DATA_LOADING) {
                    this.f65548c.mo29366b(8);
                    return;
                } else if ((this.f65549d.f148934a & 8) != 0) {
                    C23953c cVar = this.f65548c;
                    C55915a aVar = (C55915a) C55977m.f149067g.createBuilder();
                    aVar.copyOnWrite();
                    C55977m mVar = (C55977m) aVar.instance;
                    mVar.f149070b = 7;
                    mVar.f149069a |= 1;
                    C55970f fVar = (C55970f) C55971g.f149050c.createBuilder();
                    int i = this.f65549d.f148939f;
                    fVar.copyOnWrite();
                    C55971g gVar = (C55971g) fVar.instance;
                    gVar.f149052a |= 1;
                    gVar.f149053b = i;
                    aVar.copyOnWrite();
                    C55977m mVar2 = (C55977m) aVar.instance;
                    C55971g gVar2 = (C55971g) fVar.build();
                    gVar2.getClass();
                    mVar2.f149072d = gVar2;
                    mVar2.f149069a |= 4;
                    cVar.mo29365a((C55977m) aVar.build());
                    return;
                } else {
                    return;
                }
            case 2:
                if (rVar2 == C23968r.WAITING_FOR_USER_DECISION) {
                    z = true;
                }
                C58838bb.m90883r(z);
                this.f65549d.getClass();
                Application application2 = this.f6558a;
                Account account = this.f65551f;
                C55912b bVar = this.f65552g;
                String languageTag = C23940a.m44522a(application2).toLanguageTag();
                synchronized (C23948af.f65490e) {
                    C23948af.f65490e.remove(new C23942a(account.name, bVar, languageTag));
                }
                C23948af afVar2 = this.f65554i;
                Account account2 = this.f65551f;
                C55912b bVar2 = this.f65552g;
                C58485gu j = C58485gu.m89842j(this.f65549d.f148937d);
                C55960bg bgVar = this.f65553h;
                C63088z zVar = this.f65549d.f148938e;
                if (C68820a.m99375e()) {
                    C55961bh bhVar = (C55961bh) C55964bk.f149032g.createBuilder();
                    C55979o d = C23948af.m44535d(application2, bgVar);
                    bhVar.copyOnWrite();
                    C55964bk bkVar = (C55964bk) bhVar.instance;
                    d.getClass();
                    bkVar.f149036c = d;
                    bkVar.f149034a |= 1;
                    bhVar.copyOnWrite();
                    C55964bk bkVar2 = (C55964bk) bhVar.instance;
                    zVar.getClass();
                    bkVar2.f149034a |= 2;
                    bkVar2.f149037d = zVar;
                    C58800sl lA = j.iterator();
                    while (lA.hasNext()) {
                        C55962bi biVar = (C55962bi) C55963bj.f149027d.createBuilder();
                        int intValue = ((Integer) lA.next()).intValue();
                        biVar.copyOnWrite();
                        C55963bj bjVar = (C55963bj) biVar.instance;
                        bjVar.f149029a |= 1;
                        bjVar.f149030b = intValue;
                        biVar.copyOnWrite();
                        C55963bj bjVar2 = (C55963bj) biVar.instance;
                        bjVar2.f149029a |= 2;
                        bjVar2.f149031c = true;
                        bhVar.mo54306a(biVar);
                    }
                    if (bVar2.f148826V == 3) {
                        C55927aa aaVar = (C55927aa) C55928ab.f148876d.createBuilder();
                        aaVar.copyOnWrite();
                        C55928ab abVar = (C55928ab) aaVar.instance;
                        abVar.f148878a |= 1;
                        abVar.f148879b = true;
                        bhVar.copyOnWrite();
                        C55964bk bkVar3 = (C55964bk) bhVar.instance;
                        C55928ab abVar2 = (C55928ab) aaVar.build();
                        abVar2.getClass();
                        bkVar3.f149039f = abVar2;
                        bkVar3.f149034a |= 8;
                    }
                    cxVar = C60922j.m93044g(afVar2.f65492f.mo124244a(account2).mo124242j((C55964bk) bhVar.build()), C23973w.f65561a, C60826bg.f164896a);
                } else {
                    cxVar = C60895di.m92995a(Executors.newSingleThreadExecutor()).mo19399b(new C23975y(afVar2, j, application2, account2, bgVar, zVar, bVar2));
                }
                C60856cj.m92911t(cxVar, new C23966p(this, application2), new C23970t());
                return;
            case 3:
                if (rVar2 == C23968r.CONSENT_WRITE_IN_PROGRESS) {
                    z = true;
                }
                C58838bb.m90883r(z);
                this.f65548c.mo29366b(13);
                return;
            case 4:
                if (rVar2 == C23968r.CONSENT_DATA_LOADING) {
                    z = true;
                }
                C58838bb.m90883r(z);
                this.f65548c.mo29367c(3);
                return;
            case 5:
                if (rVar2 == C23968r.CONSENT_DATA_LOADING) {
                    z = true;
                }
                C58838bb.m90883r(z);
                this.f65548c.mo29367c(2);
                return;
            case 6:
                if (rVar2 == C23968r.CONSENT_DATA_LOADING) {
                    z = true;
                }
                C58838bb.m90883r(z);
                this.f65548c.mo29366b(5);
                return;
            default:
                return;
        }
    }
}
