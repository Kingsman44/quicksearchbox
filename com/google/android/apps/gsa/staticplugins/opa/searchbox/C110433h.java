package com.google.android.apps.gsa.staticplugins.opa.searchbox;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.searchbox.p6960ui.C88702c;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88692a;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88800ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.searchbox.h */
/* compiled from: PG */
public final class C110433h extends C88728ak implements C89200e, C89199d {

    /* renamed from: a */
    private final C88692a f307858a;

    /* renamed from: b */
    private final Context f307859b;

    /* renamed from: c */
    private C88702c f307860c;

    /* renamed from: d */
    private C88710k f307861d;

    /* renamed from: e */
    private int f307862e;

    /* renamed from: f */
    private boolean f307863f;

    /* renamed from: t */
    private String f307864t;

    /* renamed from: u */
    private int f307865u;

    public C110433h(Context context, C88692a aVar) {
        this.f307859b = context;
        this.f307858a = aVar;
    }

    /* renamed from: n */
    private final void m183962n(Suggestion suggestion, C88803an anVar) {
        anVar.mo82350d(C88727aj.m143704m(suggestion.mo44268u(), suggestion, this.f307861d), 3);
        m183963o(suggestion, anVar);
        String[] P = C88727aj.m143688P(suggestion);
        String str = P[0];
        if (C88727aj.m143685M(str)) {
            C88800ak c = anVar.mo82349c(1);
            c.mo82558a(this.f307859b.getResources().getDimensionPixelSize(R.dimen.core_suggestion_action_button_visible_width));
            c.mo82567j(str, this.f240008n, P[1], ImageView.ScaleType.FIT_CENTER, 0);
        } else if (suggestion.f108925z.contains(143)) {
            this.f240011q.mo82464t(anVar);
        } else if (!C88727aj.m143678F(suggestion)) {
            this.f240011q.mo82458Z(suggestion.mo44269v(), anVar, this.f307865u, this.f307862e);
        }
        if (C89235z.m145122B(suggestion) && !C41670aj.m73085r(suggestion)) {
            anVar.mo82550m();
        }
    }

    /* renamed from: o */
    private final void m183963o(Suggestion suggestion, C88803an anVar) {
        int c = C88727aj.m143699c(suggestion, R.drawable.quantum_ic_google_assistant_white_24);
        int a = C88727aj.m143696a(suggestion, f240003i);
        String p = C88727aj.m143707p(suggestion);
        if (!p.isEmpty()) {
            anVar.mo82349c(0).mo82563f(this.f240011q.mo82459i(c, Color.parseColor(p), false, 46), 5);
            return;
        }
        String[] Q = C88727aj.m143689Q(suggestion);
        String str = Q[0];
        if (!C88727aj.m143685M(str)) {
            for (Integer intValue : suggestion.f108925z) {
                if (intValue.intValue() == 143) {
                    anVar.mo82349c(0).mo82561d(C88727aj.m143699c(suggestion, R.drawable.ic_trending_up), a, false);
                    return;
                }
            }
            if (C88727aj.m143679G(suggestion)) {
                anVar.mo82349c(0).mo82561d(c, a, false);
            } else {
                anVar.mo82349c(0).mo82561d(c, a, false);
            }
        } else {
            anVar.mo82349c(0).mo82567j(str, this.f240008n, Q[1], ImageView.ScaleType.FIT_CENTER, c);
        }
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 0;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        if (this.f307860c.f239826a) {
            return 14;
        }
        if (C89235z.m145123C(suggestion)) {
            return 58;
        }
        return (!this.f307863f || !C88727aj.m143684L(suggestion)) ? 57 : 50;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        mo82185d((C88715p) obj);
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f307859b.getResources().getString(R.string.query_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        if (suggestion.f108925z.contains(179) && !TextUtils.isEmpty(this.f307864t)) {
            this.f240011q.mo82452A(this.f307864t, suggestion, true);
        } else if (suggestion.f108925z.contains(143)) {
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

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        int r = anVar.mo82584r();
        if (r == 1 || r == 49 || r == 57) {
            m183962n(suggestion, anVar);
        } else if (r == 15 || r == 2 || r == 58) {
            m183962n(suggestion, anVar);
            Spanned n = C88727aj.m143705n(suggestion, this.f307861d);
            if (n != null) {
                anVar.mo82588w(n);
            }
            if (C88727aj.m143681I(suggestion)) {
                Drawable drawable = this.f307859b.getResources().getDrawable(C88727aj.m143691S(suggestion), (Resources.Theme) null);
                drawable.setColorFilter(f240003i, PorterDuff.Mode.SRC_ATOP);
                anVar.mo82548k(drawable);
            }
        } else if (r == 50) {
            anVar.mo82350d(C88727aj.m143704m(suggestion.mo44268u(), suggestion, this.f307861d), 3);
            m183963o(suggestion, anVar);
            anVar.mo82349c(5).mo82562e(R.drawable.quantum_ic_keyboard_arrow_down_grey600_24, 0, this.f307859b.getResources().getString(R.string.accessibility_expand));
        } else {
            anVar.mo82587v(suggestion.mo44268u());
        }
        return true;
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f307865u = jVar.f239875ae;
        this.f307862e = jVar.f239876b;
        this.f307863f = jVar.f239880f;
        this.f307864t = jVar.f239858O;
        this.f240013s = jVar;
    }

    /* renamed from: hK */
    public final void mo82333hK(int i, View view, Suggestion suggestion, String str) {
        if (i == 5) {
            this.f307858a.mo82394c();
            mo82472s(suggestion, (View) null, "gsa::expand_action");
        } else if (i == 6) {
            this.f307858a.mo82393a();
            mo82472s(suggestion, (View) null, "gsa::collpase_action");
        } else if (i == 1) {
            mo82475w(TextUtils.concat(new CharSequence[]{suggestion.mo44269v(), " "}));
            mo82472s(suggestion, (View) null, "gsa::set_input_action");
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
        this.f307861d = pVar.f239938j;
        this.f307860c = pVar.f239944p;
    }
}
