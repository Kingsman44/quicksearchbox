package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.apps.gsa.search.core.p6881w.C87252a;
import com.google.android.libraries.p10923ac.p10947c.C147206h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4102au.p4103a.p4104a.p4105a.C54568f;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.ah */
/* compiled from: PG */
public final class C97278ah extends C97241a implements C87252a {

    /* renamed from: c */
    private static final C59071e f271688c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bv.ah");

    /* renamed from: b */
    public String f271689b;

    public C97278ah(C147206h hVar) {
        super(hVar);
        try {
            this.f271689b = ((C54568f) hVar.mo124033a()).f143269a;
        } catch (C62974ct e) {
            C59104x c = f271688c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "QryDataFtprntImpl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(20927)).mo56386p("Failed to parse footprint.");
        }
    }
}
