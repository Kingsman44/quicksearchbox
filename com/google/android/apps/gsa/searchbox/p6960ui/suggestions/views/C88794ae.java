package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.ae */
/* compiled from: PG */
public final /* synthetic */ class C88794ae implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ C88795af f240411a;

    public /* synthetic */ C88794ae(C88795af afVar) {
        this.f240411a = afVar;
    }

    public final boolean onLongClick(View view) {
        Suggestion suggestion;
        C88795af afVar = this.f240411a;
        C88728ak akVar = afVar.f240418o;
        if (akVar == null || (suggestion = afVar.f240417n) == null) {
            return false;
        }
        akVar.f240007m.mo44281u(suggestion);
        C88709j jVar = akVar.f240013s;
        if (!jVar.f239899y || !jVar.f239900z) {
            return akVar.mo82330hH(afVar, suggestion);
        }
        C88727aj ajVar = akVar.f240011q;
        String v = suggestion.mo44269v();
        String x = C89235z.m145152x(suggestion.f108909j);
        String v2 = C89235z.m145150v(suggestion.f108910k);
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : suggestion.f108925z) {
            arrayList.add(C89235z.m145149u(intValue.intValue()));
        }
        int r = afVar.mo82584r();
        String w = C89235z.m145151w(suggestion.f108915p.intValue());
        int i = suggestion.f108917r;
        ajVar.mo82452A(String.format(Locale.US, "Text: %s\nSource: %s\nType: %s\nSubtypes: %s\nViewtype: %d\nGroup: %s\nScore: %d", new Object[]{v, x, v2, arrayList, Integer.valueOf(r), w, Integer.valueOf(i)}), (Suggestion) null, false);
        return true;
    }
}
