package com.google.android.setupcompat.p3550b;

import android.util.Log;

/* renamed from: com.google.android.setupcompat.b.b */
/* compiled from: PG */
public final class C45245b {

    /* renamed from: a */
    private final String f118177a;

    public C45245b(String str) {
        this.f118177a = "[" + str + "] ";
    }

    /* renamed from: a */
    public final void mo49111a(String str) {
        if (Log.isLoggable("SetupLibrary", 3)) {
            Log.d("SetupLibrary", this.f118177a.concat(str));
        }
    }

    /* renamed from: b */
    public final void mo49112b(String str) {
        if (Log.isLoggable("SetupLibrary", 4)) {
            Log.i("SetupLibrary", this.f118177a.concat(str));
        }
    }

    /* renamed from: c */
    public final void mo49113c(String str) {
        Log.e("SetupLibrary", this.f118177a.concat(str));
    }

    /* renamed from: d */
    public final void mo49114d(String str, Throwable th) {
        Log.e("SetupLibrary", this.f118177a.concat(str), th);
    }

    /* renamed from: e */
    public final void mo49115e(String str) {
        Log.w("SetupLibrary", this.f118177a.concat(str));
    }
}
