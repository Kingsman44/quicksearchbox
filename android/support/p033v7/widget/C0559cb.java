package android.support.p033v7.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.cb */
/* compiled from: PG */
final class C0559cb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f2162a;

    /* renamed from: b */
    final /* synthetic */ C0568ck f2163b;

    public C0559cb(C0568ck ckVar, ArrayList arrayList) {
        this.f2163b = ckVar;
        this.f2162a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f2162a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0566ci ciVar = (C0566ci) arrayList.get(i);
            C0568ck ckVar = this.f2163b;
            C0673gh ghVar = ciVar.f2188a;
            View view = null;
            View view2 = ghVar == null ? null : ghVar.itemView;
            C0673gh ghVar2 = ciVar.f2189b;
            if (ghVar2 != null) {
                view = ghVar2.itemView;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(ckVar.f2411k);
                ckVar.f2206g.add(ciVar.f2188a);
                duration.translationX((float) (ciVar.f2192e - ciVar.f2190c));
                duration.translationY((float) (ciVar.f2193f - ciVar.f2191d));
                duration.alpha(0.0f).setListener(new C0564cg(ckVar, ciVar, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                ckVar.f2206g.add(ciVar.f2189b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(ckVar.f2411k).alpha(1.0f).setListener(new C0565ch(ckVar, ciVar, animate, view)).start();
            }
        }
        this.f2162a.clear();
        this.f2163b.f2202c.remove(this.f2162a);
    }
}
