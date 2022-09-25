package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.shared.overlay.SearchOverlayLayout;
import com.google.android.apps.gsa.shared.util.C91033e;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.af */
/* compiled from: PG */
public final class C87627af {
    /* renamed from: a */
    public static View m142529a(Context context) {
        C91033e eVar = new C91033e(context);
        View inflate = LayoutInflater.from(new ContextThemeWrapper(eVar, 2132150880)).inflate(R.layout.search_overlay, (ViewGroup) null);
        eVar.mo85312b(inflate);
        return inflate;
    }

    /* renamed from: b */
    public static SearchOverlayLayout m142530b(View view) {
        return (SearchOverlayLayout) view.findViewById(R.id.search_overlay);
    }
}
