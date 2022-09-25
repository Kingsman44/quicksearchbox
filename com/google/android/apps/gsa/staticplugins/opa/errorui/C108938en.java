package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83877ak;
import com.google.android.apps.gsa.opaonboarding.C83883aq;
import com.google.android.apps.gsa.opaonboarding.C83884ar;
import com.google.android.apps.gsa.opaonboarding.C83887au;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83944k;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.HotwordTrainingConfig;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83924k;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83925l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a.C102923be;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.C104163o;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109789ai;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58480gp;
import com.google.common.util.concurrent.C60826bg;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.en */
/* compiled from: PG */
public final class C108938en {

    /* renamed from: a */
    private final C113787bc f302931a;

    /* renamed from: b */
    private final C86124t f302932b;

    /* renamed from: c */
    private final C108854bk f302933c;

    /* renamed from: d */
    private final C83893b f302934d;

    /* renamed from: e */
    private final C83887au f302935e;

    /* renamed from: f */
    private final C58833ax f302936f;

    /* renamed from: g */
    private final C108984gf f302937g;

    /* renamed from: h */
    private final C58833ax f302938h;

    /* renamed from: i */
    private final C108882cl f302939i;

    /* renamed from: j */
    private final C109789ai f302940j;

    public C108938en(C113787bc bcVar, C86124t tVar, C109789ai aiVar, C108854bk bkVar, C83893b bVar, C83887au auVar, C58833ax axVar, C108984gf gfVar, C58833ax axVar2, C108882cl clVar) {
        this.f302931a = bcVar;
        this.f302932b = tVar;
        this.f302940j = aiVar;
        this.f302933c = bkVar;
        this.f302934d = bVar;
        this.f302935e = auVar;
        this.f302936f = axVar;
        this.f302937g = gfVar;
        this.f302938h = axVar2;
        this.f302939i = clVar;
    }

    /* renamed from: a */
    public final C83956t mo97291a(StartupConfig startupConfig, C108936el elVar) {
        C108936el elVar2 = C108936el.NO_ACCOUNT;
        boolean z = false;
        switch (elVar.ordinal()) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putBoolean("allow_signed_out_mode", this.f302931a.mo100633m() && startupConfig.mo97191i());
                if (startupConfig.mo97182a() == 32) {
                    z = true;
                }
                bundle.putBoolean("bypass_error_page", z);
                return C83875ai.m133540e(new C108870c(), bundle);
            case 1:
                return C83875ai.m133537b(new C108839aw());
            case 3:
                boolean e = this.f302932b.mo79746e(C90053de.f248945L);
                C109789ai aiVar = this.f302940j;
                C83883aq o = C83884ar.m133585o();
                C83944k kVar = (C83944k) o;
                kVar.f228637d = 2;
                kVar.f228636c = 3;
                o.mo77255j(2);
                o.mo77252g(true);
                C83924k kVar2 = (C83924k) C83925l.f228575d.createBuilder();
                kVar2.copyOnWrite();
                C83925l lVar = (C83925l) kVar2.instance;
                lVar.f228577a |= 1;
                lVar.f228578b = true;
                boolean b = this.f302935e.mo77272b((Account) this.f302934d.mo77278a().mo56107c(), 3);
                kVar2.copyOnWrite();
                C83925l lVar2 = (C83925l) kVar2.instance;
                lVar2.f228577a = 2 | lVar2.f228577a;
                lVar2.f228579c = true ^ b;
                o.mo77247b((C83925l) kVar2.build());
                o.mo77254i(startupConfig.mo97183b());
                o.mo77249d(e);
                return aiVar.mo98123a(o.mo77246a());
            case 4:
                return C83875ai.m133537b(new C108861br());
            case 5:
                return C83875ai.m133537b(new C108820ad());
            case 6:
                return C83875ai.m133537b(new C108904dg());
            case 7:
                C83877ak d = HotwordTrainingConfig.m133502d();
                d.mo77218b(18);
                if ((this.f302932b.mo79746e(C90014bt.f247378fy) || !this.f302932b.mo79746e(C90014bt.f247345fR)) && !this.f302932b.mo79746e(C90053de.f248940G)) {
                    z = true;
                }
                d.mo77220d(z);
                d.mo77219c(1);
                return this.f302933c.mo97230a(d.mo77217a());
            case 8:
                return C83875ai.m133537b(new C108836at());
            case 9:
                return C83875ai.m133537b(new C108991l());
            case 10:
                C58480gp gpVar = new C58480gp(4);
                if (((C102923be) ((C58847bk) this.f302936f).f156646a).f287416a.mo71083f()) {
                    gpVar.mo55395g(C83875ai.m133537b(new C104163o()));
                }
                return C83875ai.m133538c(gpVar.mo55394f());
            case 11:
                return C83875ai.m133537b(new C108949ey());
            case 12:
                return C83875ai.m133537b(new C109005z());
            case 13:
                return this.f302937g.mo97344a();
            case 14:
                return C83875ai.m133537b(new C108943es());
            case 15:
                return C83875ai.m133537b(new C108988i());
            case 16:
                return C83875ai.m133537b(new C108998s());
            case 17:
                ((C42876ab) ((C68214a) ((C58847bk) this.f302938h).f156646a).mo27525b()).mo46039a(C108937em.f302930a, C60826bg.f164896a);
                return C83875ai.m133537b(new C108864bu());
            case 18:
                return C83875ai.m133537b(new C108962fk());
            case 19:
                C108882cl clVar = this.f302939i;
                i iVar = (i) clVar.f302736a.mo17428b();
                iVar.getClass();
                C14096x xVar = (C14096x) clVar.f302737b.mo17428b();
                xVar.getClass();
                C86054o oVar = (C86054o) clVar.f302738c.mo17428b();
                oVar.getClass();
                C91077d dVar = (C91077d) clVar.f302739d.mo17428b();
                dVar.getClass();
                C86124t tVar = (C86124t) clVar.f302740e.mo17428b();
                tVar.getClass();
                Context context = (Context) clVar.f302741f.mo17428b();
                context.getClass();
                return new C108881ck(iVar, xVar, oVar, dVar, tVar, context);
            default:
                throw new IllegalArgumentException("Unknown StartupCondition: ".concat(String.valueOf(String.valueOf(elVar))));
        }
    }
}
