package com.android.p271h.p272a;

import android.graphics.Bitmap;
import com.android.p261d.p262a.C5041e;
import com.android.p261d.p264c.C5065m;

/* renamed from: com.android.h.a.a */
/* compiled from: PG */
final class C5153a extends C5065m {

    /* renamed from: i */
    public int f16362i;

    /* renamed from: l */
    public int f16363l;

    /* renamed from: m */
    public int f16364m;

    /* renamed from: n */
    public C5153a f16365n;

    /* renamed from: o */
    public Bitmap f16366o;

    /* renamed from: p */
    public volatile int f16367p = 1;

    /* renamed from: q */
    final /* synthetic */ C5157e f16368q;

    public C5153a(C5157e eVar, int i, int i2, int i3) {
        this.f16368q = eVar;
        this.f16362i = i;
        this.f16363l = i2;
        this.f16364m = i3;
    }

    /* renamed from: c */
    public final int mo10015c() {
        return this.f16368q.f16377b;
    }

    /* renamed from: d */
    public final int mo10016d() {
        return this.f16368q.f16377b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Bitmap mo10026m() {
        C5041e.m13844c(this.f16367p == 8);
        C5157e eVar = this.f16368q;
        int i = eVar.f16393r;
        int i2 = this.f16362i;
        int i3 = this.f16364m;
        mo10021h(Math.min(eVar.f16377b, (i - i2) >> i3), Math.min(this.f16368q.f16377b, (eVar.f16394s - this.f16363l) >> i3));
        Bitmap bitmap = this.f16366o;
        this.f16366o = null;
        this.f16367p = 1;
        return bitmap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo10027n(Bitmap bitmap) {
        C5157e.f16371a.mo5127b(bitmap);
    }

    public final String toString() {
        int i = this.f16362i;
        C5157e eVar = this.f16368q;
        int i2 = eVar.f16377b;
        return String.format("tile(%s, %s, %s / %s)", new Object[]{Integer.valueOf(i / i2), Integer.valueOf(this.f16363l / i2), Integer.valueOf(eVar.f16381f), Integer.valueOf(eVar.f16380e)});
    }
}
