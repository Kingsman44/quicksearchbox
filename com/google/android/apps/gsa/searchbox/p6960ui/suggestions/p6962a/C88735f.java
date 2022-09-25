package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.graphics.Paint;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6960ui.C88705f;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88695d;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88800ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88819c;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.CoreSuggestionView;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.EnhancementSuggestionView;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.SuggestionActionView;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.SuggestionViewWithActions;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.p4567m.C60254a;
import com.google.common.p4552o.p4567m.C60255b;
import com.google.common.p4552o.p4567m.C60257d;
import com.google.common.p4552o.p4567m.C60259f;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54238b;
import com.google.p4017at.p4060h.p4073d.p4074a.C54248l;
import com.google.protobuf.C62963cj;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.f */
/* compiled from: PG */
public final class C88735f extends C88728ak implements C89200e, C89199d {

    /* renamed from: A */
    private int f240037A;

    /* renamed from: B */
    private int f240038B;

    /* renamed from: a */
    private final int f240039a;

    /* renamed from: b */
    private final Context f240040b;

    /* renamed from: c */
    private final C88695d f240041c;

    /* renamed from: d */
    private C88710k f240042d;

    /* renamed from: e */
    private boolean f240043e;

    /* renamed from: f */
    private boolean f240044f;

    /* renamed from: t */
    private Map f240045t;

    /* renamed from: u */
    private boolean f240046u;

    /* renamed from: v */
    private int f240047v = -1;

    /* renamed from: w */
    private final int f240048w;

    /* renamed from: x */
    private final int f240049x;

    /* renamed from: y */
    private int f240050y;

    /* renamed from: z */
    private boolean f240051z;

    public C88735f(Context context, C88695d dVar) {
        this.f240040b = context;
        this.f240041c = dVar;
        this.f240039a = context.getResources().getDimensionPixelSize(R.dimen.line_two_text_size);
        this.f240048w = C1878d.m5128a(context, f240002h);
        this.f240049x = C1878d.m5128a(context, f240004j);
    }

