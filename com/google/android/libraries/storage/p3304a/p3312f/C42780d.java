package com.google.android.libraries.storage.p3304a.p3312f;

import java.io.Closeable;

/* renamed from: com.google.android.libraries.storage.a.f.d */
/* compiled from: PG */
public final /* synthetic */ class C42780d implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ Closeable f112044a;

    /* renamed from: b */
    public final /* synthetic */ Closeable f112045b;

    /* renamed from: c */
    public final /* synthetic */ Closeable f112046c;

    public /* synthetic */ C42780d(Closeable closeable, Closeable closeable2, Closeable closeable3) {
        this.f112044a = closeable;
        this.f112045b = closeable2;
        this.f112046c = closeable3;
    }

    public final void close() {
        Closeable closeable = this.f112044a;
        Closeable closeable2 = this.f112045b;
        Closeable closeable3 = this.f112046c;
        if (closeable3 != null) {
            try {
                closeable3.close();
            } catch (Throwable th) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th2) {
                        C42779c.m75546a(th, th2);
                    }
                }
                throw th;
            }
        }
        if (closeable2 != null) {
            closeable2.close();
        }
        if (closeable != null) {
            closeable.close();
            return;
        }
        return;
        throw th;
    }
}
