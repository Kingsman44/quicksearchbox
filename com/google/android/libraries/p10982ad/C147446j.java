package com.google.android.libraries.p10982ad;

import android.animation.TimeAnimator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.ad.j */
/* compiled from: PG */
public final class C147446j extends C147443g {

    /* renamed from: j */
    private final List f398008j;

    public C147446j() {
        this(0.0f);
    }

    /* renamed from: c */
    public final void mo124177c() {
        for (C147445i a : this.f398008j) {
            a.mo18517a();
        }
    }

    /* renamed from: n */
    public final void mo124188n(C147445i iVar) {
        this.f398008j.add(iVar);
    }

    /* renamed from: o */
    public final void mo124189o(C147445i iVar) {
        this.f398008j.remove(iVar);
    }

    public C147446j(float f) {
        super(new TimeAnimator());
        this.f398008j = new ArrayList();
        mo124186l(f);
    }
}
