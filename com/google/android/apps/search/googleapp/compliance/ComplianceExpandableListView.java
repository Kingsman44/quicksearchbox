package com.google.android.apps.search.googleapp.compliance;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ExpandableListView;

/* compiled from: PG */
public final class ComplianceExpandableListView extends ExpandableListView {
    public ComplianceExpandableListView(Context context) {
        super(context);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, LinearLayoutManager.INVALID_OFFSET));
    }

    public ComplianceExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ComplianceExpandableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
