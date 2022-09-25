package com.google.android.apps.gsa.search.core.google;

import android.location.Location;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.google.p6796f.C85983e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90933cc;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.location.C38570a;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.search.core.google.at */
/* compiled from: PG */
public final class C85862at implements C85983e {

    /* renamed from: a */
    public static final C59071e f232160a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.at");

    /* renamed from: b */
    private static final Duration f232161b = Duration.ofSeconds(5);

    /* renamed from: c */
    private final C74637ae f232162c;

    /* renamed from: d */
    private final C85881bd f232163d;

    /* renamed from: e */
    private final C86338r f232164e;

    /* renamed from: f */
    private final C39141kp f232165f;

    /* renamed from: g */
    private final C86124t f232166g;

    /* renamed from: h */
    private final C22871g f232167h;

    public C85862at(C74637ae aeVar, C85881bd bdVar, C86338r rVar, C39141kp kpVar, C86124t tVar, C22871g gVar) {
        this.f232162c = aeVar;
        this.f232163d = bdVar;
        this.f232164e = rVar;
        this.f232165f = kpVar;
        this.f232166g = tVar;
        this.f232167h = gVar;
    }

    /* renamed from: a */
    public final String mo79492a() {
        return this.f232164e.getString("selected_search_country_code", BuildConfig.FLAVOR);
    }

    /* renamed from: b */
    public final void mo79493b(C85981c cVar, Query query, C39226b bVar) {
        String a = mo79492a();
        if (!a.isEmpty()) {
            cVar.mo79638d("gl", a);
        }
        String str = query.f252759Q;
        if (str != null) {
            cVar.mo79638d("sei", str);
            cVar.mo79638d("dlnr", "1");
        }
        if (!query.mo84414cu() || !this.f232166g.mo79746e(C90085ej.f250242t)) {
            mo79495e(cVar, query, bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo79494c(C85981c cVar, String str, boolean z) {
        cVar.mo79637c(cVar.f232497e, "X-Geo", str);
        if (z) {
            cVar.mo79638d("action", "devloc");
        }
    }

    /* renamed from: d */
    public final void mo79436d(C85981c cVar, Query query) {
        mo79493b(cVar, query, C39226b.TAG_CLASSIC_SEARCH_LO);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo79495e(C85981c cVar, Query query, C39226b bVar) {
        boolean z = false;
        if (!(query == null || query.f252759Q == null)) {
            z = true;
        }
        int h = this.f232163d.mo79517h(z);
        if (h != 1) {
            mo79497g(cVar, h);
            return;
        }
        C85975du duVar = new C85975du();
        if (query != null) {
            duVar.f232482b = query.f252785x;
        }
        if (!this.f232166g.mo79746e(C90086ek.f250507et) || query == null || !query.mo84412cs()) {
            mo79496f(cVar, duVar, bVar);
            return;
        }
        C74637ae aeVar = this.f232162c;
        C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_ASSISTANT_CAR_LO);
        d.mo41493b(f232161b);
        ((C38570a) d).f101954b = 3;
        new C90873ag(aeVar.mo71020c(d.mo41492a()), this.f232167h, "Auto getLocationWithMaxAge", new C85860ar(this, duVar, cVar)).mo85223a(C85861as.f232159a);
    }

    /* renamed from: f */
    public final void mo79496f(C85981c cVar, C85975du duVar, C39226b bVar) {
        C74637ae aeVar = this.f232162c;
        C91018d.m148680c();
        C38725y d = C38726z.m68011d(bVar);
        d.mo41493b(Duration.ofDays(1));
        C60870cx c = aeVar.mo71020c(d.mo41492a());
        C90933cc.m148547b(c, TimeUnit.MILLISECONDS);
        Location location = (Location) C90877ak.m148475i(c, (Object) null);
        duVar.f232481a = location;
        boolean z = location != null;
        String a = duVar.mo79631a();
        if (a != null) {
            mo79494c(cVar, a, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo79497g(C85981c cVar, int i) {
        String str;
        C39141kp kpVar = this.f232165f;
        switch (i) {
            case 1:
                str = "ALLOWED";
                break;
            case 2:
                str = "PERMISSION_NOT_GRANTED";
                break;
            case 3:
                str = "SETTINGS_UNKNOWN";
                break;
            case 4:
                str = "SWITCH_OFF";
                break;
            case 5:
                str = "LOCATION_FOR_SERVICES_OFF";
                break;
            case 6:
                str = "SENDER_NOT_ALLOWED";
                break;
            default:
                str = "null";
                break;
        }
        if (i != 0) {
            ((C19567d) kpVar.f102822aF.mo6453a()).mo24822a(1, str);
            cVar.mo79638d("devloc", "0");
            return;
        }
        throw null;
    }
}
