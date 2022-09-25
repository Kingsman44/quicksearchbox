package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85346o;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8646b.C115199b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.co */
/* compiled from: PG */
public final /* synthetic */ class C115272co implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C115273cp f319844a;

    /* renamed from: b */
    public final /* synthetic */ C84275o f319845b;

    public /* synthetic */ C115272co(C115273cp cpVar, C84275o oVar) {
        this.f319844a = cpVar;
        this.f319845b = oVar;
    }

    public final void run() {
        C115273cp cpVar = this.f319844a;
        C84275o oVar = this.f319845b;
        ((C23251a) cpVar.f319846a.f319849c.mo102010n()).mo28730f(C58833ax.m90834k(C115199b.m190986a(oVar)), false);
        C58833ax n = oVar.mo77808n();
        if (n.mo56113h()) {
            ((C23251a) cpVar.f319846a.f319849c.mo102008l()).mo28730f((Float) n.mo56107c(), false);
            cpVar.f319846a.f319858l.f242124e = ((Float) n.mo56107c()).floatValue();
        }
        C115274cq cqVar = cpVar.f319846a;
        if (oVar.mo77795a() > C59203do.f157270a && !cqVar.f319856j) {
            C85346o oVar2 = cqVar.f319857k;
            new C90873ag(oVar2.f231139b.mo78873h(oVar2.f231138a), cqVar.f319850d, "setting-paragraphs-metadata", new C115251bu(cqVar)).mo85223a(C115263cf.f319824a);
        }
        if (!oVar.mo77814t()) {
            cqVar.f319858l.mo83237c();
        }
        cqVar.mo101923G();
        if (oVar.mo77810p() && !((C58833ax) ((C23251a) cpVar.f319846a.f319849c.mo102007k()).f63720e).mo56113h() && oVar.mo77796b() == cpVar.f319846a.f319853g.mo101954a().f319951a.f136916d) {
            C115274cq cqVar2 = cpVar.f319846a;
            C58833ax i = oVar.mo77803i();
            C58833ax k = oVar.mo77805k();
            C59104x b = C115274cq.f319847a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageC");
            ((C59052c) ((C59052c) b).mo56372aa(29838)).mo56354G("Setting playback error. Error code: %s, Gsa Error code: %s", i, k);
            new C90873ag(((C89037bh) cqVar2.f319848b.mo27525b()).mo27378c(), cqVar2.f319850d, "get-connectivity-info", new C115247bq(cqVar2, i)).mo85223a(C115248br.f319791a);
        }
        if (oVar.mo77811q()) {
            cpVar.f319846a.mo101921E();
        }
    }
}
