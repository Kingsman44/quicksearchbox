package com.google.android.libraries.assistant.p1594s.p1595a;

import android.content.Context;
import com.google.android.libraries.assistant.p1594s.p1595a.p1596a.C19128a;
import com.google.android.libraries.assistant.p1594s.p1599c.C19200b;
import com.google.android.libraries.assistant.p1594s.p1599c.C19206h;
import com.google.android.libraries.assistant.p1594s.p1599c.C19213o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60895di;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.libraries.assistant.s.a.c */
/* compiled from: PG */
public final class C19130c {

    /* renamed from: a */
    public static final C59071e f53598a = C59071e.m91332i("com.google.android.libraries.assistant.s.a.c");

    /* renamed from: b */
    public final SortedMap f53599b = new TreeMap();

    /* renamed from: c */
    public final C19128a f53600c;

    /* renamed from: d */
    private final C60887da f53601d;

    public C19130c(Map map, Context context) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == null) {
                C59104x d = f53598a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AIEngines");
                ((C59052c) ((C59052c) d).mo56372aa(47813)).mo56386p("An engine instance can't be null.");
            } else {
                this.f53599b.put((Integer) entry.getKey(), (C19127a) entry.getValue());
            }
        }
        this.f53601d = C60895di.m92995a(Executors.newFixedThreadPool(5));
        this.f53600c = new C19128a(context);
    }

    /* renamed from: a */
    public static final void m36543a(C19127a aVar, int i, C19213o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        oVar.f53802d.size();
        if (oVar.f53803e.isEmpty()) {
            for (C19206h hVar : oVar.f53802d) {
                if (hVar.f53781e.size() > 0) {
                    Iterator it = new HashSet(hVar.f53781e).iterator();
                    while (it.hasNext()) {
                        if (((Integer) it.next()).intValue() == i) {
                            String str = hVar.f53779c;
                            new ArrayList(Arrays.asList(new C19206h[]{hVar}));
                            aVar.mo24292f();
                        }
                    }
                } else {
                    String str2 = hVar.f53779c;
                    new ArrayList(Arrays.asList(new C19206h[]{hVar}));
                    aVar.mo24292f();
                }
            }
            return;
        }
        String str3 = oVar.f53803e;
        C62971cq cqVar = oVar.f53802d;
        aVar.mo24292f();
    }

    /* renamed from: b */
    public final C60870cx mo24295b(C19200b bVar) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f53601d.mo19399b(new C19129b(this, bVar));
    }
}
