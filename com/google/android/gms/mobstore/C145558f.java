package com.google.android.gms.mobstore;

import android.os.ParcelFileDescriptor;
import com.google.android.libraries.storage.p3304a.p3307c.C42739a;
import com.google.android.libraries.storage.p3304a.p3307c.C42767t;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* renamed from: com.google.android.gms.mobstore.f */
/* compiled from: PG */
final class C145558f extends FileOutputStream implements C42767t, C42739a {

    /* renamed from: a */
    private final ParcelFileDescriptor f393599a;

    public C145558f(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.f393599a = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final void mo45847a() {
        getFD().sync();
    }

    /* renamed from: b */
    public final FileChannel mo45845b() {
        return getChannel();
    }

    public final void close() {
        try {
            super.close();
        } finally {
            this.f393599a.close();
        }
    }
}
