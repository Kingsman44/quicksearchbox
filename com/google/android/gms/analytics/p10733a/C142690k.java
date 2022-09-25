package com.google.android.gms.analytics.p10733a;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.C142757j;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: com.google.android.gms.analytics.a.k */
/* compiled from: PG */
public final class C142690k extends C142757j {

    /* renamed from: a */
    public int f387198a;

    public C142690k() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Integer.MAX_VALUE;
        }
        this.f387198a = leastSignificantBits;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo117461b(C142757j jVar) {
        C142690k kVar = (C142690k) jVar;
        TextUtils.isEmpty((CharSequence) null);
        int i = this.f387198a;
        if (i != 0) {
            kVar.f387198a = i;
        }
        TextUtils.isEmpty((CharSequence) null);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            TextUtils.isEmpty((CharSequence) null);
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", (Object) null);
        hashMap.put("interstitial", false);
        hashMap.put("automatic", false);
        hashMap.put("screenId", Integer.valueOf(this.f387198a));
        hashMap.put("referrerScreenId", 0);
        hashMap.put("referrerScreenName", (Object) null);
        hashMap.put("referrerUri", (Object) null);
        return C142757j.m231683a(hashMap, 0);
    }
}
