package com.google.android.libraries.search.p2904c.p2942m.p2949f.p2950a;

import android.os.Process;
import com.google.android.libraries.p1730f.C21370a;
import java.util.concurrent.atomic.AtomicLong;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.m.f.a.a */
/* compiled from: PG */
public final class C37890a {

    /* renamed from: a */
    public final AtomicLong f100473a;

    public C37890a(C21370a aVar) {
        C69664n.m101061g(aVar, "clock");
        this.f100473a = new AtomicLong((((long) Process.myPid()) << 40) + aVar.mo26871c());
    }
}
