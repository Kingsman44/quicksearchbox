package com.google.android.libraries.lens.view.p2091bb;

import android.graphics.RectF;

/* renamed from: com.google.android.libraries.lens.view.bb.b */
/* compiled from: PG */
public abstract class C25688b {

    /* renamed from: a */
    public static final C25688b f69827a;

    /* renamed from: b */
    public static final C25688b f69828b;

    static {
        C25687a b = m47362b();
        C25689c cVar = (C25689c) b;
        cVar.f69829a = new RectF(0.5f, 0.5f, 0.5f, 0.5f);
        cVar.f69830b = 5;
        b.mo30791d(true);
        f69827a = b.mo30790c();
        C25687a b2 = m47362b();
        C25689c cVar2 = (C25689c) b2;
        cVar2.f69829a = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        cVar2.f69830b = 6;
        b2.mo30791d(false);
        f69828b = b2.mo30790c();
    }

    /* renamed from: b */
    public static C25687a m47362b() {
        C25689c cVar = new C25689c();
        cVar.f69829a = new RectF();
        cVar.mo30791d(false);
        return cVar;
    }

    /* renamed from: a */
    public abstract RectF mo30793a();

    /* renamed from: c */
    public abstract boolean mo30794c();

    /* renamed from: d */
    public abstract int mo30795d();
}
