package com.google.android.apps.gsa.shared.logger.p7055e.p7056a.p7057a;

import com.google.android.apps.gsa.shared.logger.p7055e.C89909c;
import com.google.android.libraries.gsa.p1876k.C22868d;

/* renamed from: com.google.android.apps.gsa.shared.logger.e.a.a.k */
/* compiled from: PG */
public final class C89899k implements C22868d {

    /* renamed from: a */
    final /* synthetic */ String f246311a;

    /* renamed from: b */
    final /* synthetic */ C22868d f246312b;

    /* renamed from: c */
    final /* synthetic */ C89900l f246313c;

    public C89899k(C89900l lVar, String str, C22868d dVar) {
        this.f246313c = lVar;
        this.f246311a = str;
        this.f246312b = dVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C89909c b = this.f246313c.f246315b.mo83749b(String.valueOf(this.f246311a).concat("[onFailure]"), C89900l.f246314a);
        b.mo83746d();
        try {
            this.f246312b.mo17701gl(th);
            b.mo83747e();
        } catch (Error | RuntimeException e) {
            b.mo83745c(e);
            throw e;
        }
    }

    /* renamed from: gm */
    public final void mo17702gm(Object obj) {
        C89909c b = this.f246313c.f246315b.mo83749b(String.valueOf(this.f246311a).concat("[onSuccess]"), C89900l.f246314a);
        b.mo83746d();
        try {
            this.f246312b.mo17702gm(obj);
            b.mo83747e();
        } catch (Error | RuntimeException e) {
            b.mo83745c(e);
            throw e;
        }
    }
}
