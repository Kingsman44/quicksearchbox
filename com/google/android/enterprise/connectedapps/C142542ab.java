package com.google.android.enterprise.connectedapps;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.util.Objects;

/* renamed from: com.google.android.enterprise.connectedapps.ab */
/* compiled from: PG */
final class C142542ab extends C142548ah {

    /* renamed from: a */
    public final C142623z f386801a;

    /* renamed from: b */
    private final C142543ac f386802b;

    /* renamed from: c */
    private final BundleCallReceiver f386803c = new BundleCallReceiver();

    public C142542ab(C142543ac acVar, C142623z zVar) {
        this.f386802b = acVar;
        this.f386801a = zVar;
    }

    /* renamed from: a */
    public final void mo117144a(long j, int i, byte[] bArr) {
        Bundle preparedCall = this.f386803c.getPreparedCall(j, i, bArr);
        this.f386802b.mo117159k(this.f386801a);
        this.f386801a.f386953d.mo106921a(preparedCall);
        C142543ac acVar = this.f386802b;
        ScheduledExecutorService scheduledExecutorService = acVar.f386808c;
        Objects.requireNonNull(acVar);
        scheduledExecutorService.execute(new C142541aa(acVar));
    }

    /* renamed from: b */
    public final void mo117145b(long j, int i, int i2, byte[] bArr) {
        this.f386802b.mo117159k(this.f386801a);
        this.f386801a.f386953d.mo106922b(i2, this.f386803c.getPreparedCall(j, i, bArr));
    }

    /* renamed from: c */
    public final void mo117146c(long j, int i, int i2, byte[] bArr) {
        this.f386803c.mo117193a(j, i, i2, bArr);
    }

    /* renamed from: d */
    public final void mo117147d(long j, Bundle bundle) {
        this.f386803c.mo117196e(j, bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C142542ab abVar = (C142542ab) obj;
            return this.f386802b.equals(abVar.f386802b) && this.f386801a.equals(abVar.f386801a);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f386802b, this.f386801a);
    }
}
