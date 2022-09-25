package com.google.android.apps.gsa.staticplugins.bisto.p7495m;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.p10712d.C142324bc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.m.b */
/* compiled from: PG */
public final /* synthetic */ class C95485b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C95493j f267206a;

    /* renamed from: b */
    public final /* synthetic */ String f267207b;

    public /* synthetic */ C95485b(C95493j jVar, String str) {
        this.f267206a = jVar;
        this.f267207b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C95493j jVar = this.f267206a;
        String str = this.f267207b;
        try {
            byte[] f = ((C89057m) obj).mo83036f();
            try {
                jVar.f267224h.mo83386ab(str, (C142324bc) C62942bv.parseFrom((C62942bv) C142324bc.f386113s, f));
                C58976aa aaVar = C58975e.f156826a;
            } catch (C62974ct e) {
                C59104x d = C95493j.f267217a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "DevCusDownloader");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(15130)).mo56386p("Invalid input");
            }
        } catch (C89013ak | C90457d e2) {
            C59104x c = C95493j.f267217a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DevCusDownloader");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(15109)).mo56386p("Failed to read page body");
        }
        return C118826c.f331422a;
    }
}
