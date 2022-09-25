package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87250s;
import com.google.android.apps.gsa.shared.p6968aa.C89052h;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;
import dagger.C68214a;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.ad */
/* compiled from: PG */
public final class C110318ad {

    /* renamed from: a */
    public static final C59071e f307474a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.photos.ad");

    /* renamed from: b */
    public final C86124t f307475b;

    /* renamed from: c */
    public final C58881cr f307476c;

    /* renamed from: d */
    public final C86106b f307477d;

    /* renamed from: e */
    public final C86054o f307478e;

    /* renamed from: f */
    public final C22871g f307479f;

    /* renamed from: g */
    public final C89052h f307480g;

    /* renamed from: h */
    public final C87250s f307481h;

    /* renamed from: i */
    public final C68214a f307482i;

    /* renamed from: j */
    public final C84466a f307483j;

    public C110318ad(C86124t tVar, C58881cr crVar, C86106b bVar, C86054o oVar, C68214a aVar, C22871g gVar, C84466a aVar2, C89052h hVar, C87250s sVar) {
        this.f307475b = tVar;
        this.f307476c = crVar;
        this.f307477d = bVar;
        this.f307478e = oVar;
        this.f307482i = aVar;
        this.f307479f = gVar;
        this.f307483j = aVar2;
        this.f307480g = hVar;
        this.f307481h = sVar;
    }

    /* renamed from: e */
    private final C60870cx m183706e() {
        C91032p pVar = new C91032p();
        Account a = this.f307478e.mo79668a();
        if (a == null) {
            return C60856cj.m92900i(new HashMap());
        }
        return this.f307479f.mo28209i(this.f307478e.mo79672f("oauth2:https://www.googleapis.com/auth/googlenow", a, true, pVar), "build headers", new C110317ac(this));
    }

    /* renamed from: a */
    public final C60870cx mo98568a(C58833ax axVar, C58833ax axVar2) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f307479f.mo28202b("fetchalbums", new C110389s(this, axVar, axVar2));
    }

    /* renamed from: b */
    public final C60870cx mo98569b(Uri uri) {
        return this.f307479f.mo28210j(m183706e(), "Send homescreen request", new C110388r(this, uri));
    }

    /* renamed from: c */
    public final C60870cx mo98570c() {
        return this.f307479f.mo28201a("get user key", new C110390t(this));
    }

    /* renamed from: d */
    public final C60870cx mo98571d(Uri uri, MessageLite messageLite) {
        return this.f307479f.mo28210j(m183706e(), "Send post request", new C110387q(this, messageLite, uri));
    }
}
