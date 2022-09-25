package com.google.android.apps.gsa.staticplugins.opa.errorui;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ei */
/* compiled from: PG */
abstract class C108933ei implements C90991b {
    /* renamed from: a */
    public abstract long mo97281a();

    /* renamed from: b */
    public abstract C108936el mo97282b();

    /* renamed from: c */
    public abstract StartupConfig mo97283c();

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85292s(C90752i.m148232f(new Date(mo97281a())));
        fVar.mo85279c("error_type").mo85276a(C90752i.m148231e(mo97282b()));
        fVar.mo85286m(mo97283c());
    }
}
