package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.content.Context;
import android.net.Uri;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90425f;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90427h;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94647k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95197l;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95208w;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95209x;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95210y;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95311q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60237lk;
import com.google.common.p4552o.C60241lo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.l */
/* compiled from: PG */
public final class C95537l extends C95515ae {

    /* renamed from: d */
    private static final C59071e f267363d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.b.l");

    /* renamed from: c */
    public final List f267364c;

    /* renamed from: e */
    private final C89656k f267365e;

    /* renamed from: f */
    private C95209x f267366f;

    public C95537l(List list, C95706l lVar, C89656k kVar, C95307m mVar, C21370a aVar) {
        super(mVar, aVar, lVar);
        this.f267365e = kVar;
        if (!list.isEmpty()) {
            C90427h hVar = ((C90425f) list.get(0)).f252605t;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C90425f fVar = (C90425f) it.next();
                if (!hVar.equals(fVar.f252605t)) {
                    C59104x d = f267363d.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "EventAnnouncement");
                    ((C59052c) ((C59052c) d).mo56372aa(16051)).mo56354G("All identifiers must be the same. Mismatch: %s and %s", hVar, fVar.f252605t);
                    int i = C90755l.f253831a;
                }
            }
        }
        this.f267364c = list;
    }

    /* renamed from: B */
    static CharSequence m158079B(long j, long j2) {
        return DateUtils.getRelativeTimeSpanString(j + TimeUnit.MINUTES.toMillis(j2), j, 60000);
    }

    /* renamed from: F */
    private static long m158080F(C90425f fVar, long j) {
        long millis = TimeUnit.MINUTES.toMillis(1) / 2;
        long j2 = fVar.f252603r - j;
        if (j2 > 0) {
            return TimeUnit.MILLISECONDS.toMinutes(j2 + millis);
        }
        return TimeUnit.MILLISECONDS.toMinutes(j2 - millis);
    }

    /* renamed from: H */
    private final C95209x m158081H(Context context, C95516af afVar, C90425f fVar, long j) {
        long F = m158080F(fVar, j);
        CharSequence B = m158079B(j, F);
        if (!m158082I(afVar, fVar)) {
            Spanned a = C95197l.m157356a(C95526ap.m158041b(C95526ap.m158040a(fVar.f252604s), context), C95210y.m157365g(context, this.f267365e));
            if (F < 0) {
                return C95197l.m157357b(context, R.string.event_summary_with_past_timestamp, a, B);
            } else if (F == 0) {
                return C95197l.m157357b(context, R.string.event_summary_with_current_timestamp, a);
            } else {
                return C95197l.m157357b(context, R.string.event_summary_with_future_timestamp, a, B);
            }
        } else if (F < 0) {
            return new C95208w(context, R.string.generic_event_summary_with_past_timestamp, B);
        } else if (F == 0) {
            return new C95208w(context, R.string.generic_event_summary_with_current_timestamp, new Object[0]);
        } else {
            return new C95208w(context, R.string.generic_event_summary_with_future_timestamp, B);
        }
    }

    /* renamed from: I */
    private final boolean m158082I(C95516af afVar, C90425f fVar) {
        CharSequence charSequence = fVar.f252604s;
        long a = this.f267365e.mo83546a("calendar_max_words");
        long a2 = this.f267365e.mo83546a("calendar_max_chars");
        long length = (long) charSequence.toString().split("\\s+").length;
        C58976aa aaVar = C58975e.f156826a;
        if (afVar.f267282c) {
            return false;
        }
        if (((long) charSequence.length()) > a2 || length > a) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final C95209x mo89430A(Context context, C95516af afVar, List list, long j) {
        Long valueOf;
        Context context2 = context;
        List list2 = list;
        long j2 = j;
        if (list.size() > 1) {
            long F = m158080F((C90425f) list2.get(0), j2);
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    valueOf = Long.valueOf(F);
                    break;
                } else if (m158080F((C90425f) list2.get(i), j2) != F) {
                    valueOf = null;
                    break;
                } else {
                    i++;
                }
            }
            if (valueOf == null) {
                long F2 = m158080F((C90425f) list2.get(0), j2);
                C90425f fVar = (C90425f) list2.get(0);
                int i2 = 1;
                for (int i3 = 1; i3 < list.size(); i3++) {
                    long F3 = m158080F((C90425f) list2.get(i3), j2);
                    if (F3 < F2) {
                        fVar = (C90425f) list2.get(i3);
                        F2 = F3;
                        i2 = 1;
                    } else if (F3 == F2) {
                        i2++;
                    }
                }
                if (i2 == 1) {
                    return new C95208w(context2, R.string.announcement_multiple_events_different_times_one_soonest, m158081H(context, afVar, fVar, j).f266358a, Integer.valueOf(list.size() - 1));
                }
                CharSequence B = m158079B(j2, F2);
                if (F2 < 0) {
                    return new C95208w(context2, R.string.announcement_multiple_events_different_times_multiple_soonest_past, Integer.valueOf(i2), B, Integer.valueOf(list.size() - i2));
                } else if (F2 == 0) {
                    return new C95208w(context2, R.string.announcement_multiple_events_different_times_multiple_soonest_now, Integer.valueOf(i2), Integer.valueOf(list.size() - i2));
                } else {
                    return new C95208w(context2, R.string.announcement_multiple_events_different_times_multiple_soonest_future, Integer.valueOf(i2), B, Integer.valueOf(list.size() - i2));
                }
            } else {
                long longValue = valueOf.longValue();
                CharSequence B2 = m158079B(j2, longValue);
                if (longValue < 0) {
                    return new C95208w(context2, R.string.multiple_event_summary_with_past_timestamp, Integer.valueOf(list.size()), B2);
                } else if (longValue == 0) {
                    return new C95208w(context2, R.string.multiple_event_summary_with_current_timestamp, Integer.valueOf(list.size()));
                } else {
                    return new C95208w(context2, R.string.multiple_event_summary_with_future_timestamp, Integer.valueOf(list.size()), B2);
                }
            }
        } else {
            return m158081H(context, afVar, (C90425f) list2.get(0), j);
        }
    }

    /* renamed from: C */
    public final boolean mo89399C() {
        return true;
    }

    /* renamed from: D */
    public final boolean mo89400D() {
        return true;
    }

    /* renamed from: E */
    public final boolean mo89431E() {
        C95516af afVar = this.f267279m;
        if (afVar != null) {
            return afVar.f267282c || !m158082I(afVar, (C90425f) this.f267364c.get(0));
        }
        return false;
    }

    /* renamed from: o */
    public final int mo89411o() {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
            return 6;
        } else if (mo89418v()) {
            return 9;
        } else {
            if (mo89419w()) {
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
        for (C90421b bVar : this.f267364c) {
            Uri uri = bVar.f252585f;
            if (uri != null) {
                return uri;
            }
        }
        return null;
    }

    /* renamed from: q */
    public final C90427h mo89413q() {
        return ((C90421b) this.f267364c.get(0)).mo84131b();
    }

    /* renamed from: r */
    public final List mo89414r() {
        return this.f267364c;
    }

    /* renamed from: s */
    public final void mo89415s(C95285o oVar, C95284n nVar) {
        C95516af afVar = this.f267279m;
        if (afVar == null) {
            C89655j.m145957a("no settings");
            nVar.mo88601a();
        } else if (afVar.f267281b || afVar.f267282c) {
            if (this.f267366f == null) {
                this.f267366f = mo89430A(this.f267276j.f267947e, afVar, this.f267364c, this.f264706b.mo26870b());
                if (mo89431E()) {
                    C60237lk lkVar = this.f267277k;
                    int a = this.f267366f.mo89114a();
                    lkVar.copyOnWrite();
                    C60241lo loVar = (C60241lo) lkVar.instance;
                    C60241lo loVar2 = C60241lo.f162980w;
                    loVar.f162982a |= C89885b.S3REQUEST_VALUE;
                    loVar.f162995n = a;
                } else {
                    C60237lk lkVar2 = this.f267277k;
                    int a2 = this.f267366f.mo89114a();
                    lkVar2.copyOnWrite();
                    C60241lo loVar3 = (C60241lo) lkVar2.instance;
                    C60241lo loVar4 = C60241lo.f162980w;
                    loVar3.f162982a |= 32768;
                    loVar3.f162993l = a2;
                }
            }
            C95311q.m157570d(this.f267277k, oVar.mo89203c(this.f267366f, new C95536k(this, this.f264705a.mo89241d(), this.f264705a.mo89242e(), nVar)));
        } else {
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
        long b = this.f264706b.mo26870b();
        long millis = TimeUnit.MINUTES.toMillis(1);
        C95516af afVar2 = afVar;
        TextUtils.equals(mo89430A(this.f267276j.f267947e, afVar2, this.f267364c, b).f266358a, mo89430A(this.f267276j.f267947e, afVar2, this.f267364c, b + millis).f266358a);
        return false;
    }

    /* renamed from: v */
    public final boolean mo89418v() {
        return this.f267366f != null && mo89431E();
    }

    /* renamed from: w */
    public final boolean mo89419w() {
        return this.f267366f != null && !mo89431E();
    }
}
