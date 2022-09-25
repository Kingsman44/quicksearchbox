package com.facebook.litho.p322a;

import android.view.animation.Interpolator;
import com.facebook.litho.C6373gz;
import com.facebook.litho.p326e.C6215d;
import com.facebook.litho.p326e.C6220i;
import com.facebook.litho.p326e.C6221j;
import com.facebook.litho.p326e.C6222k;
import com.facebook.litho.p326e.C6225n;
import java.util.ArrayList;

/* renamed from: com.facebook.litho.a.t */
/* compiled from: PG */
public final class C6087t extends C6089v {

    /* renamed from: b */
    private final int f17981b;

    /* renamed from: c */
    private final C6084q f17982c;

    /* renamed from: d */
    private final Interpolator f17983d;

    public C6087t(int i, C6084q qVar, Interpolator interpolator) {
        super(C6220i.m16478a());
        this.f17981b = i;
        this.f17982c = qVar;
        this.f17983d = interpolator;
    }

    /* renamed from: c */
    public final void mo12770c(ArrayList arrayList) {
        arrayList.add(this.f17982c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo12791m(C6373gz gzVar) {
        C6225n nVar = new C6225n(this.f17981b);
        C6215d dVar = new C6215d(gzVar.mo13386a(this.f17982c.f17975a));
        C6215d dVar2 = new C6215d(this.f17982c.f17976b);
        C6222k kVar = new C6222k();
        Interpolator interpolator = this.f17983d;
        if (interpolator != null) {
            C6221j jVar = new C6221j(interpolator);
            this.f17985a.mo13181b(nVar, jVar, "default_input");
            this.f17985a.mo13181b(jVar, kVar, "default_input");
        } else {
            this.f17985a.mo13181b(nVar, kVar, "default_input");
        }
        this.f17985a.mo13181b(dVar, kVar, "initial");
        this.f17985a.mo13181b(dVar2, kVar, "end");
        this.f17985a.mo13181b(kVar, gzVar.mo13387b(this.f17982c.f17975a), "default_input");
    }
}
