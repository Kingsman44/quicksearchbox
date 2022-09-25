package com.google.android.libraries.home.coreui.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.chip.C44596f;
import com.google.android.material.chip.Chip;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class FilterChip extends Chip {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FilterChip(Context context) {
        this(context, (AttributeSet) null, 0, 6, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FilterChip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C69664n.m101061g(context, "context");
        setClickable(true);
        super.mo47683n(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C23637a.f64656a, R.attr.filterChipStyle, 2132149150);
        C69664n.m101060f(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        super.setChecked(obtainStyledAttributes.getBoolean(0, false));
        m44119d();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private final void m44119d() {
        mo47719t(!isChecked());
        boolean isChecked = isChecked();
        C44596f fVar = this.f116093d;
        if (fVar != null) {
            fVar.mo47763i(isChecked);
        }
    }

    public final void setChecked(boolean z) {
        super.setChecked(z);
        m44119d();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilterChip(Context context, AttributeSet attributeSet, int i, int i2, C69659i iVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.filterChipStyle : i);
    }
}
