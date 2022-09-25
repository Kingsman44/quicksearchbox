package com.google.android.libraries.mdi.download;

import android.net.Uri;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.mdi.download.bz */
/* compiled from: PG */
abstract class C28748bz extends C28786ca {
    /* renamed from: a */
    public C63088z mo34358a() {
        throw null;
    }

    /* renamed from: c */
    public final Uri mo34362c() {
        int b = mo34359b();
        String str = b != 1 ? b != 2 ? "null" : "URI" : "BYTESTRING";
        if (b != 0) {
            throw new UnsupportedOperationException(str);
        }
        throw null;
    }
}
