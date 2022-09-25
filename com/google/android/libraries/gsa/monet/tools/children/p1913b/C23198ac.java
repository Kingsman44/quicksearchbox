package com.google.android.libraries.gsa.monet.tools.children.p1913b;

import android.support.p033v7.p040e.C0429k;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23253c;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.b.ac */
/* compiled from: PG */
public final class C23198ac implements C23253c, C23209f {

    /* renamed from: a */
    public final C22945j f63618a;

    /* renamed from: b */
    public final C23203ah f63619b = new C23203ah(new C23209f[0]);

    /* renamed from: c */
    private ArrayList f63620c = new ArrayList();

    /* renamed from: d */
    private final String f63621d;

    public C23198ac(String str, C22945j jVar) {
        this.f63618a = jVar;
        this.f63621d = "REPEATED_CHILD_BUNDLE_".concat(str);
        jVar.mo28343n(new C23228y(this));
        if (jVar.mo28316z()) {
            mo28656b(jVar.mo28336e());
        }
    }

    /* renamed from: a */
    public final C23208e mo28655a() {
        return this.f63619b;
    }

    /* renamed from: b */
    public final void mo28656b(C23120p pVar) {
        ArrayList c;
        C23120p a = pVar.mo28564a(this.f63621d);
        if (a != null && (c = a.mo28566c()) != null) {
            C0429k.m1383a(new C23197ab(c, this.f63620c), true).mo1398a(new C23196aa(this.f63619b, this.f63618a, c));
            this.f63620c = c;
        }
    }

    /* renamed from: c */
    public final void mo28657c(C23227x xVar) {
        this.f63619b.mo28666e(new C23229z(this, xVar));
    }
}
