package com.google.apps.tiktok.tracing;

import java.io.Closeable;

/* renamed from: com.google.apps.tiktok.tracing.eh */
/* compiled from: PG */
public final /* synthetic */ class C47799eh implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ C47572bw f123801a;

    /* renamed from: b */
    public final /* synthetic */ Closeable f123802b;

    public /* synthetic */ C47799eh(C47572bw bwVar, Closeable closeable) {
        this.f123801a = bwVar;
        this.f123802b = closeable;
    }

    public final void close() {
        C47572bw bwVar = this.f123801a;
        Closeable closeable = this.f123802b;
        int i = C47810es.f123822b;
        C47572bw h = C47831fm.m85013h(bwVar);
        try {
            closeable.close();
        } finally {
            C47831fm.m85013h(h);
        }
    }
}
