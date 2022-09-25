package com.google.android.apps.gsa.staticplugins.messages.monet.p8038ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7148ui.C90638an;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.ui.MessageCardView */
/* compiled from: PG */
public class MessageCardView extends LinearLayout {

    /* renamed from: a */
    private TextView f286859a;

    /* renamed from: b */
    private TextView f286860b;

    public MessageCardView(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo93415a() {
        StringBuilder sb = new StringBuilder();
        TextView textView = this.f286859a;
        if (textView != null) {
            String obj = textView.getText().toString();
            sb.append(obj);
            if (!obj.endsWith(".")) {
                sb.append(". ");
            }
        }
        TextView textView2 = this.f286860b;
        if (textView2 != null) {
            sb.append(textView2.getText());
        }
        return sb.toString();
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
        this.f286859a = (TextView) findViewById(R.id.message_card_title);
        this.f286860b = (TextView) findViewById(R.id.message_card_explanation);
        C90638an anVar = new C90638an(0);
        anVar.f253489r = 3;
        anVar.f253473b = false;
        setLayoutParams(anVar);
        setImportantForAccessibility(1);
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText().add(mo93415a());
        }
    }

    public MessageCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
