package com.google.android.libraries.material.opensearchbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.ActionMenuView;
import android.support.p033v7.widget.C0678gm;
import android.support.p033v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2104s;
import androidx.customview.view.AbsSavedState;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.C44505aa;
import com.google.android.material.appbar.C44518n;
import com.google.android.material.internal.C44733be;
import com.google.android.material.internal.C44735bg;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44780k;
import com.google.android.material.p3515l.C44785p;
import com.google.android.material.theme.p3518a.C44965a;

/* compiled from: PG */
public class OpenSearchBar extends Toolbar {

    /* renamed from: B */
    public final TextView f77584B;

    /* renamed from: C */
    public final C28547b f77585C;

    /* renamed from: D */
    public View f77586D;

    /* renamed from: E */
    public int f77587E;

    /* renamed from: F */
    public C44779j f77588F;

    /* renamed from: G */
    private final boolean f77589G;

    /* renamed from: H */
    private final boolean f77590H;

    /* renamed from: I */
    private final Drawable f77591I;

    /* renamed from: J */
    private final boolean f77592J;

    /* renamed from: K */
    private final boolean f77593K;

    /* renamed from: L */
    private Integer f77594L;

    /* renamed from: M */
    private Drawable f77595M;

    /* renamed from: N */
    private boolean f77596N;

    /* compiled from: PG */
    public class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: e */
        private boolean f77598e = false;

        public ScrollingViewBehavior() {
        }

