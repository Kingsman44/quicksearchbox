package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.aa */
/* compiled from: PG */
abstract class C98145aa implements C90991b {
    /* renamed from: a */
    public abstract long mo90984a();

    /* renamed from: b */
    public abstract String mo90985b();

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85279c("label").mo85276a(C90752i.m148229c(mo90985b()));
        fVar.mo85279c("timestamp").mo85276a(C90752i.m148232f(new Date(mo90984a())));
    }
}
