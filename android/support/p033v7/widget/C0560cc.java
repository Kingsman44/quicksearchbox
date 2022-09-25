package android.support.p033v7.widget;

import java.util.ArrayList;

/* renamed from: android.support.v7.widget.cc */
/* compiled from: PG */
final class C0560cc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f2164a;

    /* renamed from: b */
    final /* synthetic */ C0568ck f2165b;

    public C0560cc(C0568ck ckVar, ArrayList arrayList) {
        this.f2165b = ckVar;
        this.f2164a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f2164a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f2165b.mo2685a((C0673gh) arrayList.get(i));
        }
        this.f2164a.clear();
        this.f2165b.f2200a.remove(this.f2164a);
    }
}
