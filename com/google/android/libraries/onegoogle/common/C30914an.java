package com.google.android.libraries.onegoogle.common;

import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.onegoogle.common.an */
/* compiled from: PG */
public final class C30914an {
    /* renamed from: a */
    public static void m57706a(Runnable runnable) {
        if (C19559g.m37305d(Thread.currentThread())) {
            runnable.run();
        } else {
            C19559g.m37302a().post(runnable);
        }
    }
}
