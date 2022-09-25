package com.google.android.apps.gsa.staticplugins.opa.util;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.shared.C73869h;
import com.google.android.apps.gsa.assistant.shared.i.h;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106391p;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114532a;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114540i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58824ao;
import com.google.common.base.C58827ar;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60951j;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;
import p3186j$.util.DesugarDate;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.k */
/* compiled from: PG */
public final class C113880k implements C73869h {

    /* renamed from: a */
    public static final C59071e f315306a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.util.k");

    /* renamed from: b */
    public final SharedPreferences f315307b;

    /* renamed from: c */
    public final C68214a f315308c;

    /* renamed from: d */
    public final C21370a f315309d;

    /* renamed from: e */
    public final C68214a f315310e;

    /* renamed from: f */
    public final C68214a f315311f;

    /* renamed from: g */
    public final C68214a f315312g;

    /* renamed from: h */
    public final C68214a f315313h;

    /* renamed from: i */
    public final C68214a f315314i;

    /* renamed from: j */
    private final C22871g f315315j;

    public C113880k(C22871g gVar, SharedPreferences sharedPreferences, C68214a aVar, C21370a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7) {
        this.f315315j = gVar;
        this.f315307b = sharedPreferences;
        this.f315308c = aVar;
        this.f315309d = aVar2;
        this.f315310e = aVar3;
        this.f315311f = aVar4;
        this.f315312g = aVar5;
        this.f315313h = aVar6;
        this.f315314i = aVar7;
    }

    /* renamed from: d */
    public static String m188516d(LocalDate localDate) {
        return new SimpleDateFormat("yyyyMMdd", Locale.US).format(DesugarDate.from(localDate.atStartOfDay(C60951j.f165070a).toInstant()));
    }

    /* renamed from: a */
    public final C60870cx mo65344a(int i) {
        C60870cx g = C60922j.m93044g(((C114540i) this.f315310e.mo27525b()).mo101395e(), new C113878i(this, i), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: b */
    public final void mo65345b(e eVar) {
        Optional empty;
        C58976aa aaVar = C58975e.f156826a;
        long b = this.f315309d.mo26870b();
        long j = -1;
        long j2 = this.f315307b.getLong("assistant_latest_interaction_timestamp_millis", -1);
        if (j2 != -1) {
            j = j2;
        } else if (((C86124t) this.f315308c.mo27525b()).mo79746e(C90037cp.f248607dy)) {
            ((h) this.f315312g.mo27525b()).a(true);
        } else {
            ((C106391p) this.f315311f.mo27525b()).mo95498g(true);
        }
        if (b - j > C113785ba.f315124b) {
            this.f315307b.edit().putLong("assistant_latest_interaction_timestamp_millis", b).apply();
        }
        int i = this.f315307b.getInt("assistant_interaction_count", 0) + 1;
        this.f315307b.edit().putInt("assistant_interaction_count", i).apply();
        if (((C86124t) this.f315308c.mo27525b()).mo79743a(C90037cp.f248503be) != 0) {
            new C90873ag(((C114540i) this.f315310e.mo27525b()).mo101395e(), this.f315315j, "Reading opaActiveDates", new C113876g(this)).mo85223a(C113877h.f315302a);
        }
        if (((C86124t) this.f315308c.mo27525b()).mo79743a(C90037cp.f248503be) != 0) {
            C114540i iVar = (C114540i) this.f315310e.mo27525b();
            new C90873ag(C60922j.m93044g(iVar.f317634a.mo46042d(), new C114532a(eVar), iVar.f317635b), this.f315315j, "Reading opaActiveDatesForTriggerTypeFuture", new C113874e(this, eVar)).mo85223a(C113875f.f315300a);
        }
        C113785ba baVar = (C113785ba) this.f315313h.mo27525b();
        if (!((Boolean) baVar.f315126d.mo6453a()).booleanValue()) {
            if (baVar.f315128f.mo79746e(C90037cp.f248393A)) {
                empty = Optional.m71637of(Integer.valueOf(i));
            } else {
                return;
            }
        } else if (baVar.f315128f.mo79746e(C90037cp.f248560ci)) {
            empty = Optional.empty();
        } else {
            return;
        }
        baVar.mo100624a(empty);
    }

    /* renamed from: c */
    public final int mo100738c() {
        if (mo100740f()) {
            return this.f315307b.getInt("assistant_interaction_count", 0);
        }
        this.f315307b.edit().putInt("assistant_interaction_count", 0).apply();
        return 0;
    }

    /* renamed from: e */
    public final String mo100739e(String str) {
        ArrayList arrayList = new ArrayList(C58869cf.m90936b(new C58903m(',')).mo56151a().mo56155i(str));
        LocalDate localDate = Instant.ofEpochMilli(this.f315309d.mo26870b()).atZone(C60951j.f165070a).toLocalDate();
        String d = m188516d(localDate);
        C58976aa aaVar = C58975e.f156826a;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listIterator.add(d);
                break;
            }
            String str2 = (String) listIterator.previous();
            if (!d.equals(str2)) {
                if (d.compareTo(str2) > 0) {
                    listIterator.next();
                    listIterator.add(d);
                    break;
                }
            } else {
                return str;
            }
        }
        String d2 = m188516d(localDate.minusDays(((C86124t) this.f315308c.mo27525b()).mo79743a(C90037cp.f248503be)));
        ListIterator listIterator2 = arrayList.listIterator();
        while (listIterator2.hasNext()) {
            if (d2.compareTo((String) listIterator2.next()) >= 0) {
                listIterator2.remove();
            }
        }
        C58827ar arVar = new C58827ar(",");
        return new C58824ao(arVar, arVar).mo56097d(arrayList);
    }

    /* renamed from: f */
    public final boolean mo100740f() {
        return this.f315309d.mo26870b() - this.f315307b.getLong("assistant_latest_interaction_timestamp_millis", -1) < TimeUnit.DAYS.toMillis(((C86124t) this.f315308c.mo27525b()).mo79743a(C90014bt.f247403gW));
    }

    /* renamed from: g */
    public final boolean mo100741g() {
        long a = ((C86124t) this.f315308c.mo27525b()).mo79743a(C90014bt.f247700mB);
        if (a == 0) {
            a = 1;
        }
        if (((long) mo100738c()) >= a && mo100740f()) {
            return false;
        }
        return true;
    }
}
