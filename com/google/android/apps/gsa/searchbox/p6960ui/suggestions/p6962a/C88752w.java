package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.text.SpannedString;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.w */
/* compiled from: PG */
public class C88752w extends C88728ak implements C89199d {

    /* renamed from: a */
    protected final Context f240095a;

    /* renamed from: b */
    private final int f240096b;

    public C88752w(Context context) {
        this.f240095a = context;
        this.f240096b = C1878d.m5128a(context, f240002h);
    }

    /* renamed from: b */
    public int mo82327b() {
        return 86;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 58;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f240095a.getResources().getString(R.string.on_device_url_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        this.f240011q.mo82469z(R.string.url_history_suggestion_message, suggestion, false);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        anVar.mo82350d(SpannedString.valueOf(C89235z.m145132d(suggestion)), 2);
        anVar.mo82546i(SpannedString.valueOf(C41670aj.m73079l(suggestion)), 2);
        if (C41670aj.m73086s(suggestion)) {
            anVar.mo82349c(0).mo82561d(C41670aj.m73068a(suggestion), C88727aj.m143696a(suggestion, this.f240096b), false);
        } else {
            anVar.mo82349c(0).mo82564g(C41670aj.m73072e(suggestion), C41670aj.m73081n(suggestion), this.f240008n);
        }
        anVar.mo82349c(1).mo82560c();
        return true;
    }
}
