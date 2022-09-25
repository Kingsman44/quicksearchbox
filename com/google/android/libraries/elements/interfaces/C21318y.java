package com.google.android.libraries.elements.interfaces;

import com.google.common.base.C58838bb;
import com.google.protos.youtube.elements.C66192df;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5497e.p5498a.C69826b;

/* renamed from: com.google.android.libraries.elements.interfaces.y */
/* compiled from: PG */
public abstract class C21318y {
    /* renamed from: a */
    public abstract C21319z mo26778a();

    /* renamed from: b */
    public abstract void mo26779b(boolean z);

    /* renamed from: c */
    public abstract void mo26780c(String str);

    /* renamed from: d */
    public abstract void mo26781d(C21238ah ahVar);

    /* renamed from: e */
    public abstract void mo26782e(int i);

    /* renamed from: f */
    public abstract void mo26783f(String str);

    /* renamed from: g */
    public abstract void mo26784g(String str);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo26785h(WeakReference weakReference);

    /* renamed from: i */
    public abstract void mo26786i(WeakReference weakReference);

    /* renamed from: j */
    public abstract void mo26787j(StringBuilder sb);

    /* renamed from: k */
    public abstract void mo26788k(C69826b bVar);

    /* renamed from: l */
    public abstract void mo26789l(AtomicReference atomicReference);

    /* renamed from: m */
    public abstract void mo26790m(boolean z);

    /* renamed from: n */
    public abstract void mo26791n(String str);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo26792o(boolean z);

    /* renamed from: p */
    public final C21319z mo26839p() {
        C21319z a = mo26778a();
        boolean z = true;
        if (a.mo26806h() != null && a.mo26823w()) {
            z = false;
        }
        C58838bb.m90884s(z, "Setting an ElementsConfig overrides other values set on the ConversionContext, like useIncrementalMountOnChildren, useLegacyVisible, and elementsInteractionLogger. Configure them through the ElementsConfig instead of directly on the ConversionContext.");
        return a;
    }

    /* renamed from: q */
    public final void mo26840q(C66192df dfVar) {
        mo26785h(dfVar == null ? null : new WeakReference(dfVar));
    }

    /* renamed from: r */
    public final void mo26841r(boolean z) {
        mo26779b(true);
        mo26792o(z);
    }
}
