package com.android.p261d.p264c;

import android.util.Log;
import com.android.p261d.p262a.C5041e;
import java.util.WeakHashMap;

/* renamed from: com.android.d.c.a */
/* compiled from: PG */
public abstract class C5053a implements C5063k {

    /* renamed from: a */
    public static final WeakHashMap f16090a = new WeakHashMap();

    /* renamed from: i */
    private static final ThreadLocal f16091i = new ThreadLocal();

    /* renamed from: b */
    protected int f16092b;

    /* renamed from: c */
    public int f16093c;

    /* renamed from: d */
    public int f16094d;

    /* renamed from: e */
    public int f16095e;

    /* renamed from: f */
    protected int f16096f;

    /* renamed from: g */
    protected int f16097g;

    /* renamed from: h */
    public C5055c f16098h;

    protected C5053a() {
        this((byte[]) null);
    }

    /* renamed from: a */
    public int mo10013a() {
        return this.f16095e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo10014b();

    /* renamed from: c */
    public int mo10015c() {
        return this.f16097g;
    }

    /* renamed from: d */
    public int mo10016d() {
        return this.f16096f;
    }

    /* renamed from: e */
    public int mo10017e() {
        return this.f16094d;
    }

    /* renamed from: f */
    public final void mo10018f() {
        C5055c cVar = this.f16098h;
        if (!(cVar == null || this.f16092b == -1)) {
            if (mo10024k()) {
                synchronized (((C5059g) cVar).f16115j) {
                    ((C5059g) cVar).f16115j.mo10035a(this.f16092b);
                }
            }
            this.f16092b = -1;
        }
        this.f16093c = 0;
        this.f16098h = null;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        ThreadLocal threadLocal = f16091i;
        threadLocal.set(C5053a.class);
        mo10020g();
        threadLocal.set((Object) null);
    }

    /* renamed from: g */
    public void mo10020g() {
        mo10018f();
    }

    /* renamed from: h */
    public final void mo10021h(int i, int i2) {
        this.f16094d = i;
        this.f16095e = i2;
        this.f16096f = i > 0 ? C5041e.m13842a(i) : 0;
        int a = i2 > 0 ? C5041e.m13842a(i2) : 0;
        this.f16097g = a;
        int i3 = this.f16096f;
        if (i3 > 4096 || a > 4096) {
            Log.w("BasicTexture", String.format("texture is too large: %d x %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(a)}), new Exception());
        }
    }

    /* renamed from: i */
    public void mo10022i() {
        mo10018f();
    }

    /* renamed from: j */
    public boolean mo10023j() {
        return false;
    }

    /* renamed from: k */
    public final boolean mo10024k() {
        return this.f16093c == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo10025l(C5055c cVar);

    protected C5053a(byte[] bArr) {
        this.f16094d = -1;
        this.f16095e = -1;
        this.f16098h = null;
        this.f16092b = 0;
        this.f16093c = 0;
        WeakHashMap weakHashMap = f16090a;
        synchronized (weakHashMap) {
            weakHashMap.put(this, (Object) null);
        }
    }
}
