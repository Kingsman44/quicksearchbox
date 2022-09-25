package com.google.android.libraries.assistant.p1467d.p1468a.p1469a.p1470a;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.libraries.assistant.p1467d.p1472c.C17837a;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17848k;
import com.google.android.libraries.assistant.p1467d.p1472c.p1477d.C17925a;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.assistant.d.a.a.a.b */
/* compiled from: PG */
public final class C17813b extends C17848k {

    /* renamed from: a */
    public C17812a f51112a;

    /* renamed from: b */
    public boolean f51113b;

    /* renamed from: c */
    protected final SettableFuture f51114c;

    public C17813b() {
        new Handler(Looper.getMainLooper());
        SettableFuture settableFuture = new SettableFuture();
        this.f51114c = settableFuture;
        new AtomicBoolean(false);
        settableFuture.mo57356n(C17837a.f51179a);
        C17925a.m35113a();
    }

    /* renamed from: a */
    public final void mo23472a(byte[] bArr) {
        Log.i("AIClientCbStub", "#onUpdate()");
        Log.w("AIClientCbStub", String.format("callback is not an instance of CallbackExt: %s", new Object[]{null}));
    }
}
