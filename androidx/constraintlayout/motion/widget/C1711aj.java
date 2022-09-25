package androidx.constraintlayout.motion.widget;

import android.view.View;

/* renamed from: androidx.constraintlayout.motion.widget.aj */
/* compiled from: PG */
public final /* synthetic */ class C1711aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1714am f4970a;

    /* renamed from: b */
    public final /* synthetic */ View[] f4971b;

    public /* synthetic */ C1711aj(C1714am amVar, View[] viewArr) {
        this.f4970a = amVar;
        this.f4971b = viewArr;
    }

    public final void run() {
        C1714am amVar = this.f4970a;
        View[] viewArr = this.f4971b;
        if (amVar.f4992g != -1) {
            for (View tag : viewArr) {
                tag.setTag(amVar.f4992g, Long.valueOf(System.nanoTime()));
            }
        }
        if (amVar.f4993h != -1) {
            for (View tag2 : viewArr) {
                tag2.setTag(amVar.f4993h, (Object) null);
            }
        }
    }
}
