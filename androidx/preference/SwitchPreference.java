package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.core.content.p091b.C1875x;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: c */
    private final C4004bc f12780c;

    /* renamed from: d */
    private CharSequence f12781d;

    /* renamed from: e */
    private CharSequence f12782e;

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1875x.m5115b(context, R.attr.switchPreferenceStyle, 16843629));
    }

    /* renamed from: ae */
    private final void m11455ae(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f12789a);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f12781d);
            switchR.setTextOff(this.f12782e);
            switchR.setOnCheckedChangeListener(this.f12780c);
        }
    }

    /* renamed from: a */
    public void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        m11455ae(axVar.mo8435a(16908352));
        mo8390ad(axVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8314b(View view) {
        mo8337D();
        if (((AccessibilityManager) this.f12738j.getSystemService("accessibility")).isEnabled()) {
            m11455ae(view.findViewById(16908352));
            mo8389ac(view.findViewById(16908304));
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f12780c = new C4004bc(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3999ay.f12860l, i, 0);
        mo8393o(C1875x.m5119f(obtainStyledAttributes, 7, 0));
        mo8392l(C1875x.m5119f(obtainStyledAttributes, 6, 1));
        this.f12781d = C1875x.m5119f(obtainStyledAttributes, 9, 3);
        mo8317e();
        this.f12782e = C1875x.m5119f(obtainStyledAttributes, 8, 4);
        mo8317e();
        this.f12790b = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
