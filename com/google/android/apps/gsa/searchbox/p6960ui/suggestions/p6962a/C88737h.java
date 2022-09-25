package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.text.Html;
import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.h */
/* compiled from: PG */
public final class C88737h extends C88728ak {
    /* renamed from: b */
    public final int mo82327b() {
        return 179;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 65;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return Html.fromHtml(suggestion.mo44269v()).toString();
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        View findViewById;
        View view = (View) ((View) anVar).getParent();
        if (view == null || (findViewById = view.findViewById(R.id.in_context_control_overflow_button)) == null) {
            return true;
        }
        findViewById.performClick();
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        anVar.mo82587v(Html.fromHtml(suggestion.mo44269v()));
        return true;
    }
}
