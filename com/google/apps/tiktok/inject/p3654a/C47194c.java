package com.google.apps.tiktok.inject.p3654a;

import androidx.lifecycle.C2344as;
import androidx.lifecycle.C2358bf;
import com.google.android.apps.gsa.binaries.satin.app.C73959bo;
import com.google.android.apps.gsa.binaries.satin.app.C73960bq;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3654a.C47183a;
import dagger.hilt.C68286a;
import dagger.hilt.android.internal.p5302a.C68308f;

/* renamed from: com.google.apps.tiktok.inject.a.c */
/* compiled from: PG */
public final class C47194c extends C2358bf {

    /* renamed from: a */
    public final C2344as f122850a;

    /* renamed from: b */
    public final Object f122851b = new Object();

    /* renamed from: c */
    public volatile Object f122852c;

    /* renamed from: d */
    private final C47199g f122853d;

    /* renamed from: e */
    private final AccountId f122854e;

    public C47194c(C2344as asVar, C47199g gVar, AccountId accountId) {
        this.f122850a = asVar;
        this.f122853d = gVar;
        this.f122854e = accountId;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo51100a() {
        Object obj;
        synchronized (this.f122851b) {
            if (this.f122852c == null) {
                C73959bo nV = ((C47183a.C47184a) C68286a.m98629a(this.f122853d.mo51105a(this.f122854e), C47183a.C47184a.class)).mo51095nV();
                this.f122852c = new C73960bq(nV.f205445a, nV.f205446b);
            }
            obj = this.f122852c;
        }
        return obj;
    }

    /* renamed from: d */
    public final void mo639d() {
        C68308f b;
        synchronized (this.f122851b) {
            b = this.f122852c != null ? ((C47183a.C47185b) C68286a.m98629a(this.f122852c, C47183a.C47185b.class)).mo51096b() : null;
        }
        if (b != null) {
            b.mo60321a();
        }
    }
}
