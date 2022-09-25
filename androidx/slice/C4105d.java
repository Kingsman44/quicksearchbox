package androidx.slice;

import android.app.slice.Slice;
import android.app.slice.SliceManager;
import android.net.Uri;
import java.util.Set;

/* renamed from: androidx.slice.d */
/* compiled from: PG */
final class C4105d {
    /* renamed from: a */
    static Slice m11765a(SliceManager sliceManager, Uri uri, Set set) {
        return sliceManager.bindSlice(uri, set);
    }
}
