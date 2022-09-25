package com.android.datetimepicker.date;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ViewAnimator;

/* compiled from: PG */
public class AccessibleDateAnimator extends ViewAnimator {

    /* renamed from: a */
    public long f16146a;

    public AccessibleDateAnimator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        accessibilityEvent.getText().clear();
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), this.f16146a, 22));
        return true;
    }
}
