package com.google.android.gms.analytics.p10733a;

import android.text.TextUtils;
import com.google.android.gms.analytics.C142757j;
import com.google.common.p4535g.C59203do;
import java.util.HashMap;

/* renamed from: com.google.android.gms.analytics.a.j */
/* compiled from: PG */
public final class C142689j extends C142757j {

    /* renamed from: a */
    public String f387192a;

    /* renamed from: b */
    public String f387193b;

    /* renamed from: c */
    public String f387194c;

    /* renamed from: d */
    public String f387195d;

    /* renamed from: e */
    public boolean f387196e;

    /* renamed from: f */
    public boolean f387197f;

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo117461b(C142757j jVar) {
        C142689j jVar2 = (C142689j) jVar;
        if (!TextUtils.isEmpty(this.f387192a)) {
            jVar2.f387192a = this.f387192a;
        }
        if (!TextUtils.isEmpty(this.f387193b)) {
            jVar2.f387193b = this.f387193b;
        }
        if (!TextUtils.isEmpty(this.f387194c)) {
            jVar2.f387194c = this.f387194c;
        }
        if (!TextUtils.isEmpty(this.f387195d)) {
            jVar2.f387195d = this.f387195d;
        }
        if (this.f387196e) {
            jVar2.f387196e = true;
        }
        TextUtils.isEmpty((CharSequence) null);
        if (this.f387197f) {
            jVar2.f387197f = true;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.f387192a);
        hashMap.put("clientId", this.f387193b);
        hashMap.put("userId", this.f387194c);
        hashMap.put("androidAdId", this.f387195d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.f387196e));
        hashMap.put("sessionControl", (Object) null);
        hashMap.put("nonInteraction", Boolean.valueOf(this.f387197f));
        hashMap.put("sampleRate", Double.valueOf(C59203do.f157270a));
        return C142757j.m231683a(hashMap, 0);
    }
}
