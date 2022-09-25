package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.app.C0382c;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.gt */
/* compiled from: PG */
public final class C0685gt extends LinearLayout {

    /* renamed from: a */
    public C0382c f2504a;

    /* renamed from: b */
    final /* synthetic */ C0687gv f2505b;

    /* renamed from: c */
    private final int[] f2506c;

    /* renamed from: d */
    private TextView f2507d;

    /* renamed from: e */
    private ImageView f2508e;

    /* renamed from: f */
    private View f2509f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0685gt(C0687gv gvVar, Context context, C0382c cVar, boolean z) {
        super(context, (AttributeSet) null, R.attr.actionBarTabStyle);
        this.f2505b = gvVar;
        int[] iArr = {16842964};
        this.f2506c = iArr;
        this.f2504a = cVar;
        C0735ip f = C0735ip.m2473f(context, (AttributeSet) null, iArr, R.attr.actionBarTabStyle, 0);
        if (f.f2596b.hasValue(0)) {
            setBackgroundDrawable(f.mo3246b(0));
        }
        f.f2596b.recycle();
        if (z) {
            setGravity(8388627);
        }
        mo3155a();
    }

    /* renamed from: a */
    public final void mo3155a() {
        C0382c cVar = this.f2504a;
        View c = cVar.mo1274c();
        CharSequence charSequence = null;
        if (c != null) {
            ViewParent parent = c.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(c);
                }
                addView(c);
            }
            this.f2509f = c;
            TextView textView = this.f2507d;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f2508e;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f2508e.setImageDrawable((Drawable) null);
                return;
            }
            return;
        }
        View view = this.f2509f;
        if (view != null) {
            removeView(view);
            this.f2509f = null;
        }
        Drawable b = cVar.mo1273b();
        CharSequence e = cVar.mo1276e();
        if (b != null) {
            if (this.f2508e == null) {
                AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 16;
                appCompatImageView.setLayoutParams(layoutParams);
                addView(appCompatImageView, 0);
                this.f2508e = appCompatImageView;
            }
            this.f2508e.setImageDrawable(b);
            this.f2508e.setVisibility(0);
        } else {
            ImageView imageView2 = this.f2508e;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                this.f2508e.setImageDrawable((Drawable) null);
            }
        }
        boolean z = !TextUtils.isEmpty(e);
        if (z) {
            if (this.f2507d == null) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, R.attr.actionBarTabTextStyle);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 16;
                appCompatTextView.setLayoutParams(layoutParams2);
                addView(appCompatTextView);
                this.f2507d = appCompatTextView;
            }
            this.f2507d.setText(e);
            this.f2507d.setVisibility(0);
        } else {
            TextView textView2 = this.f2507d;
            if (textView2 != null) {
                textView2.setVisibility(8);
                this.f2507d.setText((CharSequence) null);
            }
        }
        ImageView imageView3 = this.f2508e;
        if (imageView3 != null) {
            imageView3.setContentDescription(cVar.mo1275d());
        }
        if (!z) {
            charSequence = cVar.mo1275d();
        }
        C0751je.m2535a(this, charSequence);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.app.ActionBar$Tab");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.app.ActionBar$Tab");
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f2505b.f2516e > 0 && getMeasuredWidth() > (i3 = this.f2505b.f2516e)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public final void setSelected(boolean z) {
        boolean isSelected = isSelected();
        super.setSelected(z);
        if (isSelected != z && z) {
            sendAccessibilityEvent(4);
        }
    }
}
