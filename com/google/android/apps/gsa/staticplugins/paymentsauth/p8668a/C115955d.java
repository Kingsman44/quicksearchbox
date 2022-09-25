package com.google.android.apps.gsa.staticplugins.paymentsauth.p8668a;

import android.content.Context;
import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import com.google.android.libraries.logging.C28292j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.a.d */
/* compiled from: PG */
public final class C115955d {

    /* renamed from: a */
    public static final C28292j f321517a = new C28292j(77873);

    /* renamed from: b */
    public static final C28292j f321518b;

    /* renamed from: c */
    public final Context f321519c;

    /* renamed from: d */
    public final BiometricPrompt.CryptoObject f321520d;

    /* renamed from: e */
    public final Executor f321521e;

    /* renamed from: f */
    public final C115954c f321522f;

    /* renamed from: g */
    public CancellationSignal f321523g;

    static {
        C28292j jVar = new C28292j(77874);
        jVar.mo33795i(5);
        f321518b = jVar;
    }

    public C115955d(Context context, BiometricPrompt.CryptoObject cryptoObject, Executor executor, C115954c cVar) {
        this.f321519c = context;
        this.f321521e = executor;
        this.f321520d = cryptoObject;
        this.f321522f = cVar;
    }
}
