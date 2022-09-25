package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.l */
/* compiled from: PG */
public final class C88741l extends C88728ak {

    /* renamed from: a */
    private final Context f240061a;

    /* renamed from: b */
    private final int f240062b;

    public C88741l(Context context) {
        this.f240061a = context;
        this.f240062b = C1878d.m5128a(context, f240002h);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 141;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 4;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f240061a.getResources().getString(R.string.query_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        anVar.mo82587v(suggestion.mo44268u());
        anVar.mo82349c(0).mo82561d(C88727aj.m143699c(suggestion, f240006l), C88727aj.m143696a(suggestion, this.f240062b), false);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo82334j() {
        return true;
    }
}
