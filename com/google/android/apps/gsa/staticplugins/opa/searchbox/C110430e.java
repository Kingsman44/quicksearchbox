package com.google.android.apps.gsa.staticplugins.opa.searchbox;

import android.content.Context;
import android.graphics.Paint;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.searchbox.p6960ui.C88705f;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88695d;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88800ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.SuggestionActionView;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.SuggestionViewWithActions;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.p4567m.C60254a;
import com.google.common.p4552o.p4567m.C60255b;
import com.google.common.p4552o.p4567m.C60257d;
import com.google.common.p4552o.p4567m.C60259f;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54238b;
import com.google.p4017at.p4060h.p4073d.p4074a.C54248l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.searchbox.e */
/* compiled from: PG */
public final class C110430e extends C88728ak implements C89200e, C89199d {

    /* renamed from: a */
    private final Context f307842a;

    /* renamed from: b */
    private C88710k f307843b;

    /* renamed from: c */
    private int f307844c;

    /* renamed from: d */
    private boolean f307845d;

    /* renamed from: e */
    private boolean f307846e;

    /* renamed from: f */
    private final C88695d f307847f;

    /* renamed from: t */
    private final int f307848t;

    /* renamed from: u */
    private final boolean f307849u;

    /* renamed from: v */
    private int f307850v;

    public C110430e(Context context, C88695d dVar, boolean z) {
        this.f307842a = context;
        this.f307847f = dVar;
        this.f307848t = context.getResources().getDimensionPixelSize(R.dimen.line_two_text_size);
        this.f307849u = z;
    }

    /* renamed from: n */
    private final void m183929n(Suggestion suggestion, SuggestionViewWithActions suggestionViewWithActions, boolean z) {
        Suggestion suggestion2 = suggestion;
        C58480gp gpVar = new C58480gp(4);
        C54248l lVar = suggestion2.f108906A.f142338j;
        if (lVar == null) {
            lVar = C54248l.f142431m;
        }
        int i = 0;
        for (C54238b bVar : lVar.f142443k) {
            String str = bVar.f142403c;
            String str2 = bVar.f142404d;
            if (z) {
                int i2 = i + 1;
                SuggestionActionView p = suggestionViewWithActions.mo82573p(i, str2);
                p.f240373c.mo82564g(str, (String) null, this.f240008n);
                p.f240371a.setText(bVar.f142402b);
                p.mo82556b((String) null);
                i = i2;
            } else {
                SuggestionViewWithActions suggestionViewWithActions2 = suggestionViewWithActions;
            }
            C60254a aVar = (C60254a) C60255b.f163024g.createBuilder();
            int a = C60257d.m92557a(bVar.f142405e);
            if (a == 0) {
                a = 1;
            }
            aVar.copyOnWrite();
            C60255b bVar2 = (C60255b) aVar.instance;
            bVar2.f163027b = a - 1;
            bVar2.f163026a = 1 | bVar2.f163026a;
            aVar.copyOnWrite();
            C60255b bVar3 = (C60255b) aVar.instance;
            str2.getClass();
            bVar3.f163026a |= 8;
            bVar3.f163030e = str2;
            if ((bVar.f142401a & 16) != 0) {
                String str3 = bVar.f142406f;
                aVar.copyOnWrite();
                C60255b bVar4 = (C60255b) aVar.instance;
                str3.getClass();
                bVar4.f163026a |= 2;
                bVar4.f163028c = str3;
            }
            if ((bVar.f142401a & 64) != 0) {
                String str4 = bVar.f142408h;
                aVar.copyOnWrite();
                C60255b bVar5 = (C60255b) aVar.instance;
                str4.getClass();
                bVar5.f163026a |= 16;
                bVar5.f163031f = str4;
            }
            if ((bVar.f142401a & 32) != 0) {
                C60259f fVar = bVar.f142407g;
                if (fVar == null) {
                    fVar = C60259f.f163033a;
                }
                aVar.copyOnWrite();
                C60255b bVar6 = (C60255b) aVar.instance;
                fVar.getClass();
                bVar6.f163029d = fVar;
                bVar6.f163026a |= 4;
            }
            gpVar.mo55395g((C60255b) aVar.build());
        }
        C58485gu f = gpVar.mo55394f();
        if (!f.isEmpty()) {
            suggestion2.f108921v = f;
            suggestion2.f108922w = 3;
        }
        if ((lVar.f142433a & 1) != 0) {
            suggestion2.f108918s = lVar.f142434b;
        }
        if ((lVar.f142433a & 2048) != 0) {
            suggestion2.f108920u = lVar.f142444l;
        }
    }

