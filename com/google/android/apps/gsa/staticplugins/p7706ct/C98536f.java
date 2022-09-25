package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.grammar.pumpkin.C66528t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.f */
/* compiled from: PG */
public final class C98536f extends C66528t {

    /* renamed from: a */
    private final List f275143a = new ArrayList();

    public C98536f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f275143a.add(((String) it.next()).toLowerCase());
        }
    }

    /* renamed from: a */
    public final float mo59673a(String str) {
        C90748e.m148224b();
        C58976aa aaVar = C58975e.f156826a;
        if (this.f275143a.contains(str.toLowerCase())) {
            return C98555y.m163249a(str);
        }
        return 0.0f;
    }
}
