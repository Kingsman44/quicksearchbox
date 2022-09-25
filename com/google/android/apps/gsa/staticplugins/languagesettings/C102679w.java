package com.google.android.apps.gsa.staticplugins.languagesettings;

import android.widget.AbsListView;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.w */
/* compiled from: PG */
final class C102679w implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ C102655aa f286600a;

    public C102679w(C102655aa aaVar) {
        this.f286600a = aaVar;
    }

    /* renamed from: a */
    private final void m170260a(AbsListView absListView) {
        LinearLayout linearLayout = (LinearLayout) this.f286600a.f286546e.findViewById(R.id.search_language_selected_layout);
        if (absListView.canScrollVertically(-1)) {
            linearLayout.setElevation(15.0f);
        } else {
            linearLayout.setElevation(0.0f);
        }
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        m170260a(absListView);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        m170260a(absListView);
    }
}
