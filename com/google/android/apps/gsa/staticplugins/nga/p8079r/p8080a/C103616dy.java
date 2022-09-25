package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.binaries.satin.app.acq;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4449cd.C57940c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.dy */
/* compiled from: PG */
public final /* synthetic */ class C103616dy implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C103567cc f288647a;

    /* renamed from: b */
    public final /* synthetic */ C103518bw f288648b;

    /* renamed from: c */
    public final /* synthetic */ acq f288649c;

    public /* synthetic */ C103616dy(C103567cc ccVar, C103518bw bwVar, acq acq) {
        this.f288647a = ccVar;
        this.f288648b = bwVar;
        this.f288649c = acq;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C103567cc ccVar = this.f288647a;
        C103518bw bwVar = this.f288648b;
        acq acq = this.f288649c;
        C58833ax b = C57940c.m88575b(bwVar.mo93791b());
        if (b.mo56113h()) {
            ((C59052c) ((C59052c) ((C59052c) C103567cc.f288531a.mo56226d()).mo56382g((Throwable) b.mo56107c())).mo56372aa(21572)).mo56386p("First network attempt ended with failure");
        }
        if (!((Boolean) b.mo56106b(C103566cb.f288530a).mo56109e(false)).booleanValue()) {
            return C60856cj.m92900i(bwVar);
        }
        C58485gu a = bwVar.mo93790a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ccVar.f288532b.mo79665L((String) a.get(i));
        }
        ((C59052c) ((C59052c) C103567cc.f288531a.mo56224b()).mo56372aa(21571)).mo56386p("Looks like authentication error, retrying with new tokens");
        return acq.mo65479a().mo93816b();
    }
}
