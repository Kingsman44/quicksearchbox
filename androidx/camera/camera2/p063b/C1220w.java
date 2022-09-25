package androidx.camera.camera2.p063b;

import android.text.TextUtils;
import androidx.camera.core.C1506cj;
import androidx.camera.core.C1571u;
import androidx.core.p097i.C1974i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.w */
/* compiled from: PG */
public final /* synthetic */ class C1220w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1091an f3593a;

    /* renamed from: b */
    public final /* synthetic */ List f3594b;

    public /* synthetic */ C1220w(C1091an anVar, List list) {
        this.f3593a = anVar;
        this.f3594b = list;
    }

    public final void run() {
        C1091an anVar = this.f3593a;
        List<C1090am> list = this.f3594b;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        for (C1090am amVar : list) {
            if (anVar.f3242a.mo4272i(amVar.mo3815e())) {
                anVar.f3242a.f3864b.remove(amVar.mo3815e());
                arrayList.add(amVar.mo3815e());
                if (amVar.mo3814d() == C1506cj.class) {
                    z2 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            anVar.mo3822h("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera", (Throwable) null);
            if (z2) {
                anVar.f3243b.f3564c.f3401d = null;
            }
            anVar.mo3820f();
            if (anVar.f3242a.mo4266c().isEmpty()) {
                ((C1202eq) anVar.f3243b.f3566e).f3530d = false;
            } else {
                anVar.mo3836u();
            }
            if (anVar.f3242a.mo4265b().isEmpty()) {
                anVar.f3243b.mo4040i();
                anVar.mo3840y();
                anVar.f3243b.mo4043l(false);
                anVar.f3248g = anVar.mo3817a();
                anVar.mo3822h("Closing camera.", (Throwable) null);
                int i = anVar.f3253l;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            anVar.mo3838w(5, (C1571u) null, true);
                            anVar.mo3839x();
                            return;
                        } else if (i2 != 5) {
                            int i3 = anVar.f3253l;
                            C1085ah.m3057a(i3);
                            anVar.mo3822h("close() ignored due to being in state: ".concat(C1085ah.m3057a(i3)), (Throwable) null);
                            return;
                        }
                    }
                    boolean b = anVar.f3244c.mo3805b();
                    anVar.mo3838w(5, (C1571u) null, true);
                    if (b) {
                        C1974i.m5315c(anVar.mo3837v(), (String) null);
                        anVar.mo3824j();
                    }
                } else {
                    if (anVar.f3246e == null) {
                        z = true;
                    }
                    C1974i.m5315c(z, (String) null);
                    anVar.mo3838w(1, (C1571u) null, true);
                }
            } else {
                anVar.mo3834t();
                anVar.mo3840y();
                if (anVar.f3253l == 4) {
                    anVar.mo3829o();
                }
            }
        }
    }
}
