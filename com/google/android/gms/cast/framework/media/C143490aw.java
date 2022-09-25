package com.google.android.gms.cast.framework.media;

import android.app.PendingIntent;
import com.google.android.gms.cast.internal.C143573al;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.cast.framework.media.aw */
/* compiled from: PG */
final class C143490aw implements C143573al {

    /* renamed from: a */
    final /* synthetic */ C143492ay f389113a;

    public C143490aw(C143492ay ayVar) {
        this.f389113a = ayVar;
    }

    /* renamed from: a */
    public final void mo118753a(long j, int i, Object obj) {
        try {
            this.f389113a.mo119112p(new C143495ba(new Status(1, i, (String) null, (PendingIntent) null, (ConnectionResult) null)));
        } catch (IllegalStateException e) {
            C143500bf.f389126a.mo118887e(e, "Result already set when calling onRequestCompleted", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo118754b(long j) {
        try {
            this.f389113a.mo119112p(new C143491ax(new Status(1, 2103, (String) null, (PendingIntent) null, (ConnectionResult) null)));
        } catch (IllegalStateException e) {
            C143500bf.f389126a.mo118887e(e, "Result already set when calling onRequestReplaced", new Object[0]);
        }
    }
}
