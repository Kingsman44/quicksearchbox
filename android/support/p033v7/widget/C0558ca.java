package android.support.p033v7.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.ca */
/* compiled from: PG */
final class C0558ca implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f2160a;

    /* renamed from: b */
    final /* synthetic */ C0568ck f2161b;

    public C0558ca(C0568ck ckVar, ArrayList arrayList) {
        this.f2161b = ckVar;
        this.f2160a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f2160a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0567cj cjVar = (C0567cj) arrayList.get(i);
            C0568ck ckVar = this.f2161b;
            C0673gh ghVar = cjVar.f2194a;
            int i2 = cjVar.f2195b;
            int i3 = cjVar.f2196c;
            int i4 = cjVar.f2197d;
            int i5 = cjVar.f2198e;
            View view = ghVar.itemView;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (i6 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i7 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            ckVar.f2204e.add(ghVar);
            animate.setDuration(ckVar.f2410j).setListener(new C0563cf(ckVar, ghVar, i6, view, i7, animate)).start();
        }
        this.f2160a.clear();
        this.f2161b.f2201b.remove(this.f2160a);
    }
}
