package androidx.work.impl.background.p208a;

import androidx.work.C4380ad;
import androidx.work.impl.p207b.C4470ae;

/* renamed from: androidx.work.impl.background.a.a */
/* compiled from: PG */
final class C4518a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4470ae f14275a;

    /* renamed from: b */
    final /* synthetic */ C4519b f14276b;

    public C4518a(C4519b bVar, C4470ae aeVar) {
        this.f14276b = bVar;
        this.f14275a = aeVar;
    }

    public final void run() {
        C4380ad.m12560h().mo9309a(C4519b.f14277a, "Scheduling work ".concat(String.valueOf(this.f14275a.f14217b)));
        this.f14276b.f14278b.mo9475c(this.f14275a);
    }
}
