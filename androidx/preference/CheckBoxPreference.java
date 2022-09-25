package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.core.content.p091b.C1875x;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: c */
    private final C3974a f12692c;

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1875x.m5115b(context, R.attr.checkBoxPreferenceStyle, 16842895));
    }

    /* renamed from: ae */
    private final void m11344ae(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f12789a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f12692c);
        }
    }

    /* renamed from: a */
    public void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        m11344ae(axVar.mo8435a(16908289));
        mo8390ad(axVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8314b(View view) {
        mo8337D();
        if (((AccessibilityManager) this.f12738j.getSystemService("accessibility")).isEnabled()) {
            m11344ae(view.findViewById(16908289));
            mo8389ac(view.findViewById(16908304));
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f12692c = new C3974a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3999ay.f12850b, i, 0);
        mo8393o(C1875x.m5119f(obtainStyledAttributes, 5, 0));
        mo8392l(C1875x.m5119f(obtainStyledAttributes, 4, 1));
        this.f12790b = obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
