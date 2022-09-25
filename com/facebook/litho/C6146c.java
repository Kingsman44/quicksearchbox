package com.facebook.litho;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.facebook.litho.c */
/* compiled from: PG */
public final class C6146c {

    /* renamed from: a */
    public Map f18173a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13128a(Map map) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        synchronized (this) {
            Map map2 = this.f18173a;
            if (map != null) {
                linkedHashMap = new LinkedHashMap(map);
                if (map2 != null) {
                    linkedHashMap.keySet().removeAll(map2.keySet());
                }
            } else {
                linkedHashMap = null;
            }
            Map map3 = this.f18173a;
            if (map3 != null) {
                linkedHashMap2 = new LinkedHashMap(map3);
                if (map != null) {
                    linkedHashMap2.keySet().removeAll(map.keySet());
                }
            } else {
                linkedHashMap2 = null;
            }
            if (map != null) {
                this.f18173a = new LinkedHashMap(map);
            } else {
                this.f18173a = null;
            }
        }
        if (linkedHashMap2 != null) {
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                C6407q qVar = (C6407q) entry.getValue();
                String str = (String) entry.getKey();
                C6411u uVar = qVar.f18995r;
                qVar.mo12832ax();
            }
        }
        if (linkedHashMap != null) {
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                C6407q qVar2 = (C6407q) entry2.getValue();
                String str2 = (String) entry2.getKey();
                qVar2.mo12801U(qVar2.f18995r);
            }
        }
    }
}
