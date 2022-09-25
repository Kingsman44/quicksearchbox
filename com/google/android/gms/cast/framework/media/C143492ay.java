package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.C143573al;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: com.google.android.gms.cast.framework.media.ay */
/* compiled from: PG */
abstract class C143492ay extends BasePendingResult {

    /* renamed from: a */
    private C143573al f389115a;

    /* renamed from: g */
    public final boolean f389116g;

    /* renamed from: h */
    final /* synthetic */ C143500bf f389117h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143492ay(C143500bf bfVar, boolean z) {
        super((C143851w) null);
        this.f389117h = bfVar;
        this.f389116g = z;
    }

    /* renamed from: c */
    public final /* synthetic */ C143711ad mo117683c(Status status) {
        return new C143491ax(status);
    }

    /* renamed from: h */
    public abstract void mo118739h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C143573al mo118755i() {
        if (this.f389115a == null) {
            this.f389115a = new C143490aw(this);
        }
        return this.f389115a;
    }
}
