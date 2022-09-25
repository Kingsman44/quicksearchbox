package com.google.android.gms.car.p10760f;

import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.car.C143181dh;

/* renamed from: com.google.android.gms.car.f.v */
/* compiled from: PG */
final class C143307v implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ C143268bb f388537a;

    public C143307v(C143268bb bbVar) {
        this.f388537a = bbVar;
    }

    public final void binderDied() {
        C143181dh.m232308a(Looper.getMainLooper(), this.f388537a.f388456e);
    }
}
