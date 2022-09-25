package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.apps.gsa.search.core.p6881w.C87252a;
import com.google.android.libraries.p10923ac.p10947c.C147206h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4184bj.p4211e.p4212a.p4213a.C56025b;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.c */
/* compiled from: PG */
public final class C97280c extends C97241a implements C87252a {

    /* renamed from: c */
    private static final C59071e f271692c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bv.c");

    /* renamed from: b */
    public String f271693b;

    public C97280c(C147206h hVar) {
        super(hVar);
        try {
            this.f271693b = ((C56025b) hVar.mo124033a()).f149201a;
        } catch (C62974ct e) {
            C59104x c = f271692c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ChrmHistFtprntImpl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(20916)).mo56386p("Failed to parse footprint.");
        }
    }
}
