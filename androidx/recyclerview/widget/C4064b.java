package androidx.recyclerview.widget;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.b */
/* compiled from: PG */
public final /* synthetic */ class C4064b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4073k f12994a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f12995b;

    public /* synthetic */ C4064b(C4073k kVar, ArrayList arrayList) {
        this.f12994a = kVar;
        this.f12995b = arrayList;
    }

    public final void run() {
        C4073k kVar = this.f12994a;
        ArrayList arrayList = this.f12995b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4071i iVar = (C4071i) arrayList.get(i);
            C0673gh ghVar = iVar.f13020a;
            View view = null;
            View view2 = ghVar == null ? null : ghVar.itemView;
            C0673gh ghVar2 = iVar.f13021b;
            if (ghVar2 != null) {
                view = ghVar2.itemView;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(kVar.f2411k);
                kVar.f13039n.add(iVar.f13020a);
                duration.translationX((float) (iVar.f13024e - iVar.f13022c));
                duration.translationY((float) (iVar.f13025f - iVar.f13023d));
                duration.alpha(0.0f).setListener(new C4069g(kVar, iVar, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                kVar.f13039n.add(iVar.f13021b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f2411k).alpha(1.0f).setListener(new C4070h(kVar, iVar, animate, view)).start();
            }
        }
        arrayList.clear();
        kVar.f13035d.remove(arrayList);
    }
}
