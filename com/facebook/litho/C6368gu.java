package com.facebook.litho;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.litho.gu */
/* compiled from: PG */
final class C6368gu {

    /* renamed from: a */
    public final Map f18828a = new LinkedHashMap();

    /* renamed from: b */
    public final Map f18829b = new LinkedHashMap();

    /* renamed from: c */
    public final Map f18830c = new LinkedHashMap();

    /* renamed from: d */
    public final Map f18831d = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo13380a(C6367gt gtVar) {
        return this.f18831d.get(gtVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Collection mo13381b() {
        return this.f18831d.values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Set mo13382c() {
        return this.f18831d.keySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo13383d(C6367gt gtVar) {
        if (this.f18831d.remove(gtVar) != null) {
            int i = gtVar.f18824a;
            if (i == 1) {
                this.f18828a.remove(gtVar.f18825b);
            } else if (i != 2) {
                this.f18830c.remove(gtVar.f18825b);
            } else {
                String str = gtVar.f18826c;
                Map map = (Map) this.f18829b.get(str);
                map.remove(gtVar.f18825b);
                if (map.isEmpty()) {
                    this.f18829b.remove(str);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C6367gt mo13384e(String str) {
        Map map = (Map) this.f18829b.get((Object) null);
        if (map != null) {
            return (C6367gt) map.get(str);
        }
        return null;
    }
}
