package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a;

import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97214b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97217e;
import java.util.Comparator;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.r */
/* compiled from: PG */
public final /* synthetic */ class C97122r implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ C97214b f271378a;

    /* renamed from: b */
    public final /* synthetic */ Map f271379b;

    public /* synthetic */ C97122r(C97214b bVar, Map map) {
        this.f271378a = bVar;
        this.f271379b = map;
    }

    public final int compare(Object obj, Object obj2) {
        C97214b bVar = this.f271378a;
        Map map = this.f271379b;
        C97217e eVar = new C97217e(bVar);
        C97214b bVar2 = (C97214b) map.get((C97112h) obj);
        bVar2.getClass();
        C97214b bVar3 = (C97214b) map.get((C97112h) obj2);
        bVar3.getClass();
        int compare = eVar.compare(bVar2, bVar3);
        if (compare != 0) {
            return compare;
        }
        return -1;
    }
}
