package com.google.android.gms.analytics.p10733a;

import android.text.TextUtils;
import com.google.android.gms.analytics.C142757j;
import java.util.HashMap;

/* renamed from: com.google.android.gms.analytics.a.a */
/* compiled from: PG */
public final class C142680a extends C142757j {

    /* renamed from: a */
    public String f387169a;

    /* renamed from: b */
    public String f387170b;

    /* renamed from: c */
    public String f387171c;

    /* renamed from: d */
    public String f387172d;

    /* renamed from: c */
    public final void mo117461b(C142680a aVar) {
        if (!TextUtils.isEmpty(this.f387169a)) {
            aVar.f387169a = this.f387169a;
        }
        if (!TextUtils.isEmpty(this.f387170b)) {
            aVar.f387170b = this.f387170b;
        }
        if (!TextUtils.isEmpty(this.f387171c)) {
            aVar.f387171c = this.f387171c;
        }
        if (!TextUtils.isEmpty(this.f387172d)) {
            aVar.f387172d = this.f387172d;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f387169a);
        hashMap.put("appVersion", this.f387170b);
        hashMap.put("appId", this.f387171c);
        hashMap.put("appInstallerId", this.f387172d);
        return C142757j.m231683a(hashMap, 0);
    }
}
