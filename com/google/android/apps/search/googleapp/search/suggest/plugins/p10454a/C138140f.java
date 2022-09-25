package com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a;

import android.view.View;
import com.google.android.apps.search.googleapp.p10139b.C133489e;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.a.f */
/* compiled from: PG */
public final /* synthetic */ class C138140f implements C133489e {

    /* renamed from: a */
    public static final /* synthetic */ C138140f f375845a = new C138140f();

    private /* synthetic */ C138140f() {
    }

    /* renamed from: a */
    public final boolean mo111191a(View view) {
        View findViewById;
        View view2 = (View) view.getParent();
        if (view2 == null || (findViewById = view2.findViewById(R.id.googleapp_in_context_control_overflow_button)) == null) {
            return true;
        }
        findViewById.performClick();
        return true;
    }
}
