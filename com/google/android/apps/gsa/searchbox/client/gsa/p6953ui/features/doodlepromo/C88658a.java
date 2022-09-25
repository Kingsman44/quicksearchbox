package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.doodlepromo;

import android.graphics.drawable.AnimatedImageDrawable;
import android.net.Uri;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.libraries.searchbox.shared.suggestion.C41683i;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.doodlepromo.a */
/* compiled from: PG */
public final class C88658a extends C88728ak {
    /* renamed from: b */
    public final int mo82327b() {
        return 123;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 60;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return null;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        C41683i iVar = suggestion.f108907B.f109019m;
        if (iVar == null) {
            iVar = C41683i.f109026d;
        }
        Uri parse = Uri.parse(iVar.f109029b);
        int i = iVar.f109030c;
        DoodlePromoSuggestionView doodlePromoSuggestionView = (DoodlePromoSuggestionView) anVar;
        doodlePromoSuggestionView.f239717b.setImageURI(parse);
        if (i != -1) {
            doodlePromoSuggestionView.f239717b.setBackgroundColor(i);
        }
        try {
            ((AnimatedImageDrawable) doodlePromoSuggestionView.f239717b.getDrawable()).start();
            return true;
        } catch (ClassCastException e) {
            C59104x c = DoodlePromoSuggestionView.f239716a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DoodleView");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(9875)).mo56386p("Cannot start animation for doodles in suggest.");
            return true;
        }
    }
}
