package com.google.android.libraries.micore.learning.base;

import java.util.logging.Level;

/* renamed from: com.google.android.libraries.micore.learning.base.k */
/* compiled from: PG */
public abstract class C29719k {

    /* renamed from: a */
    public final String f80486a;

    protected C29719k(String str) {
        this.f80486a = str;
    }

    /* renamed from: c */
    public abstract void mo34855c(Level level, String str, Throwable th, String str2, Object... objArr);

    /* renamed from: d */
    public abstract void mo34856d();

    /* renamed from: e */
    public final void mo34863e(String str) {
        mo34855c(Level.SEVERE, this.f80486a, (Throwable) null, str, new Object[0]);
    }

    /* renamed from: f */
    public final void mo34864f(Throwable th, String str) {
        mo34855c(Level.SEVERE, this.f80486a, th, str, new Object[0]);
    }

    /* renamed from: g */
    public final void mo34865g(String str, Object... objArr) {
        mo34855c(Level.INFO, this.f80486a, (Throwable) null, str, objArr);
    }

    /* renamed from: h */
    public final void mo34866h(String str) {
        mo34855c(Level.WARNING, this.f80486a, (Throwable) null, str, new Object[0]);
    }

    /* renamed from: i */
    public final void mo34867i(String str, Object... objArr) {
        mo34855c(Level.WARNING, this.f80486a, (Throwable) null, str, objArr);
    }

    /* renamed from: j */
    public final void mo34868j(Throwable th, String str) {
        mo34855c(Level.WARNING, this.f80486a, th, str, new Object[0]);
    }

    /* renamed from: k */
    public final void mo34869k(Throwable th, String str, Object... objArr) {
        mo34855c(Level.WARNING, this.f80486a, th, str, objArr);
    }
}
