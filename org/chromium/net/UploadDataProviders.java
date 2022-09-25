package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new C72430aa(new C72559x(parcelFileDescriptor));
    }

    public static UploadDataProvider create(File file) {
        return new C72430aa(new C72558w(file));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new C72560y(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new C72560y(ByteBuffer.wrap(bArr, i, i2).slice());
    }
}
