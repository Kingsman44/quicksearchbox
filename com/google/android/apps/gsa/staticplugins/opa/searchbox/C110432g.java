package com.google.android.apps.gsa.staticplugins.opa.searchbox;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
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
import com.google.p4017at.p4060h.p4073d.p4074a.C54254r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.searchbox.g */
/* compiled from: PG */
public final class C110432g extends C88728ak implements C89200e, C89199d {

    /* renamed from: a */
    private final C88692a f307851a;

    /* renamed from: b */
    private final Context f307852b;

    /* renamed from: c */
    private C88702c f307853c;

    /* renamed from: d */
    private C88710k f307854d;

    /* renamed from: e */
    private int f307855e;

    /* renamed from: f */
    private boolean f307856f;

    /* renamed from: t */
    private int f307857t;

    public C110432g(Context context, C88692a aVar) {
        this.f307852b = context;
        this.f307851a = aVar;
    }

    /* renamed from: n */
    private static int m183947n(Suggestion suggestion) {
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
    private final void m183948o(Suggestion suggestion, C88803an anVar) {
        anVar.mo82587v(C88727aj.m143704m(suggestion.mo44268u(), suggestion, this.f307854d));
        m183949q(suggestion, anVar);
        String[] P = C88727aj.m143688P(suggestion);
        String str = P[0];
        if (C88727aj.m143685M(str)) {
            C88800ak c = anVar.mo82349c(1);
            c.mo82558a(this.f307852b.getResources().getDimensionPixelSize(R.dimen.core_suggestion_action_button_visible_width));
            c.mo82567j(str, this.f240008n, P[1], ImageView.ScaleType.FIT_CENTER, 0);
        } else if (suggestion.f108925z.contains(111) && m183950r(suggestion)) {
            this.f240011q.mo82464t(anVar);
            anVar.mo82349c(1).mo82562e(m183947n(suggestion) == 1 ? R.drawable.ic_navigation : R.drawable.ic_action_directions_pressed, f240001g, this.f307852b.getResources().getString(R.string.navigation_action, new Object[]{suggestion.mo44269v()}));
        } else if (!C88727aj.m143678F(suggestion)) {
            this.f240011q.mo82458Z(suggestion.mo44269v(), anVar, this.f307857t, this.f307855e);
        }
        if (C89235z.m145122B(suggestion) && !C41670aj.m73085r(suggestion)) {
            anVar.mo82550m();
        }
    }

    /* renamed from: q */
    private final void m183949q(Suggestion suggestion, C88803an anVar) {
        int c = C88727aj.m143699c(suggestion, f240005k);
        int a = C88727aj.m143696a(suggestion, f240003i);
        String[] Q = C88727aj.m143689Q(suggestion);
        String str = Q[0];
        String p = C88727aj.m143707p(suggestion);
        if (!p.isEmpty()) {
            anVar.mo82349c(0).mo82563f(this.f240011q.mo82459i(c, Color.parseColor(p), false, 46), 5);
        } else if (C88727aj.m143685M(str)) {
            C88800ak c2 = anVar.mo82349c(0);
            c2.mo82567j(str, this.f240008n, Q[1], ImageView.ScaleType.FIT_CENTER, c);
        } else {
            anVar.mo82349c(0).mo82561d(c, a, false);
        }
    }

    /* renamed from: r */
    private static boolean m183950r(Suggestion suggestion) {
        if (!suggestion.mo44265s()) {
            return false;
        }
        C54254r rVar = suggestion.f108906A.f142336h;
        if (rVar == null) {
            rVar = C54254r.f142454c;
        }
        return (rVar.f142456a & 4) != 0;
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 35;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        if (this.f307853c.f239826a) {
            return 14;
        }
        if (C89235z.m145123C(suggestion)) {
            return 58;
        }
        return (!this.f307856f || !C88727aj.m143684L(suggestion)) ? 57 : 50;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        mo82185d((C88715p) obj);
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f307852b.getResources().getString(R.string.query_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        if (suggestion.f108925z.contains(114)) {
            this.f240011q.mo82468y(R.string.places_deletion_message, R.string.manage_places_url, (Suggestion) null, false, C88727aj.f239990a);
            return true;
        }
        this.f240011q.mo82453B(this.f307852b.getResources().getString(R.string.remove_psuggest_title), Html.fromHtml(this.f307852b.getResources().getString(R.string.remove_psuggest_message, new Object[]{Html.escapeHtml(suggestion.mo44269v())})), suggestion, this);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        int r = anVar.mo82584r();
        if (r == 1 || r == 49 || r == 57) {
            m183948o(suggestion, anVar);
        } else if (r == 2 || r == 58) {
            Spanned n = C88727aj.m143705n(suggestion, this.f307854d);
            if (n != null) {
                anVar.mo82588w(n);
            }
            m183948o(suggestion, anVar);
        } else if (r == 50) {
            anVar.mo82587v(C88727aj.m143704m(suggestion.mo44268u(), suggestion, this.f307854d));
            m183949q(suggestion, anVar);
            anVar.mo82349c(5).mo82562e(R.drawable.quantum_ic_keyboard_arrow_down_grey600_24, 0, this.f307852b.getResources().getString(R.string.accessibility_expand));
        } else {
            anVar.mo82587v(suggestion.mo44268u());
        }
        return true;
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f307857t = jVar.f239875ae;
        this.f307855e = jVar.f239876b;
        this.f307856f = jVar.f239880f;
        this.f240013s = jVar;
    }

    /* renamed from: hK */
    public final void mo82333hK(int i, View view, Suggestion suggestion, String str) {
        Spanned n;
        if (i == 5) {
            this.f307851a.mo82394c();
            mo82472s(suggestion, (View) null, "gsa::expand_action");
        } else if (i == 6) {
            this.f307851a.mo82393a();
            mo82472s(suggestion, (View) null, "gsa::collpase_action");
        } else if (i != 1) {
        } else {
            if (!suggestion.f108925z.contains(111) || !m183950r(suggestion)) {
                mo82475w(TextUtils.concat(new CharSequence[]{suggestion.mo44269v(), " "}));
                mo82472s(suggestion, view, "gsa::set_input_action");
                return;
            }
            StringBuilder sb = new StringBuilder("https://www.google.com/maps/search/");
            if (!m183950r(suggestion) || m183947n(suggestion) != 1) {
                sb.append("directions");
            } else {
                sb.append("navigate");
            }
            String replace = C88727aj.m143704m(suggestion.mo44268u(), suggestion, this.f307854d).toString().replace(" ", "+");
            sb.append("+");
            sb.append(replace);
            if (!suggestion.f108925z.contains(114) && (n = C88727aj.m143705n(suggestion, this.f307854d)) != null) {
                String replace2 = n.toString().replace(" ", "+");
                sb.append("+");
                sb.append(replace2);
            }
            mo82472s(suggestion, view, sb.toString());
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
        this.f307854d = pVar.f239938j;
        this.f307853c = pVar.f239944p;
    }
}
