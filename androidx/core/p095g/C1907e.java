package androidx.core.p095g;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

/* renamed from: androidx.core.g.e */
/* compiled from: PG */
final class C1907e {
    /* renamed from: a */
    static Cursor m5172a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
    }
}
