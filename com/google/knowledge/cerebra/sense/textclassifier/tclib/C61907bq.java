package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import java.io.Closeable;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.bq */
/* compiled from: PG */
public abstract class C61907bq implements Closeable {
    /* renamed from: a */
    public abstract Object mo58341a();

    /* renamed from: b */
    public abstract Runnable mo58342b();

    /* renamed from: c */
    public abstract boolean mo58343c();

    public final void close() {
        mo58342b().run();
    }
}
