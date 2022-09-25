package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.search.core.logging.C86169a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.search.core.p.at */
/* compiled from: PG */
final class C86210at implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C86211au f232958a;

    public C86210at(C86211au auVar) {
        this.f232958a = auVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        throw new AssertionError("searchResult.firstByteElapsedTimeNanos Future cannot be failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Long l = (Long) obj;
        C86169a.m138609a(this.f232958a.f232960a, l.longValue());
        C89859i iVar = this.f232958a.f232967h;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.FIRST_BYTE_RECEIVED;
        fVar.f246204d = l.longValue();
        iVar.mo74236a(fVar.mo83699a());
    }
}
