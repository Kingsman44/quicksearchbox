package androidx.core.p098j;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.C1926c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p3186j$.util.Objects;

/* renamed from: androidx.core.j.ch */
/* compiled from: PG */
class C2074ch extends C2079cm {

    /* renamed from: c */
    private static boolean f5976c = false;

    /* renamed from: f */
    private static Method f5977f;

    /* renamed from: g */
    private static Class f5978g;

    /* renamed from: h */
    private static Field f5979h;

    /* renamed from: i */
    private static Field f5980i;

    /* renamed from: a */
    final WindowInsets f5981a;

    /* renamed from: b */
    C1926c f5982b;

    /* renamed from: j */
    private C1926c[] f5983j;

    /* renamed from: k */
    private C1926c f5984k = null;

    /* renamed from: l */
    private C2082cp f5985l;

    public C2074ch(C2082cp cpVar, WindowInsets windowInsets) {
        super(cpVar);
        this.f5981a = windowInsets;
    }

    /* renamed from: v */
    private C1926c m5666v(int i, boolean z) {
        C1926c cVar = C1926c.f5820a;
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((i & i2) != 0) {
                cVar = C1926c.m5196b(cVar, mo5217b(i2, z));
            }
        }
        return cVar;
    }

    /* renamed from: w */
    private C1926c m5667w() {
        C2082cp cpVar = this.f5985l;
        return cpVar != null ? cpVar.f5994b.mo5229m() : C1926c.f5820a;
    }

    /* renamed from: x */
    private C1926c m5668x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f5976c) {
                m5669y();
            }
            Method method = f5977f;
            if (!(method == null || f5978g == null || f5979h == null)) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f5979h.get(f5980i.get(invoke));
                    if (rect != null) {
                        return C1926c.m5197c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e.getMessage())), e);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    /* renamed from: y */
    private static void m5669y() {
        try {
            f5977f = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f5978g = cls;
            f5979h = cls.getDeclaredField("mVisibleInsets");
            f5980i = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f5979h.setAccessible(true);
            f5980i.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e.getMessage())), e);
        }
        f5976c = true;
    }

    /* renamed from: a */
    public C1926c mo5216a(int i) {
        return m5666v(i, false);
    }

    /* renamed from: c */
    public C1926c mo5218c(int i) {
        return m5666v(7, true);
    }

    /* renamed from: d */
    public final C1926c mo5219d() {
        if (this.f5984k == null) {
            this.f5984k = C1926c.m5198d(this.f5981a.getSystemWindowInsetLeft(), this.f5981a.getSystemWindowInsetTop(), this.f5981a.getSystemWindowInsetRight(), this.f5981a.getSystemWindowInsetBottom());
        }
        return this.f5984k;
    }

    /* renamed from: e */
    public C2082cp mo5220e(int i, int i2, int i3, int i4) {
        C2073cg cgVar;
        C2082cp h = C2082cp.m5717h(this.f5981a, (View) null);
        if (Build.VERSION.SDK_INT >= 30) {
            cgVar = new C2072cf(h);
        } else {
            cgVar = new C2071ce(h);
        }
        cgVar.mo5212e(C2082cp.m5716f(mo5219d(), i, i2, i3, i4));
        cgVar.mo5210c(C2082cp.m5716f(mo5229m(), i, i2, i3, i4));
        return cgVar.mo5208a();
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f5982b, ((C2074ch) obj).f5982b);
    }

    /* renamed from: f */
    public void mo5222f(View view) {
        C1926c x = m5668x(view);
        if (x == null) {
            x = C1926c.f5820a;
        }
        mo5224h(x);
    }

    /* renamed from: g */
    public void mo5223g(C1926c[] cVarArr) {
        this.f5983j = cVarArr;
    }

    /* renamed from: h */
    public void mo5224h(C1926c cVar) {
        this.f5982b = cVar;
    }

    /* renamed from: i */
    public void mo5225i(C2082cp cpVar) {
        this.f5985l = cpVar;
    }

    /* renamed from: j */
    public boolean mo5226j() {
        return this.f5981a.isRound();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo5227k(int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 4) {
                return false;
            }
            if (!(i == 8 || i == 128)) {
                return true;
            }
        }
        return !mo5217b(i, false).equals(C1926c.f5820a);
    }

    /* renamed from: l */
    public boolean mo5228l(int i) {
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((i2 & 8) != 0 && !mo5227k(i2)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1926c mo5217b(int i, boolean z) {
        int i2;
        C2098m mVar;
        if (i != 1) {
            C1926c cVar = null;
            if (i != 2) {
                if (i == 8) {
                    C1926c[] cVarArr = this.f5983j;
                    if (cVarArr != null) {
                        cVar = cVarArr[C2080cn.m5714a(8)];
                    }
                    if (cVar != null) {
                        return cVar;
                    }
                    C1926c d = mo5219d();
                    C1926c w = m5667w();
                    int i3 = d.f5824e;
                    if (i3 > w.f5824e) {
                        return C1926c.m5198d(0, 0, 0, i3);
                    }
                    C1926c cVar2 = this.f5982b;
                    return (cVar2 == null || cVar2.equals(C1926c.f5820a) || (i2 = this.f5982b.f5824e) <= w.f5824e) ? C1926c.f5820a : C1926c.m5198d(0, 0, 0, i2);
                } else if (i == 16) {
                    return mo5237t();
                } else {
                    if (i == 32) {
                        return mo5236s();
                    }
                    if (i == 64) {
                        return mo5238u();
                    }
                    if (i != 128) {
                        return C1926c.f5820a;
                    }
                    C2082cp cpVar = this.f5985l;
                    if (cpVar != null) {
                        mVar = cpVar.f5994b.mo5234q();
                    } else {
                        mVar = mo5234q();
                    }
                    return mVar != null ? C1926c.m5198d(C2097l.m5778b(mVar.f6013a), C2097l.m5780d(mVar.f6013a), C2097l.m5779c(mVar.f6013a), C2097l.m5777a(mVar.f6013a)) : C1926c.f5820a;
                }
            } else if (z) {
                C1926c w2 = m5667w();
                C1926c m = mo5229m();
                return C1926c.m5198d(Math.max(w2.f5821b, m.f5821b), 0, Math.max(w2.f5823d, m.f5823d), Math.max(w2.f5824e, m.f5824e));
            } else {
                C1926c d2 = mo5219d();
                C2082cp cpVar2 = this.f5985l;
                if (cpVar2 != null) {
                    cVar = cpVar2.f5994b.mo5229m();
                }
                int i4 = d2.f5824e;
                if (cVar != null) {
                    i4 = Math.min(i4, cVar.f5824e);
                }
                return C1926c.m5198d(d2.f5821b, 0, d2.f5823d, i4);
            }
        } else if (z) {
            return C1926c.m5198d(0, Math.max(m5667w().f5822c, mo5219d().f5822c), 0, 0);
        } else {
            return C1926c.m5198d(0, mo5219d().f5822c, 0, 0);
        }
    }
}
