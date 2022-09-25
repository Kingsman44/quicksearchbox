package com.google.android.libraries.home.p1948c.p1949a;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.google.android.libraries.home.coreui.devicetile.C23655aa;
import com.google.android.libraries.home.coreui.devicetile.C23675au;
import com.google.android.libraries.home.p1940a.p1943c.C23404ag;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.c.a.h */
/* compiled from: PG */
public final class C23626h {

    /* renamed from: d */
    private static final C59071e f64638d = C59071e.m91331h();

    /* renamed from: a */
    public final Context f64639a;

    /* renamed from: b */
    public final C23655aa f64640b;

    /* renamed from: c */
    public final C23675au f64641c;

    /* renamed from: e */
    private final Map f64642e;

    public C23626h(Context context, C23655aa aaVar, ViewGroup viewGroup, Collection collection, C23675au auVar) {
        this.f64639a = context;
        this.f64640b = aaVar;
        this.f64641c = auVar;
        int b = C69505av.m100860b(C69540x.m100804k(collection, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(b < 16 ? 16 : b);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C23404ag agVar = (C23404ag) it.next();
            C23625g gVar = new C23625g(this, viewGroup, agVar);
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(GridLayout.spec(LinearLayoutManager.INVALID_OFFSET, 1.0f), GridLayout.spec(LinearLayoutManager.INVALID_OFFSET, 1.0f));
            layoutParams.width = 0;
            viewGroup.addView(gVar.f64635b, layoutParams);
            C69685i iVar = new C69685i(agVar.f63965a.f63989a, gVar);
            linkedHashMap.put(iVar.f186052a, iVar.f186053b);
        }
        this.f64642e = linkedHashMap;
    }

    /* renamed from: a */
    public final Map mo28942a() {
        Map map = this.f64642e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C69505av.m100860b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((C23625g) entry.getValue()).f64634a);
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public final void mo28943b(Map map) {
        C69664n.m101061g(map, "deviceMap");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            C23404ag agVar = (C23404ag) entry.getValue();
            C23625g gVar = (C23625g) this.f64642e.get(str);
            if (gVar == null) {
                C59052c cVar = (C59052c) f64638d.mo56226d();
                cVar.mo56379ah(new C59094n(48672));
                cVar.mo56389s("Received trait update for unrecognized device ID %s", str);
            } else {
                gVar.mo28941a(agVar);
            }
        }
    }
}
