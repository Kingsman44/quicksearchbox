package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.p6956c;

import android.content.Context;
import android.text.Html;
import android.text.SpannedString;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.c.a */
/* compiled from: PG */
public final class C88654a extends C88728ak implements C89199d {

    /* renamed from: a */
    private final Context f239706a;

    /* renamed from: b */
    private final int f239707b;

    /* renamed from: c */
    private final int f239708c;

    /* renamed from: d */
    private int f239709d;

    public C88654a(Context context) {
        this.f239706a = context;
        this.f239707b = C1878d.m5128a(context, f240002h);
        this.f239708c = C1878d.m5128a(context, f240004j);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 78;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 57;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return null;
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        this.f240011q.mo82453B(this.f239706a.getResources().getString(R.string.remove_psuggest_title), Html.fromHtml(this.f239706a.getResources().getString(R.string.remove_psuggest_message, new Object[]{Html.escapeHtml(suggestion.mo44269v())})), suggestion, this);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        int c = C88727aj.m143699c(suggestion, f240005k);
        int a = C88727aj.m143696a(suggestion, this.f239707b);
        anVar.mo82587v(SpannedString.valueOf(this.f239706a.getResources().getString(R.string.search_for, new Object[]{suggestion.mo44269v()})));
        anVar.mo82349c(0).mo82561d(c, a, false);
        if (!C88727aj.m143678F(suggestion)) {
            this.f240011q.mo82458Z(suggestion.mo44269v(), anVar, this.f239709d, this.f239708c);
        }
        return true;
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f239709d = jVar.f239875ae;
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
}
