package com.google.android.libraries.storage.p3304a.p3309d.p3310a;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42777a;
import com.google.android.libraries.storage.p3304a.p3312f.C42796t;
import com.google.common.p4541l.C59332o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.libraries.storage.a.d.a.a */
/* compiled from: PG */
public final class C42770a {

    /* renamed from: a */
    public final C42813k f112026a;

    /* renamed from: b */
    public final Uri f112027b;

    public C42770a(C42813k kVar, Uri uri) {
        this.f112026a = kVar;
        this.f112027b = uri;
    }

    /* renamed from: a */
    public final void mo45870a(InputStream inputStream, long j) {
        C42797g gVar;
        long a = this.f112026a.mo45887a(this.f112027b);
        if (j <= a) {
            if (j > 0) {
                gVar = new C42777a();
            } else {
                gVar = new C42796t();
            }
            OutputStream outputStream = (OutputStream) this.f112026a.mo45889c(this.f112027b, gVar);
            try {
                C59332o.m92211b(inputStream, outputStream);
                if (outputStream != null) {
                    outputStream.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else {
            throw new IOException(String.format("Invalid resumed download; offsetBytes exceeds the existing data size: %d, %d", new Object[]{Long.valueOf(j), Long.valueOf(a)}));
        }
        throw th;
    }
}
