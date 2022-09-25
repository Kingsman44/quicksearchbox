package com.google.android.apps.gsa.staticplugins.p7453bi;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6562au.C84741a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86744b;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89046bq;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import java.io.File;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.gsa.staticplugins.bi.y */
/* compiled from: PG */
public final class C94633y implements C84741a, C86744b {

    /* renamed from: a */
    public final C94615g f264667a;

    /* renamed from: b */
    private final C22871g f264668b;

    /* renamed from: c */
    private final C22871g f264669c;

    public C94633y(C94615g gVar, C22871g gVar2, C22871g gVar3) {
        this.f264667a = gVar;
        this.f264668b = gVar2;
        this.f264669c = gVar3;
    }

    /* renamed from: a */
    public final C60870cx mo78453a(File file) {
        return this.f264668b.mo28202b("captureCronetNetLog", new C94626r(this, file));
    }

    /* renamed from: c */
    public final C60870cx mo78454c(String str, int i, C70334de deVar, String str2, int i2) {
        return this.f264669c.mo28202b("createGrpcChannel", new C94632x(this, str, i, deVar, str2, i2));
    }

    /* renamed from: e */
    public final C60870cx mo78455e(C89020ar arVar, C89068x xVar, C89061q qVar) {
        return this.f264669c.mo28202b("executeRequest", new C94628t(this, arVar, xVar, qVar));
    }

    /* renamed from: f */
    public final C60870cx mo78456f(C89020ar arVar, C89068x xVar, C89061q qVar) {
        return this.f264669c.mo28202b("executeRequestUnbuffered", new C94630v(this, arVar, xVar, qVar));
    }

    /* renamed from: g */
    public final C60870cx mo78457g() {
        return this.f264668b.mo28202b("forceStartCronetNetLog", new C94627s(this));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        this.f264667a.mo17602gS(fVar);
    }

    /* renamed from: h */
    public final C60870cx mo78458h(int i) {
        return this.f264669c.mo28202b("getStatistics", new C94631w(this, i));
    }

    /* renamed from: hY */
    public final void mo79108hY() {
    }

    /* renamed from: hZ */
    public final C118575h mo80348hZ() {
        return this.f264667a.f234292d;
    }

    /* renamed from: i */
    public final C60870cx mo78459i(C89046bq bqVar) {
        return this.f264669c.mo28202b("setTestingUrlRewriter", new C94629u(this, bqVar));
    }

    /* renamed from: ia */
    public final String mo80349ia() {
        return this.f264667a.f234293e;
    }

    /* renamed from: ib */
    public final void mo80350ib() {
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
