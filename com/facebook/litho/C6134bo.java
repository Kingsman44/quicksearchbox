package com.facebook.litho;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.facebook.litho.p328f.C6257d;

/* renamed from: com.facebook.litho.bo */
/* compiled from: PG */
final class C6134bo extends C6407q {

    /* renamed from: a */
    final Drawable f18152a;

    /* renamed from: b */
    int f18153b;

    /* renamed from: c */
    int f18154c;

    public C6134bo(Drawable drawable) {
        super("DrawableComponent");
        this.f18152a = drawable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final Object mo12797P(Context context) {
        return new C6234eh();
    }

    /* renamed from: Q */
    public final void mo12798Q(C6411u uVar, Object obj) {
        mo12802V(uVar, obj);
    }

    /* renamed from: T */
    public final void mo12800T(C6411u uVar, Object obj) {
        mo12805Y(uVar, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo12802V(C6411u uVar, Object obj) {
        ((C6234eh) obj).mo13192a(this.f18153b, this.f18154c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo12803W(C6411u uVar, C6564z zVar) {
        this.f18153b = zVar.mo12882H();
        this.f18154c = zVar.mo12901a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo12805Y(C6411u uVar, Object obj) {
        C6234eh ehVar = (C6234eh) obj;
        Drawable drawable = this.f18152a;
        Drawable drawable2 = ehVar.f18409a;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                ehVar.mo13193b(false, false);
                ehVar.f18409a.setCallback((Drawable.Callback) null);
            }
            ehVar.f18409a = drawable;
            if (ehVar.f18409a != null) {
                ehVar.mo13193b(ehVar.isVisible(), false);
                ehVar.f18409a.setCallback(ehVar);
            }
            ehVar.f18410b = ehVar.f18409a instanceof InsetDrawable;
            ehVar.invalidateSelf();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6407q) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final void mo12810aa(C6411u uVar, Object obj) {
        C6234eh ehVar = (C6234eh) obj;
        if (ehVar.f18409a != null) {
            ehVar.mo13193b(false, false);
            ehVar.f18409a.setCallback((Drawable.Callback) null);
        }
        ehVar.f18409a = null;
        ehVar.f18410b = false;
        ehVar.f18412d = 0;
        ehVar.f18411c = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public final boolean mo12822am() {
        return true;
    }

    /* renamed from: ao */
    public final int mo12824ao() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: as */
    public final boolean mo12828as(C6407q qVar, C6407q qVar2) {
        return !C6257d.m16805a(((C6134bo) qVar).f18152a, ((C6134bo) qVar2).f18152a);
    }

    /* renamed from: f */
    public final boolean mo13115f(C6407q qVar) {
        if (this == qVar) {
            return true;
        }
        if (qVar == null || getClass() != qVar.getClass()) {
            return false;
        }
        return C6257d.m16805a(this.f18152a, ((C6134bo) qVar).f18152a);
    }
}
