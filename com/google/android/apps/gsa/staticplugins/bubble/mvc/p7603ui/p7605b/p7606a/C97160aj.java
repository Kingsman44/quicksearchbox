package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b.p7606a;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.a.aj */
/* compiled from: PG */
public final class C97160aj {

    /* renamed from: b */
    private static final C59071e f271484b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.a.aj");

    /* renamed from: a */
    public C58833ax f271485a = C58836b.f156633a;

    /* renamed from: a */
    public final C60870cx mo90553a() {
        C59081b.m91349a(C58979ad.FULL, "stack size");
        if (!this.f271485a.mo56113h()) {
            ((C59052c) ((C59052c) f271484b.mo56226d()).mo56372aa(18457)).mo56386p("getNodesAndStopCollecting() called without calling startCollecting() first");
            int i = C90755l.f253831a;
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C60870cx e = C60856cj.m92896e((Iterable) this.f271485a.mo56107c());
        this.f271485a = C58836b.f156633a;
        return e;
    }

    /* renamed from: b */
    public final void mo90554b(C60870cx cxVar) {
        C59081b.m91349a(C58979ad.FULL, "stack size");
        if (!this.f271485a.mo56113h()) {
            ((C59052c) ((C59052c) f271484b.mo56226d()).mo56372aa(18459)).mo56389s("Ignoring veTreeNode while not collecting: [%s]", cxVar);
            int i = C90755l.f253831a;
            return;
        }
        ((List) this.f271485a.mo56107c()).add(cxVar);
    }

    /* renamed from: c */
    public final void mo90555c() {
        C59081b.m91349a(C58979ad.FULL, "stack size");
        if (this.f271485a.mo56113h()) {
            C59052c cVar = (C59052c) f271484b.mo56226d();
            cVar.mo56380ai(C58979ad.FULL);
            ((C59052c) cVar.mo56372aa(18461)).mo56387q("startCollecting called while already collecting, discarding previously collected VEs, count=%d.", ((List) this.f271485a.mo56107c()).size());
        }
        this.f271485a = C58833ax.m90834k(new ArrayList());
    }
}
