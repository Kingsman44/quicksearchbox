package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.components.NonScrollableListView */
/* compiled from: PG */
public class NonScrollableListView extends ListView {
    public NonScrollableListView(Context context) {
        super(context);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, LinearLayoutManager.INVALID_OFFSET));
        getLayoutParams().height = getMeasuredHeight();
    }

    public NonScrollableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NonScrollableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
