package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.net.Uri;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90427h;
import com.google.android.apps.gsa.shared.notificationlistening.common.StandardNotification;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94647k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95208w;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95209x;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95311q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60237lk;
import com.google.common.p4552o.C60241lo;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.al */
/* compiled from: PG */
public final class C95522al extends C95515ae {

    /* renamed from: c */
    private final StandardNotification f267313c;

    /* renamed from: d */
    private final C95293ae f267314d;

    /* renamed from: e */
    private boolean f267315e;

    /* renamed from: f */
    private boolean f267316f;

    public C95522al(StandardNotification standardNotification, C95706l lVar, C95293ae aeVar, C95307m mVar, C21370a aVar) {
        super(mVar, aVar, lVar);
        this.f267313c = standardNotification;
        this.f267314d = aeVar;
    }

    /* renamed from: E */
    private final C95209x m158018E(boolean z) {
        CharSequence b = C95526ap.m158041b(C95526ap.m158040a(this.f267313c.f252562s), this.f267276j.f267947e);
        CharSequence charSequence = this.f267313c.f252561r;
        if (charSequence != null) {
            CharSequence b2 = C95526ap.m158041b(C95526ap.m158040a(charSequence), this.f267276j.f267947e);
            if (z) {
                return new C95208w(this.f267276j.f267947e, R.string.single_notification_announcement_with_app_name_non_optimized, mo89420x(), b2, b);
            }
            return new C95208w(this.f267276j.f267947e, R.string.single_notification_announcement_non_optimized, b2, b);
        } else if (!z) {
            return new C95209x(b);
        } else {
            return new C95208w(this.f267276j.f267947e, R.string.single_notification_announcement_with_app_name_and_optimized_content, mo89420x(), b);
        }
    }

