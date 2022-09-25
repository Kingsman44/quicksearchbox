package com.google.android.libraries.storage.p3304a.p3312f;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.google.android.libraries.storage.p3304a.C42776f;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.android.libraries.storage.p3304a.p3307c.C42764q;
import com.google.android.libraries.storage.p3304a.p3307c.C42768u;
import java.io.Closeable;

/* renamed from: com.google.android.libraries.storage.a.f.i */
/* compiled from: PG */
public final class C42785i implements C42797g {
    /* renamed from: b */
    public static final ParcelFileDescriptor m75551b(C42776f fVar) {
        Pair b = fVar.f112039b.mo45812b(fVar.f112043f);
        try {
            if (!fVar.mo45872b()) {
                Uri uri = (Uri) b.first;
                if (uri.getScheme().equals("fd")) {
                    ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(Integer.parseInt(uri.getSchemeSpecificPart()));
                    ((Closeable) b.second).close();
                    return fromFd;
                }
                throw new C42764q("Scheme must be 'fd'");
            }
            String valueOf = String.valueOf(fVar.f112042e);
            throw new C42768u("Accessing file descriptor directly would skip transforms for " + valueOf);
        } catch (NumberFormatException e) {
            throw new C42764q((Throwable) e);
        } catch (Throwable th) {
            ((Closeable) b.second).close();
            throw th;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo34512a(C42776f fVar) {
        return m75551b(fVar);
    }
}
