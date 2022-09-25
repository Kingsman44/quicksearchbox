package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a.C78293ao;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.CancellationException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.ed */
/* compiled from: PG */
public final /* synthetic */ class C78462ed implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C78466eh f216036a;

    /* renamed from: b */
    public final /* synthetic */ String f216037b;

    public /* synthetic */ C78462ed(C78466eh ehVar, String str) {
        this.f216036a = ehVar;
        this.f216037b = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C78466eh ehVar = this.f216036a;
        String str = this.f216037b;
        Throwable th = (Throwable) obj;
        if (!(th instanceof CancellationException)) {
            ((C59052c) ((C59052c) ((C59052c) C78466eh.f216038a.mo56225c()).mo56382g(th)).mo56372aa(5207)).mo56386p("Couldn't collect content.");
            ehVar.f216041b.mo83702b(C89849ae.FETCH_ONBOARDING_CHIP_TIMEOUT);
            ehVar.mo73392d(new C78497w(C58485gu.m89845m(), C78293ao.m125777d(), Optional.empty(), C58485gu.m89845m(), Optional.empty()), str);
        }
    }
}
