package androidx.camera.core;

import androidx.camera.core.p069a.p070a.p071a.C1247j;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.camera.core.p073b.C1454q;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/* renamed from: androidx.camera.core.bo */
/* compiled from: PG */
final class C1469bo implements C1413an {

    /* renamed from: a */
    public final Deque f4045a = new ArrayDeque();

    /* renamed from: b */
    C1466bl f4046b = null;

    /* renamed from: c */
    C60870cx f4047c = null;

    /* renamed from: d */
    int f4048d = 0;

    /* renamed from: e */
    final Object f4049e = new Object();

    /* renamed from: f */
    private final C1425az f4050f;

    /* renamed from: g */
    private final C1455ba f4051g;

    public C1469bo(C1425az azVar, C1455ba baVar) {
        this.f4050f = azVar;
        this.f4051g = baVar;
    }

    /* renamed from: a */
    public final void mo4349a(Throwable th) {
        C1466bl blVar;
        C60870cx cxVar;
        ArrayList arrayList;
        synchronized (this.f4049e) {
            blVar = this.f4046b;
            this.f4046b = null;
            cxVar = this.f4047c;
            this.f4047c = null;
            arrayList = new ArrayList(this.f4045a);
            this.f4045a.clear();
        }
        if (blVar != null && cxVar != null) {
            C1470bp.m3947n(th);
            th.getMessage();
            throw null;
        } else if (arrayList.size() > 0) {
            C1466bl blVar2 = (C1466bl) arrayList.get(0);
            C1470bp.m3947n(th);
            th.getMessage();
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4350b() {
        synchronized (this.f4049e) {
            if (this.f4046b == null) {
                if (this.f4048d >= 2) {
                    C1477bw.m3983f("ImageCapture", "Too many acquire images. Close image to be able to process next.");
                    return;
                }
                C1466bl blVar = (C1466bl) this.f4045a.poll();
                if (blVar != null) {
                    this.f4046b = blVar;
                    C1455ba baVar = this.f4051g;
                    if (baVar != null) {
                        C1454q qVar = baVar.f4029a;
                        int i = C1470bp.f4052o;
                        int i2 = blVar.f4042b;
                        synchronized (qVar.f4020a) {
                            qVar.f4021b = 0;
                        }
                        int i3 = blVar.f4041a;
                        synchronized (qVar.f4020a) {
                        }
                    }
                    C60870cx a = C2169h.m6027a(new C1458bd(this.f4050f.f3981a));
                    this.f4047c = a;
                    C1263l.m3436h(a, new C1468bn(this), C1247j.m3414a());
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo4299k(C1473bs bsVar) {
        synchronized (this.f4049e) {
            this.f4048d--;
            C1247j.m3414a().execute(new C1467bm(this));
        }
    }
}
