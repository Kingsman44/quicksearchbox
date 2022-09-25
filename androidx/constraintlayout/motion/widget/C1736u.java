package androidx.constraintlayout.motion.widget;

import android.view.View;

/* renamed from: androidx.constraintlayout.motion.widget.u */
/* compiled from: PG */
final class C1736u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f5164a;

    public C1736u(View view) {
        this.f5164a = view;
    }

    public final void run() {
        this.f5164a.setNestedScrollingEnabled(true);
    }
}
