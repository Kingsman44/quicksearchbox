package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59593aq;
import com.google.common.p4552o.C59594ar;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59770f;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.am */
/* compiled from: PG */
public final class C134208am extends C134206ak {

    /* renamed from: b */
    final /* synthetic */ C134212aq f365570b;

    /* renamed from: c */
    private final Duration f365571c = Duration.ofSeconds(60);

    /* renamed from: d */
    private final boolean f365572d;

    /* renamed from: e */
    private C60870cx f365573e;

    /* renamed from: f */
    private final AtomicBoolean f365574f = new AtomicBoolean(true);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134208am(C134212aq aqVar, boolean z) {
        super(aqVar);
        this.f365570b = aqVar;
        this.f365572d = z;
    }

    /* renamed from: q */
    private final boolean m217727q() {
        return this.f365574f.getAndSet(false);
    }

    /* renamed from: a */
    public final C59582aj mo111622a() {
        C59582aj a = super.mo111622a();
        int i = true != this.f365572d ? 2 : 3;
        a.copyOnWrite();
        C59687cb cbVar = (C59687cb) a.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        cbVar.f160140u = i - 1;
        cbVar.f160062a |= C89885b.HTTP_VALUE;
        return a;
    }

    /* renamed from: b */
    public final void mo111623b() {
        C60870cx cxVar = this.f365573e;
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
        C89849ae aeVar = C89849ae.FEED_LAUNCH_SUCCESS;
        C59582aj a = mo111622a();
        C59593aq aqVar = (C59593aq) C59594ar.f159800c.createBuilder();
        C63042fg c = C62950b.m95472c(instant);
        aqVar.copyOnWrite();
        C59594ar arVar = (C59594ar) aqVar.instance;
        c.getClass();
        arVar.f159803b = c;
        arVar.f159802a |= 1;
        a.copyOnWrite();
        C59687cb cbVar = (C59687cb) a.instance;
        C59594ar arVar2 = (C59594ar) aqVar.build();
        C59687cb cbVar2 = C59687cb.f160034bf;
        arVar2.getClass();
        cbVar.f160086aX = arVar2;
        cbVar.f160123d |= C89885b.HTTP_VALUE;
        mo111624c(aeVar, a);
    }

    /* renamed from: h */
    public final void mo111629h() {
    }

    /* renamed from: i */
    public final void mo111630i(boolean z) {
    }

    /* renamed from: j */
    public final void mo111631j() {
    }

    /* renamed from: k */
    public final void mo111632k() {
        if (m217727q()) {
            mo111624c(C89849ae.FEED_LAUNCH_CACHE_HIT, mo111622a());
        }
    }

    /* renamed from: l */
    public final void mo111633l(C89885b bVar) {
        if (m217727q()) {
            C89849ae aeVar = C89849ae.FEED_LAUNCH_CACHE_MISS;
            C59582aj a = mo111622a();
            a.mo57008e(C134214c.m217785a(bVar));
            mo111624c(aeVar, a);
        }
    }

    /* renamed from: m */
    public final void mo111634m() {
        mo111624c(C89849ae.FEED_LAUNCH_START, mo111622a());
        this.f365573e = this.f365570b.f365585c.mo29164d(C47810es.m84977q(new C134207al(this)), this.f365571c.getSeconds(), TimeUnit.SECONDS);
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
