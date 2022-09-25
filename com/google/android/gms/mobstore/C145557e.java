package com.google.android.gms.mobstore;

import android.os.ParcelFileDescriptor;
import com.google.android.libraries.storage.p3304a.p3307c.C42739a;
import com.google.android.libraries.storage.p3304a.p3307c.C42766s;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;
import p3186j$.wrapper.java.p3189io.FileInputStreamWrapper;

/* renamed from: com.google.android.gms.mobstore.e */
/* compiled from: PG */
final class C145557e extends FileInputStream implements InputStreamRetargetInterface, C42766s, C42739a {

    /* renamed from: a */
    private final ParcelFileDescriptor f393598a;

    public C145557e(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.f393598a = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final Long mo45840a() {
        return Long.valueOf(this.f393598a.getStatSize());
    }

    /* renamed from: b */
    public final FileChannel mo45845b() {
        return FileInputStreamWrapper.getChannel(this);
    }

    public final void close() {
        try {
            super.close();
        } finally {
            this.f393598a.close();
        }
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
