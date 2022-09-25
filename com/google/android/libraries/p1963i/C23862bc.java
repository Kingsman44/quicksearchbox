package com.google.android.libraries.p1963i;

import android.os.Process;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.i.bc */
/* compiled from: PG */
final class C23862bc extends ThreadLocal {

    /* renamed from: a */
    public static final C23862bc f65307a = new C23862bc();

    private C23862bc() {
    }

    /* renamed from: a */
    public final C23851az get() {
        Object obj = super.get();
        C69664n.m101058d(obj);
        return (C23851az) obj;
    }

    public final /* bridge */ /* synthetic */ Object initialValue() {
        int myTid = Process.myTid();
        Thread currentThread = Thread.currentThread();
        C69664n.m101060f(currentThread, "currentThread()");
        return new C23851az(currentThread, myTid, Process.getThreadPriority(myTid), 16);
    }
}
