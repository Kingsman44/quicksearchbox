package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.gsa.now.shared.p6421ui.C83413b;
import com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerFrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.OpaPartialPageLayout */
/* compiled from: PG */
public class OpaPartialPageLayout extends CoordinatorLayout {

    /* renamed from: i */
    public final BottomSheetBehavior f228729i;

    /* renamed from: j */
    public final FooterLayout f228730j;

    /* renamed from: k */
    private final ScrollView f228731k;

    /* renamed from: l */
    private final View f228732l;

    public OpaPartialPageLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: q */
    public final void mo77372q(int i) {
        View inflate = inflate(getContext(), i, (ViewGroup) null);
        this.f228731k.removeAllViews();
        this.f228731k.addView(inflate);
    }

    public OpaPartialPageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.opa_partial_page_layout, this);
        setId(R.id.opa_partial_page_layout);
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) findViewById(R.id.opa_page_rounded_frame);
        roundedCornerFrameLayout.mo76724hc(3);
        roundedCornerFrameLayout.mo76723hb(C83413b.m132808a(context));
        this.f228730j = (FooterLayout) findViewById(R.id.opa_footer_container);
        this.f228731k = (ScrollView) findViewById(R.id.opa_page_scrollview);
        int resourceId = getContext().getTheme().obtainStyledAttributes(attributeSet, C83976aa.f228770d, 0, 0).getResourceId(0, 0);
        if (resourceId != 0) {
            mo77372q(resourceId);
        }
        this.f228729i = BottomSheetBehavior.m78767C(roundedCornerFrameLayout);
        View findViewById = findViewById(R.id.opa_page_outside);
        this.f228732l = findViewById;
        findViewById.setOnClickListener(new C84028w(this));
    }
}
