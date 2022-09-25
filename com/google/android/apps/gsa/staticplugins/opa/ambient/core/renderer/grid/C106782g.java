package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.view.ReorderingGridLayout;
import java.util.LinkedList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.g */
/* compiled from: PG */
public final /* synthetic */ class C106782g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ C106791p f297568a;

    public /* synthetic */ C106782g(C106791p pVar) {
        this.f297568a = pVar;
    }

    public final void onGlobalLayout() {
        ReorderingGridLayout reorderingGridLayout = this.f297568a.f297587c;
        LinkedList linkedList = new LinkedList();
        linkedList.add(reorderingGridLayout);
        while (!linkedList.isEmpty()) {
            ViewGroup viewGroup = (ViewGroup) linkedList.pop();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    if (childAt instanceof TextView) {
                        childAt.invalidate();
                    } else if (childAt instanceof ViewGroup) {
                        linkedList.add((ViewGroup) childAt);
                    }
                }
            }
        }
    }
}
