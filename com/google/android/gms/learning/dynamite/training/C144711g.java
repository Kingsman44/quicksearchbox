package com.google.android.gms.learning.dynamite.training;

import android.os.RemoteException;
import com.google.android.gms.learning.internal.training.C144802f;
import com.google.android.gms.p10793f.C144166k;
import com.google.fcp.client.http.C61102k;
import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.learning.dynamite.training.g */
/* compiled from: PG */
public final /* synthetic */ class C144711g implements C61102k {

    /* renamed from: a */
    public final /* synthetic */ C144802f f391506a;

    public /* synthetic */ C144711g(C144802f fVar) {
        this.f391506a = fVar;
    }

    /* renamed from: a */
    public final HttpURLConnection mo57656a(String str) {
        try {
            return (HttpURLConnection) C144166k.m234388a(this.f391506a.mo120224a(str));
        } catch (RemoteException e) {
            throw new IOException(e);
        }
    }
}
