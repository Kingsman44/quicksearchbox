package com.google.android.enterprise.connectedapps.internal;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.C142552al;

/* compiled from: PG */
public final class CrossProfileBundleCallSender extends C142576a {

    /* renamed from: a */
    private final C142552al f386877a;

    /* renamed from: b */
    private final long f386878b;

    /* renamed from: c */
    private final int f386879c;

    /* renamed from: d */
    private final C142549ai f386880d;

    public CrossProfileBundleCallSender(C142552al alVar, long j, int i, C142549ai aiVar) {
        this.f386877a = alVar;
        this.f386878b = j;
        this.f386879c = i;
        this.f386880d = aiVar;
    }

    /* renamed from: a */
    public final void mo117203a(long j, int i, int i2, byte[] bArr) {
        this.f386877a.mo77085a(j, i, i2, bArr);
    }

    /* renamed from: b */
    public final byte[] mo117204b(long j, int i, byte[] bArr) {
        return this.f386877a.mo77086b(j, i, this.f386878b, this.f386879c, bArr, this.f386880d);
    }

    /* renamed from: c */
    public final byte[] mo117205c(long j, int i) {
        return this.f386877a.mo77087c(j, i);
    }

    /* renamed from: d */
    public final Bundle mo117206d(long j) {
        return this.f386877a.mo77088d(j);
    }

    /* renamed from: e */
    public final void mo117207e(long j, Bundle bundle) {
        this.f386877a.mo77089e(j, bundle);
    }

    public /* bridge */ /* synthetic */ Bundle makeBundleCall(Bundle bundle) {
        return super.makeBundleCall(bundle);
    }
}
