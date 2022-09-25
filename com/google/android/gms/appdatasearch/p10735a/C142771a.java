package com.google.android.gms.appdatasearch.p10735a;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.appdatasearch.a.a */
/* compiled from: PG */
public final class C142771a extends C142773c {

    /* renamed from: a */
    private final C146010af f387571a;

    public C142771a(C146010af afVar) {
        this.f387571a = afVar;
    }

    /* renamed from: a */
    public final void mo117674a(GetRecentContextCall$Response getRecentContextCall$Response) {
        C143811de.m233724a(getRecentContextCall$Response.f387453a, getRecentContextCall$Response.f387454b, this.f387571a);
    }

    /* renamed from: b */
    public final void mo117675b(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        C143811de.m233724a(status, parcelFileDescriptor, this.f387571a);
    }

    /* renamed from: c */
    public final void mo117676c(Status status) {
        C143811de.m233724a(status, (Object) null, this.f387571a);
    }
}
