package com.google.ads.interactivemedia.p367v3.internal;

import android.os.AsyncTask;
import android.os.Build;
import com.google.ads.interactivemedia.p367v3.api.StreamRequest;
import com.google.ads.interactivemedia.p367v3.impl.data.C6738bd;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alu */
/* compiled from: PG */
final class alu extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ alv f20908a;

    /* renamed from: b */
    private final StreamRequest f20909b;

    /* renamed from: c */
    private final String f20910c;

    public alu(alv alv, StreamRequest streamRequest, String str) {
        this.f20908a = alv;
        this.f20909b = streamRequest;
        this.f20910c = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String a;
        Void[] voidArr = (Void[]) objArr;
        synchronized (this.f20908a.f20923m) {
            if (this.f20908a.f20924n == null) {
                alv alv = this.f20908a;
                alv.f20924n = new apk(apj.m19231q(alv.f20911a));
            }
            a = this.f20908a.f20924n.mo15145b().mo15136a(this.f20908a.f20911a);
        }
        return new als(new aon(this.f20908a.f20911a), a, alv.m18957e(this.f20908a));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        als als = (als) obj;
        amx amx = new amx(amv.adsLoader, amw.requestStream, this.f20910c, C6738bd.createFromStreamRequest(this.f20909b, String.format("android%s:%s:%s", new Object[]{Build.VERSION.RELEASE, "3.21.0", this.f20908a.f20911a.getPackageName()}), als.f20905a, alv.m18959g(this.f20908a), this.f20908a.f20919i, alv.m18961i(this.f20908a), C7458yy.m22584g(this.f20908a.f20911a, this.f20908a.f20920j), als.f20907c, als.f20906b, this.f20908a.f20921k));
        ane l = this.f20908a.f20912b;
        aon aon = als.f20906b;
        l.mo15010q();
        this.f20908a.f20912b.mo15008n(amx);
    }
}
