package com.google.android.material.tabs;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.Layout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1990j;
import androidx.core.p098j.p099a.C1991k;
import androidx.core.widget.C2133t;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.tabs.o */
/* compiled from: PG */
public final class C44912o extends LinearLayout {

    /* renamed from: a */
    public TextView f117233a;

    /* renamed from: b */
    public ImageView f117234b;

    /* renamed from: c */
    public View f117235c;

    /* renamed from: d */
    public final Drawable f117236d;

    /* renamed from: e */
    final /* synthetic */ TabLayout f117237e;

    /* renamed from: f */
    private C44909l f117238f;

    /* renamed from: g */
    private TextView f117239g;

    /* renamed from: h */
    private ImageView f117240h;

    /* renamed from: i */
    private int f117241i = 2;

    /* JADX WARNING: type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C44912o(com.google.android.material.tabs.TabLayout r7, android.content.Context r8) {
        /*
            r6 = this;
            r6.f117237e = r7
            r6.<init>(r8)
            r0 = 2
            r6.f117241i = r0
            int r0 = r7.f117197o
            r1 = 0
            if (r0 == 0) goto L_0x0027
            android.support.v7.widget.gm r2 = android.support.p033v7.widget.C0678gm.m2375e()
            android.graphics.drawable.Drawable r8 = r2.mo3100c(r8, r0)
            r6.f117236d = r8
            if (r8 == 0) goto L_0x0029
            boolean r0 = r8.isStateful()
            if (r0 == 0) goto L_0x0029
            int[] r0 = r6.getDrawableState()
            r8.setState(r0)
            goto L_0x0029
        L_0x0027:
            r6.f117236d = r1
        L_0x0029:
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            r0 = 0
            r8.setColor(r0)
            android.content.res.ColorStateList r0 = r7.f117192j
            r2 = 1
            if (r0 == 0) goto L_0x005b
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r3 = 925353388(0x3727c5ac, float:1.0E-5)
            r0.setCornerRadius(r3)
            r3 = -1
            r0.setColor(r3)
            android.content.res.ColorStateList r3 = r7.f117192j
            android.content.res.ColorStateList r3 = com.google.android.material.p3513j.C44767a.m79371a(r3)
            android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
            boolean r5 = r7.f117206x
            if (r2 != r5) goto L_0x0053
            r8 = r1
        L_0x0053:
            if (r2 != r5) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r1 = r0
        L_0x0057:
            r4.<init>(r3, r8, r1)
            r8 = r4
        L_0x005b:
            androidx.core.p098j.C2043bi.m5530X(r6, r8)
            r7.invalidate()
            int r8 = r7.f117185c
            int r0 = r7.f117186d
            int r1 = r7.f117187e
            int r3 = r7.f117188f
            androidx.core.p098j.C2043bi.m5556aj(r6, r8, r0, r1, r3)
            r8 = 17
            r6.setGravity(r8)
            boolean r7 = r7.f117203u
            r7 = r7 ^ r2
            r6.setOrientation(r7)
            r6.setClickable(r2)
            android.content.Context r7 = r6.getContext()
            androidx.core.j.ai r7 = androidx.core.p098j.C2015ai.m5366a(r7)
            androidx.core.p098j.C2043bi.m5557ak(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.C44912o.<init>(com.google.android.material.tabs.TabLayout, android.content.Context):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f117220a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m79728c(android.widget.TextView r9, android.widget.ImageView r10, boolean r11) {
        /*
            r8 = this;
            com.google.android.material.tabs.l r0 = r8.f117238f
            r1 = 0
            if (r0 == 0) goto L_0x000e
            android.graphics.drawable.Drawable r0 = r0.f117220a
            if (r0 == 0) goto L_0x000e
            android.graphics.drawable.Drawable r0 = r0.mutate()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            if (r0 == 0) goto L_0x0021
            com.google.android.material.tabs.TabLayout r2 = r8.f117237e
            android.content.res.ColorStateList r2 = r2.f117191i
            androidx.core.graphics.drawable.C1929b.m5226g(r0, r2)
            com.google.android.material.tabs.TabLayout r2 = r8.f117237e
            android.graphics.PorterDuff$Mode r2 = r2.f117194l
            if (r2 == 0) goto L_0x0021
            androidx.core.graphics.drawable.C1929b.m5227h(r0, r2)
        L_0x0021:
            com.google.android.material.tabs.l r2 = r8.f117238f
            if (r2 == 0) goto L_0x0028
            java.lang.CharSequence r2 = r2.f117221b
            goto L_0x0029
        L_0x0028:
            r2 = r1
        L_0x0029:
            r3 = 8
            r4 = 0
            if (r10 == 0) goto L_0x0040
            if (r0 == 0) goto L_0x003a
            r10.setImageDrawable(r0)
            r10.setVisibility(r4)
            r8.setVisibility(r4)
            goto L_0x0040
        L_0x003a:
            r10.setVisibility(r3)
            r10.setImageDrawable(r1)
        L_0x0040:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r5 = 1
            r0 = r0 ^ r5
            if (r9 == 0) goto L_0x0068
            if (r0 == 0) goto L_0x0050
            com.google.android.material.tabs.l r6 = r8.f117238f
            int r6 = r6.f117225f
            r6 = 1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            if (r5 == r0) goto L_0x0055
            r7 = r1
            goto L_0x0056
        L_0x0055:
            r7 = r2
        L_0x0056:
            r9.setText(r7)
            if (r5 == r6) goto L_0x005e
            r7 = 8
            goto L_0x005f
        L_0x005e:
            r7 = 0
        L_0x005f:
            r9.setVisibility(r7)
            if (r0 == 0) goto L_0x0069
            r8.setVisibility(r4)
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            if (r11 == 0) goto L_0x00ad
            if (r10 == 0) goto L_0x00ad
            android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            if (r6 == 0) goto L_0x0085
            int r11 = r10.getVisibility()
            if (r11 != 0) goto L_0x0085
            android.content.Context r11 = r8.getContext()
            float r11 = com.google.android.material.internal.C44741bm.m79308a(r11, r3)
            int r11 = (int) r11
            goto L_0x0086
        L_0x0085:
            r11 = 0
        L_0x0086:
            com.google.android.material.tabs.TabLayout r3 = r8.f117237e
            boolean r3 = r3.f117203u
            if (r3 == 0) goto L_0x009e
            int r3 = androidx.core.p098j.C2104s.m5789b(r9)
            if (r11 == r3) goto L_0x00ad
            androidx.core.p098j.C2104s.m5793f(r9, r11)
            r9.bottomMargin = r4
            r10.setLayoutParams(r9)
            r10.requestLayout()
            goto L_0x00ad
        L_0x009e:
            int r3 = r9.bottomMargin
            if (r11 == r3) goto L_0x00ad
            r9.bottomMargin = r11
            androidx.core.p098j.C2104s.m5793f(r9, r4)
            r10.setLayoutParams(r9)
            r10.requestLayout()
        L_0x00ad:
            com.google.android.material.tabs.l r9 = r8.f117238f
            if (r9 == 0) goto L_0x00b3
            java.lang.CharSequence r1 = r9.f117222c
        L_0x00b3:
            if (r5 != r0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r2 = r1
        L_0x00b7:
            android.support.p033v7.widget.C0751je.m2535a(r8, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.C44912o.m79728c(android.widget.TextView, android.widget.ImageView, boolean):void");
    }

    /* renamed from: d */
    private static final void m79729d(View view) {
        if (view != null) {
            view.addOnLayoutChangeListener(new C44911n(view));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo48446a(C44909l lVar) {
        if (lVar != this.f117238f) {
            this.f117238f = lVar;
            mo48447b();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0102, code lost:
        if (r1 == r0.f117223d) goto L_0x010e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48447b() {
        /*
            r5 = this;
            com.google.android.material.tabs.l r0 = r5.f117238f
            r1 = 0
            if (r0 == 0) goto L_0x0008
            android.view.View r2 = r0.f117224e
            goto L_0x0009
        L_0x0008:
            r2 = r1
        L_0x0009:
            if (r2 == 0) goto L_0x0062
            android.view.ViewParent r3 = r2.getParent()
            if (r3 == r5) goto L_0x002c
            if (r3 == 0) goto L_0x0018
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.removeView(r2)
        L_0x0018:
            android.view.View r3 = r5.f117235c
            if (r3 == 0) goto L_0x0029
            android.view.ViewParent r3 = r3.getParent()
            if (r3 == 0) goto L_0x0029
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r4 = r5.f117235c
            r3.removeView(r4)
        L_0x0029:
            r5.addView(r2)
        L_0x002c:
            r5.f117235c = r2
            android.widget.TextView r3 = r5.f117233a
            r4 = 8
            if (r3 == 0) goto L_0x0037
            r3.setVisibility(r4)
        L_0x0037:
            android.widget.ImageView r3 = r5.f117234b
            if (r3 == 0) goto L_0x0043
            r3.setVisibility(r4)
            android.widget.ImageView r3 = r5.f117234b
            r3.setImageDrawable(r1)
        L_0x0043:
            r1 = 16908308(0x1020014, float:2.3877285E-38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.f117239g = r1
            if (r1 == 0) goto L_0x0056
            int r1 = androidx.core.widget.C2133t.m5906a(r1)
            r5.f117241i = r1
        L_0x0056:
            r1 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5.f117240h = r1
            goto L_0x006f
        L_0x0062:
            android.view.View r2 = r5.f117235c
            if (r2 == 0) goto L_0x006b
            r5.removeView(r2)
            r5.f117235c = r1
        L_0x006b:
            r5.f117239g = r1
            r5.f117240h = r1
        L_0x006f:
            android.view.View r1 = r5.f117235c
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x00d7
            android.widget.ImageView r1 = r5.f117234b
            if (r1 != 0) goto L_0x008f
            android.content.Context r1 = r5.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r4 = 2131624717(0x7f0e030d, float:1.8876622E38)
            android.view.View r1 = r1.inflate(r4, r5, r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5.f117234b = r1
            r5.addView(r1, r3)
        L_0x008f:
            android.widget.TextView r1 = r5.f117233a
            if (r1 != 0) goto L_0x00b1
            android.content.Context r1 = r5.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r4 = 2131624718(0x7f0e030e, float:1.8876624E38)
            android.view.View r1 = r1.inflate(r4, r5, r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.f117233a = r1
            r5.addView(r1)
            android.widget.TextView r1 = r5.f117233a
            int r1 = androidx.core.widget.C2133t.m5906a(r1)
            r5.f117241i = r1
        L_0x00b1:
            android.widget.TextView r1 = r5.f117233a
            com.google.android.material.tabs.TabLayout r4 = r5.f117237e
            int r4 = r4.f117189g
            r1.setTextAppearance(r4)
            com.google.android.material.tabs.TabLayout r1 = r5.f117237e
            android.content.res.ColorStateList r1 = r1.f117190h
            if (r1 == 0) goto L_0x00c5
            android.widget.TextView r4 = r5.f117233a
            r4.setTextColor(r1)
        L_0x00c5:
            android.widget.TextView r1 = r5.f117233a
            android.widget.ImageView r4 = r5.f117234b
            r5.m79728c(r1, r4, r2)
            android.widget.ImageView r1 = r5.f117234b
            m79729d(r1)
            android.widget.TextView r1 = r5.f117233a
            m79729d(r1)
            goto L_0x00e4
        L_0x00d7:
            android.widget.TextView r1 = r5.f117239g
            if (r1 != 0) goto L_0x00df
            android.widget.ImageView r4 = r5.f117240h
            if (r4 == 0) goto L_0x00e4
        L_0x00df:
            android.widget.ImageView r4 = r5.f117240h
            r5.m79728c(r1, r4, r3)
        L_0x00e4:
            if (r0 == 0) goto L_0x00f3
            java.lang.CharSequence r1 = r0.f117222c
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00f3
            java.lang.CharSequence r1 = r0.f117222c
            r5.setContentDescription(r1)
        L_0x00f3:
            if (r0 == 0) goto L_0x010d
            com.google.android.material.tabs.TabLayout r1 = r0.f117226g
            if (r1 == 0) goto L_0x0105
            int r1 = r1.mo48401a()
            r4 = -1
            if (r1 == r4) goto L_0x010d
            int r0 = r0.f117223d
            if (r1 != r0) goto L_0x010d
            goto L_0x010e
        L_0x0105:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Tab not attached to a TabLayout"
            r0.<init>(r1)
            throw r0
        L_0x010d:
            r2 = 0
        L_0x010e:
            r5.setSelected(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.C44912o.mo48447b():void");
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f117236d;
        if (drawable != null && drawable.isStateful() && this.f117236d.setState(drawableState)) {
            invalidate();
            this.f117237e.invalidate();
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1991k kVar = new C1991k(accessibilityNodeInfo);
        kVar.mo5155d(C1990j.m5333a(0, 1, this.f117238f.f117223d, 1, false, isSelected()));
        if (isSelected()) {
            kVar.f5921a.setClickable(false);
            kVar.mo5159g(C1988h.f5905c);
        }
        kVar.mo5158f(getResources().getString(R.string.item_view_role_description));
    }

    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.f117237e.f117198p;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, LinearLayoutManager.INVALID_OFFSET);
        }
        super.onMeasure(i, i2);
        if (this.f117233a != null) {
            float f = this.f117237e.f117195m;
            int i4 = this.f117241i;
            ImageView imageView = this.f117234b;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f117233a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.f117237e.f117196n;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.f117233a.getTextSize();
            int lineCount = this.f117233a.getLineCount();
            int a = C2133t.m5906a(this.f117233a);
            if (f == textSize && (a < 0 || i4 == a)) {
                return;
            }
            if (this.f117237e.f117202t != 1 || f <= textSize || lineCount != 1 || ((layout = this.f117233a.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                this.f117233a.setTextSize(0, f);
                this.f117233a.setMaxLines(i4);
                super.onMeasure(i, i2);
            }
        }
    }

    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f117238f == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.f117238f.mo48441a();
        return true;
    }

    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.f117233a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.f117234b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f117235c;
        if (view != null) {
            view.setSelected(z);
        }
    }
}
