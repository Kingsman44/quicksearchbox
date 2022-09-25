package com.google.android.play.core.p3529c;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.google.android.play.core.c.a */
/* compiled from: PG */
public final class C45053a {

    /* renamed from: a */
    private final String f117695a;

    public C45053a(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.f117695a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(String.valueOf(str));
    }

    /* renamed from: f */
    private static String m80208f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* renamed from: a */
    public final void mo48883a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", m80208f(this.f117695a, str, objArr));
        }
    }

    /* renamed from: b */
    public final void mo48884b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m80208f(this.f117695a, str, objArr));
        }
    }

    /* renamed from: c */
    public final void mo48885c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m80208f(this.f117695a, str, objArr), th);
        }
    }

    /* renamed from: d */
    public final void mo48886d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", m80208f(this.f117695a, str, objArr));
        }
    }

    /* renamed from: e */
    public final void mo48887e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", m80208f(this.f117695a, str, objArr));
        }
    }
}
