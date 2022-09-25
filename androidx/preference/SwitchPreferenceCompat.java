package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p033v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.core.content.p091b.C1875x;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: c */
    private final C4005bd f12783c;

    /* renamed from: d */
    private CharSequence f12784d;

    /* renamed from: e */
    private CharSequence f12785e;

    public SwitchPreferenceCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: ae */
    private final void m11458ae(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f12789a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.mo2362g(this.f12784d);
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.mo2356d();
            }
            switchCompat.mo2361f(this.f12785e);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.mo2355c();
            }
            switchCompat.setOnCheckedChangeListener(this.f12783c);
        }
    }

    /* renamed from: a */
    public void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        m11458ae(axVar.mo8435a(R.id.switchWidget));
        mo8390ad(axVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8314b(View view) {
        mo8337D();
        if (((AccessibilityManager) this.f12738j.getSystemService("accessibility")).isEnabled()) {
            m11458ae(view.findViewById(R.id.switchWidget));
            mo8389ac(view.findViewById(16908304));
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f12783c = new C4005bd(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3999ay.f12861m, i, i2);
        mo8393o(C1875x.m5119f(obtainStyledAttributes, 7, 0));
        mo8392l(C1875x.m5119f(obtainStyledAttributes, 6, 1));
        this.f12784d = C1875x.m5119f(obtainStyledAttributes, 9, 3);
        mo8317e();
        this.f12785e = C1875x.m5119f(obtainStyledAttributes, 8, 4);
        mo8317e();
        this.f12790b = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
