package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10129a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60901do;
import com.google.frameworks.client.data.android.p4632a.C61358s;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.p4184bj.p4193c.p4197c.C55937ak;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.a.l */
/* compiled from: PG */
public final class C133202l {

    /* renamed from: a */
    public static final C46690ah f363066a = new C46885y("GoogleApp_AccountMenu_DeleteHistoryState");

    /* renamed from: b */
    public static final C59071e f363067b = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.b.a.l");

    /* renamed from: c */
    public final C55937ak f363068c;

    /* renamed from: d */
    public final C60888db f363069d;

    /* renamed from: e */
    public C60872cz f363070e;

    /* renamed from: f */
    public final C21370a f363071f;

    /* renamed from: g */
    public final C42876ab f363072g;

    /* renamed from: h */
    public final C46778cv f363073h;

    public C133202l(C46778cv cvVar, C55937ak akVar, C60888db dbVar, C42876ab abVar, C21370a aVar) {
        this.f363073h = cvVar;
        this.f363069d = dbVar;
        this.f363072g = abVar;
        this.f363068c = (C55937ak) akVar.mo62577p(C61409d.f166071a, C61358s.m93865b());
        this.f363071f = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo111021a(boolean z) {
        return C47633f.m84733g(this.f363072g.mo46039a(new C133196f(z), C60826bg.f164896a));
    }

    /* renamed from: b */
    public final void mo111022b(long j) {
        C60872cz d = this.f363069d.mo29164d(C60901do.f165001a, j, TimeUnit.MILLISECONDS);
        this.f363070e = d;
        C47633f i = C47633f.m84733g(d).mo51516i(new C133195e(this), this.f363069d);
        C133201k kVar = new C133201k(this);
        C60856cj.m92911t(i.f164926b, C47810es.m84974n(kVar), this.f363069d);
    }
}
