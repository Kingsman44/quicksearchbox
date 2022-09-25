package com.google.android.libraries.storage.p3304a.p3314h;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.google.android.libraries.storage.p3304a.p3307c.C42754g;
import com.google.android.libraries.storage.p3304a.p3307c.C42755h;
import com.google.android.libraries.storage.p3304a.p3307c.C42756i;
import com.google.android.libraries.storage.p3304a.p3307c.C42763p;
import com.google.android.libraries.storage.p3304a.p3307c.C42768u;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42746g;
import com.google.android.libraries.storage.p3304a.p3313g.C42804g;
import com.google.android.libraries.storage.p3304a.p3313g.C42805h;
import com.google.p5238v.p5239a.C67540ak;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.storage.a.h.c */
/* compiled from: PG */
public final class C42809c implements C42805h {

    /* renamed from: a */
    public static final byte[] f112065a = new byte[0];

    /* renamed from: b */
    public static final C42763p f112066b = new C42763p(new ConcurrentHashMap());

    /* renamed from: c */
    private static boolean f112067c = false;

    /* renamed from: d */
    private static final Object f112068d = new Object();

    /* renamed from: e */
    private final Context f112069e;

    /* renamed from: f */
    private final C42763p f112070f;

    /* renamed from: g */
    private volatile boolean f112071g = false;

    /* renamed from: h */
    private C67540ak f112072h = null;

    public C42809c(Context context, C42763p pVar) {
        this.f112069e = context;
        this.f112070f = pVar;
    }

    /* renamed from: a */
    public final InputStream mo45879a(Uri uri, InputStream inputStream) {
        C42754g b = C42756i.m75530b(uri);
        mo45886g();
        try {
            if (Collections.unmodifiableList(b.f112015b).isEmpty()) {
                return this.f112072h.mo59913a(inputStream, f112065a);
            }
            C42755h hVar = (C42755h) Collections.unmodifiableList(b.f112015b).get(0);
            if ("aes_gcm_key".equals(hVar.f112016a)) {
                return new C42746g(new C42808b(Base64.decode(hVar.f112017b, 2), inputStream));
            }
            String str = hVar.f112016a;
            throw new C42768u("Unsupported decryption mode: " + str);
        } catch (GeneralSecurityException e) {
            throw new IOException("Failed to decrypt stream", e);
        }
    }

    /* renamed from: b */
    public final OutputStream mo45880b(Uri uri, OutputStream outputStream) {
        C42754g b = C42756i.m75530b(uri);
        mo45886g();
        try {
            if (Collections.unmodifiableList(b.f112015b).isEmpty()) {
                return this.f112072h.mo59914b(outputStream, f112065a);
            }
            String str = ((C42755h) Collections.unmodifiableList(b.f112015b).get(0)).f112016a;
            throw new C42768u("Unsupported encryption mode: " + str);
        } catch (GeneralSecurityException e) {
            throw new IOException("Failed to encrypt stream", e);
        }
    }

    /* renamed from: c */
    public final String mo45881c() {
        return "encrypt";
    }

