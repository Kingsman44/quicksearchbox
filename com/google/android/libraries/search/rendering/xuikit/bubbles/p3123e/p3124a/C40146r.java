package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a;

import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40248b;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40250d;
import java.util.Comparator;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.a.r */
/* compiled from: PG */
public final /* synthetic */ class C40146r implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ C40248b f105464a;

    /* renamed from: b */
    public final /* synthetic */ Map f105465b;

    public /* synthetic */ C40146r(C40248b bVar, Map map) {
        this.f105464a = bVar;
        this.f105465b = map;
    }

    public final int compare(Object obj, Object obj2) {
        C40248b bVar = this.f105464a;
        Map map = this.f105465b;
        C40250d dVar = new C40250d(bVar);
        C40248b bVar2 = (C40248b) map.get((C40137i) obj);
        bVar2.getClass();
        C40248b bVar3 = (C40248b) map.get((C40137i) obj2);
        bVar3.getClass();
        int compare = dVar.compare(bVar2, bVar3);
        if (compare != 0) {
            return compare;
        }
        return -1;
    }
}
