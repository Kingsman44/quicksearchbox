package androidx.recyclerview.widget;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.a */
/* compiled from: PG */
public final /* synthetic */ class C4063a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4073k f12992a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f12993b;

    public /* synthetic */ C4063a(C4073k kVar, ArrayList arrayList) {
        this.f12992a = kVar;
        this.f12993b = arrayList;
    }

    public final void run() {
        C4073k kVar = this.f12992a;
        ArrayList arrayList = this.f12993b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4072j jVar = (C4072j) arrayList.get(i);
            C0673gh ghVar = jVar.f13026a;
            int i2 = jVar.f13027b;
            int i3 = jVar.f13028c;
            int i4 = jVar.f13029d;
            int i5 = jVar.f13030e;
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
            kVar.f13037f.add(ghVar);
            animate.setDuration(kVar.f2410j).setListener(new C4068f(kVar, ghVar, i6, view, i7, animate)).start();
        }
        arrayList.clear();
        kVar.f13034c.remove(arrayList);
    }
}