    /* renamed from: d */
    public final /* synthetic */ OutputStream mo45882d(OutputStream outputStream) {
        return C42804g.m75613a(this, outputStream);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo45883e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo45884f() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00dd */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45886g() {
        /*
            r8 = this;
            boolean r0 = r8.f112071g
            if (r0 != 0) goto L_0x00ec
            java.lang.Object r0 = f112068d
            monitor-enter(r0)
            boolean r1 = r8.f112071g     // Catch:{ all -> 0x00e9 }
            if (r1 != 0) goto L_0x00e7
            android.net.Uri$Builder r1 = new android.net.Uri$Builder     // Catch:{ GeneralSecurityException -> 0x00de }
            r1.<init>()     // Catch:{ GeneralSecurityException -> 0x00de }
            java.lang.String r2 = "file"
            android.net.Uri$Builder r1 = r1.scheme(r2)     // Catch:{ GeneralSecurityException -> 0x00de }
            java.lang.String r2 = ""
            android.net.Uri$Builder r1 = r1.authority(r2)     // Catch:{ GeneralSecurityException -> 0x00de }
            java.lang.String r2 = "/"
            android.net.Uri$Builder r1 = r1.path(r2)     // Catch:{ GeneralSecurityException -> 0x00de }
            com.google.common.b.gp r2 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ GeneralSecurityException -> 0x00de }
            android.content.Context r3 = r8.f112069e     // Catch:{ GeneralSecurityException -> 0x00de }
            java.io.File r3 = com.google.android.libraries.storage.p3304a.p3305a.C42717d.m75457b(r3)     // Catch:{ GeneralSecurityException -> 0x00de }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ GeneralSecurityException -> 0x00de }
            r1.path(r3)     // Catch:{ GeneralSecurityException -> 0x00de }
            java.lang.String r3 = "mobstore_encrypt"
            r1.appendPath(r3)     // Catch:{ GeneralSecurityException -> 0x00de }
            android.net.Uri r1 = com.google.android.libraries.storage.p3304a.p3305a.C42732s.m75494a(r1, r2)     // Catch:{ GeneralSecurityException -> 0x00de }
            com.google.android.libraries.storage.a.k r2 = new com.google.android.libraries.storage.a.k     // Catch:{ GeneralSecurityException -> 0x00de }
            r3 = 1
            com.google.android.libraries.storage.a.g.b[] r4 = new com.google.android.libraries.storage.p3304a.p3313g.C42799b[r3]     // Catch:{ GeneralSecurityException -> 0x00de }
            com.google.android.libraries.storage.a.a.v r5 = new com.google.android.libraries.storage.a.a.v     // Catch:{ GeneralSecurityException -> 0x00de }
            com.google.android.libraries.storage.a.c.p r6 = r8.f112070f     // Catch:{ GeneralSecurityException -> 0x00de }
            r5.<init>(r6)     // Catch:{ GeneralSecurityException -> 0x00de }
            r6 = 0
            r4[r6] = r5     // Catch:{ GeneralSecurityException -> 0x00de }
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ GeneralSecurityException -> 0x00de }
            r2.<init>(r4)     // Catch:{ GeneralSecurityException -> 0x00de }
            com.google.android.libraries.storage.a.f.e r4 = com.google.android.libraries.storage.p3304a.p3312f.C42781e.m75547b()     // Catch:{ GeneralSecurityException -> 0x00de }
            java.lang.Object r1 = r2.mo45889c(r1, r4)     // Catch:{ GeneralSecurityException -> 0x00de }
            java.io.Closeable r1 = (java.io.Closeable) r1     // Catch:{ GeneralSecurityException -> 0x00de }
            boolean r2 = f112067c     // Catch:{ all -> 0x00c0 }
            if (r2 != 0) goto L_0x0065
            com.google.p5238v.p5239a.p5258l.C67822h.m97965a()     // Catch:{ all -> 0x00c0 }
            f112067c = r3     // Catch:{ all -> 0x00c0 }
        L_0x0065:
            android.content.Context r2 = r8.f112069e     // Catch:{ all -> 0x00c0 }
            com.google.v.a.e.a.a r4 = new com.google.v.a.e.a.a     // Catch:{ all -> 0x00c0 }
            r4.<init>()     // Catch:{ all -> 0x00c0 }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x00c0 }
            if (r2 == 0) goto L_0x00b8
            com.google.v.a.e.a.e r5 = new com.google.v.a.e.a.e     // Catch:{ all -> 0x00c0 }
            r5.<init>(r2)     // Catch:{ all -> 0x00c0 }
            r4.f183508a = r5     // Catch:{ all -> 0x00c0 }
            com.google.v.a.e.a.f r5 = new com.google.v.a.e.a.f     // Catch:{ all -> 0x00c0 }
            r5.<init>(r2)     // Catch:{ all -> 0x00c0 }
            r4.f183512e = r5     // Catch:{ all -> 0x00c0 }
            r2 = 4096(0x1000, float:5.74E-42)
            r5 = 16
            com.google.v.a.j.af r2 = com.google.p5238v.p5239a.p5258l.C67820f.m97959h(r5, r5, r2)     // Catch:{ all -> 0x00c0 }
            com.google.v.a.l.f r5 = new com.google.v.a.l.f     // Catch:{ all -> 0x00c0 }
            r5.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey"
            byte[] r2 = r2.toByteArray()     // Catch:{ all -> 0x00c0 }
            r7 = 3
            com.google.v.a.r r2 = com.google.p5238v.p5239a.C67902r.m98165a(r5, r2, r7)     // Catch:{ all -> 0x00c0 }
            r4.f183510c = r2     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = "android-keystore://mobstore_encrypt"
            r4.f183509b = r2     // Catch:{ all -> 0x00c0 }
            com.google.v.a.e.a.b r2 = r4.mo59930a()     // Catch:{ all -> 0x00c0 }
            com.google.v.a.t r2 = r2.mo59931a()     // Catch:{ all -> 0x00c0 }
            java.lang.Class<com.google.v.a.ak> r4 = com.google.p5238v.p5239a.C67540ak.class
            java.lang.Object r2 = r2.mo60041c(r4)     // Catch:{ all -> 0x00c0 }
            com.google.v.a.ak r2 = (com.google.p5238v.p5239a.C67540ak) r2     // Catch:{ all -> 0x00c0 }
            r8.f112072h = r2     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x00b5
            r1.close()     // Catch:{ GeneralSecurityException -> 0x00de }
        L_0x00b5:
            r8.f112071g = r3     // Catch:{ GeneralSecurityException -> 0x00de }
            goto L_0x00e7
        L_0x00b8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c0 }
            java.lang.String r4 = "need an Android context"
            r2.<init>(r4)     // Catch:{ all -> 0x00c0 }
            throw r2     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r2 = move-exception
            if (r1 == 0) goto L_0x00dd
            r1.close()     // Catch:{ all -> 0x00c7 }
            goto L_0x00dd
        L_0x00c7:
            r1 = move-exception
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00dd }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r6] = r5     // Catch:{ Exception -> 0x00dd }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r7, r4)     // Catch:{ Exception -> 0x00dd }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00dd }
            r3[r6] = r1     // Catch:{ Exception -> 0x00dd }
            r4.invoke(r2, r3)     // Catch:{ Exception -> 0x00dd }
        L_0x00dd:
            throw r2     // Catch:{ GeneralSecurityException -> 0x00de }
        L_0x00de:
            r1 = move-exception
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = "Failed to initialize encryption"
            r2.<init>(r3, r1)     // Catch:{ all -> 0x00e9 }
            throw r2     // Catch:{ all -> 0x00e9 }
        L_0x00e7:
            monitor-exit(r0)     // Catch:{ all -> 0x00e9 }
            return
        L_0x00e9:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e9 }
            throw r1
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.p3304a.p3314h.C42809c.mo45886g():void");
    }
}
