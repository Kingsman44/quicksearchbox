package androidx.core.p098j;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.C1926c;
import androidx.core.p097i.C1968c;

/* renamed from: androidx.core.j.cp */
/* compiled from: PG */
public final class C2082cp {

    /* renamed from: a */
    public static final C2082cp f5993a;

    /* renamed from: b */
    public final C2079cm f5994b;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f5993a = C2078cl.f5990c;
        } else {
            f5993a = C2079cm.f5991d;
        }
    }

    private C2082cp(WindowInsets windowInsets) {
        this.f5994b = Build.VERSION.SDK_INT >= 30 ? new C2078cl(this, windowInsets) : new C2077ck(this, windowInsets);
    }

    /* renamed from: f */
    static C1926c m5716f(C1926c cVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, cVar.f5821b - i);
        int max2 = Math.max(0, cVar.f5822c - i2);
        int max3 = Math.max(0, cVar.f5823d - i3);
        int max4 = Math.max(0, cVar.f5824e - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? cVar : C1926c.m5198d(max, max2, max3, max4);
    }

    /* renamed from: h */
    public static C2082cp m5717h(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        C2082cp cpVar = new C2082cp(windowInsets);
        if (view != null && C2043bi.m5569aw(view)) {
            cpVar.f5994b.mo5225i(C2043bi.m5597z(view));
            cpVar.f5994b.mo5222f(view.getRootView());
        }
        return cpVar;
    }

    @Deprecated
    /* renamed from: a */
    public final int mo5239a() {
        return this.f5994b.mo5219d().f5824e;
    }

    @Deprecated
    /* renamed from: b */
    public final int mo5240b() {
        return this.f5994b.mo5219d().f5821b;
    }

    @Deprecated
    /* renamed from: c */
    public final int mo5241c() {
        return this.f5994b.mo5219d().f5823d;
    }

    @Deprecated
    /* renamed from: d */
    public final int mo5242d() {
        return this.f5994b.mo5219d().f5822c;
    }

    /* renamed from: e */
    public final WindowInsets mo5243e() {
        C2079cm cmVar = this.f5994b;
        if (cmVar instanceof C2074ch) {
            return ((C2074ch) cmVar).f5981a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2082cp)) {
            return false;
        }
        return C1968c.m5305b(this.f5994b, ((C2082cp) obj).f5994b);
    }

    @Deprecated
    /* renamed from: g */
    public final C2082cp mo5245g(int i, int i2, int i3, int i4) {
        C2073cg cgVar;
        if (Build.VERSION.SDK_INT >= 30) {
            cgVar = new C2072cf(this);
        } else {
            cgVar = new C2071ce(this);
        }
        cgVar.mo5212e(C1926c.m5198d(i, i2, i3, i4));
        return cgVar.mo5208a();
    }

    public final int hashCode() {
        C2079cm cmVar = this.f5994b;
        if (cmVar == null) {
            return 0;
        }
        return cmVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public final boolean mo5247i() {
        return !this.f5994b.mo5219d().equals(C1926c.f5820a);
    }

    /* renamed from: j */
    public final C1926c mo5248j() {
        return this.f5994b.mo5218c(7);
    }

    public C2082cp() {
        this.f5994b = new C2079cm(this);
    }
}
