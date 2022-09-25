package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Objects;

/* compiled from: PG */
public final class MediaFilterRadioButton extends ConstraintLayout implements Checkable {

    /* renamed from: d */
    private View f360597d;

    /* renamed from: e */
    private TextView f360598e;

    /* renamed from: f */
    private TextView f360599f;

    /* renamed from: g */
    private RadioButton f360600g;

    /* renamed from: h */
    private ImageView f360601h;

    public MediaFilterRadioButton(Context context) {
        super(context);
        m214710f();
    }

    /* renamed from: f */
    private final void m214710f() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.assistant_custodio_media_filter_item, this, true);
        this.f360597d = inflate;
        this.f360601h = (ImageView) inflate.findViewById(R.id.assistant_custodio_media_filter_item_image);
        this.f360598e = (TextView) this.f360597d.findViewById(R.id.assistant_custodio_media_filter_item_title);
        this.f360599f = (TextView) this.f360597d.findViewById(R.id.assistant_custodio_media_filter_item_subtitle);
        this.f360600g = (RadioButton) this.f360597d.findViewById(R.id.assistant_custodio_media_filter_radio_button);
        ((View) Objects.requireNonNull(this.f360597d)).setOnClickListener(new C132294ep(this));
    }

    /* renamed from: b */
    public final void mo110451b(String str) {
        ((TextView) Objects.requireNonNull(this.f360599f)).setText(str);
    }

    /* renamed from: c */
    public final void mo110452c(int i) {
        ((ImageView) Objects.requireNonNull(this.f360601h)).setImageResource(i);
    }

    /* renamed from: d */
    public final void mo110453d(C132296er erVar) {
        ((RadioButton) Objects.requireNonNull(this.f360600g)).setOnCheckedChangeListener(erVar != null ? new C132295eq(this, erVar) : null);
    }

    /* renamed from: e */
    public final void mo110454e(String str) {
        ((TextView) Objects.requireNonNull(this.f360598e)).setText(str);
    }

    public final CharSequence getAccessibilityClassName() {
        return ((RadioButton) Objects.requireNonNull(this.f360600g)).getAccessibilityClassName();
    }

    public final boolean isChecked() {
        return ((RadioButton) Objects.requireNonNull(this.f360600g)).isChecked();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(((RadioButton) Objects.requireNonNull(this.f360600g)).isChecked());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(((RadioButton) Objects.requireNonNull(this.f360600g)).isChecked());
        accessibilityNodeInfo.setClassName(((RadioButton) Objects.requireNonNull(this.f360600g)).getAccessibilityClassName());
    }

    public final void setChecked(boolean z) {
        ((RadioButton) Objects.requireNonNull(this.f360600g)).setChecked(z);
    }

    public final void toggle() {
        ((RadioButton) Objects.requireNonNull(this.f360600g)).toggle();
    }

    public MediaFilterRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m214710f();
    }

    public MediaFilterRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m214710f();
    }
}
