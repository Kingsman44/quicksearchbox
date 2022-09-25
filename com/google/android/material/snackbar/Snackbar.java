package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class Snackbar extends BaseTransientBottomBar {

    /* renamed from: w */
    private static final int[] f117103w = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* renamed from: v */
    public C44887r f117104v;

    /* renamed from: x */
    private final AccessibilityManager f117105x;

    /* renamed from: y */
    private boolean f117106y;

    /* compiled from: PG */
    public final class SnackbarLayout extends C44890u {
        public SnackbarLayout(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        super(context, viewGroup, view, snackbarContentLayout);
        this.f117105x = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: p */
    public static Snackbar m79660p(View view, int i, int i2) {
        return m79661q((Context) null, view, view.getResources().getText(i), i2);
    }

    /* renamed from: q */
    public static Snackbar m79661q(Context context, View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (view.getId() == 16908290) {
                        viewGroup = (ViewGroup) view;
                        break;
                    }
                    viewGroup2 = (ViewGroup) view;
                }
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                        continue;
                    } else {
                        view = null;
                        continue;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                viewGroup = (ViewGroup) view;
                break;
            }
        }
        if (viewGroup != null) {
            if (context == null) {
                context = viewGroup.getContext();
            }
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f117103w);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            int i2 = R.layout.design_layout_snackbar_include;
            if (!(resourceId == -1 || resourceId2 == -1)) {
                i2 = R.layout.mtrl_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, viewGroup, false);
            Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            snackbar.mo48351r().f117107a.setText(charSequence);
            snackbar.f117090k = i;
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: a */
    public final int mo48336a() {
        int i = this.f117090k;
        if (i == -2) {
            return -2;
        }
        return this.f117105x.getRecommendedTimeoutMillis(i, (true != this.f117106y ? 0 : 4) | 3);
    }

    /* renamed from: r */
    public final SnackbarContentLayout mo48351r() {
        return (SnackbarContentLayout) this.f117089j.getChildAt(0);
    }

    /* renamed from: s */
    public final void mo48352s(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button = mo48351r().f117108b;
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            button.setVisibility(8);
            button.setOnClickListener((View.OnClickListener) null);
            this.f117106y = false;
            return;
        }
        this.f117106y = true;
        button.setVisibility(0);
        button.setText(charSequence);
        button.setOnClickListener(new C44892w(this, onClickListener));
    }

    /* renamed from: t */
    public final void mo48353t(int i, View.OnClickListener onClickListener) {
        mo48352s(this.f117088i.getText(i), onClickListener);
    }
}
