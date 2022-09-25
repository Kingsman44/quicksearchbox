package com.google.android.libraries.storage.p3304a.p3312f;

import com.google.android.libraries.storage.p3304a.C42776f;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.android.libraries.storage.p3304a.p3307c.C42739a;
import com.google.android.libraries.storage.p3304a.p3307c.C42768u;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.google.android.libraries.storage.a.f.f */
/* compiled from: PG */
public final class C42782f implements C42797g {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo34512a(C42776f fVar) {
        InputStream b = new C42790n().mo34512a(fVar);
        try {
            if (b instanceof C42739a) {
                FileChannel b2 = ((C42739a) b).mo45845b();
                MappedByteBuffer map = b2.map(FileChannel.MapMode.READ_ONLY, 0, b2.size());
                if (b != null) {
                    b.close();
                }
                return map;
            }
            String valueOf = String.valueOf(fVar.f112042e);
            throw new C42768u("URI not convertible to FileChannel for mapping: " + valueOf);
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
