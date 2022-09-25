package com.google.android.enterprise.connectedapps;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import p3186j$.util.Objects;

/* renamed from: com.google.android.enterprise.connectedapps.z */
/* compiled from: PG */
final class C142623z implements C142545ae {

    /* renamed from: a */
    public final long f386950a;

    /* renamed from: b */
    public final int f386951b;

    /* renamed from: c */
    public final Bundle f386952c;

    /* renamed from: d */
    public final C142553am f386953d;

    public C142623z(long j, int i, Bundle bundle, C142553am amVar) {
        amVar.getClass();
        this.f386950a = j;
        this.f386951b = i;
        this.f386952c = bundle;
        this.f386953d = amVar;
    }

    /* renamed from: a */
    public final void mo117167a(Throwable th) {
        C142553am amVar = this.f386953d;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        bundle.putSerializable("throwable", th);
        amVar.mo106921a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C142623z zVar = (C142623z) obj;
            return this.f386950a == zVar.f386950a && this.f386951b == zVar.f386951b && this.f386952c.equals(zVar.f386952c) && this.f386953d.equals(zVar.f386953d);
        }
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f386950a), Integer.valueOf(this.f386951b), this.f386952c, this.f386953d);
    }
}
