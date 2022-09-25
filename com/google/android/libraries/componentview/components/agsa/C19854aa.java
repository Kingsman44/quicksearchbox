package com.google.android.libraries.componentview.components.agsa;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.componentview.components.agsa.aa */
/* compiled from: PG */
abstract class C19854aa implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: b */
    final /* synthetic */ NativePaginatorView f55530b;

    public C19854aa(NativePaginatorView nativePaginatorView) {
        this.f55530b = nativePaginatorView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25150a();

    public final void onClick(View view) {
        if (this.f55530b.f55473p != null) {
            mo25150a();
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            return true;
        }
        if (motionEvent.getAction() != 1 || this.f55530b.f55473p == null) {
            return false;
        }
        mo25150a();
        return true;
    }
}