        /* renamed from: e */
        public final boolean mo4957e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean e = super.mo4957e(coordinatorLayout, view, view2);
            if (!this.f77598e && (view2 instanceof AppBarLayout)) {
                this.f77598e = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                C44505aa.m78682a(appBarLayout, 0.0f);
            }
            return e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public final boolean mo34098s() {
            return true;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public OpenSearchBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: F */
    private final Drawable m53401F(Drawable drawable) {
        int i;
        if (!this.f77592J || drawable == null) {
            return drawable;
        }
        Integer num = this.f77594L;
        if (num != null) {
            i = num.intValue();
        } else {
            i = C44535e.m78719b(this, drawable == this.f77591I ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
        }
        Drawable mutate = drawable.mutate();
        C1929b.m5225f(mutate, i);
        return mutate;
    }

    /* renamed from: G */
    private final void m53402G(boolean z) {
        Drawable drawable;
        ImageButton b = C44735bg.m79303b(this);
        if (b != null) {
            boolean z2 = !z;
            b.setClickable(z2);
            b.setFocusable(z2);
            Drawable background = b.getBackground();
            if (background != null) {
                this.f77595M = background;
            }
            if (z) {
                drawable = null;
            } else {
                drawable = this.f77595M;
            }
            b.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: H */
    private static final int m53403H(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f77589G && this.f77586D == null && !(view instanceof ActionMenuView)) {
            this.f77586D = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: n */
    public final void mo2404n(int i) {
        super.mo2404n(i);
        this.f77587E = i;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C44780k.m79413d(this, this.f77588F);
        if (this.f77590H && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.google_opensearchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.google_opensearchbar_margin_vertical);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = m53403H(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = m53403H(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = m53403H(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = m53403H(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
        if (getLayoutParams() instanceof C44518n) {
            C44518n nVar = (C44518n) getLayoutParams();
            if (this.f77596N) {
                if (nVar.f115750a == 0) {
                    nVar.f115750a = 53;
                }
            } else if (nVar.f115750a == 53) {
                nVar.f115750a = 0;
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = this.f77584B.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(this.f77584B.getHint());
        accessibilityNodeInfo.setShowingHintText(isEmpty);
        if (isEmpty) {
            text = this.f77584B.getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f77586D;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i5 = measuredWidth + measuredWidth2;
            int measuredHeight = this.f77586D.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i6 = measuredHeight + measuredHeight2;
            View view2 = this.f77586D;
            if (C2043bi.m5577f(this) == 1) {
                view2.layout(getMeasuredWidth() - i5, measuredHeight2, getMeasuredWidth() - measuredWidth2, i6);
            } else {
                view2.layout(measuredWidth2, measuredHeight2, i5, i6);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.f77586D;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6116d);
        this.f77584B.setText(savedState.f77597a);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        String str;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = this.f77584B.getText();
        if (text == null) {
            str = null;
        } else {
            str = text.toString();
        }
        savedState.f77597a = str;
        return savedState;
    }

    /* renamed from: s */
    public final void mo2418s(Drawable drawable) {
        super.mo2418s(m53401F(drawable));
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        C44779j jVar = this.f77588F;
        if (jVar != null) {
            jVar.mo48123U(f);
        }
    }

    /* renamed from: t */
    public final void mo2419t(View.OnClickListener onClickListener) {
        if (!this.f77593K) {
            super.mo2419t(onClickListener);
            m53402G(onClickListener == null);
        }
    }

    /* renamed from: v */
    public final void mo2421v(CharSequence charSequence) {
    }

    /* renamed from: x */
    public final void mo2423x(CharSequence charSequence) {
    }

    /* compiled from: PG */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C28545a();

        /* renamed from: a */
        String f77597a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f77597a = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            parcel.writeString(this.f77597a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public OpenSearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.openSearchBarStyle);
    }

    public OpenSearchBar(Context context, AttributeSet attributeSet, int i) {
        super(C44965a.m79936a(context, attributeSet, i, 2132151369), attributeSet, i);
        this.f77587E = -1;
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
                throw new UnsupportedOperationException("OpenSearchBar does not support title. Use hint or text instead.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                throw new UnsupportedOperationException("OpenSearchBar does not support subtitle. Use hint or text instead.");
            }
        }
        Drawable c = C0678gm.m2375e().mo3100c(context2, R.drawable.quantum_gm_ic_search_vd_theme_24);
        this.f77591I = c;
        this.f77585C = new C28547b();
        TypedArray a = C44733be.m79295a(context2, attributeSet, C28546aa.f77625a, i, 2132151369, new int[0]);
        C44785p pVar = new C44785p(C44785p.m79428e(context2, attributeSet, i, 2132151369));
        float dimension = a.getDimension(5, 0.0f);
        this.f77590H = a.getBoolean(3, true);
        this.f77596N = a.getBoolean(4, true);
        boolean z = a.getBoolean(7, false);
        this.f77593K = a.getBoolean(6, false);
        this.f77592J = a.getBoolean(11, true);
        if (a.hasValue(8)) {
            this.f77594L = Integer.valueOf(a.getColor(8, -1));
        }
        int resourceId = a.getResourceId(0, -1);
        String string = a.getString(1);
        String string2 = a.getString(2);
        float dimension2 = a.getDimension(10, -1.0f);
        int color = a.getColor(9, 0);
        a.recycle();
        if (!z) {
            super.mo2418s(m53401F(mo2391e() != null ? mo2391e() : c));
            m53402G(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.open_search_bar, this);
        this.f77589G = true;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.f77584B = textView;
        C2043bi.m5548ab(this, dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
        }
        textView.setText(string);
        textView.setHint(string2);
        if (mo2391e() == null) {
            C2104s.m5794g((ViewGroup.MarginLayoutParams) textView.getLayoutParams(), getResources().getDimensionPixelSize(R.dimen.google_opensearchbar_text_margin_start_no_navigation_icon));
        }
        C44779j jVar = new C44779j(pVar);
        this.f77588F = jVar;
        jVar.mo48121S(getContext());
        this.f77588F.mo48123U(dimension);
        if (dimension2 >= 0.0f) {
            this.f77588F.mo48127Y(dimension2, color);
        }
        int b = C44535e.m78719b(this, R.attr.colorSurface);
        int b2 = C44535e.m78719b(this, R.attr.colorControlHighlight);
        this.f77588F.mo48124V(ColorStateList.valueOf(b));
        ColorStateList valueOf = ColorStateList.valueOf(b2);
        C44779j jVar2 = this.f77588F;
        C2043bi.m5530X(this, new RippleDrawable(valueOf, jVar2, jVar2));
    }
}
