package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.view.View;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.libraries.searchbox.shared.response.Response;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.ad */
/* compiled from: PG */
public final class C88759ad implements View.OnClickListener {

    /* renamed from: a */
    final int f240113a;

    /* renamed from: b */
    final /* synthetic */ C88760ae f240114b;

    public C88759ad(C88760ae aeVar, int i) {
        this.f240114b = aeVar;
        this.f240113a = i;
    }

    public final void onClick(View view) {
        C90772bp.m148317y(this.f240114b.f240135o.getContext(), view);
        C88760ae aeVar = this.f240114b;
        int i = this.f240113a;
        C88786t j = aeVar.mo82488j(i);
        if (j != null) {
            j.mo82521j();
            j.mo82519h();
            Response k = aeVar.mo82489k();
            aeVar.mo82497s(i, (List) aeVar.f240132l.get(i), k, true);
            if (k.f108861a.isEmpty()) {
                aeVar.f240123c.mo82408o(k);
            }
            if (!k.f108862b.isEmpty()) {
                aeVar.f240123c.mo82411r(k);
            }
        }
    }
}
