package com.google.android.apps.gsa.nga.engine.p5900ag;

import com.google.assistant.p3897e.p3917i.p3918a.C51310cz;

/* renamed from: com.google.android.apps.gsa.nga.engine.ag.be */
/* compiled from: PG */
public final class C74820be {

    /* renamed from: a */
    private final C74818bc f208980a;

    public C74820be(C74818bc bcVar) {
        this.f208980a = bcVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C51310cz mo71216a() {
        return mo71220e() ? C51310cz.DEVICE_UNLOCKED : C51310cz.DEVICE_LOCKED;
    }

    /* renamed from: b */
    public final boolean mo71217b() {
        return !this.f208980a.f208979b.isDeviceLocked();
    }

    /* renamed from: c */
    public final /* synthetic */ boolean mo71218c() {
        return !mo71220e();
    }

    /* renamed from: d */
    public final boolean mo71219d() {
        return this.f208980a.f208978a.isInteractive();
    }

    /* renamed from: e */
    public final boolean mo71220e() {
        return this.f208980a.f208978a.isInteractive() && !this.f208980a.f208979b.isKeyguardLocked();
    }
}
