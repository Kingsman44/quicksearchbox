package com.google.android.apps.gsa.staticplugins.p7877dx.p7879b;

import com.google.android.apps.gsa.shared.p7020bd.C89408a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62974ct;
import p5451f.p5452a.p5453a.p5454a.C69395aq;

/* renamed from: com.google.android.apps.gsa.staticplugins.dx.b.i */
/* compiled from: PG */
public final /* synthetic */ class C100291i implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C100295m f280454a;

    public /* synthetic */ C100291i(C100295m mVar) {
        this.f280454a = mVar;
    }

    public final void run() {
        C100295m mVar = this.f280454a;
        Object obj = C58836b.f156633a;
        try {
            C58833ax a = mVar.f280462e.mo83325a(C69395aq.DRAWER_FEATURE_TIP);
            if (a.mo56113h() && mVar.f280462e.mo83328d(((Integer) a.mo56107c()).intValue())) {
                obj = C58833ax.m90834k(mVar.f280462e.mo83327c(((Integer) a.mo56107c()).intValue()));
            }
        } catch (C89408a | C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C100295m.f280458a.mo56225c()).mo56382g(e)).mo56372aa(33295)).mo56386p("Error retrieving tip next tip");
        }
        mVar.f280459b.mo91864i().mo28730f(obj, false);
        mVar.mo91866e();
    }
}
