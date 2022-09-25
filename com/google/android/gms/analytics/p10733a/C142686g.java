package com.google.android.gms.analytics.p10733a;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.analytics.C142757j;
import com.google.android.gms.analytics.p10734b.C142694a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.a.g */
/* compiled from: PG */
public final class C142686g extends C142757j {

    /* renamed from: a */
    public final List f387189a = new ArrayList();

    /* renamed from: b */
    public final List f387190b = new ArrayList();

    /* renamed from: c */
    public final Map f387191c = new HashMap();

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo117461b(C142757j jVar) {
        C142686g gVar = (C142686g) jVar;
        gVar.f387189a.addAll(this.f387189a);
        gVar.f387190b.addAll(this.f387190b);
        for (Map.Entry entry : this.f387191c.entrySet()) {
            String str = (String) entry.getKey();
            for (C142694a aVar : (List) entry.getValue()) {
                if (aVar != null) {
                    String str2 = str == null ? BuildConfig.FLAVOR : str;
                    if (!gVar.f387191c.containsKey(str2)) {
                        gVar.f387191c.put(str2, new ArrayList());
                    }
                    ((List) gVar.f387191c.get(str2)).add(aVar);
                }
            }
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.f387189a.isEmpty()) {
            hashMap.put("products", this.f387189a);
        }
        if (!this.f387190b.isEmpty()) {
            hashMap.put("promotions", this.f387190b);
        }
        if (!this.f387191c.isEmpty()) {
            hashMap.put("impressions", this.f387191c);
        }
        hashMap.put("productAction", (Object) null);
        return C142757j.m231683a(hashMap, 0);
    }
}
