package com.google.android.libraries.onegoogle.accountmanagement;

import android.os.SystemClock;

/* renamed from: com.google.android.libraries.onegoogle.accountmanagement.i */
/* compiled from: PG */
public final class C30280i {

    /* renamed from: a */
    public static final C30280i f81876a = new C30280i();

    /* renamed from: b */
    public boolean f81877b = false;

    /* renamed from: c */
    public long f81878c = -1;

    private C30280i() {
    }

    /* renamed from: a */
    public final void mo35793a(boolean z) {
        if (z != this.f81877b) {
            this.f81877b = z;
            if (!z) {
                this.f81878c = SystemClock.elapsedRealtime();
            }
        }
    }
}
