package com.google.android.apps.gsa.sidekick.shared.p7232c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.c.c */
/* compiled from: PG */
public final /* synthetic */ class C91654c implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C91656e f255612a;

    /* renamed from: b */
    public final /* synthetic */ String f255613b;

    public /* synthetic */ C91654c(C91656e eVar, String str) {
        this.f255612a = eVar;
        this.f255613b = str;
    }

    public final void run() {
        C91656e eVar = this.f255612a;
        String str = this.f255613b;
        if (!eVar.mo86055t(str)) {
            eVar.mo86039d(str);
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.FEED_NEXT_PAGE_TIMEOUT;
            fVar.mo83701c("SessionLoggerId", str);
            eVar.f255616c.mo74236a(fVar.mo83699a());
        }
    }
}
