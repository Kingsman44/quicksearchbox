package com.google.android.apps.gsa.staticplugins.searchboxroot;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.c */
/* compiled from: PG */
public final class C116843c {

    /* renamed from: a */
    public final C86124t f324296a;

    /* renamed from: b */
    public final int f324297b;

    /* renamed from: c */
    public final int f324298c;

    /* renamed from: d */
    public final int f324299d;

    /* renamed from: e */
    private final int f324300e;

    /* renamed from: f */
    private final int f324301f;

    public C116843c(Context context, C86124t tVar) {
        this.f324296a = tVar;
        Resources resources = context.getResources();
        this.f324300e = resources.getInteger(R.integer.min_web_suggestions);
        this.f324297b = resources.getInteger(R.integer.max_total_suggestions);
        this.f324298c = resources.getInteger(R.integer.max_displayed_summons_in_results_suggest);
        this.f324299d = resources.getInteger(R.integer.suggestion_strip_count);
        this.f324301f = (int) tVar.mo79743a(C90085ej.f250137aN);
    }

    /* renamed from: a */
    public final int mo103031a(List list, C88616t tVar) {
        boolean z = true;
        if (tVar.f239556a.mo84406cm()) {
            Iterator it = list.iterator();
            boolean z2 = false;
            int i = 0;
            boolean z3 = false;
            while (it.hasNext()) {
                int intValue = ((RootSuggestion) it.next()).f108915p.intValue();
                i |= intValue == C41669ai.f108958g.intValue() ? 1 : 0;
                z2 |= intValue == C41669ai.f108953b.intValue();
                z3 |= intValue == C41669ai.f108957f.intValue();
            }
            if (z2) {
                i++;
            }
            if (z3) {
                i++;
            }
            if (i > 0) {
                return (this.f324301f + 2) - i;
            }
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (!C41669ai.f108954c.equals(((RootSuggestion) it2.next()).f108915p)) {
                i2++;
            }
        }
        if (!tVar.f239556a.mo84352bk().isEmpty()) {
            if (this.f324296a.mo79746e(C90085ej.f250221bw)) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (((RootSuggestion) it3.next()).f108910k == 84) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
        }
        if (i2 <= 0) {
            return Integer.MAX_VALUE;
        }
        if (z) {
            return this.f324300e;
        }
        return (int) this.f324296a.mo79743a(C90085ej.f250138aO);
    }
}
