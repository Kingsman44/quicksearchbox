package com.google.android.libraries.lens.view.filters;

import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p098j.C2100o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.lens.p4711m.C62632i;

/* renamed from: com.google.android.libraries.lens.view.filters.aw */
/* compiled from: PG */
public final class C25916aw extends C25917ax {

    /* renamed from: a */
    public final LvfButtonsView f70409a;

    /* renamed from: b */
    public final View f70410b;

    /* renamed from: c */
    public final ImageView f70411c;

    /* renamed from: d */
    public final ConstraintLayout f70412d;

    /* renamed from: e */
    public final View.OnClickListener f70413e;

    /* renamed from: f */
    public final C24974a f70414f;

    /* renamed from: g */
    public C1756o f70415g;

    /* renamed from: h */
    public C1756o f70416h;

    /* renamed from: i */
    public int f70417i = 80;

    /* renamed from: j */
    public C25908ao f70418j;

    /* renamed from: l */
    private final boolean f70419l;

    public C25916aw(LvfButtonsView lvfButtonsView, C28310af afVar, C28306ab abVar, C27232l lVar, C24974a aVar, C47770dh dhVar) {
        this.f70409a = lvfButtonsView;
        this.f70414f = aVar;
        this.f70419l = C62632i.m94823h(lVar.mo32701h());
        View findViewById = lvfButtonsView.findViewById(R.id.shutter_button_view);
        findViewById.getClass();
        this.f70410b = findViewById;
        findViewById.setAccessibilityTraversalBefore(R.id.image_picker_button_view);
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.filter_icon);
        imageView.getClass();
        this.f70411c = imageView;
        ConstraintLayout constraintLayout = (ConstraintLayout) lvfButtonsView.findViewById(R.id.filter_lvf_buttons);
        constraintLayout.getClass();
        this.f70412d = constraintLayout;
        C47591co coVar = new C47591co(dhVar, "Shutter click", new C25912as(this));
        this.f70413e = coVar;
        C2100o oVar = new C2100o(findViewById.getContext(), new C25913at(findViewById), (Handler) null);
        oVar.f6015a.f6014a.setIsLongpressEnabled(false);
        findViewById.setOnTouchListener(new C25911ar(oVar));
        findViewById.setOnClickListener(coVar);
        findViewById.setContentDescription(findViewById.getContext().getString(R.string.lens_shutter_button_content_description));
        findViewById.setAccessibilityDelegate(new C25914au(findViewById));
        abVar.mo33801b(findViewById, afVar.mo33805a(C28427h.m53115a(71566)));
        mo31075a();
    }

    /* renamed from: a */
    public final void mo31075a() {
        Resources resources = this.f70409a.getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lvf_buttons_layout_margin_vertical);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.filter_carousel_top_margin);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.filter_carousel_height_with_borders) + dimensionPixelSize2;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f70412d.getLayoutParams();
        int i = -2;
        layoutParams.width = true != C25915av.m47795a(this.f70417i) ? -2 : -1;
        if (true != C25915av.m47795a(this.f70417i)) {
            i = -1;
        }
        layoutParams.height = i;
        layoutParams.leftMargin = this.f70417i == 3 ? dimensionPixelSize2 : 0;
        layoutParams.rightMargin = this.f70417i == 5 ? dimensionPixelSize2 : 0;
        if (true != C25915av.m47795a(this.f70417i)) {
            dimensionPixelSize = 0;
        }
        layoutParams.topMargin = dimensionPixelSize;
        if (C25915av.m47795a(this.f70417i)) {
            if (true != this.f70419l) {
                dimensionPixelSize2 = dimensionPixelSize3;
            }
            layoutParams.bottomMargin = dimensionPixelSize2;
        } else {
            layoutParams.bottomMargin = 0;
        }
        this.f70412d.setLayoutParams(layoutParams);
    }
}
