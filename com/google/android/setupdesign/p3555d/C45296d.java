package com.google.android.setupdesign.p3555d;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.template.C45280g;
import com.google.android.setupdesign.C45318g;
import com.google.android.setupdesign.p3558f.C45308b;
import com.google.android.setupdesign.p3558f.C45312f;

/* renamed from: com.google.android.setupdesign.d.d */
/* compiled from: PG */
public final class C45296d implements C45280g {

    /* renamed from: a */
    public final Context f118346a;

    /* renamed from: b */
    private final TemplateLayout f118347b;

    /* renamed from: c */
    private final int f118348c;

    /* renamed from: d */
    private final ImageView.ScaleType f118349d;

    public C45296d(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        ImageView b;
        ImageView.ScaleType scaleType;
        ImageView b2;
        this.f118347b = templateLayout;
        Context context = templateLayout.getContext();
        this.f118346a = context;
        ImageView b3 = mo49230b();
        if (b3 != null) {
            this.f118348c = b3.getLayoutParams().height;
            this.f118349d = b3.getScaleType();
        } else {
            this.f118348c = 0;
            this.f118349d = null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C45318g.f118390i, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (!(resourceId == 0 || (b2 = mo49230b()) == null)) {
            b2.setImageResource(resourceId);
            b2.setVisibility(resourceId != 0 ? 0 : 8);
            mo49231c(b2.getVisibility());
        }
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        ImageView b4 = mo49230b();
        if (b4 != null) {
            ViewGroup.LayoutParams layoutParams = b4.getLayoutParams();
            layoutParams.height = !z ? this.f118348c : b4.getMaxHeight();
            b4.setLayoutParams(layoutParams);
            if (z) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            } else {
                scaleType = this.f118349d;
            }
            b4.setScaleType(scaleType);
        }
        int color = obtainStyledAttributes.getColor(1, 0);
        if (!(color == 0 || (b = mo49230b()) == null)) {
            b.setColorFilter(color);
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final FrameLayout mo49229a() {
        return (FrameLayout) this.f118347b.mo49127h(R.id.sud_layout_icon_container);
    }

    /* renamed from: b */
    public final ImageView mo49230b() {
        return (ImageView) this.f118347b.mo49127h(R.id.sud_layout_icon);
    }

    /* renamed from: c */
    public final void mo49231c(int i) {
        if (mo49229a() != null) {
            mo49229a().setVisibility(i);
        }
    }

    /* renamed from: d */
    public final void mo49232d() {
        int dimension;
        if (C45312f.m80763c(this.f118347b)) {
            ImageView b = mo49230b();
            FrameLayout a = mo49229a();
            if (b != null && a != null) {
                Context context = b.getContext();
                int a2 = C45312f.m80761a(context);
                if (a2 != 0 && (b.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b.getLayoutParams();
                    layoutParams.gravity = a2;
                    b.setLayoutParams(layoutParams);
                }
                int i = 0;
                if (C45240c.m80574e(context).mo49107l(C45238a.CONFIG_ICON_SIZE)) {
                    b.getViewTreeObserver().addOnPreDrawListener(new C45308b(b));
                    ViewGroup.LayoutParams layoutParams2 = b.getLayoutParams();
                    layoutParams2.height = (int) C45240c.m80574e(context).mo49099a(context, C45238a.CONFIG_ICON_SIZE, 0.0f);
                    layoutParams2.width = -2;
                    b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    Drawable drawable = b.getDrawable();
                    if (drawable != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        if (intrinsicWidth > intrinsicHeight + intrinsicHeight && layoutParams2.height > (dimension = (int) context.getResources().getDimension(R.dimen.sud_horizontal_icon_height))) {
                            i = layoutParams2.height - dimension;
                            layoutParams2.height = dimension;
                        }
                    }
                }
                ViewGroup.LayoutParams layoutParams3 = a.getLayoutParams();
                if (C45240c.m80574e(context).mo49107l(C45238a.CONFIG_ICON_MARGIN_TOP) && (layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, ((int) C45240c.m80574e(context).mo49099a(context, C45238a.CONFIG_ICON_MARGIN_TOP, 0.0f)) + i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                }
            }
        }
    }
}
