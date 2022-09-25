package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.content.Context;
import android.support.p033v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl.C81731aj;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl.C81750bb;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl.C81772bx;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.ac */
/* compiled from: PG */
final class C81677ac extends RecyclerView {

    /* renamed from: a */
    private final C81676ab f223388a;

    public C81677ac(Context context, C81676ab abVar) {
        super(context);
        this.f223388a = abVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C81676ab abVar = ((C81720z) this.f223388a).f223480a.f223378h;
        if (abVar != null) {
            C81772bx bxVar = ((C81750bb) abVar).f223602a;
            bxVar.f223649a.mo28212l("[NGA] onCarouselInteracted", new C81731aj(bxVar));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
