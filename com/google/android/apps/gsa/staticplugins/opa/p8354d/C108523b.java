package com.google.android.apps.gsa.staticplugins.opa.p8354d;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.gsa.assist.p505d.C9406a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.d.b */
/* compiled from: PG */
public final class C108523b {

    /* renamed from: a */
    public final Handler f301940a = new Handler(Looper.getMainLooper(), new C108521a(this));

    /* renamed from: b */
    public C9406a f301941b;

    /* renamed from: a */
    public final void mo96958a(boolean z) {
        Message obtain = Message.obtain(this.f301940a, 5);
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_qk", z);
        obtain.setData(bundle);
        this.f301940a.sendMessage(obtain);
    }
}
