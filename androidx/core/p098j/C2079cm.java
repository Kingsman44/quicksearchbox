package androidx.core.p098j;

import android.os.Build;
import android.view.View;
import androidx.core.graphics.C1926c;
import androidx.core.p097i.C1968c;

/* renamed from: androidx.core.j.cm */
/* compiled from: PG */
public class C2079cm {

    /* renamed from: d */
    static final C2082cp f5991d;

    /* renamed from: e */
    final C2082cp f5992e;

    static {
        C2073cg cgVar;
        if (Build.VERSION.SDK_INT >= 30) {
            cgVar = new C2072cf();
        } else {
            cgVar = new C2071ce();
        }
        f5991d = cgVar.mo5208a().f5994b.mo5235r().f5994b.mo5230n().f5994b.mo5231o();
    }

    public C2079cm(C2082cp cpVar) {
        this.f5992e = cpVar;
    }

    /* renamed from: a */
    public C1926c mo5216a(int i) {
        return C1926c.f5820a;
    }

    /* renamed from: c */
    public C1926c mo5218c(int i) {
        return C1926c.f5820a;
    }

    /* renamed from: d */
    public C1926c mo5219d() {
        return C1926c.f5820a;
    }

    /* renamed from: e */
    public C2082cp mo5220e(int i, int i2, int i3, int i4) {
        return f5991d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2079cm)) {
            return false;
        }
        C2079cm cmVar = (C2079cm) obj;
        return mo5226j() == cmVar.mo5226j() && mo5232p() == cmVar.mo5232p() && C1968c.m5305b(mo5219d(), cmVar.mo5219d()) && C1968c.m5305b(mo5229m(), cmVar.mo5229m()) && C1968c.m5305b(mo5234q(), cmVar.mo5234q());
    }

    /* renamed from: f */
    public void mo5222f(View view) {
    }

    /* renamed from: g */
    public void mo5223g(C1926c[] cVarArr) {
    }

    public int hashCode() {
        return C1968c.m5304a(Boolean.valueOf(mo5226j()), Boolean.valueOf(mo5232p()), mo5219d(), mo5229m(), mo5234q());
    }

    /* renamed from: i */
    public void mo5225i(C2082cp cpVar) {
    }

    /* renamed from: j */
    public boolean mo5226j() {
        return false;
    }

    /* renamed from: l */
    public boolean mo5228l(int i) {
        return true;
    }

    /* renamed from: m */
    public C1926c mo5229m() {
        return C1926c.f5820a;
    }

    /* renamed from: n */
    public C2082cp mo5230n() {
        return this.f5992e;
    }

    /* renamed from: o */
    public C2082cp mo5231o() {
        return this.f5992e;
    }

    /* renamed from: p */
    public boolean mo5232p() {
        return false;
    }

    /* renamed from: q */
    public C2098m mo5234q() {
        return null;
    }

    /* renamed from: r */
    public C2082cp mo5235r() {
        return this.f5992e;
    }

    /* renamed from: s */
    public C1926c mo5236s() {
        return mo5219d();
    }

    /* renamed from: t */
    public C1926c mo5237t() {
        return mo5219d();
    }

    /* renamed from: u */
    public C1926c mo5238u() {
        return mo5219d();
    }
}
