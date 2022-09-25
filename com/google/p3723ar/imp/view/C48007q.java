package com.google.p3723ar.imp.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceView;

/* renamed from: com.google.ar.imp.view.q */
/* compiled from: PG */
public final class C48007q extends SurfaceView implements C48005o {

    /* renamed from: a */
    public final Context f124241a;

    /* renamed from: b */
    public C48004n f124242b;

    public C48007q(Context context) {
        super(context);
        this.f124241a = context;
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C48004n nVar = this.f124242b;
        if (nVar != null) {
            nVar.mo53117c(getDisplay().getRotation());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C48004n nVar = this.f124242b;
        if (nVar != null) {
            return nVar.mo53118d(motionEvent);
        }
        return false;
    }
}
