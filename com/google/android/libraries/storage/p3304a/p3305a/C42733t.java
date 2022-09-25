package com.google.android.libraries.storage.p3304a.p3305a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.storage.p3304a.p3307c.C42764q;
import java.io.File;

/* renamed from: com.google.android.libraries.storage.a.a.t */
/* compiled from: PG */
public final class C42733t {

    /* renamed from: a */
    public static final C42733t f111992a = new C42733t();

    private C42733t() {
    }

    /* renamed from: a */
    public static final File m75495a(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new C42764q("Scheme must be 'file'");
        } else if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new C42764q("Did not expect uri to have query");
        } else if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        } else {
            throw new C42764q("Did not expect uri to have authority");
        }
    }
}