    /* renamed from: o */
    private final void m183930o(Suggestion suggestion, C88803an anVar) {
        if (!C88727aj.m143678F(suggestion)) {
            this.f240011q.mo82458Z(mo82470hN(suggestion), anVar, this.f307850v, this.f307844c);
        }
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 46;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        C54228aq o = C88727aj.m143706o(suggestion);
        if (o == null || (o.f142330a & 64) == 0 || this.f307849u) {
            return 57;
        }
        C54248l lVar = o.f142338j;
        if (lVar == null) {
            lVar = C54248l.f142431m;
        }
        return !lVar.f142435c.isEmpty() ? 59 : 57;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        mo82185d((C88715p) obj);
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f307842a.getResources().getString(R.string.query_suggestion_content_description, new Object[]{mo82470hN(suggestion)});
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        if (suggestion.f108925z.contains(39) || suggestion.f108925z.contains(136)) {
            this.f240011q.mo82453B(this.f307842a.getResources().getString(R.string.remove_psuggest_title), Html.fromHtml(this.f307842a.getResources().getString(R.string.remove_psuggest_message, new Object[]{Html.escapeHtml(suggestion.mo44269v())})), suggestion, this);
            return true;
        }
        this.f240011q.mo82469z(R.string.entity_suggestion_message, suggestion, true);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        SuggestionViewWithActions suggestionViewWithActions;
        String str;
        int g;
        Suggestion suggestion2 = suggestion;
        C88803an anVar2 = anVar;
        int c = C88727aj.m143699c(suggestion2, suggestion2.f108925z.contains(39) ? f240005k : R.drawable.quantum_ic_google_assistant_white_24);
        int a = C88727aj.m143696a(suggestion2, f240003i);
        C54228aq o = C88727aj.m143706o(suggestion);
        int i = o.f142330a & 64;
        if (i == 0 || this.f307849u) {
            if (i != 0) {
                C54248l lVar = o.f142338j;
                if (lVar == null) {
                    lVar = C54248l.f142431m;
                }
                anVar2.mo82350d(Html.fromHtml(lVar.f142440h), 3);
            } else {
                anVar2.mo82587v(C88727aj.m143704m(suggestion.mo44268u(), suggestion2, this.f307843b));
            }
            anVar2.mo82349c(0).mo82561d(c, a, false);
            m183930o(suggestion, anVar);
            return true;
        }
        C54248l lVar2 = o.f142338j;
        if (lVar2 == null) {
            lVar2 = C54248l.f142431m;
        }
        String str2 = lVar2.f142440h;
        C54248l lVar3 = o.f142338j;
        String str3 = (lVar3 == null ? C54248l.f142431m : lVar3).f142435c;
        if (lVar3 == null) {
            lVar3 = C54248l.f142431m;
        }
        String str4 = lVar3.f142439g;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        anVar2.mo82350d(Html.fromHtml(str2), 3);
        if (!TextUtils.isEmpty(str3)) {
            if (suggestion2.f108925z.contains(175)) {
                Spanned fromHtml = Html.fromHtml(str3);
                String obj = fromHtml.toString();
                anVar2.mo82546i(fromHtml, 4);
                if (this.f307846e && (g = anVar.mo82544g()) > 0) {
                    Paint paint = new Paint();
                    paint.setTextSize((float) this.f307848t);
                    double measureText = (double) ((int) paint.measureText(obj));
                    double d = (double) g;
                    Double.isNaN(measureText);
                    Double.isNaN(d);
                    this.f307847f.mo82396a((int) Math.ceil(measureText / d), obj);
                }
            } else {
                anVar2.mo82546i(Html.fromHtml(str3), 3);
            }
        }
        if (C88727aj.m143685M(str4)) {
            C88800ak c2 = anVar2.mo82349c(0);
            C88705f fVar = this.f240008n;
            C54228aq o2 = C88727aj.m143706o(suggestion);
            if (o2 == null || (o2.f142330a & 64) == 0) {
                str = null;
            } else {
                C54248l lVar4 = o2.f142338j;
                if (lVar4 == null) {
                    lVar4 = C54248l.f142431m;
                }
                str = lVar4.f142441i;
            }
            c2.mo82568k(str4, fVar, str, ImageView.ScaleType.FIT_CENTER, 5, 0, c, 0, (!suggestion2.f108925z.contains(199) || !this.f307845d) ? 0 : -1);
            suggestionViewWithActions = null;
        } else {
            suggestionViewWithActions = null;
            anVar2.mo82349c(0).mo82561d(c, a, false);
        }
        if (anVar.mo82584r() == 12 || anVar.mo82584r() == 13) {
            SuggestionViewWithActions suggestionViewWithActions2 = (SuggestionViewWithActions) anVar2;
            anVar2.mo82349c(-1).mo82562e(R.drawable.quantum_ic_keyboard_arrow_down_grey600_24, f240003i, this.f307842a.getResources().getString(R.string.accessibility_expand));
            if (m143730u(suggestion)) {
                suggestionViewWithActions2.mo82576y();
                m183929n(suggestion2, suggestionViewWithActions2, true);
                suggestionViewWithActions2.mo82575x(false);
            }
            return true;
        }
        m183929n(suggestion2, suggestionViewWithActions, false);
        m183930o(suggestion, anVar);
        return true;
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f307850v = jVar.f239875ae;
        this.f307844c = jVar.f239876b;
        this.f307845d = jVar.f239897w;
        this.f307846e = jVar.f239898x;
        this.f240013s = jVar;
    }

