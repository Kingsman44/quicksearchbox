package com.google.android.apps.gsa.nga.engine.education.pie.p6025f;

import com.google.android.apps.gsa.nga.engine.education.C75688am;
import com.google.android.apps.gsa.nga.engine.education.pie.p6020b.C75855v;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75158f;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6044n.C76401e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76565ai;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4883as.p4884a.C63775d;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.f.r */
/* compiled from: PG */
public final class C75897r extends C75899t {

    /* renamed from: a */
    private static final C58974d f210588a = C58974d.m91136j();

    /* renamed from: c */
    private final String f210589c;

    /* renamed from: d */
    private final String f210590d;

    /* renamed from: e */
    private final C76092h f210591e;

    /* renamed from: f */
    private final C81515c f210592f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75897r(C75892m mVar, String str, String str2, C75688am amVar, C75855v vVar, C75050a aVar, C75158f fVar, C76092h hVar, C91142g gVar, C81515c cVar) {
        super(mVar, amVar, vVar, aVar, fVar, hVar, gVar);
        this.f210589c = str;
        this.f210590d = str2;
        this.f210591e = hVar;
        this.f210592f = cVar;
    }

    /* renamed from: l */
    public final String mo71952l() {
        Locale e = this.f210591e.mo72021b().mo72039e();
        C81515c cVar = this.f210592f;
        return cVar.mo75121a(e).getString(R.string.nga_pie_try_saying_open_app_suggestion, new Object[]{this.f210589c});
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo71953m(C76401e eVar) {
        Optional b = eVar.mo72146a().mo72525b().mo73747b();
        if (b.isEmpty()) {
            ((C58970a) ((C58970a) f210588a.mo56225c()).mo56372aa(3415)).mo56386p("Query had no interpretation");
            return false;
        }
        C61752n nVar = ((C80513b) b.get()).f221016a;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        C76590bg bgVar = new C76590bg(nVar);
        if (bgVar.f211838b.mo73901d("Open_app")) {
            Optional g = bgVar.mo72265g(C76565ai.f211802a, "app");
            if (!g.isPresent() || !this.f210590d.equals(((C63775d) g.get()).f172523d)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
