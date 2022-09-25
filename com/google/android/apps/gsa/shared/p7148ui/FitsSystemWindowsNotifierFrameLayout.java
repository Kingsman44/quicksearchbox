package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.nowoverlayservice.C83537j;
import com.google.android.apps.gsa.nowoverlayservice.C83553y;
import com.google.android.apps.gsa.shared.monet.C90347r;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.ui.FitsSystemWindowsNotifierFrameLayout */
/* compiled from: PG */
public class FitsSystemWindowsNotifierFrameLayout extends FrameLayout {

    /* renamed from: a */
    public C83537j f253358a;

    public FitsSystemWindowsNotifierFrameLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        C90347r rVar;
        C83537j jVar = this.f253358a;
        if (jVar != null) {
            C83553y yVar = jVar.f227763a;
            C58976aa aaVar = C58975e.f156826a;
            if (!rect.equals(yVar.f227801Q)) {
                yVar.f227801Q = rect;
                if (yVar.f227832c && (rVar = yVar.f227793I) != null) {
                    rVar.mo84044o(rect);
                }
                View h = yVar.f227849t.mo81812h();
                h.setPadding(h.getPaddingLeft(), rect.top, h.getPaddingRight(), h.getPaddingBottom());
            }
        }
        return false;
    }

    public FitsSystemWindowsNotifierFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FitsSystemWindowsNotifierFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FitsSystemWindowsNotifierFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
