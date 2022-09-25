package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.j */
/* compiled from: PG */
public final class C88739j extends C88728ak implements C89200e, C89199d {

    /* renamed from: a */
    private final Context f240054a;

    /* renamed from: b */
    private final int f240055b;

    /* renamed from: c */
    private final int f240056c;

    /* renamed from: d */
    private int f240057d;

    public C88739j(Context context) {
        this.f240054a = context;
        this.f240055b = C1878d.m5128a(context, f240002h);
        this.f240056c = C1878d.m5128a(context, f240004j);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 38;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 57;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f240054a.getResources().getString(R.string.query_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        int c = C88727aj.m143699c(suggestion, f240006l);
        int a = C88727aj.m143696a(suggestion, this.f240055b);
        anVar.mo82350d(suggestion.mo44268u(), 3);
        anVar.mo82349c(0).mo82561d(c, a, false);
        if (C88727aj.m143678F(suggestion)) {
            return true;
        }
        this.f240011q.mo82458Z(suggestion.mo44269v(), anVar, this.f240057d, this.f240056c);
        return true;
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f240057d = jVar.f239875ae;
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
