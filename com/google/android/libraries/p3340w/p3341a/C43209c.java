package com.google.android.libraries.p3340w.p3341a;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.api.C142878b;
import com.google.android.gms.auth.api.C142879c;
import com.google.android.gms.tasks.C146021aq;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70898m;
import p5488io.grpc.C70899n;

/* renamed from: com.google.android.libraries.w.a.c */
/* compiled from: PG */
public final class C43209c implements C70899n {

    /* renamed from: a */
    static final C70297cz f112932a = new C70290cs("X-Goog-Spatula", C70334de.f187481c);

    /* renamed from: b */
    final Context f112933b;

    public C43209c(Context context) {
        this.f112933b = context;
    }

    /* renamed from: a */
    public final C70898m mo27479a(C70338di diVar, C70851i iVar, C70888j jVar) {
        return new C43208b(this, jVar.mo39510a(diVar, iVar));
    }

    /* renamed from: b */
    public final String mo46269b() {
        try {
            return (String) C146021aq.m237853g(C142878b.m231832a(this.f112933b, new C142879c(new Bundle())).mo117796a(), 2000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("SpatulaClientInterceptor", "Error getting spatula header", e);
            return null;
        }
    }
}
