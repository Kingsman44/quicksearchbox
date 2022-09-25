package com.google.android.apps.gsa.staticplugins.opa.p8354d.p8355a;

import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.d.a.a */
/* compiled from: PG */
public final class C108522a {
    /* renamed from: a */
    public static void m180456a(View view, boolean z) {
        View findViewById = view.findViewById(R.id.qk_progress_bar);
        View findViewById2 = view.findViewById(R.id.qk_edge_lights);
        if (findViewById != null && findViewById2 != null) {
            int i = 8;
            findViewById.setVisibility(true != z ? 8 : 0);
            if (true != z) {
                i = 0;
            }
            findViewById2.setVisibility(i);
        }
    }
}
