package com.google.android.gms.learning.dynamite.training;

import com.google.fcp.client.http.C61102k;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.learning.dynamite.training.e */
/* compiled from: PG */
public final /* synthetic */ class C144709e implements C61102k {

    /* renamed from: a */
    public static final /* synthetic */ C144709e f391504a = new C144709e();

    private /* synthetic */ C144709e() {
    }

    /* renamed from: a */
    public final HttpURLConnection mo57656a(String str) {
        return (HttpURLConnection) new URL(str).openConnection();
    }
}
