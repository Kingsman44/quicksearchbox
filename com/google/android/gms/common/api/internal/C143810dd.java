package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.common.api.internal.dd */
/* compiled from: PG */
public abstract class C143810dd {

    /* renamed from: b */
    public final Feature[] f389864b;

    /* renamed from: c */
    public final boolean f389865c;

    /* renamed from: d */
    public final int f389866d;

    @Deprecated
    public C143810dd() {
        this.f389864b = null;
        this.f389865c = false;
        this.f389866d = 0;
    }

    protected C143810dd(Feature[] featureArr, boolean z, int i) {
        this.f389864b = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f389865c = z2;
        this.f389866d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo57751a(C143717b bVar, C146010af afVar);
}
