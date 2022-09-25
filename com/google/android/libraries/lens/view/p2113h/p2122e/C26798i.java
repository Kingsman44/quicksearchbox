package com.google.android.libraries.lens.view.p2113h.p2122e;

import android.graphics.PointF;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.lens.view.h.e.i */
/* compiled from: PG */
public final /* synthetic */ class C26798i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26784ai f73061a;

    /* renamed from: b */
    public final /* synthetic */ PointF f73062b;

    public /* synthetic */ C26798i(C26784ai aiVar, PointF pointF) {
        this.f73061a = aiVar;
        this.f73062b = pointF;
    }

    public final void run() {
        C26784ai aiVar = this.f73061a;
        PointF pointF = this.f73062b;
        if (pointF.x < 0.0f || pointF.x > 1.0f || pointF.y < 0.0f || pointF.y > 1.0f) {
            ((C58970a) ((C58970a) C26784ai.f72971a.mo56226d()).mo56372aa(49176)).mo56389s("The focus point at %s is out of the range.", pointF);
        } else {
            aiVar.f73031w.mo31984n(pointF);
        }
    }
}
