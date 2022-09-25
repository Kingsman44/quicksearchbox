package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.MaxHeightRecyclerView */
/* compiled from: PG */
public class MaxHeightRecyclerView extends RecyclerView {

    /* renamed from: b */
    private static final C59071e f314283b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.ui.MaxHeightRecyclerView");

    /* renamed from: a */
    public int f314284a;

    public MaxHeightRecyclerView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (NullPointerException e) {
            ((C59052c) ((C59052c) ((C59052c) f314283b.mo56225c()).mo56382g(e)).mo56372aa(27912)).mo56386p("#MaxHeightRecyclerView.onLayout: Caught NPE");
            throw e;
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f314284a, LinearLayoutManager.INVALID_OFFSET));
    }

    public MaxHeightRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
