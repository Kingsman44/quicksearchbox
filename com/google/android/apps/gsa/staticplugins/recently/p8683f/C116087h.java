package com.google.android.apps.gsa.staticplugins.recently.p8683f;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.staticplugins.recently.p8682e.C116073a;
import com.google.android.apps.gsa.staticplugins.recently.p8682e.C116076d;
import com.google.android.apps.gsa.staticplugins.recently.p8684g.C116091b;
import com.google.android.apps.gsa.staticplugins.recently.timeline.C116201d;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Group;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1875j.C22840k;
import com.google.android.libraries.gsa.p1875j.C22845p;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.f.h */
/* compiled from: PG */
public final class C116087h extends C116076d {

    /* renamed from: b */
    private final Context f321882b;

    /* renamed from: c */
    private final SharedPreferences f321883c;

    /* renamed from: d */
    private final C86124t f321884d;

    public C116087h(Context context, SharedPreferences sharedPreferences, C86124t tVar) {
        this.f321882b = context;
        this.f321883c = sharedPreferences;
        this.f321884d = tVar;
    }

    /* renamed from: e */
    public static final boolean m192468e(C22845p pVar) {
        int a = C22840k.m42693a(pVar.f62894c);
        if (a != 0 && a == 4) {
            return true;
        }
        int i = pVar.f62894c;
        int a2 = C22840k.m42693a(i);
        if (a2 != 0 && a2 == 5) {
            return true;
        }
        int a3 = C22840k.m42693a(i);
        if (a3 != 0 && a3 == 6) {
            return true;
        }
        int a4 = C22840k.m42693a(i);
        if (a4 != 0 && a4 == 7) {
            return true;
        }
        int a5 = C22840k.m42693a(i);
        return a5 != 0 && a5 == 8;
    }

    /* renamed from: f */
    public static final void m192469f(SharedPreferences.Editor editor, boolean z) {
        editor.putBoolean("onboarding_removed_recents", z).putBoolean("onboarding_removed_find_that_page", z).putBoolean("onboarding_removed_compare", z).putBoolean("onboarding_removed_swipe_up", z).putBoolean("onboarding_removed_search_on", z);
    }

    /* renamed from: h */
    public static final boolean m192471h(Group group) {
        return m192468e(group.f322177h[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo102461a() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo102462b(List list) {
        long j = this.f321883c.getLong("onboarding_timestamp", 0);
        if (j == 0) {
            j = System.currentTimeMillis();
            this.f321883c.edit().putLong("onboarding_timestamp", j).apply();
        }
        C116201d dVar = null;
        if (System.currentTimeMillis() - j <= TimeUnit.DAYS.toMillis(this.f321884d.mo79743a(C90110fh.f250671ba))) {
            C116201d dVar2 = new C116201d();
            dVar2.f322182a = this.f321882b.getResources().getString(R.string.recently_onboarding_query);
            dVar2.f322183b = C116091b.m192482b(this.f321882b, j, System.currentTimeMillis());
            dVar2.f322184c = j;
            dVar2.f322185d = R.drawable.onboarding_icon;
            dVar2.f322188g = true;
            if (!this.f321883c.getBoolean("onboarding_removed_recents", false)) {
                dVar2.mo102559c(m192455c(4));
            }
            if (!this.f321883c.getBoolean("onboarding_removed_find_that_page", false)) {
                dVar2.mo102559c(m192455c(5));
            }
            if (!this.f321883c.getBoolean("onboarding_removed_compare", false)) {
                dVar2.mo102559c(m192455c(6));
            }
            if (!this.f321883c.getBoolean("onboarding_removed_swipe_up", false)) {
                dVar2.mo102559c(m192455c(7));
            }
            if (!this.f321883c.getBoolean("onboarding_removed_search_on", false)) {
                dVar2.mo102559c(m192455c(8));
            }
            if (dVar2.mo102557a() != 0) {
                dVar = dVar2;
            }
        }
        if (dVar != null) {
            for (int i = 0; i < list.size(); i++) {
                if (((C116201d) list.get(i)).f322184c < dVar.f322184c) {
                    list.add(i, dVar);
                    return;
                }
            }
            list.add(dVar);
        }
    }

    /* renamed from: d */
    public final void mo102474d(C116086g gVar) {
        SharedPreferences.Editor edit = this.f321883c.edit();
        gVar.mo102473a(edit);
        edit.apply();
        C116073a aVar = this.f321867a;
        if (aVar != null) {
            aVar.f321858a.mo102460e();
        }
    }

    /* renamed from: g */
    public static final void m192470g(SharedPreferences.Editor editor, C22845p pVar, boolean z) {
        int a = C22840k.m42693a(pVar.f62894c);
        if (a != 0 && a == 4) {
            editor.putBoolean("onboarding_removed_recents", z);
        }
        int a2 = C22840k.m42693a(pVar.f62894c);
        if (a2 != 0 && a2 == 5) {
            editor.putBoolean("onboarding_removed_find_that_page", z);
        }
        int a3 = C22840k.m42693a(pVar.f62894c);
        if (a3 != 0 && a3 == 6) {
            editor.putBoolean("onboarding_removed_compare", z);
        }
        int a4 = C22840k.m42693a(pVar.f62894c);
        if (a4 != 0 && a4 == 7) {
            editor.putBoolean("onboarding_removed_swipe_up", z);
        }
        int a5 = C22840k.m42693a(pVar.f62894c);
        if (a5 != 0 && a5 == 8) {
            editor.putBoolean("onboarding_removed_search_on", z);
        }
    }
}
