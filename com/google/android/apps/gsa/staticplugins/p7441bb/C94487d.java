package com.google.android.apps.gsa.staticplugins.p7441bb;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.common.util.concurrent.C60856cj;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.C70898m;

/* renamed from: com.google.android.apps.gsa.staticplugins.bb.d */
/* compiled from: PG */
final class C94487d extends C94502s {

    /* renamed from: a */
    final /* synthetic */ C94490g f264176a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94487d(C94490g gVar, C70898m mVar) {
        super(mVar);
        this.f264176a = gVar;
    }

    /* renamed from: a */
    public final void mo27478a(C70897l lVar, C70334de deVar) {
        Account a = this.f264176a.f264182b.mo79668a();
        if (a == null) {
            if (this.f264176a.f264184d) {
                mo27480d("User is not logged in", (Throwable) null);
            }
            mo88488e(lVar, deVar);
            return;
        }
        C94490g gVar = this.f264176a;
        C60856cj.m92911t(gVar.f264182b.mo79672f(gVar.f264183c, a, true, new C91032p()), new C94486c(this, lVar, deVar), this.f264176a.f264186f.mo85210c("callbackExecutor"));
    }
}
