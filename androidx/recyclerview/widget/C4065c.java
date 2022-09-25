package androidx.recyclerview.widget;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.c */
/* compiled from: PG */
public final /* synthetic */ class C4065c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4073k f12996a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f12997b;

    public /* synthetic */ C4065c(C4073k kVar, ArrayList arrayList) {
        this.f12996a = kVar;
        this.f12997b = arrayList;
    }

    public final void run() {
        C4073k kVar = this.f12996a;
        ArrayList arrayList = this.f12997b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0673gh ghVar = (C0673gh) arrayList.get(i);
            View view = ghVar.itemView;
            ViewPropertyAnimator animate = view.animate();
            kVar.f13036e.add(ghVar);
            animate.alpha(1.0f).setDuration(kVar.f2408h).setListener(new C4067e(kVar, ghVar, view, animate)).start();
        }
        arrayList.clear();
        kVar.f13033b.remove(arrayList);
    }
}
