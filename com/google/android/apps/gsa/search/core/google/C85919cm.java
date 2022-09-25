package com.google.android.apps.gsa.search.core.google;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89017ao;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4184bj.C56036l;
import com.google.p4500cm.p4518d.p4519a.C58181d;
import dagger.C68214a;
import java.net.MalformedURLException;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.search.core.google.cm */
/* compiled from: PG */
public final class C85919cm {

    /* renamed from: a */
    public static final C59071e f232286a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.cm");

    /* renamed from: r */
    private static String f232287r;

    /* renamed from: b */
    public final Object f232288b = new Object();

    /* renamed from: c */
    public final C68214a f232289c;

    /* renamed from: d */
    public final C90931ca f232290d;

    /* renamed from: e */
    public final C68214a f232291e;

    /* renamed from: f */
    public final C68214a f232292f;

    /* renamed from: g */
    public final C68214a f232293g;

    /* renamed from: h */
    public final C68214a f232294h;

    /* renamed from: i */
    public final C68214a f232295i;

    /* renamed from: j */
    public final C68214a f232296j;

    /* renamed from: k */
    public final C68214a f232297k;

    /* renamed from: l */
    public final C68214a f232298l;

    /* renamed from: m */
    public final C22871g f232299m;

    /* renamed from: n */
    public int f232300n;

    /* renamed from: o */
    public int f232301o;

    /* renamed from: p */
    public String f232302p;

    /* renamed from: q */
    public int f232303q;

    public C85919cm(C68214a aVar, C90931ca caVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C22871g gVar) {
        this.f232289c = aVar;
        this.f232290d = caVar;
        this.f232291e = aVar2;
        this.f232292f = aVar3;
        this.f232293g = aVar4;
        this.f232294h = aVar5;
        this.f232295i = aVar6;
        this.f232296j = aVar7;
        this.f232297k = aVar8;
        this.f232298l = aVar9;
        this.f232299m = gVar;
    }

    /* renamed from: a */
    public static synchronized String m138054a() {
        String str;
        synchronized (C85919cm.class) {
            C90748e.m148224b();
            if (f232287r == null) {
                byte[] bArr = new byte[8];
                new SecureRandom().nextBytes(bArr);
                f232287r = Base64.encodeToString(bArr, 11);
                C58976aa aaVar = C58975e.f156826a;
            }
            str = f232287r;
        }
        return str;
    }

    /* renamed from: b */
    public final void mo79543b(Uri uri, Map map) {
        try {
            C58976aa aaVar = C58975e.f156826a;
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(uri.toString());
            c.mo82991c(map);
            c.f241239e = false;
            c.f241244j = true;
            c.f241245k = 5;
            ((C89057m) C90877ak.m148472f(((C89012aj) this.f232289c.mo27525b()).mo27495f(c.mo82989a(), C89009ag.f241207b, ((C89012aj) this.f232289c.mo27525b()).mo27510b(C89066v.f241382a)))).mo83036f();
        } catch (C89017ao e) {
            C59104x d = f232286a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
            ((C59052c) ((C59052c) d).mo56372aa(7896)).mo56389s("Got redirect from click log request: %s", e.f241232b);
        } catch (C89013ak | C90457d | InterruptedException e2) {
            C59104x d2 = f232286a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(7897)).mo56386p("Error logging result click");
        } catch (MalformedURLException | ExecutionException e3) {
            C59104x d3 = f232286a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e3)).mo56372aa(7898)).mo56386p("Error logging result click");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo79544c(String str, Long l, C85929cw cwVar) {
        if (TextUtils.isEmpty(str)) {
            C59104x c = f232286a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
            ((C59052c) ((C59052c) c).mo56372aa(7900)).mo56386p("Cannot log event to GWS because URL is null/empty");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f232290d.mo85139d(new C85916cj(this, str, l, cwVar));
    }

    /* renamed from: d */
    public final void mo79545d(int i, C58181d dVar, String str, Long l, C85929cw cwVar, long j, int i2) {
        int i3 = i;
        C58181d dVar2 = dVar;
        Long l2 = l;
        C85929cw cwVar2 = cwVar;
        if (cwVar2 == null) {
            C59104x c = f232286a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
            ((C59052c) ((C59052c) c).mo56372aa(7903)).mo56386p("Cannot log, urlHelper==null");
            return;
        }
        if ((i3 & 4096) != 0) {
            if (str != null) {
                this.f232290d.mo85139d(new C85917ck(this, cwVar, str, l, j, i2));
                i3 &= -4097;
            } else {
                C59104x c2 = f232286a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
                ((C59052c) ((C59052c) c2).mo56372aa(7902)).mo56386p("Cannot log card above SRP because event id is null");
            }
        }
        if (i3 == 0) {
            return;
        }
        if (dVar2 != null) {
            if ((i3 & 1) != 0) {
                mo79544c(dVar2.f155549a, l2, cwVar2);
            }
            if ((i3 & 2) != 0) {
                mo79544c(dVar2.f155551c, l2, cwVar2);
            }
            if ((i3 & 4) != 0) {
                mo79544c(dVar2.f155550b, l2, cwVar2);
            }
            if ((i3 & 8) != 0) {
                mo79544c(dVar2.f155552d, l2, cwVar2);
            }
            if ((i3 & 16) != 0) {
                mo79544c(dVar2.f155555g, l2, cwVar2);
            }
            if ((i3 & 32) != 0) {
                mo79544c(dVar2.f155553e, l2, cwVar2);
            }
            if ((i3 & 64) != 0) {
                mo79544c(dVar2.f155554f, l2, cwVar2);
            }
            if ((i3 & 128) != 0) {
                mo79544c(dVar2.f155556h, l2, cwVar2);
            }
            if ((i3 & 256) != 0) {
                mo79544c(dVar2.f155557i, l2, cwVar2);
                return;
            }
            return;
        }
        C59104x d = f232286a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
        ((C59052c) ((C59052c) d).mo56372aa(7901)).mo56386p("Cannot log to GWS: all URLs missing.");
    }

    /* renamed from: e */
    public final void mo79546e() {
        synchronized (this.f232288b) {
            this.f232300n++;
            this.f232303q = 1;
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: f */
    public final void mo79547f(C56036l lVar) {
        this.f232299m.mo28212l("sendFp204ForProactiveZpSuggestions", new C85912cf(this, lVar));
    }

    /* renamed from: g */
    public final boolean mo79548g(UriRequest uriRequest, int i) {
        try {
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(uriRequest.f236331a.toString());
            c.mo82991c(uriRequest.mo81502a());
            c.f241244j = true;
            c.f241245k = 5;
            c.f241249o = i;
            ((C89057m) C90877ak.m148472f(((C89012aj) this.f232289c.mo27525b()).mo27495f(c.mo82989a(), C89009ag.f241207b, ((C89012aj) this.f232289c.mo27525b()).mo27510b(C89066v.f241382a)))).mo83036f();
            return true;
        } catch (C89013ak | C90457d | InterruptedException e) {
            C59104x d = f232286a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7905)).mo56386p("Could not log using gen204");
            return false;
        } catch (MalformedURLException | ExecutionException e2) {
            C59104x d2 = f232286a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Velvet.SearchBoxLogging");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(7906)).mo56386p("Could not log using gen204");
            return false;
        }
    }

    /* renamed from: h */
    public final void mo79549h(C58881cr crVar) {
        this.f232290d.mo85139d(new C85913cg(this, crVar));
    }
}
