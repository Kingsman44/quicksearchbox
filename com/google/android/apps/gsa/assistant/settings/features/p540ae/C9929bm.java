package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.material.opensearchbar.C28559n;
import com.google.android.libraries.material.opensearchbar.OpenSearchBar;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.bm */
/* compiled from: PG */
public final /* synthetic */ class C9929bm implements C28559n {

    /* renamed from: a */
    public final /* synthetic */ C9935bs f34032a;

    /* renamed from: b */
    public final /* synthetic */ TextView f34033b;

    /* renamed from: c */
    public final /* synthetic */ OpenSearchBar f34034c;

    public /* synthetic */ C9929bm(C9935bs bsVar, TextView textView, OpenSearchBar openSearchBar) {
        this.f34032a = bsVar;
        this.f34033b = textView;
        this.f34034c = openSearchBar;
    }

    /* renamed from: a */
    public final void mo18126a(int i, int i2) {
        C9935bs bsVar = this.f34032a;
        TextView textView = this.f34033b;
        OpenSearchBar openSearchBar = this.f34034c;
        int i3 = i2 - 1;
        if (i3 != 1) {
            if (i3 == 2) {
                bsVar.f34054n.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(openSearchBar));
            }
        } else if (!bsVar.f34049i.mo79746e(C90059dk.f249069af)) {
            textView.animate().alpha(1.0f).start();
        }
    }
}
