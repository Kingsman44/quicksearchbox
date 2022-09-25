package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.graphics.Color;
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
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.ad */
/* compiled from: PG */
public final class C88721ad extends C88728ak implements C89200e, C89199d {

    /* renamed from: a */
    private final C88692a f239968a;

    /* renamed from: b */
    private final Context f239969b;

    /* renamed from: c */
    private C88702c f239970c;

    /* renamed from: d */
    private C88710k f239971d;

    /* renamed from: e */
    private boolean f239972e;

    /* renamed from: f */
    private String f239973f;

    /* renamed from: t */
    private Map f239974t;

    /* renamed from: u */
    private int f239975u;

    /* renamed from: v */
    private final int f239976v;

    /* renamed from: w */
    private final int f239977w;

    /* renamed from: x */
    private int f239978x;

    public C88721ad(Context context, C88692a aVar) {
        this.f239969b = context;
        this.f239968a = aVar;
        this.f239976v = C1878d.m5128a(context, f240002h);
        this.f239977w = C1878d.m5128a(context, f240004j);
    }

    /* renamed from: o */
    private final void m143664o(Suggestion suggestion, C88803an anVar) {
        anVar.mo82350d(C88727aj.m143704m(suggestion.mo44268u(), suggestion, this.f239971d), 3);
        mo82446n(suggestion, anVar);
        String[] P = C88727aj.m143688P(suggestion);
        String str = P[0];
        if (C88727aj.m143685M(str)) {
            C88800ak c = anVar.mo82349c(1);
            c.mo82558a(this.f239969b.getResources().getDimensionPixelSize(R.dimen.core_suggestion_action_button_visible_width));
            c.mo82567j(str, this.f240008n, P[1], ImageView.ScaleType.FIT_CENTER, 0);
        } else if (suggestion.f108925z.contains(143) || suggestion.f108925z.contains(454)) {
            this.f240011q.mo82464t(anVar);
        } else if (!C88727aj.m143678F(suggestion)) {
            this.f240011q.mo82458Z(suggestion.mo44269v(), anVar, this.f239978x, this.f239977w);
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
            C88727aj.m143709r((CoreSuggestionView) anVar, suggestion, this.f239975u);
        }
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 0;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        if (C89235z.m145125E(suggestion)) {
            return C89235z.m145123C(suggestion) ? 67 : 66;
        }
        if (this.f239970c.f239826a) {
            return 14;
        }
        if (C89235z.m145123C(suggestion)) {
            return 58;
        }
        return (!this.f239972e || !C88727aj.m143684L(suggestion)) ? 57 : 50;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        mo82185d((C88715p) obj);
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f239969b.getResources().getString(R.string.query_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        C54228aq aqVar = suggestion.f108906A;
        if (aqVar != null) {
            C54216ae aeVar = aqVar.f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            if ((aeVar.f142290a & 134217728) != 0) {
                this.f240011q.mo82467w(suggestion, R.string.regular_query_suggestion_message, this.f239974t);
                return true;
            }
        }
        if (!suggestion.f108925z.contains(179) || TextUtils.isEmpty(this.f239973f)) {
            if (suggestion.f108925z.contains(143)) {
                this.f240011q.mo82468y(R.string.trends_suggestion_message, R.string.trends_learn_more_url, suggestion, true, C88727aj.f239990a);
            } else if (suggestion.f108925z.contains(154)) {
                this.f240011q.mo82469z(R.string.onboarding_message, suggestion, true);
            } else if (suggestion.f108925z.contains(228)) {
                this.f240011q.mo82469z(R.string.vasco_suggestion_message, suggestion, true);
            } else {
                this.f240011q.mo82468y(R.string.regular_query_suggestion_message, R.string.regular_query_learn_more_url, suggestion, true, C88727aj.f239990a);
            }
            return true;
        }
        this.f240011q.mo82452A(this.f239973f, suggestion, true);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        int r = anVar.mo82584r();
        if (r == 1 || r == 49 || r == 57 || r == 66) {
            m143664o(suggestion, anVar);
        } else if (r == 15 || r == 2 || r == 58 || r == 67) {
            m143664o(suggestion, anVar);
            this.f240011q.mo82466v(suggestion, anVar, this.f239971d);
        } else if (r == 50) {
            anVar.mo82350d(C88727aj.m143704m(suggestion.mo44268u(), suggestion, this.f239971d), 3);
            mo82446n(suggestion, anVar);
            anVar.mo82349c(5).mo82562e(R.drawable.quantum_ic_keyboard_arrow_down_grey600_24, 0, this.f239969b.getResources().getString(R.string.accessibility_expand));
        } else {
            anVar.mo82587v(suggestion.mo44268u());
        }
        return true;
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f239978x = jVar.f239875ae;
        this.f239972e = jVar.f239880f;
        this.f239973f = jVar.f239858O;
        this.f239974t = C89988b.f246752a.mo85086b(jVar.f239860Q);
        this.f239975u = jVar.f239865V;
        this.f240013s = jVar;
    }

    /* renamed from: hK */
    public final void mo82333hK(int i, View view, Suggestion suggestion, String str) {
        if (i == 5) {
            this.f239968a.mo82394c();
            mo82472s(suggestion, (View) null, "gsa::expand_action");
        } else if (i == 6) {
            this.f239968a.mo82393a();
            mo82472s(suggestion, (View) null, "gsa::collpase_action");
        } else if (i == 1) {
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
        this.f239971d = pVar.f239938j;
        this.f239970c = pVar.f239944p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo82446n(Suggestion suggestion, C88803an anVar) {
        int e = C88727aj.m143700e(suggestion, f240006l, this.f239975u);
        int b = C88727aj.m143698b(suggestion, this.f239976v, this.f239975u);
        String p = C88727aj.m143707p(suggestion);
        if (!p.isEmpty()) {
            anVar.mo82349c(0).mo82563f(this.f240011q.mo82459i(e, Color.parseColor(p), false, 46), 5);
            return;
        }
        String[] Q = C88727aj.m143689Q(suggestion);
        String str = Q[0];
        if (C88727aj.m143685M(str)) {
            anVar.mo82349c(0).mo82567j(str, this.f240008n, Q[1], ImageView.ScaleType.FIT_CENTER, e);
        } else if (suggestion.f108925z.contains(143) && !suggestion.f108925z.contains(454)) {
            anVar.mo82349c(0).mo82561d(C88727aj.m143699c(suggestion, R.drawable.ic_trending_up), b, false);
        } else if (C88727aj.m143679G(suggestion)) {
            anVar.mo82349c(0).mo82561d(e, b, false);
        } else {
            anVar.mo82349c(0).mo82561d(e, b, false);
        }
    }
}
