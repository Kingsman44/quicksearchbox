package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.C111773f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.C112064h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.C112102j;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C110971ai implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C110971ai f309143a = new C110971ai();

    private /* synthetic */ C110971ai() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Map map = (Map) obj;
        HashMap hashMap = new HashMap();
        try {
            if (map.containsKey("entity_to_actions")) {
                String str = (String) map.get("entity_to_actions");
                str.getClass();
                FileInputStream fileInputStream = new FileInputStream(str);
                C62921ba a = C62921ba.m95368a();
                fileInputStream.close();
                for (C112064h hVar : ((C112102j) C62942bv.parseFrom((C62942bv) C112102j.f311317b, (InputStream) fileInputStream, a)).f311319a) {
                    for (String str2 : hVar.f311240a) {
                        Map.EL.putIfAbsent(hashMap, str2.trim(), new ArrayList());
                        List list = (List) hashMap.get(str2.trim());
                        list.getClass();
                        C111773f fVar = hVar.f311241b;
                        if (fVar == null) {
                            fVar = C111773f.f310673c;
                        }
                        list.add(fVar);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            C59104x c = C110972aj.f309144a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TapasAAHelper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(27070)).mo56386p("loadAppActionsBII: File not found");
        } catch (IOException e2) {
            C59104x c2 = C110972aj.f309144a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "TapasAAHelper");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(27071)).mo56386p("loadAppActionsBII: I/O error");
        }
        return hashMap;
    }
}