    /* renamed from: F */
    private final C95209x m158019F(boolean z) {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
            return null;
        } else if (!afVar.f267281b || !afVar.f267282c || m158021I()) {
            if (afVar.f267282c) {
                if (this.f267313c.f252582c == null) {
                    return m158018E(false);
                }
                return null;
            } else if (afVar.f267281b) {
                return m158020H(true, z);
            } else {
                return null;
            }
        } else if (this.f267313c.f252582c == null) {
            return m158018E(true);
        } else {
            return m158020H(false, z);
        }
    }

    /* renamed from: H */
    private final C95209x m158020H(boolean z, boolean z2) {
        Integer num;
        if (z) {
            Integer g = this.f267314d.mo89215g(5);
            if (g == null) {
                return new C95208w(this.f267276j.f267947e, R.string.app_name_summary, mo89420x());
            }
            if (!z2) {
                num = this.f267314d.mo89214f(5);
                this.f267314d.mo89219l(5);
                C95311q.m157568b(this.f267276j.f267947e, this.f267314d, this.f267277k, g.intValue());
            } else {
                num = null;
            }
            if (num == null) {
                num = 1;
            }
            String j = this.f267314d.mo89217j(this.f267276j.f267947e, 19, num.intValue());
            if (j == null) {
                j = this.f267276j.f267947e.getString(R.string.default_instruction);
            }
            return new C95208w(this.f267276j.f267947e, g.intValue(), mo89420x(), j);
        }
        return new C95208w(this.f267276j.f267947e, R.string.app_name_summary, mo89420x());
    }

    /* renamed from: I */
    private final boolean m158021I() {
        if (this.f267313c.f252582c != null || !m158018E(false).f266358a.toString().contains(mo89420x())) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public final Uri mo89427A() {
        Uri uri;
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
            return null;
        } else if (!afVar.f267282c || (uri = this.f267313c.f252582c) == null) {
            return null;
        } else {
            return uri;
        }
    }

    /* renamed from: B */
    public final void mo89428B(C95209x xVar, Uri uri, boolean z, boolean z2, C95285o oVar, C95284n nVar) {
        int i;
        if (!(xVar == null || uri == null)) {
            C89655j.m145957a("Gave both TTS request and Uri request.");
        }
        if (z2) {
            this.f267316f = true;
            if (xVar != null) {
                C60237lk lkVar = this.f267277k;
                int a = xVar.mo89114a();
                lkVar.copyOnWrite();
                C60241lo loVar = (C60241lo) lkVar.instance;
                C60241lo loVar2 = C60241lo.f162980w;
                loVar.f162982a |= C89885b.S3REQUEST_VALUE;
                loVar.f162995n = a;
            }
        } else if (xVar != null) {
            C60237lk lkVar2 = this.f267277k;
            int a2 = xVar.mo89114a();
            lkVar2.copyOnWrite();
            C60241lo loVar3 = (C60241lo) lkVar2.instance;
            C60241lo loVar4 = C60241lo.f162980w;
            loVar3.f162982a |= 32768;
            loVar3.f162993l = a2;
        }
        if (z) {
            this.f267315e = true;
        }
        C95521ak akVar = new C95521ak(this, z2, this.f264705a.mo89241d(), z, this.f264705a.mo89242e(), nVar);
        if (xVar != null) {
            i = oVar.mo89203c(xVar, akVar);
        } else if (uri != null) {
            i = oVar.mo89204d(uri, akVar);
        } else {
            C89655j.m145957a("No TTS or Uri");
            nVar.mo88601a();
            return;
        }
        C95311q.m157570d(this.f267277k, i);
        if (i == 0) {
            if (z) {
                this.f267315e = false;
            }
            if (z2) {
                this.f267316f = false;
            }
        }
    }

    /* renamed from: C */
    public final boolean mo89399C() {
        return true;
    }

    /* renamed from: o */
    public final int mo89411o() {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
            return 6;
        } else if (afVar.f267282c) {
            return 9;
        } else {
            if (afVar.f267281b) {
                return 5;
            }
            if (afVar.f267280a) {
                return 1;
            }
            C89655j.m145957a("Unsupported playback type: ".concat(afVar.toString()));
            return 6;
        }
    }

    /* renamed from: p */
    public final Uri mo89412p() {
        return this.f267313c.f252585f;
    }

    /* renamed from: q */
    public final C90427h mo89413q() {
        return this.f267313c.f252563t;
    }

    /* renamed from: r */
    public final List mo89414r() {
        return Collections.singletonList(this.f267313c);
    }

    /* renamed from: s */
    public final void mo89415s(C95285o oVar, C95284n nVar) {
        C95284n nVar2;
        boolean z;
        C95520aj ajVar;
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
            nVar.mo88601a();
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        C95209x F = m158019F(false);
        Uri uri = null;
        boolean z2 = true;
        if (!afVar.f267281b || !afVar.f267282c || m158021I()) {
            if (afVar.f267282c) {
                nVar2 = nVar;
                z2 = false;
            } else if (afVar.f267281b) {
                ajVar = nVar;
                uri = mo89427A();
                z = false;
                mo89428B(F, uri, z2, z, oVar, nVar2);
            } else {
                nVar.mo88601a();
                return;
            }
        } else if (this.f267313c.f252582c == null) {
            nVar2 = nVar;
        } else {
            ajVar = new C95520aj(this, nVar, oVar);
            z = false;
            mo89428B(F, uri, z2, z, oVar, nVar2);
        }
        z = true;
        mo89428B(F, uri, z2, z, oVar, nVar2);
    }

    /* renamed from: t */
    public final boolean mo89416t(C94647k kVar, C94637a aVar) {
        if (this.f267279m == null) {
            C89655j.m145957a("no settings");
            return false;
        }
        new AtomicBoolean(true);
        m158019F(true);
        return false;
    }

    /* renamed from: v */
    public final boolean mo89418v() {
        return this.f267316f;
    }

    /* renamed from: w */
    public final boolean mo89419w() {
        return this.f267315e;
    }
}
