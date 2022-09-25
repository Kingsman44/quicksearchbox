package com.google.android.apps.gsa.searchnow;

import android.view.View;
import com.google.android.apps.gsa.search.shared.overlay.SearchOverlayLayout;
import com.google.android.apps.gsa.shared.monet.C90165af;
import com.google.android.apps.gsa.shared.monet.C90348s;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.searchnow.m */
/* compiled from: PG */
public final class C88876m {
    /* renamed from: a */
    public static SearchOverlayLayout m144321a(View view) {
        return (SearchOverlayLayout) view.findViewById(R.id.search_overlay);
    }

    /* renamed from: b */
    public static C90348s m144322b(amo amo) {
        return new C90348s(amo.name());
    }

    /* renamed from: c */
    public static C58833ax m144323c(C90165af afVar) {
        return C58833ax.m90834k(afVar.mo83913a("NAME_CHILD_SUGGEST"));
    }
}
