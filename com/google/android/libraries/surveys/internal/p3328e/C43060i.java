package com.google.android.libraries.surveys.internal.p3328e;

import com.google.protobuf.C62909aq;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63041ff;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.surveys.internal.e.i */
/* compiled from: PG */
public final class C43060i {

    /* renamed from: a */
    public final long f112619a = System.nanoTime();

    /* renamed from: b */
    public static C63042fg m75976b(long j) {
        C63041ff ffVar = (C63041ff) C63042fg.f170152c.createBuilder();
        ffVar.copyOnWrite();
        ((C63042fg) ffVar.instance).f170154a = j / 1000000000;
        ffVar.copyOnWrite();
        ((C63042fg) ffVar.instance).f170155b = (int) (j % 1000000000);
        return (C63042fg) ffVar.build();
    }

    /* renamed from: a */
    public final C62910ar mo46080a() {
        long nanoTime = System.nanoTime() - this.f112619a;
        C62909aq aqVar = (C62909aq) C62910ar.f169858c.createBuilder();
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169860a = nanoTime / 1000000000;
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169861b = (int) (nanoTime % 1000000000);
        return (C62910ar) aqVar.build();
    }
}
