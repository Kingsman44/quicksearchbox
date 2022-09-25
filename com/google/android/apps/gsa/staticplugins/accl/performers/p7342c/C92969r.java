package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82301ac;
import com.google.android.apps.gsa.shared.util.C90762bf;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.r */
/* compiled from: PG */
final class C92969r implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f259326a;

    /* renamed from: b */
    final /* synthetic */ C90762bf f259327b;

    /* renamed from: c */
    final /* synthetic */ C92970s f259328c;

    public C92969r(C92970s sVar, String str, C90762bf bfVar) {
        this.f259328c = sVar;
        this.f259326a = str;
        this.f259327b = bfVar;
    }

    /* renamed from: c */
    private final void m153003c(boolean z) {
        if (this.f259328c.f259334f.mo56113h()) {
            ((C83305i) this.f259328c.f259334f.mo56107c()).mo75579d(new C82301ac("FETCH_ASSIST_DATA_LATENCY", Double.valueOf((double) this.f259327b.mo85102a()), this.f259326a, z));
        }
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        m153003c(false);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        m153003c(((C58833ax) obj).mo56113h());
    }
}
