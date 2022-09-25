package com.google.android.gms.people.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.C145653g;
import java.io.IOException;

/* renamed from: com.google.android.gms.people.internal.o */
/* compiled from: PG */
final class C145678o implements C145653g {

    /* renamed from: a */
    private final Status f393918a;

    /* renamed from: b */
    private final ParcelFileDescriptor f393919b;

    public C145678o(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.f393918a = status;
        this.f393919b = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f393918a;
    }

    /* renamed from: b */
    public final void mo119102b() {
        ParcelFileDescriptor parcelFileDescriptor = this.f393919b;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public final ParcelFileDescriptor mo121707c() {
        return this.f393919b;
    }
}
