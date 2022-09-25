package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C143819h;

/* renamed from: com.google.android.gms.common.api.q */
/* compiled from: PG */
public final class C143845q {

    /* renamed from: a */
    public C143819h f389921a;

    /* renamed from: b */
    private Looper f389922b;

    /* renamed from: a */
    public final C143846r mo119288a() {
        if (this.f389921a == null) {
            this.f389921a = new C143819h();
        }
        if (this.f389922b == null) {
            this.f389922b = Looper.getMainLooper();
        }
        return new C143846r(this.f389921a, this.f389922b);
    }
}
