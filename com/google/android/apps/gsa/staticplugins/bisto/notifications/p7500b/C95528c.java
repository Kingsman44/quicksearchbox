package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90425f;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90427h;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95598as;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95629y;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94647k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95208w;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95309o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95311q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60237lk;
import com.google.common.p4552o.C60241lo;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.c */
/* compiled from: PG */
public final class C95528c extends C95515ae {

    /* renamed from: c */
    private final C95598as f267326c;

    /* renamed from: d */
    private final C90427h f267327d;

    /* renamed from: e */
    private List f267328e;

    /* renamed from: f */
    private boolean f267329f;

    /* renamed from: g */
    private boolean f267330g;

    public C95528c(List list, C95598as asVar, C95706l lVar, C95307m mVar, C21370a aVar) {
        super(mVar, aVar, lVar);
        this.f267326c = asVar;
        if (list.isEmpty()) {
            C89655j.m145957a("no notifs");
            this.f267327d = new C90427h(BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, (String) null);
        } else {
            this.f267327d = ((C90421b) list.get(0)).mo84131b();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f267327d.equals(((C90421b) it.next()).mo84131b())) {
                C89655j.m145957a("All notifications in the aggregate must share an identifier.");
            }
        }
        this.f267328e = list;
        C60237lk lkVar = this.f267277k;
        int size = list.size();
        lkVar.copyOnWrite();
        C60241lo loVar = (C60241lo) lkVar.instance;
        C60241lo loVar2 = C60241lo.f162980w;
        loVar.f162982a |= 4096;
        loVar.f162991j = size;
    }

    /* renamed from: A */
    private final int m158043A() {
        return this.f267328e.size();
    }

    /* renamed from: o */
    public final int mo89411o() {
        return 4;
    }

    /* renamed from: p */
    public final Uri mo89412p() {
        for (C90421b bVar : this.f267328e) {
            Uri uri = bVar.f252585f;
            if (uri != null) {
                return uri;
            }
        }
        return null;
    }

    /* renamed from: q */
    public final C90427h mo89413q() {
        return this.f267327d;
    }

    /* renamed from: r */
    public final List mo89414r() {
        return this.f267328e;
    }

    /* renamed from: s */
    public final void mo89415s(C95285o oVar, C95284n nVar) {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
            nVar.mo88601a();
            return;
        }
        List d = this.f267326c.mo89541d(this.f267327d, new C95629y());
        if (d.size() > m158043A()) {
            this.f267328e = d;
        }
        C60237lk lkVar = this.f267277k;
        int A = m158043A();
        lkVar.copyOnWrite();
        C60241lo loVar = (C60241lo) lkVar.instance;
        C60241lo loVar2 = C60241lo.f162980w;
        loVar.f162982a |= 4096;
        loVar.f162991j = A;
        C95208w B = m158044B(afVar);
        if (B == null) {
            C89655j.m145957a("no tts");
            nVar.mo88601a();
        } else if (afVar.f267282c) {
            C58976aa aaVar = C58975e.f156826a;
            C95309o d2 = this.f264705a.mo89241d();
            C60237lk lkVar2 = this.f267277k;
            int a = B.mo89114a();
            lkVar2.copyOnWrite();
            C60241lo loVar3 = (C60241lo) lkVar2.instance;
            loVar3.f162982a |= C89885b.S3REQUEST_VALUE;
            loVar3.f162995n = a;
            this.f267330g = true;
            int c = oVar.mo89203c(B, new C95510a(this, d2, nVar));
            C95311q.m157570d(this.f267277k, c);
            if (c == 0) {
                this.f267330g = false;
            }
        } else if (afVar.f267281b) {
            C58976aa aaVar2 = C58975e.f156826a;
            C95309o e = this.f264705a.mo89242e();
            C60237lk lkVar3 = this.f267277k;
            int a2 = B.mo89114a();
            lkVar3.copyOnWrite();
            C60241lo loVar4 = (C60241lo) lkVar3.instance;
            loVar4.f162982a |= 32768;
            loVar4.f162993l = a2;
            this.f267329f = true;
            int c2 = oVar.mo89203c(B, new C95527b(this, e, nVar));
            C95311q.m157570d(this.f267277k, c2);
            if (c2 == 0) {
                this.f267329f = false;
            }
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            nVar.mo88601a();
        }
    }

    /* renamed from: t */
    public final boolean mo89416t(C94647k kVar, C94637a aVar) {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
            return false;
        }
        m158044B(afVar);
        return false;
    }

    /* renamed from: u */
    public final boolean mo89417u() {
        return false;
    }

    /* renamed from: v */
    public final boolean mo89418v() {
        return this.f267330g;
    }

    /* renamed from: w */
    public final boolean mo89419w() {
        return this.f267329f;
    }

    /* renamed from: B */
    private final C95208w m158044B(C95516af afVar) {
        if (afVar.f267282c) {
            for (C90421b bVar : this.f267328e) {
                if (!(bVar instanceof C90425f)) {
                    return new C95208w(this.f267276j.f267947e, R.string.aggregate_announcement, mo89420x(), Integer.valueOf(m158043A()));
                }
            }
            return new C95208w(this.f267276j.f267947e, R.string.aggregate_announcement_events, mo89420x(), Integer.valueOf(m158043A()));
        } else if (!afVar.f267281b) {
            return null;
        } else {
            return new C95208w(this.f267276j.f267947e, R.string.app_name_summary, mo89420x());
        }
    }
}
