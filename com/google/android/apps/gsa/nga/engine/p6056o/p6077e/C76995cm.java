package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p6044n.C76401e;
import com.google.android.apps.gsa.nga.engine.p6056o.C77422p;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80642f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.cm */
/* compiled from: PG */
public final class C76995cm implements C77422p, C75155d {

    /* renamed from: a */
    private static final C59071e f212532a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.o.e.cm");

    /* renamed from: b */
    private static final Duration f212533b = Duration.ofMinutes(5);

    /* renamed from: c */
    private static final Duration f212534c = Duration.ofSeconds(7);

    /* renamed from: d */
    private final PowerManager f212535d;

    /* renamed from: e */
    private final C80642f f212536e;

    /* renamed from: f */
    private final Object f212537f = new Object();

    /* renamed from: g */
    private final PowerManager.WakeLock f212538g;

    public C76995cm(Context context, C80642f fVar) {
        PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
        this.f212535d = powerManager;
        this.f212536e = fVar;
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(536870922, "Nga:WakeLockController");
        this.f212538g = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        synchronized (this.f212537f) {
            if (!boVar.mo71470p()) {
                try {
                    if (this.f212538g.isHeld()) {
                        this.f212538g.release();
                    }
                } catch (RuntimeException e) {
                    ((C59052c) ((C59052c) ((C59052c) f212532a.mo56226d()).mo56382g(e)).mo56372aa(3717)).mo56354G("Exception while releasing the WakeLock in state %s: %s", boVar.mo71458b(), e.getMessage());
                    int i = C90755l.f253831a;
                }
            } else if (!this.f212536e.mo74386l(boVar.mo71465k())) {
                if (!this.f212538g.isHeld()) {
                    this.f212538g.acquire(f212533b.toMillis());
                }
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }

    /* renamed from: c */
    public final void mo71390c(C76401e eVar) {
        this.f212535d.newWakeLock(536870922, "Nga:WakeLockController").acquire(f212534c.toMillis());
    }

    /* renamed from: d */
    public final /* synthetic */ void mo71391d(C76401e eVar) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo71392e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo71393f() {
    }
}
