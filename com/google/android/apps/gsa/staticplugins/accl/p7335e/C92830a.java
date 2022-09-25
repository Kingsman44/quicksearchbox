package com.google.android.apps.gsa.staticplugins.accl.p7335e;

import com.google.android.apps.gsa.store.C118311b;
import com.google.android.apps.gsa.store.C118314e;
import com.google.android.apps.gsa.store.C118332u;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.e.a */
/* compiled from: PG */
public final /* synthetic */ class C92830a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C92832c f259017a;

    /* renamed from: b */
    public final /* synthetic */ String f259018b;

    public /* synthetic */ C92830a(C92832c cVar, String str) {
        this.f259017a = cVar;
        this.f259018b = str;
    }

    public final Object apply(Object obj) {
        C118332u uVar;
        C118311b bVar;
        Long l;
        C92832c cVar = this.f259017a;
        String str = this.f259018b;
        C118314e eVar = (C118314e) obj;
        Object obj2 = C58836b.f156633a;
        if (eVar != null) {
            if (eVar.mo91753a() <= 0) {
                eVar.mo91755c().mo91751b();
            } else {
                if (eVar.hasNext() && (uVar = (C118332u) eVar.next()) != null && uVar.mo103670a()) {
                    obj2 = C58833ax.m90834k(uVar.mo103671b());
                    Map map = uVar.f328462c;
                    if (map == null || (bVar = (C118311b) map.get(cVar.f259020b)) == null || (l = bVar.f328398c) == null) {
                        C59104x c = C92832c.f259019a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "ConvContentStoreImpl");
                        ((C59052c) ((C59052c) c).mo56372aa(13463)).mo56389s("Missing expiration time for blob: %s", str);
                    } else {
                        cVar.mo87470c(str, uVar.mo103671b(), l.longValue());
                    }
                }
                C58976aa aaVar = C58975e.f156826a;
                eVar.mo91755c().mo91751b();
            }
        }
        return obj2;
    }
}
