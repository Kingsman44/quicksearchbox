package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146025e;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.cloudmessaging.p */
/* compiled from: PG */
public final /* synthetic */ class C143689p implements C146025e {

    /* renamed from: a */
    public static final /* synthetic */ C143689p f389551a = new C143689p();

    private /* synthetic */ C143689p() {
    }

    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        Executor executor = C143696w.f389561a;
        if (abVar.mo122491j()) {
            return (Bundle) abVar.mo122488g();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(String.valueOf(abVar.mo122487f()))));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", abVar.mo122487f());
    }
}
