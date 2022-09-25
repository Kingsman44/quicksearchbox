package com.google.p4449cd;

import com.google.common.base.C58833ax;

/* renamed from: com.google.cd.b */
/* compiled from: PG */
public final class C57937b {
    /* renamed from: a */
    public static C58833ax m88571a(Throwable th, Class cls) {
        while (th != null && !cls.isInstance(th)) {
            th = th.getCause();
        }
        return C58833ax.m90833j(th);
    }

    /* renamed from: b */
    public static C58833ax m88572b(Throwable th, Class cls) {
        while (th != null && cls.isInstance(th)) {
            th = th.getCause();
        }
        return C58833ax.m90833j(th);
    }
}
