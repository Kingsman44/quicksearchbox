package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59770f;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.ap */
/* compiled from: PG */
public final class C134211ap extends C134206ak {

    /* renamed from: b */
    private final C134228q f365581b;

    /* renamed from: c */
    private boolean f365582c;

    public C134211ap(C134212aq aqVar, C134228q qVar) {
        super(aqVar);
        this.f365581b = qVar;
    }

    /* renamed from: d */
    public final void mo111625d() {
        if (this.f365582c) {
            mo111624c(C89849ae.DISCOVER_TNG_PULL_TO_REFRESH_SUCCESS, mo111622a());
            return;
        }
        C89849ae aeVar = C89849ae.DISCOVER_TNG_PULL_TO_REFRESH_ERROR;
        C59582aj a = mo111622a();
        a.mo57008e(C134214c.m217785a(C89885b.FEED_PULL_TO_REFRESH_REPEATED_CONTENT));
        mo111624c(aeVar, a);
    }

    /* renamed from: e */
    public final void mo111626e(C59770f fVar) {
        C89849ae aeVar = C89849ae.DISCOVER_TNG_PULL_TO_REFRESH_DISABLED;
        C59582aj a = mo111622a();
        a.mo57008e(fVar);
        mo111624c(aeVar, a);
    }

    /* renamed from: f */
    public final void mo111627f(C59770f fVar) {
        C89849ae aeVar = C89849ae.DISCOVER_TNG_PULL_TO_REFRESH_ERROR;
        C59582aj a = mo111622a();
        a.mo57008e(fVar);
        mo111624c(aeVar, a);
    }

    /* renamed from: g */
    public final void mo111628g(Instant instant) {
    }

    /* renamed from: h */
    public final void mo111629h() {
    }

    /* renamed from: i */
    public final void mo111630i(boolean z) {
    }

    /* renamed from: j */
    public final void mo111631j() {
        this.f365582c = true;
    }

    /* renamed from: k */
    public final void mo111632k() {
    }

    /* renamed from: l */
    public final void mo111633l(C89885b bVar) {
    }

    /* renamed from: m */
    public final void mo111634m() {
        mo111624c(this.f365581b.f365699j, mo111622a());
    }

    /* renamed from: n */
    public final boolean mo111635n() {
        return true;
    }

    /* renamed from: o */
    public final boolean mo111636o() {
        return false;
    }

    /* renamed from: p */
    public final void mo111637p(int i) {
        C89849ae aeVar = C89849ae.DISCOVER_TNG_PULL_TO_REFRESH_CANCEL;
        C59582aj a = mo111622a();
        a.copyOnWrite();
        C59687cb cbVar = (C59687cb) a.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        cbVar.f160041F = i - 1;
        cbVar.f160115b |= 8;
        mo111624c(aeVar, a);
    }
}
