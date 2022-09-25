package com.google.android.apps.gsa.assistant.settings.shared.p5800ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.shared.ui.AdminDisabledItemView */
/* compiled from: PG */
public final class AdminDisabledItemView extends LinearLayout {
    public AdminDisabledItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AdminDisabledItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.admin_disabled_item_layout, this);
    }
}
