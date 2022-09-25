package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.binaries.satin.app.arh;
import com.google.android.apps.gsa.binaries.satin.app.ari;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.C131579a;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.C131595b;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.C131596c;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.protos.p5124m.p5125a.C65599b;
import kotlinx.coroutines.C71422aw;
import p5304e.p5305a.p5306a.p5369g.p5370a.p5371a.C68694j;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.m */
/* compiled from: PG */
public final class C131592m implements C131596c {

    /* renamed from: a */
    private final Context f359542a;

    /* renamed from: b */
    private final boolean f359543b;

    /* renamed from: c */
    private final C58528ij f359544c;

    /* renamed from: d */
    private final C58974d f359545d;

    /* renamed from: e */
    private final C130603a f359546e;

    /* renamed from: f */
    private final arh f359547f;

    /* renamed from: g */
    private final ari f359548g;

    public C131592m(Context context, arh arh, ari ari, boolean z, C65599b bVar, C130603a aVar) {
        this.f359542a = context;
        this.f359547f = arh;
        this.f359548g = ari;
        this.f359543b = z;
        this.f359544c = C58528ij.m90006F(bVar.f178301a);
        this.f359545d = aVar.mo109739a("TemplateParserPvdImpl");
        this.f359546e = aVar;
    }

    /* renamed from: c */
    private final boolean m213999c(C50794cr crVar) {
        if (this.f359544c.contains(Integer.valueOf(crVar.f132222T))) {
            try {
                if (C1888a.m5150d()) {
                    PackageInfo packageInfo = this.f359542a.getPackageManager().getPackageInfo("com.google.android.as", 0);
                    if (((packageInfo.getLongVersionCode() < 7071309 || packageInfo.getLongVersionCode() > 8388607) && packageInfo.getLongVersionCode() < 8494128) || !this.f359543b) {
                        return false;
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                ((C58970a) ((C58970a) ((C58970a) this.f359545d.mo56226d()).mo56382g(e)).mo56372aa(39108)).mo56386p("Error obtaining package info");
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C131579a mo110203a(Object obj, int i, boolean z, C50794cr crVar) {
        if (!m213999c(crVar)) {
            ((C58970a) ((C58970a) this.f359545d.mo56224b()).mo56372aa(39105)).mo56389s("Smartspace BC UI template %s is disabled. Skipping...", crVar);
            return C131591l.f359541a;
        }
        ((C58970a) ((C58970a) this.f359545d.mo56224b()).mo56372aa(39104)).mo56389s("Using Smartspace BC UI template path for structued data: %s.", crVar.name());
        if ((obj instanceof C123787p) && crVar == C50794cr.CALENDAR) {
            arh arh = this.f359547f;
            return new C131584e((C123787p) obj, i, z, (Context) arh.f199900a.a.g.mo17428b(), arh.f199900a.a.a.mo68261eM(), (C71422aw) arh.f199900a.a.H.mo17428b(), (C60950i) arh.f199900a.a.bC.mo17428b(), C68694j.m99177h(arh.f199900a.a.a.f202914g), (C130603a) arh.f199900a.a.hQ.mo17428b());
        } else if (!(obj instanceof C123789r) || crVar != C50794cr.FLIGHT_LANDING) {
            return C131591l.f359541a;
        } else {
            ari ari = this.f359548g;
            return new C131588i((C123789r) obj, i, ari.f199901a.a.a.mo68261eM(), (C71422aw) ari.f199901a.a.H.mo17428b(), (C60950i) ari.f199901a.a.bC.mo17428b(), C68694j.m99170a(ari.f199901a.a.a.f202914g), (C130603a) ari.f199901a.a.hQ.mo17428b(), C68694j.m99178i(ari.f199901a.a.a.f202914g), ((C46897i) ari.f199901a.a.a.f202914g.mo17428b()).mo50901a("com.google.android.apps.gsa.pcp.device 45379538").mo50907f());
        }
    }

    /* renamed from: b */
    public final C131595b mo110204b(C50818do doVar) {
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        if (!m213999c(a)) {
            C58970a aVar = (C58970a) ((C58970a) this.f359545d.mo56224b()).mo56372aa(39107);
            C50794cr a2 = C50794cr.m85938a(doVar.f132315l);
            if (a2 == null) {
                a2 = C50794cr.UNDEFINED;
            }
            aVar.mo56389s("Smartspace BC UI template %s is disabled. Skipping...", a2);
            return new C131590k(doVar);
        }
        C58970a aVar2 = (C58970a) ((C58970a) this.f359545d.mo56224b()).mo56372aa(39106);
        C50794cr a3 = C50794cr.m85938a(doVar.f132315l);
        if (a3 == null) {
            a3 = C50794cr.UNDEFINED;
        }
        aVar2.mo56389s("UI template type: %s", a3);
        C50794cr a4 = C50794cr.m85938a(doVar.f132315l);
        if (a4 == null) {
            a4 = C50794cr.UNDEFINED;
        }
        int ordinal = a4.ordinal();
        if (ordinal == 1) {
            C130603a aVar3 = this.f359546e;
            doVar.getClass();
            aVar3.getClass();
            return new C131594o(doVar, aVar3);
        } else if (ordinal == 4) {
            C130603a aVar4 = this.f359546e;
            doVar.getClass();
            aVar4.getClass();
            return new C131589j(doVar, aVar4);
        } else if (ordinal != 35) {
            return new C131590k(doVar);
        } else {
            C130603a aVar5 = this.f359546e;
            doVar.getClass();
            aVar5.getClass();
            return new C131580a(doVar, aVar5);
        }
    }
}
