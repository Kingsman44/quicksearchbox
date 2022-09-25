package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.graphics.Color;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.searchbox.p6960ui.C88702c;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88692a;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88800ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.CoreSuggestionView;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.EnhancementSuggestionView;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54254r;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.aa */
/* compiled from: PG */
public final class C88718aa extends C88728ak implements C89200e, C89199d {

    /* renamed from: a */
    private final C88692a f239954a;

    /* renamed from: b */
    private final Context f239955b;

    /* renamed from: c */
    private C88702c f239956c;

    /* renamed from: d */
    private C88710k f239957d;

    /* renamed from: e */
    private final int f239958e;

    /* renamed from: f */
    private final int f239959f;

    /* renamed from: t */
    private int f239960t = -1;

    /* renamed from: u */
    private int f239961u;

    public C88718aa(Context context, C88692a aVar) {
        this.f239955b = context;
        this.f239954a = aVar;
        this.f239958e = C1878d.m5128a(context, f240002h);
        this.f239959f = C1878d.m5128a(context, f240004j);
    }

    /* renamed from: n */
    private static int m143633n(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return 0;
        }
        C54254r rVar = suggestion.f108906A.f142336h;
        if (rVar == null) {
            rVar = C54254r.f142454c;
        }
        return rVar.f142457b;
    }

    /* renamed from: o */
    private final void m143634o(Suggestion suggestion, C88803an anVar) {
        anVar.mo82587v(C88727aj.m143704m(suggestion.mo44268u(), suggestion, this.f239957d));
        m143635q(suggestion, anVar);
        String[] P = C88727aj.m143688P(suggestion);
        String str = P[0];
        if (C88727aj.m143685M(str)) {
            C88800ak c = anVar.mo82349c(1);
            c.mo82558a(this.f239955b.getResources().getDimensionPixelSize(R.dimen.core_suggestion_action_button_visible_width));
            c.mo82567j(str, this.f240008n, P[1], ImageView.ScaleType.FIT_CENTER, 0);
        } else if (suggestion.f108925z.contains(111) && m143636r(suggestion)) {
            this.f240011q.mo82464t(anVar);
            anVar.mo82349c(1).mo82562e(m143633n(suggestion) == 1 ? R.drawable.ic_navigation : R.drawable.ic_action_directions_pressed, f240001g, this.f239955b.getResources().getString(R.string.navigation_action, new Object[]{suggestion.mo44269v()}));
        } else if (!C88727aj.m143678F(suggestion) && !C88727aj.m143678F(suggestion)) {
            this.f240011q.mo82458Z(suggestion.mo44269v(), anVar, this.f239961u, this.f239959f);
        }
        this.f240011q.mo82465u(suggestion, anVar, C88727aj.m143690R(suggestion));
        if (C89235z.m145122B(suggestion) && !C41670aj.m73085r(suggestion)) {
            anVar.mo82550m();
        }
        if (suggestion.mo44265s() && (anVar.mo82584r() == 66 || anVar.mo82584r() == 67)) {
            EnhancementSuggestionView enhancementSuggestionView = (EnhancementSuggestionView) anVar;
            C54228aq aqVar = suggestion.f108906A;
            aqVar.getClass();
            C54216ae aeVar = aqVar.f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            enhancementSuggestionView.mo82551n(aeVar.f142288B);
        } else if (C88727aj.m143683K(suggestion)) {
            C88727aj.m143709r((CoreSuggestionView) anVar, suggestion, this.f239960t);
        }
    }

    /* renamed from: q */
    private final void m143635q(Suggestion suggestion, C88803an anVar) {
        int e = C88727aj.m143700e(suggestion, f240005k, this.f239960t);
        int b = C88727aj.m143698b(suggestion, this.f239958e, this.f239960t);
        String[] Q = C88727aj.m143689Q(suggestion);
        String str = Q[0];
        String p = C88727aj.m143707p(suggestion);
        if (!p.isEmpty()) {
            anVar.mo82349c(0).mo82563f(this.f240011q.mo82459i(e, Color.parseColor(p), false, 46), 5);
        } else if (C88727aj.m143685M(str)) {
            anVar.mo82349c(0).mo82567j(str, this.f240008n, Q[1], ImageView.ScaleType.FIT_CENTER, e);
        } else {
            anVar.mo82349c(0).mo82561d(e, b, false);
        }
    }

    /* renamed from: r */
    private static boolean m143636r(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return false;
        }
        C54254r rVar = suggestion.f108906A.f142336h;
        if (rVar == null) {
            rVar = C54254r.f142454c;
        }
        return (rVar.f142456a & 4) != 0;
    }

    /* renamed from: x */
    private static boolean m143637x(Suggestion suggestion) {
        return !suggestion.f108925z.contains(114);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 35;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        if (C89235z.m145125E(suggestion)) {
            return C89235z.m145123C(suggestion) ? 67 : 66;
        }
        if (this.f239956c.f239826a) {
            return 14;
        }
        if (C89235z.m145123C(suggestion)) {
            return 58;
        }
        return C88727aj.m143684L(suggestion) ? 50 : 57;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        mo82185d((C88715p) obj);
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f239955b.getResources().getString(R.string.query_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        if (m143637x(suggestion)) {
            this.f240011q.mo82454C(suggestion, this);
            return true;
        }
        this.f240011q.mo82468y(R.string.places_deletion_message, R.string.manage_places_url, (Suggestion) null, false, C88727aj.f239990a);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        int r = anVar.mo82584r();
        if (r == 1 || r == 49 || r == 57 || r == 66) {
            m143634o(suggestion, anVar);
        } else if (r == 2 || r == 58 || r == 67) {
            m143634o(suggestion, anVar);
            this.f240011q.mo82466v(suggestion, anVar, this.f239957d);
        } else if (r == 50) {
            anVar.mo82587v(C88727aj.m143704m(suggestion.mo44268u(), suggestion, this.f239957d));
            m143635q(suggestion, anVar);
            anVar.mo82349c(5).mo82562e(R.drawable.quantum_ic_keyboard_arrow_down_grey600_24, 0, this.f239955b.getResources().getString(R.string.accessibility_expand));
        } else {
            anVar.mo82587v(suggestion.mo44268u());
        }
        return true;
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f239961u = jVar.f239875ae;
        this.f239960t = jVar.f239865V;
        this.f240013s = jVar;
    }

    /* renamed from: hK */
    public final void mo82333hK(int i, View view, Suggestion suggestion, String str) {
        Spanned n;
        if (i == 5) {
            this.f239954a.mo82394c();
            mo82472s(suggestion, (View) null, "gsa::expand_action");
        } else if (i == 6) {
            this.f239954a.mo82393a();
            mo82472s(suggestion, (View) null, "gsa::collpase_action");
        } else if (i == 1) {
            if (suggestion.f108925z.contains(111) && m143636r(suggestion)) {
                StringBuilder sb = new StringBuilder("https://www.google.com/maps/search/");
                if (!m143636r(suggestion) || m143633n(suggestion) != 1) {
                    sb.append("directions");
                } else {
                    sb.append("navigate");
                }
                String replaceAll = C88727aj.m143704m(suggestion.mo44268u(), suggestion, this.f239957d).toString().replaceAll(" ", "+");
                sb.append("+");
                sb.append(replaceAll);
                if (m143637x(suggestion) && (n = C88727aj.m143705n(suggestion, this.f239957d)) != null) {
                    String replaceAll2 = n.toString().replaceAll(" ", "+");
                    sb.append("+");
                    sb.append(replaceAll2);
                }
                mo82472s(suggestion, view, sb.toString());
            }
            mo82475w(TextUtils.concat(new CharSequence[]{suggestion.mo44269v(), " "}));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo82334j() {
        return true;
    }

    /* renamed from: l */
    public final void mo82353l(C88715p pVar) {
        super.mo82185d(pVar);
        this.f239957d = pVar.f239938j;
        this.f239956c = pVar.f239944p;
    }
}
