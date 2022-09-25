package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.nio.channels.FileChannel;
import p3186j$.wrapper.java.p3189io.FileInputStreamWrapper;

/* renamed from: org.chromium.net.x */
/* compiled from: PG */
final class C72559x implements C72561z {

    /* renamed from: a */
    final /* synthetic */ ParcelFileDescriptor f193083a;

    public C72559x(ParcelFileDescriptor parcelFileDescriptor) {
        this.f193083a = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final FileChannel mo64308a() {
        if (this.f193083a.getStatSize() != -1) {
            return FileInputStreamWrapper.getChannel(new ParcelFileDescriptor.AutoCloseInputStream(this.f193083a));
        }
        this.f193083a.close();
        StringBuilder sb = new StringBuilder("Not a file: ");
        ParcelFileDescriptor parcelFileDescriptor = this.f193083a;
        sb.append(parcelFileDescriptor);
        throw new IllegalArgumentException("Not a file: ".concat(String.valueOf(parcelFileDescriptor)));
    }
}
