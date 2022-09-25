package com.google.android.gms.analytics.p10733a;

import android.text.TextUtils;
import com.google.android.gms.analytics.C142757j;
import java.util.HashMap;

/* renamed from: com.google.android.gms.analytics.a.f */
/* compiled from: PG */
public final class C142685f extends C142757j {

    /* renamed from: a */
    public String f387186a;

    /* renamed from: b */
    public int f387187b;

    /* renamed from: c */
    public int f387188c;

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo117461b(C142757j jVar) {
        C142685f fVar = (C142685f) jVar;
        int i = this.f387187b;
        if (i != 0) {
            fVar.f387187b = i;
        }
        int i2 = this.f387188c;
        if (i2 != 0) {
            fVar.f387188c = i2;
        }
        if (!TextUtils.isEmpty(this.f387186a)) {
            fVar.f387186a = this.f387186a;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.f387186a);
        hashMap.put("screenColors", 0);
        hashMap.put("screenWidth", Integer.valueOf(this.f387187b));
        hashMap.put("screenHeight", Integer.valueOf(this.f387188c));
        hashMap.put("viewportWidth", 0);
        hashMap.put("viewportHeight", 0);
        return C142757j.m231683a(hashMap, 0);
    }
}
