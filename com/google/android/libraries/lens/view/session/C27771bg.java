package com.google.android.libraries.lens.view.session;

import android.graphics.PointF;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4575r.C60752i;

/* renamed from: com.google.android.libraries.lens.view.session.bg */
/* compiled from: PG */
public abstract class C27771bg {
    /* renamed from: a */
    public abstract PointF mo33264a();

    /* renamed from: b */
    public abstract C27772bh mo33265b();

    /* renamed from: c */
    public abstract void mo33266c(C24231w wVar);

    /* renamed from: d */
    public abstract void mo33267d(boolean z);

    /* renamed from: e */
    public abstract void mo33268e(PointF pointF);

    /* renamed from: f */
    public abstract void mo33269f(C58485gu guVar);

    /* renamed from: g */
    public final C27772bh mo33270g() {
        mo33268e(new PointF(C60752i.m92727a(mo33264a().x, 0.0f, 1.0f), C60752i.m92727a(mo33264a().y, 0.0f, 1.0f)));
        return mo33265b();
    }
}