    /* renamed from: hK */
    public final void mo82333hK(int i, View view, Suggestion suggestion, String str) {
        if (view instanceof SuggestionActionView) {
            if (i >= 0 && !TextUtils.isEmpty(str)) {
                this.f240012r.mo82414u(i);
                mo82472s(suggestion, view, str);
            }
        } else if (i == 1) {
            mo82475w(TextUtils.concat(new CharSequence[]{mo82470hN(suggestion), " "}));
            mo82472s(suggestion, view, "gsa::set_input_action");
        }
    }

    /* renamed from: hN */
    public final CharSequence mo82470hN(Suggestion suggestion) {
        C54228aq o = C88727aj.m143706o(suggestion);
        if (!(o == null || (o.f142330a & 64) == 0)) {
            C54248l lVar = o.f142338j;
            if (lVar == null) {
                lVar = C54248l.f142431m;
            }
            if ((lVar.f142433a & 4) != 0) {
                C54248l lVar2 = o.f142338j;
                if (lVar2 == null) {
                    lVar2 = C54248l.f142431m;
                }
                return lVar2.f142436d;
            }
        }
        return suggestion.mo44269v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo82334j() {
        return true;
    }

    /* renamed from: l */
    public final void mo82353l(C88715p pVar) {
        super.mo82185d(pVar);
        this.f307843b = pVar.f239938j;
    }

    /* renamed from: p */
    public final void mo82471p(int i, C88803an anVar, Suggestion suggestion) {
        if (i == -1) {
            SuggestionViewWithActions suggestionViewWithActions = (SuggestionViewWithActions) anVar;
            m183929n(suggestion, suggestionViewWithActions, true);
            suggestionViewWithActions.mo82575x(true);
        }
    }
}
