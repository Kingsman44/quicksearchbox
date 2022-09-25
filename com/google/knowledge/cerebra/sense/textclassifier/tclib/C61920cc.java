package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p3186j$.util.Objects;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.cc */
/* compiled from: PG */
public final class C61920cc implements C61908br {

    /* renamed from: a */
    private Closeable f167394a;

    /* renamed from: b */
    private boolean f167395b;

    /* renamed from: c */
    private final Lock f167396c = new ReentrantLock();

    /* renamed from: d */
    private boolean f167397d = true;

    public C61920cc(Closeable closeable) {
        this.f167394a = closeable;
        this.f167395b = true;
    }

    /* renamed from: c */
    public static C61920cc m94585c(AssetFileDescriptor assetFileDescriptor) {
        return new C61920cc(CloseableAssetFileDescriptor.m94502a(assetFileDescriptor));
    }

    /* renamed from: a */
    public final C61907bq mo58311a() {
        this.f167396c.lock();
        boolean z = this.f167395b;
        Closeable closeable = this.f167394a;
        Lock lock = this.f167396c;
        Objects.requireNonNull(lock);
        C61964g gVar = new C61964g(z, closeable, new C61919cb(lock));
        this.f167395b = false;
        return gVar;
    }

    /* renamed from: b */
    public final C60870cx mo58312b() {
        return C60866ct.f164955a;
    }

    public final void close() {
        mo58361d((Closeable) null);
    }

    /* renamed from: d */
    public final void mo58361d(Closeable closeable) {
        this.f167396c.lock();
        try {
            Closeable closeable2 = this.f167394a;
            boolean z = this.f167397d;
            this.f167394a = closeable;
            this.f167397d = true;
            this.f167395b = true;
            if (z && closeable2 != null) {
                try {
                    closeable2.close();
                } catch (IOException e) {
                    Log.e("StaticModelProvider", "Failed to close the static model: ", e);
                }
            }
        } finally {
            this.f167396c.unlock();
        }
    }
}
