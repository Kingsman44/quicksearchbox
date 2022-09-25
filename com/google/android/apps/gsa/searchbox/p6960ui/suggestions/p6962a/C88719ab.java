package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.searchbox.p6960ui.C88702c;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.ab */
/* compiled from: PG */
public final class C88719ab extends C88728ak {

    /* renamed from: a */
    private final Context f239962a;

    /* renamed from: b */
    private final int f239963b;

    /* renamed from: c */
    private final int f239964c;

    /* renamed from: d */
    private C88702c f239965d;

    /* renamed from: e */
    private C88710k f239966e;

    /* renamed from: f */
    private int f239967f;

    public C88719ab(Context context) {
        this.f239962a = context;
        this.f239963b = C1878d.m5128a(context, f240002h);
        this.f239964c = C1878d.m5128a(context, f240004j);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 133;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return this.f239965d.f239826a ? 14 : 57;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        mo82185d((C88715p) obj);
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f239962a.getResources().getString(R.string.query_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        this.f240011q.mo82468y(R.string.regular_query_suggestion_message, R.string.regular_query_learn_more_url, suggestion, true, C88727aj.f239990a);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        int r = anVar.mo82584r();
        if (r == 1 || r == 57) {
            int c = C88727aj.m143699c(suggestion, f240006l);
            int a = C88727aj.m143696a(suggestion, this.f239963b);
            anVar.mo82587v(C88727aj.m143704m(suggestion.mo44268u(), suggestion, this.f239966e));
            anVar.mo82349c(0).mo82561d(c, a, false);
            if (suggestion.f108925z.contains(143)) {
                this.f240011q.mo82464t(anVar);
            } else if (!C88727aj.m143678F(suggestion)) {
                this.f240011q.mo82458Z(suggestion.mo44269v(), anVar, this.f239967f, this.f239964c);
            }
        } else if (r == 14) {
            anVar.mo82587v(suggestion.mo44268u());
        }
        return true;
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f239967f = jVar.f239875ae;
        this.f240013s = jVar;
    }

    /* renamed from: hK */
    public final void mo82333hK(int i, View view, Suggestion suggestion, String str) {
        if (i == 1) {
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
        this.f239966e = pVar.f239938j;
        this.f239965d = pVar.f239944p;
    }
}
