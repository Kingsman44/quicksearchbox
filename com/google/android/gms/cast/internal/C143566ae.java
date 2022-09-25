package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C143919bh;
import java.util.Locale;

/* renamed from: com.google.android.gms.cast.internal.ae */
/* compiled from: PG */
public final class C143566ae {

    /* renamed from: a */
    protected final String f389265a;

    /* renamed from: b */
    private final boolean f389266b;

    /* renamed from: c */
    private final String f389267c;

    public C143566ae(String str) {
        C143919bh.m233970m(str, "The log tag cannot be null or empty.");
        this.f389265a = str;
        this.f389266b = str.length() <= 23;
        this.f389267c = !TextUtils.isEmpty((CharSequence) null) ? String.format("[%s] ", new Object[]{null}) : null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo118883a(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        return !TextUtils.isEmpty(this.f389267c) ? String.valueOf(this.f389267c).concat(String.valueOf(str)) : str;
    }

    /* renamed from: b */
    public final void mo118884b(String str, Object... objArr) {
        if (mo118891i()) {
            Log.d(this.f389265a, mo118883a(str, objArr));
        }
    }

    /* renamed from: c */
    public final void mo118885c(Throwable th, String str, Object... objArr) {
        if (mo118891i()) {
            Log.d(this.f389265a, mo118883a(str, objArr), th);
        }
    }

    /* renamed from: d */
    public final void mo118886d(String str, Object... objArr) {
        Log.e(this.f389265a, mo118883a(str, objArr));
    }

    /* renamed from: e */
    public final void mo118887e(Throwable th, String str, Object... objArr) {
        Log.e(this.f389265a, mo118883a(str, objArr), th);
    }

    /* renamed from: f */
    public final void mo118888f(String str, Object... objArr) {
        Log.i(this.f389265a, mo118883a(str, objArr));
    }

    /* renamed from: g */
    public final void mo118889g(String str, Object... objArr) {
        Log.w(this.f389265a, mo118883a(str, objArr));
    }

    /* renamed from: h */
    public final void mo118890h(Throwable th, String str, Object... objArr) {
        Log.w(this.f389265a, mo118883a(str, objArr), th);
    }

    /* renamed from: i */
    public final boolean mo118891i() {
        return this.f389266b && Log.isLoggable(this.f389265a, 3);
    }
}
