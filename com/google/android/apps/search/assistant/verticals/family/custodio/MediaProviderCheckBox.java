package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Objects;

/* compiled from: PG */
public final class MediaProviderCheckBox extends ConstraintLayout implements Checkable {

    /* renamed from: d */
    public TextView f360602d;

    /* renamed from: e */
    private View f360603e;

    /* renamed from: f */
    private TextView f360604f;

    /* renamed from: g */
    private TextView f360605g;

    /* renamed from: h */
    private CheckBox f360606h;

    public MediaProviderCheckBox(Context context) {
        super(context);
        m214715e();
    }

    /* renamed from: e */
    private final void m214715e() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.assistant_custodio_media_provider_item, this, true);
        this.f360603e = inflate;
        this.f360602d = (TextView) inflate.findViewById(R.id.assistant_custodio_media_provider_textview);
        this.f360604f = (TextView) this.f360603e.findViewById(R.id.assistant_custodio_media_provider_dot_textview);
        this.f360605g = (TextView) this.f360603e.findViewById(R.id.assistant_custodio_media_provider_settings_link);
        this.f360606h = (CheckBox) this.f360603e.findViewById(R.id.assistant_custodio_media_provider_checkbox);
        ((View) Objects.requireNonNull(this.f360603e)).setOnClickListener(new C132297es(this));
    }

    /* renamed from: b */
    public final void mo110461b(C132299eu euVar) {
        ((CheckBox) Objects.requireNonNull(this.f360606h)).setOnCheckedChangeListener(euVar != null ? new C132298et(euVar) : null);
    }

    /* renamed from: c */
    public final void mo110462c(View.OnClickListener onClickListener) {
        ((TextView) Objects.requireNonNull(this.f360605g)).setOnClickListener(onClickListener);
    }

    /* renamed from: d */
    public final void mo110463d(String str) {
        if (str != null) {
            ((TextView) Objects.requireNonNull(this.f360605g)).setText(str);
            ((TextView) Objects.requireNonNull(this.f360605g)).setVisibility(0);
            ((TextView) Objects.requireNonNull(this.f360604f)).setVisibility(0);
            return;
        }
        ((TextView) Objects.requireNonNull(this.f360605g)).setVisibility(8);
        ((TextView) Objects.requireNonNull(this.f360604f)).setVisibility(8);
    }

    public final CharSequence getAccessibilityClassName() {
        return ((CheckBox) Objects.requireNonNull(this.f360606h)).getAccessibilityClassName();
    }

    public final boolean isChecked() {
        return ((CheckBox) Objects.requireNonNull(this.f360606h)).isChecked();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(((CheckBox) Objects.requireNonNull(this.f360606h)).isChecked());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(((CheckBox) Objects.requireNonNull(this.f360606h)).isChecked());
        accessibilityNodeInfo.setClassName(((CheckBox) Objects.requireNonNull(this.f360606h)).getAccessibilityClassName());
    }

    public final void setChecked(boolean z) {
        ((CheckBox) Objects.requireNonNull(this.f360606h)).setChecked(z);
    }

    public final void toggle() {
        ((CheckBox) Objects.requireNonNull(this.f360606h)).toggle();
    }

    public MediaProviderCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m214715e();
    }

    public MediaProviderCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m214715e();
    }
}
