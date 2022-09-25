package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59770f;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.ao */
/* compiled from: PG */
public final class C134210ao extends C134206ak {

    /* renamed from: b */
    final /* synthetic */ C134212aq f365576b;

    /* renamed from: c */
    private final Duration f365577c = Duration.ofSeconds(60);

    /* renamed from: d */
    private final boolean f365578d;

    /* renamed from: e */
    private C60870cx f365579e;

    /* renamed from: f */
    private boolean f365580f = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134210ao(C134212aq aqVar, boolean z) {
        super(aqVar);
        this.f365576b = aqVar;
        this.f365578d = z;
    }

    /* renamed from: a */
    public final C59582aj mo111622a() {
        C59582aj a = super.mo111622a();
        int i = true != this.f365578d ? 2 : 3;
        a.copyOnWrite();
        C59687cb cbVar = (C59687cb) a.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        cbVar.f160140u = i - 1;
        cbVar.f160062a |= C89885b.HTTP_VALUE;
        return a;
    }

    /* renamed from: b */
    public final void mo111623b() {
        C60870cx cxVar = this.f365579e;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
    }

    /* renamed from: d */
    public final void mo111625d() {
    }

    /* renamed from: e */
    public final void mo111626e(C59770f fVar) {
        C89849ae aeVar = C89849ae.FEED_LAUNCH_DISABLED;
        C59582aj a = mo111622a();
        a.mo57008e(fVar);
        mo111624c(aeVar, a);
    }

    /* renamed from: f */
    public final void mo111627f(C59770f fVar) {
        C89849ae aeVar = C89849ae.FEED_LAUNCH_ERROR;
        C59582aj a = mo111622a();
        a.mo57008e(fVar);
        mo111624c(aeVar, a);
    }

    /* renamed from: g */
    public final void mo111628g(Instant instant) {
        if (this.f365580f) {
            mo111624c(C89849ae.NOTIFICATION_REFRESH_AND_CONTENT_DISPLAYED, mo111622a());
        } else {
            mo111624c(C89849ae.NOTIFICATION_REFRESH_FAILED_CONTENT_MISSING, mo111622a());
        }
    }

    /* renamed from: h */
    public final void mo111629h() {
        mo111624c(C89849ae.NOTIFICATION_TOKEN_RECEIVED, mo111622a());
    }

    /* renamed from: i */
    public final void mo111630i(boolean z) {
        this.f365580f = z;
    }

    /* renamed from: j */
    public final void mo111631j() {
    }

    /* renamed from: k */
    public final void mo111632k() {
    }

    /* renamed from: l */
    public final void mo111633l(C89885b bVar) {
    }

    /* renamed from: m */
    public final void mo111634m() {
        this.f365579e = this.f365576b.f365585c.mo29164d(C47810es.m84977q(new C134209an(this)), this.f365577c.getSeconds(), TimeUnit.SECONDS);
    }

    /* renamed from: n */
    public final boolean mo111635n() {
        return false;
    }

    /* renamed from: o */
    public final boolean mo111636o() {
        return true;
    }

    /* renamed from: p */
    public final void mo111637p(int i) {
        C89849ae aeVar;
        if (C134212aq.m217771g(i)) {
            aeVar = C89849ae.FEED_LAUNCH_CANCEL_BAD;
        } else {
            aeVar = C89849ae.FEED_LAUNCH_CANCEL_GOOD;
        }
        C59582aj a = mo111622a();
        a.copyOnWrite();
        C59687cb cbVar = (C59687cb) a.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        cbVar.f160041F = i - 1;
        cbVar.f160115b |= 8;
        mo111624c(aeVar, a);
    }
}
