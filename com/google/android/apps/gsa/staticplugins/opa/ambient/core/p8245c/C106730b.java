package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8245c;

import com.google.android.apps.gsa.opa.smartspace.C83801q;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.c.b */
/* compiled from: PG */
public final /* synthetic */ class C106730b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106732d f297441a;

    /* renamed from: b */
    public final /* synthetic */ C50738bc f297442b;

    public /* synthetic */ C106730b(C106732d dVar, C50738bc bcVar) {
        this.f297441a = dVar;
        this.f297442b = bcVar;
    }

    public final Object apply(Object obj) {
        C58833ax axVar;
        C106732d dVar = this.f297441a;
        C50738bc bcVar = this.f297442b;
        C83801q b = ((C83802r) obj).mo77092b();
        if (dVar.f297445b.mo79746e(C90017bw.f247890aE)) {
            ((C58970a) ((C58970a) dVar.f297444a.mo56224b()).mo56372aa(23187)).mo56386p("Skipping timeout check here when bypassing content store.");
            dVar.f297447d.mo95630b(bcVar.f132038e);
            axVar = C58833ax.m90834k(bcVar);
        } else if (((Boolean) dVar.f297447d.mo95629a().mo56106b(new C106731c(bcVar)).mo56109e(false)).booleanValue()) {
            ((C58970a) ((C58970a) dVar.f297444a.mo56224b()).mo56372aa(23186)).mo56389s("cardId %s already displayed. Not checking timeout.", bcVar.f132038e);
            axVar = C58833ax.m90834k(bcVar);
        } else {
            dVar.f297446c.mo77077a("8/9: Queried out the media chip.");
            if (dVar.f297446c.mo77081e()) {
                axVar = C58836b.f156633a;
            } else {
                dVar.f297447d.mo95630b(bcVar.f132038e);
                axVar = C58833ax.m90834k(bcVar);
            }
        }
        b.mo77071c(axVar);
        return b.mo77069a();
    }
}
