package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112113a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112115b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112127m;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.assistant.p3825an.p3830c.p3831a.C49314cf;
import com.google.assistant.p3825an.p3830c.p3831a.C49316ch;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C110970ah implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C112127m f309142a;

    public /* synthetic */ C110970ah(C112127m mVar) {
        this.f309142a = mVar;
    }

    public final Object apply(Object obj) {
        Optional optional;
        C112127m mVar = this.f309142a;
        Map map = (Map) obj;
        HashMap hashMap = new HashMap();
        C121509q l = C112127m.f311355a.mo105243l("issueLoadAppActionsResourcesFromAssetsTask");
        try {
            if (mVar.f311361f.isPresent()) {
                mVar.mo99407h(2, "Loading MDD file from ASSETS (include_tapas_assets=true)", new Object[0]);
                optional = mVar.f311361f.flatMap(C112115b.f311336a);
            } else {
                optional = Optional.empty();
            }
            l.close();
            try {
                if (optional.isPresent()) {
                    C62921ba a = C62921ba.m95368a();
                    for (C49314cf cfVar : ((C49316ch) C62942bv.parseFrom((C62942bv) C49316ch.f127460b, (InputStream) optional.get(), a)).f127462a) {
                        hashMap.put(cfVar.f127457a, cfVar);
                    }
                }
            } catch (IOException e) {
                C59104x c = C110972aj.f309144a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TapasAAHelper");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(27067)).mo56386p("loadAppActionsBII: I/O error");
            }
            try {
                if (map.containsKey("appactions_bii")) {
                    String str = (String) map.get("appactions_bii");
                    str.getClass();
                    FileInputStream fileInputStream = new FileInputStream(str);
                    C62921ba a2 = C62921ba.m95368a();
                    fileInputStream.close();
                    for (C49314cf cfVar2 : ((C49316ch) C62942bv.parseFrom((C62942bv) C49316ch.f127460b, (InputStream) fileInputStream, a2)).f127462a) {
                        hashMap.put(cfVar2.f127457a, cfVar2);
                    }
                }
            } catch (FileNotFoundException e2) {
                C59104x c2 = C110972aj.f309144a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "TapasAAHelper");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(27068)).mo56386p("loadAppActionsBII: File not found");
            } catch (IOException e3) {
                C59104x c3 = C110972aj.f309144a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "TapasAAHelper");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(27069)).mo56386p("loadAppActionsBII: I/O error");
            }
            return hashMap;
        } catch (Throwable th) {
            C112113a.m185984a(th, th);
        }
        throw th;
    }
}
