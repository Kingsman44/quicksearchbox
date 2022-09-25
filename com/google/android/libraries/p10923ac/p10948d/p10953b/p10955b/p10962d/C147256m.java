package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d;

import android.util.Log;

/* renamed from: com.google.android.libraries.ac.d.b.b.d.m */
/* compiled from: PG */
public final class C147256m {

    /* renamed from: a */
    public final boolean f397497a;

    /* renamed from: b */
    public final String f397498b = "MDH";

    /* renamed from: c */
    private final String f397499c;

    public C147256m(boolean z, String str) {
        this.f397497a = z;
        if (str.isEmpty()) {
            this.f397499c = null;
            return;
        }
        this.f397499c = "[" + str + "] ";
    }

    /* renamed from: a */
    public final String mo124058a(Object obj) {
        String obj2 = obj.toString();
        if (this.f397497a) {
            return obj2;
        }
        int hashCode = obj2.hashCode();
        return "<ELIDED:" + hashCode + ">";
    }

    /* renamed from: b */
    public final String mo124059b(String str) {
        String str2 = this.f397499c;
        return str2 == null ? str : str2.concat(str);
    }

    /* renamed from: c */
    public final void mo124060c(String str, Object... objArr) {
        Log.e(this.f397498b, mo124059b(String.format(str, objArr)));
    }

    /* renamed from: d */
    public final void mo124061d(String str, Throwable th, Object... objArr) {
        Log.e(this.f397498b, mo124059b(String.format(str, objArr)), th);
    }

    /* renamed from: g */
    public final void mo124064g(String str, Object... objArr) {
        Log.i(this.f397498b, mo124059b(String.format(str, objArr)));
    }

    /* renamed from: h */
    public final void mo124065h(String str, Object... objArr) {
        Log.v(this.f397498b, mo124059b(String.format(str, objArr)));
    }

    /* renamed from: i */
    public final void mo124066i(String str, Object... objArr) {
        Log.v(this.f397498b, mo124059b(mo124058a(String.format(str, objArr))));
    }

    /* renamed from: j */
    public final void mo124067j(String str, Object... objArr) {
        Log.w(this.f397498b, mo124059b(String.format(str, objArr)));
    }

    /* renamed from: k */
    public final void mo124068k(String str, Throwable th, Object... objArr) {
        Log.w(this.f397498b, mo124059b(String.format(str, objArr)), th);
    }

    /* renamed from: l */
    public final void mo124069l(Throwable th, Object... objArr) {
        Log.i(this.f397498b, mo124059b(String.format("Exception during closing the channel", objArr)), th);
    }

    /* renamed from: e */
    public final void mo124062e(String str, Throwable th, Object... objArr) {
        if (this.f397497a) {
            Log.e(this.f397498b, mo124059b(mo124058a(String.format(str, objArr))), th);
        } else {
            Log.e(this.f397498b, mo124059b(mo124058a(String.format(str, objArr))));
        }
    }

    /* renamed from: f */
    public final void mo124063f(String str, Throwable th, Object... objArr) {
        if (this.f397497a) {
            Log.e(this.f397498b, mo124059b(String.format(str, objArr)), th);
        } else {
            Log.e(this.f397498b, mo124059b(String.format(str, objArr)));
        }
    }
}
