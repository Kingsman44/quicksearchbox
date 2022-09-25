package com.google.android.apps.search.googleapp.search.srp.error;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* compiled from: PG */
public final class ErrorCardView extends LinearLayout {

    /* renamed from: a */
    private TextView f374910a;

    /* renamed from: b */
    private TextView f374911b;

    public ErrorCardView(Context context) {
        super(context);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            onPopulateAccessibilityEvent(accessibilityEvent);
            if (!accessibilityEvent.getText().isEmpty()) {
                return true;
            }
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f374910a = (TextView) findViewById(R.id.googleapp_error_card_title);
        this.f374911b = (TextView) findViewById(R.id.googleapp_error_card_explanation);
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32) {
            List text = accessibilityEvent.getText();
            StringBuilder sb = new StringBuilder();
            TextView textView = this.f374910a;
            if (textView != null) {
                String obj = textView.getText().toString();
                sb.append(obj);
                if (!obj.endsWith(".")) {
                    sb.append(". ");
                }
            }
            TextView textView2 = this.f374911b;
            if (textView2 != null) {
                sb.append(textView2.getText());
            }
            text.add(sb.toString());
        }
    }

    public ErrorCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ErrorCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