    /* renamed from: n */
    private final void m143796n(Suggestion suggestion, SuggestionViewWithActions suggestionViewWithActions, boolean z) {
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
    private final void m143797o(Suggestion suggestion, C88803an anVar) {
        if (!C88727aj.m143678F(suggestion)) {
            this.f240011q.mo82458Z(mo82470hN(suggestion), anVar, this.f240038B, this.f240049x);
        }
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 46;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        C54228aq o = C88727aj.m143706o(suggestion);
        if (!(o == null || (o.f142330a & 64) == 0)) {
            C54248l lVar = o.f142338j;
            if (lVar == null) {
                lVar = C54248l.f142431m;
            }
            if (!lVar.f142435c.isEmpty()) {
                return C89235z.m145125E(suggestion) ? 67 : 59;
            }
        }
        return C89235z.m145125E(suggestion) ? 66 : 57;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        mo82185d((C88715p) obj);
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        String v = suggestion.mo44269v();
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
                v = String.format("%s %s", new Object[]{lVar2.f142436d, lVar2.f142435c});
            }
        }
        return this.f240040b.getResources().getString(R.string.query_suggestion_content_description, new Object[]{v});
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        if (suggestion.f108925z.contains(39) || suggestion.f108925z.contains(136)) {
            this.f240011q.mo82454C(suggestion, this);
        } else {
            C54228aq aqVar = suggestion.f108906A;
            if (aqVar != null) {
                C54216ae aeVar = aqVar.f142334f;
                if (aeVar == null) {
                    aeVar = C54216ae.f142285C;
                }
                if ((aeVar.f142290a & 134217728) != 0) {
                    this.f240011q.mo82467w(suggestion, R.string.entity_suggestion_message, this.f240045t);
                }
            }
            if (suggestion.f108925z.contains(143)) {
                this.f240011q.mo82468y(R.string.trends_suggestion_message, R.string.trends_learn_more_url, suggestion, true, C88727aj.f239990a);
            } else {
                this.f240011q.mo82469z(R.string.entity_suggestion_message, suggestion, true);
            }
        }
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        String str;
        int g;
        Suggestion suggestion2 = suggestion;
        C88803an anVar2 = anVar;
        int e = C88727aj.m143700e(suggestion2, suggestion2.f108925z.contains(39) ? f240005k : f240006l, this.f240047v);
        int c = C88727aj.m143699c(suggestion2, e);
        int b = C88727aj.m143698b(suggestion2, this.f240048w, this.f240047v);
        C54228aq o = C88727aj.m143706o(suggestion);
        if ((o.f142330a & 64) != 0) {
            C54248l lVar = o.f142338j;
            if (lVar == null) {
                lVar = C54248l.f142431m;
            }
            String str2 = lVar.f142440h;
            C54248l lVar2 = o.f142338j;
            String str3 = (lVar2 == null ? C54248l.f142431m : lVar2).f142435c;
            if (lVar2 == null) {
                lVar2 = C54248l.f142431m;
            }
            String str4 = lVar2.f142439g;
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            Spanned fromHtml = Html.fromHtml(str2);
            boolean contains = new C62963cj(o.f142333d, C54228aq.f142327e).contains(C64369b.SUBTYPE_PERSONAL);
            if (this.f240046u && contains) {
                fromHtml = this.f240042d.mo44239f(str2, true, true);
            }
            anVar2.mo82350d(fromHtml, 3);
            if (!TextUtils.isEmpty(str3)) {
                if (suggestion2.f108925z.contains(175)) {
                    Spanned fromHtml2 = Html.fromHtml(str3);
                    String obj = fromHtml2.toString();
                    anVar2.mo82546i(fromHtml2, 4);
                    if (this.f240044f && (g = anVar.mo82544g()) > 0) {
                        Paint paint = new Paint();
                        paint.setTextSize((float) this.f240039a);
                        double measureText = (double) ((int) paint.measureText(obj));
                        double d = (double) g;
                        Double.isNaN(measureText);
                        Double.isNaN(d);
                        this.f240041c.mo82396a((int) Math.ceil(measureText / d), obj);
                    }
                } else {
                    anVar2.mo82546i(Html.fromHtml(str3), 3);
                }
                int i = this.f240050y;
                if (i != -1) {
                    ((CoreSuggestionView) anVar2).mo82547j(i);
                }
                int i2 = this.f240037A;
                if (i2 == -1) {
                    if (this.f240051z) {
                        i2 = -1;
                    }
                    this.f240011q.mo82456T(suggestion2, anVar2, C88727aj.m143691S(suggestion), C88728ak.f240003i);
                }
                ((CoreSuggestionView) anVar2).mo82549l(i2, this.f240051z);
                this.f240011q.mo82456T(suggestion2, anVar2, C88727aj.m143691S(suggestion), C88728ak.f240003i);
            }
            if (true != C88727aj.m143687O(suggestion)) {
                e = c;
            }
            anVar2.mo82349c(0).mo82561d(e, b, false);
            if (C88727aj.m143685M(str4)) {
                anVar2.mo82349c(8).mo82558a(this.f240040b.getResources().getDimensionPixelSize(R.dimen.core_suggestion_action_button_visible_width));
                C88800ak c2 = anVar2.mo82349c(8);
                C88705f fVar = this.f240008n;
                C54228aq o2 = C88727aj.m143706o(suggestion);
                if (o2 == null || (o2.f142330a & 64) == 0) {
                    str = BuildConfig.FLAVOR;
                } else {
                    C54248l lVar3 = o2.f142338j;
                    if (lVar3 == null) {
                        lVar3 = C54248l.f142431m;
                    }
                    str = lVar3.f142441i;
                }
                c2.mo82568k(str4, fVar, str, ImageView.ScaleType.FIT_CENTER, 5, 0, 0, 0, (!suggestion2.f108925z.contains(199) || !this.f240043e) ? 0 : -1);
            }
            if (anVar.mo82584r() == 12 || anVar.mo82584r() == 13) {
                SuggestionViewWithActions suggestionViewWithActions = (SuggestionViewWithActions) anVar2;
                if (m143730u(suggestion)) {
                    suggestionViewWithActions.mo82576y();
                    m143796n(suggestion2, suggestionViewWithActions, true);
                    if (!suggestionViewWithActions.f240395d) {
                        suggestionViewWithActions.f240394c = true;
                        suggestionViewWithActions.f240395d = true;
                        C88819c.m144205b(suggestionViewWithActions.getContext(), (ImageView) null, suggestionViewWithActions.f240393b, false);
                    }
                }
                return true;
            }
            if (suggestion.mo44265s() && (anVar.mo82584r() == 66 || anVar.mo82584r() == 67)) {
                EnhancementSuggestionView enhancementSuggestionView = (EnhancementSuggestionView) anVar2;
                C54216ae aeVar = suggestion2.f108906A.f142334f;
                if (aeVar == null) {
                    aeVar = C54216ae.f142285C;
                }
                enhancementSuggestionView.mo82551n(aeVar.f142288B);
            }
            m143796n(suggestion2, (SuggestionViewWithActions) null, false);
            if (suggestion2.f108925z.contains(143)) {
                this.f240011q.mo82464t(anVar2);
            } else {
                m143797o(suggestion, anVar);
            }
            if (C88727aj.m143683K(suggestion)) {
                C88727aj.m143709r((CoreSuggestionView) anVar2, suggestion2, this.f240047v);
            }
            return true;
        }
        anVar2.mo82587v(C88727aj.m143704m(suggestion.mo44268u(), suggestion2, this.f240042d));
        anVar2.mo82349c(0).mo82561d(c, b, false);
        m143797o(suggestion, anVar);
        return true;
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f240038B = jVar.f239875ae;
        this.f240043e = jVar.f239897w;
        this.f240044f = jVar.f239898x;
        this.f240045t = C89988b.f246752a.mo85086b(jVar.f239860Q);
        this.f240046u = jVar.f239864U;
        this.f240047v = jVar.f239865V;
        this.f240050y = jVar.f239866W;
        this.f240037A = jVar.f239867X;
        this.f240051z = jVar.f239868Y;
        this.f240013s = jVar;
    }

    /* renamed from: hK */
    public final void mo82333hK(int i, View view, Suggestion suggestion, String str) {
        if ((view instanceof SuggestionActionView) && i >= 0 && !TextUtils.isEmpty(str)) {
            this.f240012r.mo82414u(i);
            mo82472s(suggestion, view, str);
        } else if (i == 1) {
            mo82475w(TextUtils.concat(new CharSequence[]{mo82470hN(suggestion), " "}));
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
        this.f240042d = pVar.f239938j;
    }

    /* renamed from: p */
    public final void mo82471p(int i, C88803an anVar, Suggestion suggestion) {
        if (i == -1) {
            SuggestionViewWithActions suggestionViewWithActions = (SuggestionViewWithActions) anVar;
            m143796n(suggestion, suggestionViewWithActions, true);
            suggestionViewWithActions.mo82575x(true);
        }
    }
}
