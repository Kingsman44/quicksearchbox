package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.connectivity.C25749c;
import com.google.android.libraries.lens.view.p2067ak.C25262cn;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.y */
/* compiled from: PG */
public final /* synthetic */ class C26231y implements C25749c {

    /* renamed from: a */
    public final /* synthetic */ C26059ax f71277a;

    public /* synthetic */ C26231y(C26059ax axVar) {
        this.f71277a = axVar;
    }

    /* renamed from: a */
    public final void mo30486a(boolean z) {
        C26059ax axVar = this.f71277a;
        if (!z && C26059ax.f70784a.equals(axVar.mo31248c())) {
            C25262cn h = axVar.f70816f.mo30352h();
            if (!h.f68728b.isEmpty()) {
                axVar.mo31263r(Locale.forLanguageTag(h.f68728b), axVar.mo31249d());
            }
        }
    }
}
