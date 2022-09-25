package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.content.Context;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.OpaRecyclerView */
/* compiled from: PG */
public class OpaRecyclerView extends RecyclerView {

    /* renamed from: a */
    private static final C59071e f314920a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ui.OpaRecyclerView");

    public OpaRecyclerView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (NullPointerException e) {
            ((C59052c) ((C59052c) ((C59052c) f314920a.mo56225c()).mo56382g(e)).mo56372aa(28360)).mo56386p("#OpaRecyclerView.onLayout: Caught NPE");
            throw e;
        }
    }

    public OpaRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OpaRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
