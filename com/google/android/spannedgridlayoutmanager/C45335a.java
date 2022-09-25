package com.google.android.spannedgridlayoutmanager;

import android.content.Context;
import android.graphics.PointF;
import android.support.p033v7.widget.C0602dr;

/* renamed from: com.google.android.spannedgridlayoutmanager.a */
/* compiled from: PG */
final class C45335a extends C0602dr {

    /* renamed from: f */
    final /* synthetic */ SpannedGridLayoutManager f118487f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45335a(SpannedGridLayoutManager spannedGridLayoutManager, Context context) {
        super(context);
        this.f118487f = spannedGridLayoutManager;
    }

    /* renamed from: j */
    public final PointF mo3049j(int i) {
        return new PointF(0.0f, (float) (this.f118487f.f118468a.mo49352d(i) - this.f118487f.f118473f));
    }
}
