package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class GroupArgumentRadioButton extends LinearLayout {

    /* renamed from: c */
    private static final int[] f261042c = {R.attr.state_showingVoiceOfGoogle};

    /* renamed from: a */
    public TextView f261043a;

    /* renamed from: b */
    public boolean f261044b;

    public GroupArgumentRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        if (this.f261044b) {
            i++;
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i);
        if (this.f261044b) {
            mergeDrawableStates(onCreateDrawableState, f261042c);
        }
        return onCreateDrawableState;
    }

    public final void onFinishInflate() {
        TextView textView = (TextView) findViewById(R.id.text);
        textView.getClass();
        this.f261043a = textView;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(isSelected());
        accessibilityEvent.setClassName(RadioButton.class.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(isSelected());
        accessibilityNodeInfo.setClassName(RadioButton.class.getName());
    }

    public GroupArgumentRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GroupArgumentRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
