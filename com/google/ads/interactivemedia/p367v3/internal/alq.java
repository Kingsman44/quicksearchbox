package com.google.ads.interactivemedia.p367v3.internal;

import android.os.AsyncTask;
import android.os.Build;
import com.google.ads.interactivemedia.p367v3.api.AdsRequest;
import com.google.ads.interactivemedia.p367v3.impl.data.C6738bd;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alq */
/* compiled from: PG */
final class alq extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ alv f20899a;

    /* renamed from: b */
    private final AdsRequest f20900b;

    /* renamed from: c */
    private final String f20901c;

    public alq(alv alv, AdsRequest adsRequest, String str) {
        this.f20899a = alv;
        this.f20900b = adsRequest;
        this.f20901c = str;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(1:5)|(2:7|(2:9|10))|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x004c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r5) {
        /*
            r4 = this;
            java.lang.String[] r5 = (java.lang.String[]) r5
            r0 = 0
            r5 = r5[r0]
            com.google.ads.interactivemedia.v3.internal.alv r0 = r4.f20899a
            java.lang.Object r0 = r0.f20923m
            monitor-enter(r0)
            com.google.ads.interactivemedia.v3.internal.alv r1 = r4.f20899a     // Catch:{ all -> 0x0064 }
            com.google.ads.interactivemedia.v3.internal.apk r1 = r1.f20924n     // Catch:{ all -> 0x0064 }
            if (r1 != 0) goto L_0x0026
            com.google.ads.interactivemedia.v3.internal.alv r1 = r4.f20899a     // Catch:{ all -> 0x0064 }
            com.google.ads.interactivemedia.v3.internal.apk r2 = new com.google.ads.interactivemedia.v3.internal.apk     // Catch:{ all -> 0x0064 }
            android.content.Context r3 = r1.f20911a     // Catch:{ all -> 0x0064 }
            com.google.ads.interactivemedia.v3.internal.apj r3 = com.google.ads.interactivemedia.p367v3.internal.apj.m19231q(r3)     // Catch:{ all -> 0x0064 }
            r2.<init>(r3)     // Catch:{ all -> 0x0064 }
            r1.f20924n = r2     // Catch:{ all -> 0x0064 }
        L_0x0026:
            if (r5 == 0) goto L_0x004c
            android.net.Uri r1 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0064 }
            com.google.ads.interactivemedia.v3.internal.alv r2 = r4.f20899a     // Catch:{ all -> 0x0064 }
            com.google.ads.interactivemedia.v3.internal.apk r2 = r2.f20924n     // Catch:{ all -> 0x0064 }
            boolean r2 = r2.mo15144a(r1)     // Catch:{ all -> 0x0064 }
            if (r2 == 0) goto L_0x004c
            com.google.ads.interactivemedia.v3.internal.alv r2 = r4.f20899a     // Catch:{ apl -> 0x004c }
            com.google.ads.interactivemedia.v3.internal.apk r2 = r2.f20924n     // Catch:{ apl -> 0x004c }
            com.google.ads.interactivemedia.v3.internal.alv r3 = r4.f20899a     // Catch:{ apl -> 0x004c }
            android.content.Context r3 = r3.f20911a     // Catch:{ apl -> 0x004c }
            android.net.Uri r1 = r2.mo15146c(r1, r3)     // Catch:{ apl -> 0x004c }
            java.lang.String r5 = r1.toString()     // Catch:{ apl -> 0x004c }
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            com.google.ads.interactivemedia.v3.internal.aon r0 = new com.google.ads.interactivemedia.v3.internal.aon
            com.google.ads.interactivemedia.v3.internal.alv r1 = r4.f20899a
            android.content.Context r1 = r1.f20911a
            r0.<init>(r1)
            com.google.ads.interactivemedia.v3.internal.alr r1 = new com.google.ads.interactivemedia.v3.internal.alr
            com.google.ads.interactivemedia.v3.internal.alv r2 = r4.f20899a
            com.google.ads.interactivemedia.v3.impl.data.au r2 = com.google.ads.interactivemedia.p367v3.internal.alv.m18957e(r2)
            r1.<init>(r0, r5, r2)
            return r1
        L_0x0064:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.alq.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        alr alr = (alr) obj;
        this.f20900b.setAdTagUrl(alr.f20902a);
        amx amx = new amx(amv.adsLoader, amw.requestAds, this.f20901c, C6738bd.create(this.f20900b, String.format("android%s:%s:%s", new Object[]{Build.VERSION.RELEASE, "3.21.0", this.f20899a.f20911a.getPackageName()}), alr.f20903b, alv.m18959g(this.f20899a), this.f20899a.f20919i, alv.m18961i(this.f20899a), C7458yy.m22584g(this.f20899a.f20911a, this.f20899a.f20920j), alr.f20904c, this.f20899a.f20922l));
        ane l = this.f20899a.f20912b;
        aon aon = alr.f20904c;
        l.mo15010q();
        this.f20899a.f20912b.mo15008n(amx);
    }
}
