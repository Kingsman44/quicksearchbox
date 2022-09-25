package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.av */
/* compiled from: PG */
public final /* synthetic */ class C88811av implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C88814ay f240441a;

    /* renamed from: b */
    public final /* synthetic */ int f240442b;

    /* renamed from: c */
    public final /* synthetic */ SuggestionActionView f240443c;

    /* renamed from: d */
    public final /* synthetic */ String f240444d;

    public /* synthetic */ C88811av(C88814ay ayVar, int i, SuggestionActionView suggestionActionView, String str) {
        this.f240441a = ayVar;
        this.f240442b = i;
        this.f240443c = suggestionActionView;
        this.f240444d = str;
    }

    public final void onClick(View view) {
        C88814ay ayVar = this.f240441a;
        int i = this.f240442b;
        SuggestionActionView suggestionActionView = this.f240443c;
        String str = this.f240444d;
        C88728ak akVar = ayVar.f240418o;
        if (akVar != null) {
            akVar.mo82474v(i, suggestionActionView, ayVar.f240417n, str);
        }
    }
}
