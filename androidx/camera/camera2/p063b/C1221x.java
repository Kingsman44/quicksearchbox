package androidx.camera.camera2.p063b;

import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.C1506cj;
import androidx.camera.core.C1571u;
import androidx.core.p097i.C1974i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.x */
/* compiled from: PG */
public final /* synthetic */ class C1221x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1091an f3595a;

    /* renamed from: b */
    public final /* synthetic */ List f3596b;

    public /* synthetic */ C1221x(C1091an anVar, List list) {
        this.f3595a = anVar;
        this.f3596b = list;
    }

    public final void run() {
        Size a;
        C1091an anVar = this.f3595a;
        List<C1090am> list = this.f3596b;
        try {
            boolean isEmpty = anVar.f3242a.mo4265b().isEmpty();
            ArrayList arrayList = new ArrayList();
            Rational rational = null;
            for (C1090am amVar : list) {
                if (!anVar.f3242a.mo4272i(amVar.mo3815e())) {
                    anVar.f3242a.mo4269f(amVar.mo3815e(), amVar.mo3812b(), amVar.mo3813c());
                    arrayList.add(amVar.mo3815e());
                    if (amVar.mo3814d() == C1506cj.class && (a = amVar.mo3811a()) != null) {
                        rational = new Rational(a.getWidth(), a.getHeight());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                anVar.mo3822h("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED", (Throwable) null);
                if (isEmpty) {
                    anVar.f3243b.mo4043l(true);
                    anVar.f3243b.mo4042k();
                }
                anVar.mo3820f();
                anVar.mo3836u();
                anVar.mo3834t();
                anVar.mo3840y();
                if (anVar.f3253l == 4) {
                    anVar.mo3829o();
                } else {
                    int i = anVar.f3253l;
                    int i2 = i - 1;
                    if (i != 0) {
                        boolean z = false;
                        if (i2 == 0 || i2 == 1) {
                            anVar.mo3832r(false);
                        } else if (i2 != 4) {
                            new StringBuilder().append("open() ignored due to being in state: ");
                            int i3 = anVar.f3253l;
                            C1085ah.m3057a(i3);
                            anVar.mo3822h("open() ignored due to being in state: ".concat(C1085ah.m3057a(i3)), (Throwable) null);
                        } else {
                            anVar.mo3838w(6, (C1571u) null, true);
                            if (!anVar.mo3837v() && anVar.f3247f == 0) {
                                if (anVar.f3246e != null) {
                                    z = true;
                                }
                                C1974i.m5315c(z, "Camera Device should be open if session close is not complete");
                                anVar.mo3838w(4, (C1571u) null, true);
                                anVar.mo3829o();
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                if (rational != null) {
                    anVar.f3243b.f3564c.f3401d = rational;
                }
            }
        } finally {
            anVar.f3243b.mo4040i();
        }
    }
}
