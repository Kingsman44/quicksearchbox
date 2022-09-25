package com.google.android.libraries.storage.p3304a.p3312f;

import com.google.android.libraries.storage.p3304a.C42776f;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.android.libraries.storage.p3304a.p3307c.C42766s;
import com.google.android.libraries.storage.p3304a.p3307c.C42768u;
import com.google.common.p4541l.C59332o;
import com.google.common.p4575r.C60757n;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.storage.a.f.k */
/* compiled from: PG */
public final class C42787k implements C42797g {
    /* renamed from: b */
    public static final byte[] m75554b(C42776f fVar) {
        InputStream b = new C42790n().mo34512a(fVar);
        try {
            Long a = b instanceof C42766s ? ((C42766s) b).mo45840a() : null;
            if (a == null && !fVar.mo45872b()) {
                try {
                    long a2 = fVar.f112038a.mo45887a(fVar.f112042e);
                    if (a2 > 0) {
                        a = Long.valueOf(a2);
                    }
                } catch (C42768u unused) {
                }
            }
            if (a == null) {
                byte[] d = C59332o.m92213d(b);
                if (b != null) {
                    b.close();
                }
                return d;
            }
            byte[] bArr = new byte[C60757n.m92740a(a.longValue())];
            C59332o.m92212c(b, bArr);
            if (b != null) {
                b.close();
            }
            return bArr;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused2) {
            }
        }
        throw th;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo34512a(C42776f fVar) {
        return m75554b(fVar);
    }
}
