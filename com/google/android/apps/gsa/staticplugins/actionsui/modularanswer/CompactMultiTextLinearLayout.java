package com.google.android.apps.gsa.staticplugins.actionsui.modularanswer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: PG */
public class CompactMultiTextLinearLayout extends LinearLayout {

    /* renamed from: a */
    public C93670a f261460a;

    /* renamed from: b */
    private int f261461b;

    /* renamed from: c */
    private int f261462c;

    /* renamed from: d */
    private int f261463d;

    public CompactMultiTextLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo88132a(int i) {
        if (this.f261462c != i) {
            this.f261462c = i;
            requestLayout();
        }
    }

    /* renamed from: b */
    public final void mo88133b() {
        if (this.f261461b != 9) {
            this.f261461b = 9;
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (!(view instanceof TextView)) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        TextView textView = (TextView) view;
        int min = Math.min(this.f261462c, this.f261463d);
        textView.setMaxLines(min);
        if (min == 0) {
            textView.setVisibility(8);
            C93670a aVar = this.f261460a;
            if (aVar != null) {
                aVar.mo88137a(textView);
            }
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
        int i5 = this.f261463d;
        if (i5 != Integer.MAX_VALUE) {
            this.f261463d = Math.max(i5 - textView.getLineCount(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        this.f261463d = this.f261461b;
        super.onMeasure(i, i2);
    }

    public CompactMultiTextLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CompactMultiTextLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f261461b = Integer.MAX_VALUE;
        this.f261462c = Integer.MAX_VALUE;
    }
}
