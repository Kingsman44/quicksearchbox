package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9210j.p9216e;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121220ae;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121244h;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121258v;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9208i.p9209a.C121375a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.j.e.c */
/* compiled from: PG */
public final /* synthetic */ class C121402c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Map f337047a;

    /* renamed from: b */
    public final /* synthetic */ C121375a f337048b;

    public /* synthetic */ C121402c(Map map, C121375a aVar) {
        this.f337047a = map;
        this.f337048b = aVar;
    }

    public final Object call() {
        C121244h hVar;
        C121258v vVar;
        Map map = this.f337047a;
        C121375a aVar = this.f337048b;
        C121220ae aeVar = (C121220ae) map.get(C48714bv.APP_INFO_SIGNAL);
        if (aeVar == null || aeVar.f336744b != 6) {
            C58976aa aaVar = C58975e.f156826a;
            return new ArrayList();
        }
        C121220ae aeVar2 = (C121220ae) map.get(C48714bv.APP_STATIC_SHORTCUT_SIGNAL);
        if (aeVar2 == null || aeVar2.f336744b != 7) {
            C58976aa aaVar2 = C58975e.f156826a;
            return new ArrayList();
        }
        if (aeVar.f336744b == 6) {
            hVar = (C121244h) aeVar.f336745c;
        } else {
            hVar = C121244h.f336790b;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hVar.f336792a);
        if (aeVar2.f336744b == 7) {
            vVar = (C121258v) aeVar2.f336745c;
        } else {
            vVar = C121258v.f336821b;
        }
        List b = aVar.mo105118b(unmodifiableMap, Collections.unmodifiableMap(vVar.f336823a), 2);
        C58976aa aaVar3 = C58975e.f156826a;
        b.size();
        return b;
    }
}
