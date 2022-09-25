package com.google.apps.tiktok.inject;

import java.io.RandomAccessFile;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.inject.i */
/* compiled from: PG */
public final /* synthetic */ class C47269i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C47272l f122910a;

    /* renamed from: b */
    public final /* synthetic */ RandomAccessFile f122911b;

    /* renamed from: c */
    public final /* synthetic */ int f122912c;

    public /* synthetic */ C47269i(C47272l lVar, RandomAccessFile randomAccessFile, int i) {
        this.f122910a = lVar;
        this.f122911b = randomAccessFile;
        this.f122912c = i;
    }

    public final Object call() {
        C47272l lVar = this.f122910a;
        RandomAccessFile randomAccessFile = this.f122911b;
        int i = this.f122912c;
        try {
            for (C47267g e : (Set) lVar.f122917b.mo17428b()) {
                e.mo35389e();
            }
            C47272l.m84081d(randomAccessFile, i);
            randomAccessFile.close();
            return null;
        } catch (Throwable th) {
            C47268h.m84078a(th, th);
        }
        throw th;
    }
}
