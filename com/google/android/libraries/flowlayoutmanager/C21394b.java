package com.google.android.libraries.flowlayoutmanager;

import android.content.Context;
import android.graphics.PointF;
import android.support.p033v7.widget.C0602dr;

/* renamed from: com.google.android.libraries.flowlayoutmanager.b */
/* compiled from: PG */
final class C21394b extends C0602dr {

    /* renamed from: f */
    final /* synthetic */ FlowLayoutManager f59815f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21394b(FlowLayoutManager flowLayoutManager, Context context) {
        super(context);
        this.f59815f = flowLayoutManager;
    }

    /* renamed from: j */
    public final PointF mo3049j(int i) {
        return this.f59815f.computeScrollVectorForPosition(i);
    }
}
