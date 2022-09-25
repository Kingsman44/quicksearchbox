package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.bb */
/* compiled from: PG */
public final /* synthetic */ class C101043bb implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C101043bb f282169a = new C101043bb();

    private /* synthetic */ C101043bb() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C29690f fVar = (C29690f) obj;
        C59071e eVar = C101050bi.f282183a;
        C28595b bVar = null;
        if (fVar != null) {
            int i = 0;
            while (true) {
                if (i >= fVar.f80416g.size()) {
                    ((C59052c) ((C59052c) C101050bi.f282183a.mo56225c()).mo56372aa(19759)).mo56386p("policy config file not found in client file group!!");
                    break;
                }
                C28595b bVar2 = (C28595b) fVar.f80416g.get(i);
                if (bVar2.f77798b.startsWith("policy-config")) {
                    bVar = bVar2;
                    break;
                }
                i++;
            }
        } else {
            ((C59052c) ((C59052c) C101050bi.f282183a.mo56226d()).mo56372aa(19758)).mo56386p("Client file group is null. No policy config file available.");
        }
        return Optional.ofNullable(bVar).map(C101045bd.f282171a);
    }
}
