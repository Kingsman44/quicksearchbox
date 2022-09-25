package com.facebook.litho;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.litho.p325d.C6180a;

/* renamed from: com.facebook.litho.cr */
/* compiled from: PG */
final class C6170cr extends C6407q {

    /* renamed from: a */
    public SparseArray f18210a;

    /* renamed from: b */
    public boolean f18211b = false;

    public C6170cr() {
        super("HostComponent");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final int mo12793K() {
        return 45;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final C6236ej mo12794M() {
        if (C6180a.f18241h) {
            return new C6129bj();
        }
        return super.mo12794M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final Object mo12797P(Context context) {
        return new ComponentHost(context);
    }

    /* renamed from: Q */
    public final void mo12798Q(C6411u uVar, Object obj) {
        ((ComponentHost) obj).mo12679h();
    }

    /* renamed from: T */
    public final void mo12800T(C6411u uVar, Object obj) {
        mo12805Y(uVar, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo12802V(C6411u uVar, Object obj) {
        ((ComponentHost) obj).mo12679h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo12805Y(C6411u uVar, Object obj) {
        ComponentHost componentHost = (ComponentHost) obj;
        componentHost.setAlpha(1.0f);
        componentHost.f17850i = this.f18211b;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6407q) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final void mo12810aa(C6411u uVar, Object obj) {
        ComponentHost componentHost = (ComponentHost) obj;
        if (componentHost.isPressed()) {
            componentHost.setPressed(false);
        }
        componentHost.f17850i = false;
    }

    /* renamed from: ao */
    public final int mo12824ao() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: as */
    public final boolean mo12828as(C6407q qVar, C6407q qVar2) {
        return true;
    }

    /* renamed from: f */
    public final boolean mo13115f(C6407q qVar) {
        return this == qVar;
    }

    /* renamed from: g */
    public final SparseArray mo13144g() {
        return this.f18210a;
    }

    /* renamed from: v */
    public final boolean mo13145v() {
        SparseArray sparseArray = this.f18210a;
        return sparseArray != null && sparseArray.size() > 0;
    }
}
