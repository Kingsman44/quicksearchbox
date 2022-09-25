package com.google.apps.tiktok.concurrent;

import android.app.Application;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.concurrent.n */
/* compiled from: PG */
public final class C46462n {

    /* renamed from: a */
    public final Object f121586a = new Object();

    /* renamed from: b */
    public final Set f121587b = new HashSet();

    /* renamed from: c */
    public int f121588c;

    /* renamed from: d */
    public final Application.ActivityLifecycleCallbacks f121589d = new C46461m(this);

    /* renamed from: e */
    private boolean f121590e;

    /* renamed from: a */
    public final void mo50466a(boolean z) {
        C19559g.m37304c();
        synchronized (this.f121586a) {
            this.f121590e = z;
            for (Runnable run : this.f121587b) {
                run.run();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo50467b() {
        boolean z;
        synchronized (this.f121586a) {
            z = this.f121590e;
        }
        return z;
    }
}
