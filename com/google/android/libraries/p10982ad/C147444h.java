package com.google.android.libraries.p10982ad;

import android.animation.TimeAnimator;
import android.util.Property;

/* renamed from: com.google.android.libraries.ad.h */
/* compiled from: PG */
public final class C147444h extends C147443g {

    /* renamed from: j */
    private final Property f398006j;

    /* renamed from: k */
    private final Object f398007k;

    public C147444h(Object obj, Property property) {
        super(new TimeAnimator());
        this.f398007k = obj;
        this.f398006j = property;
        mo124186l(((Float) property.get(obj)).floatValue());
    }

    /* renamed from: c */
    public final void mo124177c() {
        this.f398006j.set(this.f398007k, Float.valueOf(mo124175a()));
    }
}
