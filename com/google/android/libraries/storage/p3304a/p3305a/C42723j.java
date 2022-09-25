package com.google.android.libraries.storage.p3304a.p3305a;

import android.app.blob.BlobHandle;
import android.app.blob.BlobStoreManager;
import android.content.Context;
import android.net.Uri;
import android.os.LimitExceededException;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.google.android.libraries.storage.p3304a.p3307c.C42758k;
import com.google.android.libraries.storage.p3304a.p3307c.C42763p;
import com.google.android.libraries.storage.p3304a.p3307c.C42768u;
import com.google.android.libraries.storage.p3304a.p3313g.C42798a;
import com.google.android.libraries.storage.p3304a.p3313g.C42799b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.storage.a.a.j */
/* compiled from: PG */
public final class C42723j implements C42799b {

    /* renamed from: a */
    private final BlobStoreManager f111983a;

    public C42723j(Context context) {
        this.f111983a = (BlobStoreManager) context.getSystemService("blob_store");
    }

    /* renamed from: p */
    private final ParcelFileDescriptor m75467p(Uri uri) {
        C42725l.m75486b(uri);
        C42725l.m75487c(uri);
        return this.f111983a.openBlob(BlobHandle.createWithSha256(C42725l.m75490f(uri.getPath()), "The file is shared to provide a better user experience", 0, "File downloaded through MDDLib"));
    }

    /* renamed from: q */
    private final void m75468q(byte[] bArr) {
        try {
            this.f111983a.releaseLease(BlobHandle.createWithSha256(bArr, "The file is shared to provide a better user experience", 0, "File downloaded through MDDLib"));
        } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
            throw new IOException("Failed to release the lease", e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ long mo45825a(Uri uri) {
        return C42798a.m75574e(this);
    }

    /* renamed from: b */
    public final Pair mo45812b(Uri uri) {
        return C42731r.m75493a(m75467p(uri));
    }

    /* renamed from: c */
    public final /* synthetic */ C42763p mo45826c() {
        throw new C42768u("lockScope not supported by blobstore");
    }

    /* renamed from: d */
    public final /* synthetic */ File mo45813d(Uri uri) {
        return C42798a.m75570a(this, uri);
    }

    /* renamed from: e */
    public final InputStream mo45814e(Uri uri) {
        return new ParcelFileDescriptor.AutoCloseInputStream(m75467p(uri));
    }

    /* renamed from: f */
    public final /* synthetic */ OutputStream mo45827f(Uri uri) {
        return C42798a.m75575f(this);
    }

    /* renamed from: g */
    public final OutputStream mo45828g(Uri uri) {
        C42725l.m75486b(uri);
        C42725l.m75487c(uri);
        byte[] f = C42725l.m75490f(uri.getPath());
        try {
            if (!C42725l.m75489e(uri.getPath())) {
                BlobStoreManager.Session openSession = this.f111983a.openSession(this.f111983a.createSession(BlobHandle.createWithSha256(f, "The file is shared to provide a better user experience", 0, "File downloaded through MDDLib")));
                openSession.allowPublicAccess();
                return new C42722i(openSession.openWrite(0, -1), openSession);
            } else if (this.f111983a.getRemainingLeaseQuotaBytes() > 0) {
                long millis = TimeUnit.SECONDS.toMillis(C42725l.m75485a(uri));
                this.f111983a.acquireLease(BlobHandle.createWithSha256(f, "The file is shared to provide a better user experience", 0, "File downloaded through MDDLib"), "String description needed for providing a better user experience", millis);
                return null;
            } else {
                throw new C42758k((byte[]) null);
            }
        } catch (LimitExceededException e) {
            throw new C42758k((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new IOException("Failed to write into BlobStoreManager", e2);
        }
    }

    /* renamed from: h */
    public final /* synthetic */ Iterable mo45829h(Uri uri) {
        return C42798a.m75571b(this);
    }

    /* renamed from: i */
    public final String mo45815i() {
        return "blobstore";
    }

    /* renamed from: j */
    public final /* synthetic */ void mo45830j(Uri uri) {
        C42798a.m75572c(this);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo45831k(Uri uri) {
        C42798a.m75573d(this);
    }

    /* renamed from: l */
    public final void mo45832l(Uri uri) {
        C42725l.m75486b(uri);
        C42725l.m75487c(uri);
        if (C42725l.m75488d(uri.getPath())) {
            for (BlobHandle sha256Digest : this.f111983a.getLeasedBlobs()) {
                m75468q(sha256Digest.getSha256Digest());
            }
            return;
        }
        m75468q(C42725l.m75490f(uri.getPath()));
    }

    /* renamed from: m */
    public final /* synthetic */ void mo45833m(Uri uri, Uri uri2) {
        throw new C42768u("rename not supported by blobstore");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002f */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo45816n(android.net.Uri r7) {
        /*
            r6 = this;
            r0 = 0
            android.os.ParcelFileDescriptor r7 = r6.m75467p(r7)     // Catch:{ SecurityException -> 0x0035 }
            if (r7 == 0) goto L_0x0030
            r1 = 1
            java.io.FileDescriptor r2 = r7.getFileDescriptor()     // Catch:{ all -> 0x0014 }
            boolean r2 = r2.valid()     // Catch:{ all -> 0x0014 }
            if (r2 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0030
        L_0x0014:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x0019 }
            goto L_0x002f
        L_0x0019:
            r7 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x002f }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r3[r0] = r4     // Catch:{ Exception -> 0x002f }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r5, r3)     // Catch:{ Exception -> 0x002f }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x002f }
            r1[r0] = r7     // Catch:{ Exception -> 0x002f }
            r3.invoke(r2, r1)     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            throw r2     // Catch:{ SecurityException -> 0x0035 }
        L_0x0030:
            if (r7 == 0) goto L_0x0035
            r7.close()     // Catch:{ SecurityException -> 0x0035 }
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.p3304a.p3305a.C42723j.mo45816n(android.net.Uri):boolean");
    }

    /* renamed from: o */
    public final boolean mo45834o(Uri uri) {
        return false;
    }
}
