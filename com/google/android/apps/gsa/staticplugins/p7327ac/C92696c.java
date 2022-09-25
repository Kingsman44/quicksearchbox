package com.google.android.apps.gsa.staticplugins.p7327ac;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p343ac.p346b.p347a.C6625b;
import com.google.p343ac.p346b.p347a.C6636m;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ac.c */
/* compiled from: PG */
public final /* synthetic */ class C92696c implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C6625b f258737a;

    public /* synthetic */ C92696c(C6625b bVar) {
        this.f258737a = bVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C6625b bVar = this.f258737a;
        C59071e eVar = C92701h.f258742a;
        for (C6636m mVar : (List) obj) {
            if (mVar == null) {
                C59104x c = C92701h.f258742a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ApplicationPropertiesBu");
                ((C59052c) ((C59052c) c).mo56372aa(19018)).mo56386p("Adding async application properties failed.");
            } else {
                bVar.mergeFrom(mVar);
            }
        }
        return ((C6636m) bVar.build()).toByteArray();
    }
}
