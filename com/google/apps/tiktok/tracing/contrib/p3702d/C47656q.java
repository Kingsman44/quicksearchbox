package com.google.apps.tiktok.tracing.contrib.p3702d;

import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.d.q */
/* compiled from: PG */
public final class C47656q {

    /* renamed from: a */
    private final C47770dh f123604a;

    public C47656q(C47770dh dhVar) {
        this.f123604a = dhVar;
    }

    /* renamed from: a */
    public final void mo51538a(Runnable runnable, String str) {
        if (C47831fm.m85027v()) {
            runnable.run();
            return;
        }
        C47538ax e = this.f123604a.mo51615e(str, C47562bm.f123426a);
        try {
            runnable.run();
            if (e != null) {
                e.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
