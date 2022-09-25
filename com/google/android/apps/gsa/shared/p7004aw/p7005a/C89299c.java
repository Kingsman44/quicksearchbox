package com.google.android.apps.gsa.shared.p7004aw.p7005a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115274cq;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119091p;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.shared.aw.a.c */
/* compiled from: PG */
public final /* synthetic */ class C89299c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C89309m f242109a;

    public /* synthetic */ C89299c(C89309m mVar) {
        this.f242109a = mVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C89309m mVar = this.f242109a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            mVar.f242126g = C58833ax.m90834k(mVar.f242122c.mo28208h("scheduling-highlighter", 100, new C89305i(mVar)));
            return;
        }
        C119091p pVar = (C119091p) axVar.mo56107c();
        if (!mVar.f242123d.mo56113h() || !pVar.equals(mVar.f242123d.mo56107c())) {
            C89320x xVar = (C89320x) C89321y.f242160c.createBuilder();
            int c = pVar.mo104163c();
            xVar.copyOnWrite();
            ((C89321y) xVar.instance).f242162a = c;
            int a = pVar.mo104161a();
            xVar.copyOnWrite();
            ((C89321y) xVar.instance).f242163b = a;
            C89321y yVar = (C89321y) xVar.build();
            for (C89308l i : mVar.f242121b) {
                i.mo83234i(yVar);
            }
            mVar.f242123d = C58833ax.m90834k(pVar);
        }
        C58833ax a2 = mVar.mo83235a(C115274cq.m191069q(mVar.f242127h.f319779a));
        if (!a2.mo56113h()) {
            ((C59052c) ((C59052c) C89309m.f242120a.mo56226d()).mo56372aa(11087)).mo56386p("Unable to get millis played in window.");
            mVar.f242126g = C58836b.f156633a;
            return;
        }
        long e = pVar.mo104165e();
        long longValue = ((Long) a2.mo56107c()).longValue();
        mVar.f242126g = C58833ax.m90834k(mVar.f242122c.mo28208h("scheduling-highlighter", (long) (((float) (e - longValue)) / mVar.f242124e), new C89302f(mVar)));
    }
}
