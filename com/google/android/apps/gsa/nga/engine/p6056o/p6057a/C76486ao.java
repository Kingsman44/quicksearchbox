package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22868d;
import java.util.concurrent.CancellationException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.ao */
/* compiled from: PG */
final class C76486ao implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C74965n f211675a;

    /* renamed from: b */
    final /* synthetic */ C76490as f211676b;

    public C76486ao(C76490as asVar, C74965n nVar) {
        this.f211676b = asVar;
        this.f211675a = nVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        if (th instanceof CancellationException) {
            this.f211676b.f211683e.mo74237c(C89849ae.NGA_FULFILLMENT_CANCEL, this.f211675a.mo71336k());
        } else {
            this.f211676b.f211683e.mo74237c(C89849ae.NGA_FULFILLMENT_ERROR, this.f211675a.mo71336k());
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        if (((Optional) obj).isPresent()) {
            this.f211676b.f211683e.mo74237c(C89849ae.NGA_FULFILLMENT_SUCCESS, this.f211675a.mo71336k());
        } else {
            this.f211676b.f211683e.mo74237c(C89849ae.NGA_FULFILLMENT_NO_MATCH, this.f211675a.mo71336k());
        }
    }
}
