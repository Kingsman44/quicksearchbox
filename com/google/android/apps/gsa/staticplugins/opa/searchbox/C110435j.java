package com.google.android.apps.gsa.staticplugins.opa.searchbox;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41704d;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.searchbox.j */
/* compiled from: PG */
public abstract class C110435j extends C88728ak implements C89200e, C89199d {

    /* renamed from: a */
    protected C41704d f307866a;

    /* renamed from: b */
    private final Context f307867b;

    /* renamed from: c */
    private C88710k f307868c;

    public C110435j(Context context) {
        this.f307867b = context;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 37;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        mo82185d((C88715p) obj);
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f307867b.getResources().getString(R.string.query_suggestion_content_description, new Object[]{mo82470hN(suggestion)});
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        return false;
    }

    /* renamed from: hI */
    public boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        if (anVar.mo82584r() != 37) {
            return false;
        }
        anVar.mo82587v(C88727aj.m143704m(suggestion.mo44268u(), suggestion, this.f307868c));
        return true;
    }

    /* renamed from: hK */
    public final void mo82333hK(int i, View view, Suggestion suggestion, String str) {
    }

    /* renamed from: l */
    public final void mo82353l(C88715p pVar) {
        super.mo82185d(pVar);
        this.f307868c = pVar.f239938j;
        this.f307866a = pVar.f239941m;
    }
}
