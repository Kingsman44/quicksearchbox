package com.google.p3723ar.imp.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;

/* renamed from: com.google.ar.imp.view.r */
/* compiled from: PG */
public class C48008r extends TextureView implements C48005o {

    /* renamed from: b */
    public final Context f124243b;

    /* renamed from: c */
    public C48004n f124244c;

    public C48008r(Context context) {
        super(context);
        this.f124243b = context;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C48004n nVar = this.f124244c;
        if (nVar != null) {
            nVar.mo53117c(getDisplay().getRotation());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C48004n nVar = this.f124244c;
        if (nVar != null) {
            return nVar.mo53118d(motionEvent);
        }
        return false;
    }
}
