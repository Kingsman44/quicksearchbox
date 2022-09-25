package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.dh */
/* compiled from: PG */
public final class C143814dh {

    /* renamed from: a */
    public static final Status f389868a = new Status(1, 8, "The connection to Google Play services was lost", (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: b */
    final Set f389869b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: c */
    private final C143813dg f389870c = new C143813dg(this);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo119261a(BasePendingResult basePendingResult) {
        this.f389869b.add(basePendingResult);
        basePendingResult.f389641m.set(this.f389870c);
    }
}
