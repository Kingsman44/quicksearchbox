package com.google.android.libraries.lens.view.common.bottompanelscrollview;

import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.onboarding.C27487at;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.lens.view.common.bottompanelscrollview.c */
/* compiled from: PG */
public final class C25735c extends C25736d {

    /* renamed from: a */
    public final ScrollView f69982a;

    /* renamed from: b */
    public final int f69983b;

    /* renamed from: c */
    public boolean f69984c = true;

    /* renamed from: d */
    public C27487at f69985d;

    /* renamed from: f */
    private final View f69986f;

    /* renamed from: g */
    private final LinearLayout f69987g;

    public C25735c(BottomPanelScrollView bottomPanelScrollView, TypedArray typedArray) {
        boolean z = true;
        bottomPanelScrollView.setOrientation(1);
        LayoutInflater from = LayoutInflater.from(bottomPanelScrollView.getContext());
        from.inflate(R.layout.bottom_panel_scroll_view, bottomPanelScrollView);
        this.f69986f = bottomPanelScrollView.findViewById(R.id.lens_scroll_divider);
        ScrollView scrollView = (ScrollView) bottomPanelScrollView.findViewById(R.id.lens_bottom_panel_scroll_view);
        this.f69982a = scrollView;
        LinearLayout linearLayout = (LinearLayout) bottomPanelScrollView.findViewById(R.id.lens_bottom_panel_scroll_view_content);
        this.f69987g = linearLayout;
        FrameLayout frameLayout = (FrameLayout) bottomPanelScrollView.findViewById(R.id.lens_bottom_panel);
        scrollView.setOnScrollChangeListener(new C25734b(this));
        C58838bb.m90866a(typedArray, "Please specify app:contentLayout");
        int[] iArr = C25739g.f69989a;
        int resourceId = typedArray.getResourceId(1, 0);
        C58838bb.m90869d(resourceId == 0 ? false : z, "Please specify app:contentLayout");
        from.inflate(resourceId, linearLayout);
        int resourceId2 = typedArray.getResourceId(0, 0);
        if (resourceId2 != 0) {
            from.inflate(resourceId2, frameLayout);
        }
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(2, 0);
        frameLayout.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        linearLayout.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        this.f69983b = typedArray.getDimensionPixelOffset(3, -1);
    }

    /* renamed from: a */
    public final void mo30892a(int i) {
        int top = this.f69987g.getTop() + this.f69987g.getMeasuredHeight();
        int measuredHeight = i + this.f69982a.getMeasuredHeight();
        int i2 = 0;
        boolean z = measuredHeight >= top;
        if (this.f69984c != z) {
            this.f69984c = z;
            View view = this.f69986f;
            if (measuredHeight >= top) {
                i2 = 4;
            }
            view.setVisibility(i2);
            C27487at atVar = this.f69985d;
            if (atVar != null) {
                atVar.f75164a.mo33026b(atVar.f75165b, z);
            }
        }
    }
}
