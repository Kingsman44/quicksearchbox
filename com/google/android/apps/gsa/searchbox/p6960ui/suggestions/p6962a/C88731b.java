package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.text.SpannedString;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.b */
/* compiled from: PG */
public final class C88731b extends C88728ak {

    /* renamed from: a */
    private final Context f240022a;

    /* renamed from: b */
    private boolean f240023b = false;

    public C88731b(Context context) {
        this.f240022a = context;
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 173;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return this.f240023b ? 1 : 64;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f240022a.getResources().getString(R.string.app_shortcut_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        anVar.mo82587v(SpannedString.valueOf(C89235z.m145132d(suggestion)));
        anVar.mo82349c(0).mo82564g(C41670aj.m73072e(suggestion), BuildConfig.FLAVOR, this.f240008n);
        return true;
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f240023b = jVar.f239873ac;
        this.f240013s = jVar;
    }
}
