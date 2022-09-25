package androidx.core.graphics;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

/* renamed from: androidx.core.graphics.m */
/* compiled from: PG */
public final class C1947m {
    /* renamed from: a */
    public static ParcelFileDescriptor m5267a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) {
        return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
    }
}
