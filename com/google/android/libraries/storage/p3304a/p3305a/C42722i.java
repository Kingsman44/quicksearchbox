package com.google.android.libraries.storage.p3304a.p3305a;

import android.app.blob.BlobStoreManager;
import android.os.ParcelFileDescriptor;
import com.google.common.util.concurrent.C60826bg;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.storage.a.a.i */
/* compiled from: PG */
final class C42722i extends ParcelFileDescriptor.AutoCloseOutputStream {

    /* renamed from: a */
    private final BlobStoreManager.Session f111981a;

    /* renamed from: b */
    private boolean f111982b = false;

    public C42722i(ParcelFileDescriptor parcelFileDescriptor, BlobStoreManager.Session session) {
        super(parcelFileDescriptor);
        this.f111981a = session;
    }

    /* renamed from: a */
    private final void m75466a() {
        int i;
        Throwable th = null;
        if (!this.f111982b) {
            this.f111982b = true;
            try {
                CompletableFuture completableFuture = new CompletableFuture();
                BlobStoreManager.Session session = this.f111981a;
                C60826bg bgVar = C60826bg.f164896a;
                Objects.requireNonNull(completableFuture);
                session.commit(bgVar, Consumer.Wrapper.convert(new C42721h(completableFuture)));
                i = ((Integer) completableFuture.get()).intValue();
            } catch (InterruptedException | RuntimeException | ExecutionException e) {
                th = e;
                i = -1;
            }
        } else {
            i = 0;
        }
        BlobStoreManager.Session session2 = this.f111981a;
        if (i != 0) {
            try {
                throw new IOException("Commit operation failed", th);
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                } catch (Exception unused) {
                }
            }
        } else if (session2 != null) {
            session2.close();
            return;
        } else {
            return;
        }
        throw th;
    }

    public final void close() {
        try {
            super.close();
        } finally {
            m75466a();
        }
    }
}
