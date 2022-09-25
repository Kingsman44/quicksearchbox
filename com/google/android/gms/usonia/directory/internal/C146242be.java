package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.usonia.directory.internal.be */
/* compiled from: PG */
final class C146242be extends C146214ad {

    /* renamed from: a */
    final /* synthetic */ C143784ce f395100a;

    /* renamed from: b */
    final /* synthetic */ C146010af f395101b;

    public C146242be(C143784ce ceVar, C146010af afVar) {
        this.f395100a = ceVar;
        this.f395101b = afVar;
    }

    /* renamed from: e */
    public final void mo122806e(Status status) {
        this.f395100a.mo119235a(new C146241bd(status));
        C143811de.m233724a(status, (Object) null, this.f395101b);
    }
}
