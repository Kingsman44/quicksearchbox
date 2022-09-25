package com.google.learning.expander.pod.inferenceapi.core;

import android.util.Log;

/* renamed from: com.google.learning.expander.pod.inferenceapi.core.a */
/* compiled from: PG */
public class C62019a {

    /* renamed from: a */
    private static final String f167588a = "a";

    /* renamed from: b */
    protected final long f167589b;

    /* renamed from: c */
    final String f167590c;

    /* renamed from: d */
    public boolean f167591d;

    protected C62019a(long j, String str) {
        if (j != 0) {
            this.f167589b = j;
            this.f167590c = str;
            return;
        }
        throw new C62020b();
    }

    /* renamed from: c */
    public final synchronized void mo58486c() {
        if (!this.f167591d) {
            deinitJni(this.f167589b);
            this.f167591d = true;
        }
    }

    /* access modifiers changed from: protected */
    public void deinitJni(long j) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (this.f167591d) {
                mo58486c();
            } else {
                String str = f167588a;
                String str2 = this.f167590c;
                Log.w(str, "Finalizing an already closed Jni instance: " + str2);
            }
        } finally {
            super.finalize();
        }
    }
}
