package android.support.p033v7.p037c.p038a;

import android.support.p033v7.p040e.C0422d;

/* renamed from: android.support.v7.c.a.c */
/* compiled from: PG */
final class C0411c extends C0422d {

    /* renamed from: a */
    final /* synthetic */ C0413e f1390a;

    public C0411c(C0413e eVar) {
        this.f1390a = eVar;
    }

    /* renamed from: a */
    public final int mo1379a() {
        return this.f1390a.f1394b.size();
    }

    /* renamed from: b */
    public final int mo1380b() {
        return this.f1390a.f1393a.size();
    }

    /* renamed from: c */
    public final Object mo1381c(int i, int i2) {
        Object obj = this.f1390a.f1393a.get(i);
        Object obj2 = this.f1390a.f1394b.get(i2);
        if (obj != null && obj2 != null) {
            return null;
        }
        throw new AssertionError();
    }

    /* renamed from: d */
    public final boolean mo1382d(int i, int i2) {
        Object obj = this.f1390a.f1393a.get(i);
        Object obj2 = this.f1390a.f1394b.get(i2);
        if (obj != null && obj2 != null) {
            return this.f1390a.f1396d.f1400b.f1389b.mo1400a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    /* renamed from: e */
    public final boolean mo1383e(int i, int i2) {
        Object obj = this.f1390a.f1393a.get(i);
        Object obj2 = this.f1390a.f1394b.get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return this.f1390a.f1396d.f1400b.f1389b.mo1401b(obj, obj2);
    }
}
