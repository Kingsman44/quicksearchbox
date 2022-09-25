package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.common.api.internal.cq */
/* compiled from: PG */
public final class C143796cq {

    /* renamed from: a */
    public C143798cs f389831a;

    /* renamed from: b */
    public C143798cs f389832b;

    /* renamed from: c */
    public C143784ce f389833c;

    /* renamed from: d */
    public Feature[] f389834d;

    /* renamed from: e */
    public boolean f389835e = true;

    /* renamed from: f */
    public int f389836f;

    /* renamed from: g */
    private final Runnable f389837g = C143793cn.f389828a;

    /* renamed from: a */
    public final C143797cr mo119255a() {
        boolean z = true;
        C143919bh.m233960c(this.f389831a != null, "Must set register function");
        C143919bh.m233960c(this.f389832b != null, "Must set unregister function");
        if (this.f389833c == null) {
            z = false;
        }
        C143919bh.m233960c(z, "Must set holder");
        C143782cc ccVar = this.f389833c.f389806b;
        C143919bh.m233971n(ccVar, "Key must not be null");
        return new C143797cr(new C143794co(this, this.f389833c, this.f389834d, this.f389835e, this.f389836f), new C143795cp(this, ccVar), this.f389837g);
    }
}
