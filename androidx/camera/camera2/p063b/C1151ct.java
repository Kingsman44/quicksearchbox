package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.b.ct */
/* compiled from: PG */
final class C1151ct {

    /* renamed from: a */
    final Executor f3380a;

    /* renamed from: b */
    final Object f3381b = new Object();

    /* renamed from: c */
    final Set f3382c = new LinkedHashSet();

    /* renamed from: d */
    final Set f3383d = new LinkedHashSet();

    /* renamed from: e */
    final Set f3384e = new LinkedHashSet();

    /* renamed from: f */
    public final CameraDevice.StateCallback f3385f = new C1150cs(this);

    public C1151ct(Executor executor) {
        this.f3380a = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo3940a() {
        ArrayList arrayList;
        synchronized (this.f3381b) {
            arrayList = new ArrayList(this.f3382c);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List mo3941b() {
        ArrayList arrayList;
        synchronized (this.f3381b) {
            arrayList = new ArrayList(this.f3384e);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final List mo3942c() {
        ArrayList arrayList;
        synchronized (this.f3381b) {
            arrayList = new ArrayList();
            arrayList.addAll(mo3940a());
            arrayList.addAll(mo3941b());
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void mo3943d(C1174dp dpVar) {
        C1174dp dpVar2;
        Iterator it = mo3942c().iterator();
        while (it.hasNext() && (dpVar2 = (C1174dp) it.next()) != dpVar) {
            dpVar2.mo3987o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo3944e(C1174dp dpVar) {
        mo3943d(dpVar);
        synchronized (this.f3381b) {
            this.f3384e.remove(dpVar);
        }
    }
}
