package android.support.p033v7.p037c.p038a;

import android.support.p033v7.p040e.C0424f;
import android.support.p033v7.p040e.C0429k;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: android.support.v7.c.a.e */
/* compiled from: PG */
final class C0413e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f1393a;

    /* renamed from: b */
    final /* synthetic */ List f1394b;

    /* renamed from: c */
    final /* synthetic */ int f1395c;

    /* renamed from: d */
    final /* synthetic */ C0415g f1396d;

    public C0413e(C0415g gVar, List list, List list2, int i) {
        this.f1396d = gVar;
        this.f1393a = list;
        this.f1394b = list2;
        this.f1395c = i;
    }

    public final void run() {
        C0424f a = C0429k.m1383a(new C0411c(this), true);
        Executor executor = this.f1396d.f1401c;
        ((C0414f) executor).f1397a.post(new C0412d(this, a));
    }
}
