package com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.p8549d;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113565h;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.d.a */
/* compiled from: PG */
public final class C112093a extends C0648fj {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        super.getItemOffsets(rect, view, recyclerView, geVar);
        C113565h hVar = (C113565h) recyclerView.mAdapter;
        if (hVar != null) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.mLayout;
            boolean z = true;
            if (linearLayoutManager != null && !linearLayoutManager.getReverseLayout()) {
                z = false;
            }
            Resources resources = view.getResources();
            int itemCount = hVar.getItemCount();
            int i = R.dimen.section_top_margin;
            if (!z ? childLayoutPosition != 0 : childLayoutPosition != itemCount - 1) {
                i = R.dimen.intent_launcher_section_margin;
            }
            rect.top = resources.getDimensionPixelOffset(i);
        }
    }
}
