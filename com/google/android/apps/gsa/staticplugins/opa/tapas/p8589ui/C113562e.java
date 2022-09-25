package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.graphics.Rect;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.e */
/* compiled from: PG */
public final class C113562e extends C0648fj {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        if (((C113572o) recyclerView.mAdapter) != null && recyclerView.getChildLayoutPosition(view) / 5 != 0) {
            rect.top = (int) view.getResources().getDimension(R.dimen.icons_shortcut_row_margin_top);
        }
    }
}
