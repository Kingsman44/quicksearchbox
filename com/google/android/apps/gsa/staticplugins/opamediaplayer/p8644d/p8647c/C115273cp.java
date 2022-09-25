package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.p7004aw.p7005a.C89301e;
import com.google.android.apps.gsa.shared.p7004aw.p7005a.C89308l;
import com.google.android.apps.gsa.shared.p7004aw.p7005a.C89309m;
import com.google.android.apps.gsa.shared.p7004aw.p7005a.C89321y;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.cp */
/* compiled from: PG */
final class C115273cp implements C115308dx, C89308l {

    /* renamed from: a */
    final /* synthetic */ C115274cq f319846a;

    public C115273cp(C115274cq cqVar) {
        this.f319846a = cqVar;
    }

    /* renamed from: a */
    public final void mo101893a(C52174hz hzVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f319846a.mo101924H();
        C89309m mVar = this.f319846a.f319858l;
        mVar.mo83237c();
        mVar.f242122c.mo28212l("reset", new C89301e(mVar));
        this.f319846a.f319856j = false;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo101894b(C52174hz hzVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo101895c(C52176ia iaVar) {
    }

    /* renamed from: d */
    public final void mo101896d(C84275o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f319846a.f319850d.mo28212l("update-playback-state", new C115272co(this, oVar));
    }

    /* renamed from: i */
    public final void mo83234i(C89321y yVar) {
        C52583xc xcVar;
        C58976aa aaVar = C58975e.f156826a;
        if (C115387w.m191348i(this.f319846a.f319853g.mo101954a().f319951a)) {
            C52568wo woVar = this.f319846a.f319853g.mo101954a().mo101947a().f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            if (woVar.f137996c == 26) {
                xcVar = (C52583xc) woVar.f137997d;
            } else {
                xcVar = C52583xc.f138063o;
            }
            this.f319846a.f319850d.mo28212l("update-ocr", new C115270cm(this, C115274cq.m191070r(xcVar), yVar));
            return;
        }
        this.f319846a.f319850d.mo28212l("update-word", new C115271cn(this, yVar));
    }
}
