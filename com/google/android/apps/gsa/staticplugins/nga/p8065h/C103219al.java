package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import android.content.Context;
import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.mdi.p2211c.p2212a.C28609l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.al */
/* compiled from: PG */
public final class C103219al implements C118549h {

    /* renamed from: a */
    private final C28609l f287984a;

    /* renamed from: b */
    private final C74713bn f287985b;

    public C103219al(Context context, C74713bn bnVar) {
        this.f287984a = new C28609l(context);
        this.f287985b = bnVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        if (!this.f287985b.mo71078c()) {
            return C118826c.f331423b;
        }
        this.f287984a.mo34284a("AppsCache");
        this.f287984a.mo34284a("WebCache");
        this.f287984a.mo34284a("ContactsCache");
        this.f287984a.mo34284a("GmmCache");
        return C118826c.f331423b;
    }
}
