package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;

/* renamed from: com.google.android.gms.people.internal.m */
/* compiled from: PG */
final class C145676m extends C145656a {

    /* renamed from: a */
    private final C143825n f393915a;

    public C145676m(C143825n nVar) {
        this.f393915a = nVar;
    }

    /* renamed from: b */
    public final void mo121712b(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        Status q = C145679p.m236798q(i, bundle);
        if (bundle2 != null) {
            bundle2.getBoolean("rewindable");
            bundle2.getInt("width");
            bundle2.getInt("height");
        }
        this.f393915a.mo117682i(new C145678o(q, parcelFileDescriptor));
    }
}
