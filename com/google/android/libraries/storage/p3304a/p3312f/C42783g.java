package com.google.android.libraries.storage.p3304a.p3312f;

import android.net.Uri;
import android.util.Pair;
import java.io.Closeable;

/* renamed from: com.google.android.libraries.storage.a.f.g */
/* compiled from: PG */
public final class C42783g implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ Uri f112050a;

    /* renamed from: b */
    final /* synthetic */ Pair f112051b;

    public C42783g(Uri uri, Pair pair) {
        this.f112050a = uri;
        this.f112051b = pair;
    }

    public final void close() {
        ((Closeable) this.f112051b.second).close();
    }
}
