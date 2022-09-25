package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C143853y;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.ab */
/* compiled from: PG */
final class C143727ab implements C143853y {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f389646a;

    /* renamed from: b */
    final /* synthetic */ C143729ad f389647b;

    public C143727ab(C143729ad adVar, BasePendingResult basePendingResult) {
        this.f389647b = adVar;
        this.f389646a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo119124a(Status status) {
        this.f389647b.f389650a.remove(this.f389646a);
    }
}
