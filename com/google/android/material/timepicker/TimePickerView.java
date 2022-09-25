package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
class TimePickerView extends ConstraintLayout {

    /* renamed from: a */
    public final Chip f117518a;

    /* renamed from: b */
    public final Chip f117519b;

    /* renamed from: c */
    public final ClockHandView f117520c;

    /* renamed from: d */
    public final ClockFaceView f117521d;

    /* renamed from: e */
    public final MaterialButtonToggleGroup f117522e;

    /* renamed from: f */
    public C44976aj f117523f;

    /* renamed from: g */
    public C44977ak f117524g;

    /* renamed from: h */
    public C44975ai f117525h;

    /* renamed from: i */
    private final View.OnClickListener f117526i;

    public TimePickerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public static final void m79956a(Chip chip, boolean z) {
        chip.setChecked(z);
        C2043bi.m5527U(chip, true != z ? 0 : 2);
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f117519b.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C44972af afVar = new C44972af(this);
        this.f117526i = afVar;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.f117521d = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f117522e = materialButtonToggleGroup;
        materialButtonToggleGroup.f115983a.add(new C44971ae(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.f117518a = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f117519b = chip2;
        this.f117520c = (ClockHandView) findViewById(R.id.material_clock_hand);
        C44974ah ahVar = new C44974ah(new GestureDetector(getContext(), new C44973ag(this)));
        chip.setOnTouchListener(ahVar);
        chip2.setOnTouchListener(ahVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(afVar);
        chip2.setOnClickListener(afVar);
        chip.f116097h = "android.view.View";
        chip2.f116097h = "android.view.View";
    }
}
