package com.google.android.apps.gsa.staticplugins.p7611bv;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6586bf.C84836c;
import com.google.android.apps.gsa.search.core.p6881w.C87253b;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p10923ac.p10947c.C147202d;
import com.google.android.libraries.p10923ac.p10947c.C147209k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60852cf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4211e.p4212a.p4213a.C56025b;
import com.google.protobuf.C62917ay;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.y */
/* compiled from: PG */
public final class C97302y extends C86734a implements C84836c {

    /* renamed from: b */
    private static final C59071e f271732b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bv.y");

    /* renamed from: a */
    public final C22871g f271733a;

    /* renamed from: c */
    private final C68214a f271734c;

    /* renamed from: f */
    private final SharedPreferences f271735f;

    /* renamed from: g */
    private final C86054o f271736g;

    /* renamed from: h */
    private final Object f271737h = new Object();

    /* renamed from: i */
    private C60870cx f271738i = C60866ct.f164955a;

    public C97302y(C68214a aVar, C22871g gVar, SharedPreferences sharedPreferences, C86054o oVar) {
        super(C118575h.WORKER_MDH, "mdh");
        this.f271734c = aVar;
        this.f271733a = gVar;
        this.f271735f = sharedPreferences;
        this.f271736g = oVar;
    }

    /* renamed from: c */
    private final C60870cx m161006c(C22862b bVar) {
        C60870cx b;
        synchronized (this.f271737h) {
            C60852cf b2 = C60856cj.m92893b(this.f271738i);
            Objects.requireNonNull(bVar);
            b = b2.mo57335b(new C97293p(bVar), new C97294q(this));
            this.f271738i = b;
        }
        return b;
    }

    /* renamed from: a */
    public final void mo78520a(C60870cx cxVar) {
        m161006c(new C97299v(this, cxVar));
    }

    /* renamed from: b */
    public final C60870cx mo78521b(int i, C62917ay ayVar, int i2, long j, C87253b bVar) {
        C68214a aVar = this.f271734c;
        Account a = this.f271736g.mo79668a();
        if (a == null) {
            ((C59052c) ((C59052c) f271732b.mo56225c()).mo56372aa(20922)).mo56386p("Couldn't create TimeSeriesFootprintsHandle in setupFootprintsDataListener because there is no logged in account in AGSA.");
            return C60856cj.m92898g();
        } else if (!ayVar.equals(C56025b.f149199c) || TextUtils.equals(a.name, this.f271735f.getString("custom_tabs_browser_account", BuildConfig.FLAVOR))) {
            C147209k b = ((C147202d) aVar.mo27525b()).mo124030b(a, i, ayVar);
            C60870cx c = m161006c(new C97295r(b, i2, j));
            C97300w wVar = new C97300w(i, bVar);
            C60870cx i3 = this.f271733a.mo28209i(this.f271733a.mo28210j(c, "attachListener", new C97296s(b, wVar)), "noop", new C97297t(b, wVar));
            this.f271733a.mo28211k(i3, "setupTimeSeriesFootprintsDataListenerFailureHandling", new C97301x());
            return i3;
        } else {
            ((C59052c) ((C59052c) f271732b.mo56225c()).mo56372aa(20921)).mo56386p("Couldn't create TimeSeriesFootprintsHandle in setupFootprintsDataListener because the logged in accounts in CCT and AGSA do not match.");
            return C60856cj.m92898g();
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
