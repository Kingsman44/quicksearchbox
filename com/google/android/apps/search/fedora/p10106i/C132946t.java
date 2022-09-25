package com.google.android.apps.search.fedora.p10106i;

import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.i.t */
/* compiled from: PG */
public final /* synthetic */ class C132946t implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C132946t f362629a = new C132946t();

    private /* synthetic */ C132946t() {
    }

    public final C60870cx apply(Object obj) {
        C29690f fVar = (C29690f) obj;
        C59071e eVar = C132948v.f362631a;
        C28595b bVar = null;
        if (fVar != null) {
            int i = 0;
            while (true) {
                if (i >= fVar.f80416g.size()) {
                    C59104x c = C132948v.f362631a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "PolicyConfigSync");
                    ((C59052c) ((C59052c) c).mo56372aa(39941)).mo56386p("policy config file not found in client file group!!");
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
            C59104x d = C132948v.f362631a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PolicyConfigSync");
            ((C59052c) ((C59052c) d).mo56372aa(39940)).mo56386p("Client file group is null. No policy config file available.");
        }
        return C60856cj.m92900i(Optional.ofNullable(bVar).map(C132947u.f362630a));
    }
}
