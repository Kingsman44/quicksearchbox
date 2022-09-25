package android.support.p033v7.p037c.p038a;

import android.support.p033v7.p040e.C0424f;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v7.c.a.d */
/* compiled from: PG */
final class C0412d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0424f f1391a;

    /* renamed from: b */
    final /* synthetic */ C0413e f1392b;

    public C0412d(C0413e eVar, C0424f fVar) {
        this.f1392b = eVar;
        this.f1391a = fVar;
    }

    public final void run() {
        C0413e eVar = this.f1392b;
        C0415g gVar = eVar.f1396d;
        if (gVar.f1405g == eVar.f1395c) {
            List list = eVar.f1394b;
            C0424f fVar = this.f1391a;
            gVar.f1403e = list;
            gVar.f1404f = Collections.unmodifiableList(list);
            fVar.mo1398a(gVar.f1399a);
            gVar.mo1388b();
        }
    }
}
