package com.google.android.apps.gsa.shared.logger.p7055e.p7056a.p7057a;

import com.google.android.apps.gsa.shared.logger.p7055e.C89909c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.shared.logger.e.a.a.j */
/* compiled from: PG */
public final class C89898j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f246308a;

    /* renamed from: b */
    final /* synthetic */ C60845bz f246309b;

    /* renamed from: c */
    final /* synthetic */ C89900l f246310c;

    public C89898j(C89900l lVar, String str, C60845bz bzVar) {
        this.f246310c = lVar;
        this.f246308a = str;
        this.f246309b = bzVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C89909c b = this.f246310c.f246315b.mo83749b(String.valueOf(this.f246308a).concat("[onFailure]"), C89900l.f246314a);
        b.mo83746d();
        try {
            this.f246309b.mo17910gl(th);
            b.mo83747e();
        } catch (Error | RuntimeException e) {
            b.mo83745c(e);
            throw e;
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C89909c b = this.f246310c.f246315b.mo83749b(String.valueOf(this.f246308a).concat("[onSuccess]"), C89900l.f246314a);
        b.mo83746d();
        try {
            this.f246309b.mo17911gm(obj);
            b.mo83747e();
        } catch (Error | RuntimeException e) {
            b.mo83745c(e);
            throw e;
        }
    }
}
