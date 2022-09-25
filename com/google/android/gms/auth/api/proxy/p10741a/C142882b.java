package com.google.android.gms.auth.api.proxy.p10741a;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.p10740a.C142873a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.auth.api.proxy.a.b */
/* compiled from: PG */
final class C142882b extends C142873a {

    /* renamed from: a */
    final /* synthetic */ C146010af f387685a;

    public C142882b(C146010af afVar) {
        this.f387685a = afVar;
    }

    /* renamed from: a */
    public final void mo117787a(String str) {
        Status status;
        if (str != null) {
            status = Status.f389615a;
        } else {
            status = new Status(1, 3006, (String) null, (PendingIntent) null, (ConnectionResult) null);
        }
        C143811de.m233724a(status, str, this.f387685a);
    }
}
