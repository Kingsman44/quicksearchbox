package com.google.android.libraries.storage.p3304a.p3312f;

import com.google.android.libraries.storage.p3304a.C42776f;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.android.libraries.storage.p3304a.p3307c.C42749b;
import com.google.android.libraries.storage.p3304a.p3307c.C42765r;
import com.google.android.libraries.storage.p3304a.p3307c.C42768u;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.storage.a.f.l */
/* compiled from: PG */
public final class C42788l implements C42797g {

    /* renamed from: a */
    public boolean f112052a = false;

    static {
        new AtomicInteger();
    }

    /* renamed from: b */
    public final File mo34512a(C42776f fVar) {
        if (!this.f112052a) {
            C42765r rVar = new C42765r(new C42790n().mo34512a(fVar));
            try {
                Closeable closeable = rVar.f112024a;
                if (closeable instanceof C42749b) {
                    File c = ((C42749b) closeable).mo45846c();
                    rVar.close();
                    return c;
                }
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else if (!fVar.mo45872b()) {
            return fVar.f112039b.mo45813d(fVar.f112043f);
        } else {
            throw new C42768u("Short circuit would skip transforms.");
        }
        throw th;
    }
}
