package com.google.android.libraries.lens.view.onboarding;

import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.lens.p4711m.C62632i;

/* renamed from: com.google.android.libraries.lens.view.onboarding.an */
/* compiled from: PG */
public final class C27481an {

    /* renamed from: a */
    private final C25225bd f75151a;

    /* renamed from: b */
    private final boolean f75152b;

    /* renamed from: c */
    private final C27232l f75153c;

    /* renamed from: d */
    private final boolean f75154d;

    /* renamed from: e */
    private final C25504aj f75155e;

    public C27481an(C25225bd bdVar, C27232l lVar, boolean z, boolean z2, C25504aj ajVar) {
        this.f75151a = bdVar;
        this.f75152b = z2;
        this.f75153c = lVar;
        this.f75154d = z;
        this.f75155e = ajVar;
    }

    /* renamed from: a */
    public final boolean mo33016a() {
        if (this.f75152b) {
            return true;
        }
        if (!this.f75151a.mo30359o()) {
            return false;
        }
        return !C62632i.m94823h(this.f75153c.mo32701h()) || this.f75151a.mo30346b() > 0;
    }

    /* renamed from: b */
    public final boolean mo33017b() {
        return this.f75154d && mo33016a() && this.f75155e.mo30536f("android.permission.CAMERA") && !C62632i.m94823h(this.f75153c.mo32701h());
    }
}
