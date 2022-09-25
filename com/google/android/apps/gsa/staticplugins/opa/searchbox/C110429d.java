package com.google.android.apps.gsa.staticplugins.opa.searchbox;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.C88702c;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.searchbox.d */
/* compiled from: PG */
public final class C110429d extends C88728ak implements C89200e, C89199d {

    /* renamed from: a */
    private final Context f307837a;

    /* renamed from: b */
    private C88702c f307838b;

    /* renamed from: c */
    private C88710k f307839c;

    /* renamed from: d */
    private int f307840d;

    /* renamed from: e */
    private int f307841e;

    public C110429d(Context context) {
        this.f307837a = context;
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 169;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return this.f307838b.f239826a ? 14 : 57;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        mo82185d((C88715p) obj);
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f307837a.getResources().getString(R.string.query_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        return false;
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f307841e = jVar.f239875ae;
        this.f307840d = jVar.f239876b;
        this.f240013s = jVar;
    }

    /* renamed from: hK */
    public final void mo82333hK(int i, View view, Suggestion suggestion, String str) {
        if (i == 1) {
            mo82475w(TextUtils.concat(new CharSequence[]{suggestion.mo44269v(), " "}));
            mo82472s(suggestion, view, "gsa::set_input_action");
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
        this.f307839c = pVar.f239938j;
        this.f307838b = pVar.f239944p;
    }

    /* renamed from: t */
    public final void mo82473t(Suggestion suggestion) {
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        if (anVar.mo82584r() == 57) {
            anVar.mo82587v(C88727aj.m143704m(suggestion.mo44268u(), suggestion, this.f307839c));
            anVar.mo82349c(0).mo82561d(C88727aj.m143699c(suggestion, R.drawable.quantum_ic_google_assistant_white_24), C88727aj.m143696a(suggestion, f240003i), false);
            this.f240011q.mo82458Z(suggestion.mo44269v(), anVar, this.f307841e, this.f307840d);
            if (!C89235z.m145122B(suggestion) || C41670aj.m73085r(suggestion)) {
                return true;
            }
            anVar.mo82550m();
            return true;
        }
        anVar.mo82587v(suggestion.mo44268u());
        return true;
    }
}
