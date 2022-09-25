package com.facebook.litho.widget;

import android.content.Context;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;

/* renamed from: com.facebook.litho.widget.e */
/* compiled from: PG */
public final class C6522e extends C6407q {
    @C6117a(mo12871a = 0)
    @C6118b(mo12872a = C6119c.DIMEN_OFFSET)

    /* renamed from: a */
    public float f19406a;
    @C6117a(mo12871a = 0)
    @C6118b(mo12872a = C6119c.DIMEN_OFFSET)

    /* renamed from: b */
    public float f19407b = -1.0f;
    @C6117a(mo12871a = 0)
    @C6118b(mo12872a = C6119c.DIMEN_OFFSET)

    /* renamed from: c */
    public float f19408c = -1.0f;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.COLOR)

    /* renamed from: d */
    public int f19409d;
    @C6117a(mo12871a = 0)
    @C6118b(mo12872a = C6119c.DIMEN_SIZE)

    /* renamed from: e */
    public float f19410e;
    @C6117a(mo12871a = 3)
    @C6118b(mo12872a = C6119c.COLOR)

    /* renamed from: f */
    public int f19411f;

    public C6522e() {
        super("CardShadow");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final int mo12793K() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final Object mo12797P(Context context) {
        return new C6541f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo12805Y(C6411u uVar, Object obj) {
        C6541f fVar = (C6541f) obj;
        int i = this.f19411f;
        int i2 = this.f19409d;
        float f = this.f19406a;
        float f2 = this.f19410e;
        float f3 = this.f19407b;
        float f4 = this.f19408c;
        if (fVar.f19474a != i) {
            fVar.f19474a = i;
            fVar.f19480g = true;
            fVar.invalidateSelf();
        }
        if (fVar.f19475b != i2) {
            fVar.f19475b = i2;
            fVar.f19480g = true;
            fVar.invalidateSelf();
        }
        float f5 = (float) ((int) (f + 0.5f));
        if (fVar.f19476c != f5) {
            fVar.f19476c = f5;
            fVar.f19480g = true;
            fVar.invalidateSelf();
        }
        if (f2 >= 0.0f) {
            float e = (float) C6541f.m17808e(f2);
            if (fVar.f19477d != e) {
                fVar.f19477d = e;
                fVar.f19480g = true;
                fVar.invalidateSelf();
            }
            if (f3 != fVar.f19478e) {
                fVar.f19478e = f3;
                fVar.f19480g = true;
                fVar.invalidateSelf();
            }
            if (f4 != fVar.f19479f) {
                fVar.f19479f = f4;
                fVar.f19480g = true;
                fVar.invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid shadow size");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6407q) obj);
    }

    /* renamed from: am */
    public final boolean mo12822am() {
        return true;
    }

    /* renamed from: ao */
    public final int mo12824ao() {
        return 2;
    }

    /* renamed from: f */
    public final boolean mo13115f(C6407q qVar) {
        if (this == qVar) {
            return true;
        }
        if (qVar == null || getClass() != qVar.getClass()) {
            return false;
        }
        C6522e eVar = (C6522e) qVar;
        return Float.compare(this.f19406a, eVar.f19406a) == 0 && Float.compare(this.f19407b, eVar.f19407b) == 0 && Float.compare(this.f19408c, eVar.f19408c) == 0 && this.f19409d == eVar.f19409d && Float.compare(this.f19410e, eVar.f19410e) == 0 && this.f19411f == eVar.f19411f;
    }
}
