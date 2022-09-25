package com.google.android.apps.gsa.nga.engine.recognition.p6109b;

import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.b.h */
/* compiled from: PG */
public final class C77580h {

    /* renamed from: a */
    public boolean f213722a = true;

    /* renamed from: b */
    public float f213723b = 0.0f;

    /* renamed from: c */
    public final C22871g f213724c;

    /* renamed from: d */
    public final C91142g f213725d;

    /* renamed from: e */
    public final AtomicBoolean f213726e = new AtomicBoolean(false);

    public C77580h(C22871g gVar, C91142g gVar2) {
        this.f213724c = gVar;
        this.f213725d = gVar2;
    }

    /* renamed from: a */
    public final boolean mo72720a() {
        boolean z;
        long d = this.f213725d.mo85399d(C90126fx.f251752oj);
        synchronized (this) {
            z = true;
            if (!this.f213726e.get()) {
                if (d <= 0 || this.f213723b * 1000.0f <= ((float) d)) {
                    z = false;
                }
            }
        }
        return z;
    }
}
