package com.google.android.apps.search.googleapp.homescreen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58724pq;
import java.util.ArrayList;

/* compiled from: PG */
public final class AccessibilityOrderedFrameLayout extends FrameLayout {

    /* renamed from: a */
    private static final C58485gu f370773a = C58485gu.m89848p(Integer.valueOf(R.id.googleapp_hs_header_container), Integer.valueOf(R.id.googleapp_hs_search_box_container), Integer.valueOf(R.id.googleapp_discover_cards_fragment));

    public AccessibilityOrderedFrameLayout(Context context) {
        super(context);
    }

    public final void addChildrenForAccessibility(ArrayList arrayList) {
        int childCount = getChildCount();
        C58485gu guVar = f370773a;
        if (childCount == ((C58724pq) guVar).f156474d) {
            C58490gz gzVar = new C58490gz(4);
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                gzVar.mo55429h(Integer.valueOf(childAt.getId()), childAt);
            }
            C58495hd f = gzVar.mo55427f(false);
            C58485gu guVar2 = f370773a;
            int i2 = ((C58724pq) guVar2).f156474d;
            int i3 = 0;
            while (i3 < i2) {
                Integer num = (Integer) guVar2.get(i3);
                View view = (View) f.get(num);
                if (view != null) {
                    view.addChildrenForAccessibility(arrayList);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format("Direct view child for ID %s not found", new Object[]{num}));
                }
            }
            return;
        }
        throw new IllegalStateException(String.format("Child count (%s) does not match VIEW_ORDER size (%s). Ensure VIEW_ORDER is kept up-to-date.", new Object[]{Integer.valueOf(getChildCount()), Integer.valueOf(((C58724pq) guVar).f156474d)}));
    }

    public AccessibilityOrderedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccessibilityOrderedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AccessibilityOrderedFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
