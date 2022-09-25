package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.measurement.internal.jj */
/* compiled from: PG */
public final class C145473jj extends C145355f {

    /* renamed from: b */
    public Handler f393318b;

    /* renamed from: c */
    protected final C145472ji f393319c = new C145472ji(this);

    /* renamed from: d */
    protected final C145471jh f393320d = new C145471jh(this);

    /* renamed from: e */
    protected final C145469jf f393321e = new C145469jf(this);

    public C145473jj(C145361ff ffVar) {
        super(ffVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo120873d() {
        return false;
    }

    /* renamed from: e */
    public final void mo121190e() {
        mo120904g();
        if (this.f393318b == null) {
            this.f393318b = new C144861c(Looper.getMainLooper());
        }
    }
}
