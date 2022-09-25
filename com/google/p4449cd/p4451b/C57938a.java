package com.google.p4449cd.p4451b;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.cd.b.a */
/* compiled from: PG */
public class C57938a {

    /* renamed from: a */
    private final String f154951a;

    /* renamed from: c */
    public final AtomicLong f154952c = new AtomicLong(0);

    /* renamed from: d */
    public final AtomicLong f154953d = new AtomicLong(0);

    public C57938a(String str) {
        this.f154951a = str;
    }

    public String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = this.f154951a;
        return "TaskGraph@" + hexString + "(\"" + str + "\")";
    }
}
