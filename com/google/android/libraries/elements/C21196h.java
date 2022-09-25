package com.google.android.libraries.elements;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.litho.C6095af;
import com.facebook.litho.C6227ea;
import com.facebook.litho.C6381hf;
import com.facebook.litho.C6411u;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.google.android.apps.gsa.staticplugins.p7630bz.p7634d.C97490f;
import com.google.android.libraries.elements.interfaces.C21251au;
import com.google.android.libraries.elements.interfaces.C21252av;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.elements.interfaces.C21284c;
import com.google.android.libraries.elements.interfaces.C21290cf;
import com.google.android.libraries.elements.interfaces.C21318y;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21323ac;
import com.google.android.libraries.elements.internal.C21363x;
import com.google.android.libraries.elements.internal.C21365z;
import com.google.android.libraries.elements.p1729h.C21215m;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3134c.C40340d;
import p3186j$.util.Objects;
import p5488io.p5490b.p5494b.C69802a;

/* renamed from: com.google.android.libraries.elements.h */
/* compiled from: PG */
public final class C21196h extends FrameLayout {

    /* renamed from: a */
    public C21256az f59458a;

    /* renamed from: b */
    private final LithoView f59459b;

    /* renamed from: c */
    private byte[] f59460c;

    /* renamed from: d */
    private C69802a f59461d;

    /* renamed from: e */
    private C6227ea f59462e;

    /* renamed from: f */
    private boolean f59463f;

    public C21196h(Context context, C21256az azVar) {
        super(context);
        context.getClass();
        azVar.getClass();
        this.f59458a = azVar;
        LithoView lithoView = new LithoView(context);
        this.f59459b = lithoView;
        super.addView(lithoView, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: c */
    private final void m39833c() {
        C69802a aVar = this.f59461d;
        if (aVar != null) {
            aVar.dispose();
            this.f59461d = null;
        }
        this.f59459b.mo12731D();
        ComponentTree componentTree = this.f59459b.f17938n;
        if (componentTree != null) {
            componentTree.mo12720o();
            this.f59459b.mo12729B((ComponentTree) null);
        }
        this.f59459b.f17943s = null;
    }

    /* renamed from: d */
    private final void m39834d() {
        byte[] bArr = this.f59460c;
        if (this.f59463f && bArr != null) {
            this.f59459b.f17943s = this.f59462e;
            C69802a aVar = new C69802a();
            this.f59461d = aVar;
            C21252av a = this.f59458a.mo26720a();
            int a2 = a.mo26265a();
            C21290cf c = a.mo26267c(a2);
            C6381hf hfVar = new C6381hf();
            hfVar.mo13398d(C21251au.class, new C21251au(String.valueOf(a2)));
            C6411u uVar = new C6411u(getContext(), this.f59458a.mo26726g(), new C21215m(a.mo26266b()), hfVar);
            C21363x b = C21365z.m40402b(uVar);
            C21318y B = C21319z.m40292B();
            C21284c cVar = (C21284c) B;
            cVar.f59610h = this.f59458a;
            cVar.f59603a = this.f59459b;
            cVar.f59604b = c;
            b.f59729a.f59735b = B.mo26839p();
            b.mo26866d(new C21151f(this, bArr, aVar));
            C6095af b2 = ComponentTree.m15673b(uVar, b.mo13259a());
            b2.f17998d = this.f59458a.mo26729j();
            C40340d k = this.f59458a.mo26730k();
            if (k != null) {
                b2.f18000f = new C21323ac(k);
            }
            this.f59459b.mo12729B(b2.mo12841a());
        }
    }

    /* renamed from: a */
    public final void mo26213a(C97490f fVar) {
        C21172g gVar;
        if (fVar == null) {
            gVar = null;
        } else {
            Objects.requireNonNull(fVar);
            gVar = new C21172g(fVar);
        }
        this.f59462e = gVar;
        if (this.f59463f) {
            this.f59459b.f17943s = gVar;
        }
    }

    public final void addView(View view) {
        throw new UnsupportedOperationException("ElementsView does not support addView");
    }

    /* renamed from: b */
    public final void mo26215b(byte[] bArr) {
        m39833c();
        this.f59460c = bArr;
        m39834d();
    }

    public final void onAttachedToWindow() {
        m39833c();
        super.onAttachedToWindow();
        this.f59463f = true;
        m39834d();
    }

    public final void onDetachedFromWindow() {
        this.f59463f = false;
        m39833c();
        super.onDetachedFromWindow();
    }

    public final void setAccessibilityLiveRegion(int i) {
        this.f59459b.setAccessibilityLiveRegion(i);
    }
}
