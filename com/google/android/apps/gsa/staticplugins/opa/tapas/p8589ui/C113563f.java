package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.graphics.Rect;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.f */
/* compiled from: PG */
public final class C113563f extends C0648fj {

    /* renamed from: a */
    private final boolean f314441a;

    public C113563f(boolean z) {
        this.f314441a = z;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        C113572o oVar = (C113572o) recyclerView.mAdapter;
        if (oVar != null) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
            int itemCount = oVar.getItemCount();
            if (this.f314441a) {
                if (childLayoutPosition == itemCount - 1) {
                    return;
                }
            } else if (childLayoutPosition == 0) {
                return;
            }
            rect.top = (int) view.getResources().getDimension(R.dimen.personalized_query_margin);
        }
    }
}
