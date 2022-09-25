package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.w */
/* compiled from: PG */
public final /* synthetic */ class C77365w implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C76795ay f213367a;

    /* renamed from: b */
    public final /* synthetic */ C83320io f213368b;

    public /* synthetic */ C77365w(C76795ay ayVar, C83320io ioVar) {
        this.f213367a = ayVar;
        this.f213368b = ioVar;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C76795ay ayVar = this.f213367a;
        C83320io ioVar = this.f213368b;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((C58970a) ((C58970a) C76795ay.f212177a.mo56224b()).mo56372aa(3667)).mo56386p("AUM failed to resolve phone number.");
            ayVar.f212190l.mo76648a(ioVar, C82835ce.AUM_PHONE_NUMBER_NOT_RESOLVED, C83044e.f226656a);
        }
        return optional;
    }
}
