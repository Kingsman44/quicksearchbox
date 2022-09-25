package com.google.android.libraries.componentview.components.p1685b;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.componentview.components.b.e */
/* compiled from: PG */
public final class C19896e extends LinearLayout implements Checkable {

    /* renamed from: a */
    public final CheckedTextView f55661a = ((CheckedTextView) findViewById(R.id.text));

    /* renamed from: b */
    public final View f55662b = findViewById(R.id.divider);

    public C19896e(Context context) {
        super(context, (AttributeSet) null, 0);
        setOrientation(1);
        inflate(getContext(), R.layout.dropdown_item, this);
    }

    public final boolean isChecked() {
        return this.f55661a.isChecked();
    }

    public final void setChecked(boolean z) {
        this.f55661a.setChecked(z);
    }

    public final void toggle() {
        this.f55661a.toggle();
    }
}
