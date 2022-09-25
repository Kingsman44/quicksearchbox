package com.google.common.util.concurrent;

import com.google.common.base.C58838bb;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.common.util.concurrent.dv */
/* compiled from: PG */
public final class C60908dv {

    /* renamed from: a */
    public Boolean f165020a = null;

    /* renamed from: b */
    public ThreadFactory f165021b = null;

    /* renamed from: c */
    private String f165022c = null;

    /* renamed from: d */
    private Integer f165023d = null;

    /* renamed from: a */
    public static ThreadFactory m93015a(C60908dv dvVar) {
        String str = dvVar.f165022c;
        Boolean bool = dvVar.f165020a;
        Integer num = dvVar.f165023d;
        ThreadFactory threadFactory = dvVar.f165021b;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new C60907du(threadFactory, str, str != null ? new AtomicLong(0) : null, bool, num);
    }

    /* renamed from: b */
    public final void mo57410b(String str) {
        String.format(Locale.ROOT, str, new Object[]{0});
        this.f165022c = str;
    }

    /* renamed from: c */
    public final void mo57411c(int i) {
        C58838bb.m90875j(true, "Thread priority (%s) must be >= %s", i, 1);
        C58838bb.m90875j(true, "Thread priority (%s) must be <= %s", i, 10);
        this.f165023d = Integer.valueOf(i);
    }
}
