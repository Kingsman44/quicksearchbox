package com.google.android.apps.search.googleapp.search.p10412h.p10414b;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.apps.search.googleapp.p10516t.p10520d.C139699c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.metrics.p2414h.C31499r;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.android.libraries.search.p2871b.p2893h.p2894a.C37248a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.search.h.b.a */
/* compiled from: PG */
public final class C137470a implements C139699c {

    /* renamed from: a */
    public final C38802e f373906a;

    /* renamed from: b */
    public final C137471b f373907b;

    /* renamed from: c */
    public final C89922b f373908c;

    /* renamed from: d */
    public final C21370a f373909d;

    static {
        C58974d.m91135i("StartupLatencyLogger");
    }

    public C137470a(C38802e eVar, C137471b bVar, C89922b bVar2, C21370a aVar) {
        this.f373907b = bVar;
        this.f373908c = bVar2;
        this.f373906a = eVar;
        this.f373909d = aVar;
    }

    /* renamed from: a */
    public final void mo112805a(Instant instant, Intent intent) {
        C137471b bVar = this.f373907b;
        bVar.f373910a = false;
        bVar.f373911b = false;
        bVar.f373912c = false;
        bVar.f373913d = false;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo112806b(boolean z) {
    }

    /* renamed from: c */
    public final void mo112807c() {
        C137471b bVar = this.f373907b;
        bVar.f373910a = true;
        if (bVar.f373913d) {
            mo113759d();
        }
    }

    /* renamed from: d */
    public final void mo113759d() {
        C137471b bVar = this.f373907b;
        if (bVar.f373912c) {
            return;
        }
        if (!bVar.f373910a) {
            bVar.f373913d = true;
            return;
        }
        this.f373908c.mo83763g(C89849ae.SEARCH_OVERLAY_STARTUP_SUGGESTIONS_SHOWN);
        this.f373906a.mo41630d(C37248a.f98949O.mo40811d(this.f373909d.mo26872d()));
        if (this.f373907b.f373911b) {
            this.f373908c.mo83760d();
            this.f373906a.mo41634h();
            C31499r.f84816a.mo37197a((Activity) null);
        }
        this.f373907b.f373912c = true;
    }
}
