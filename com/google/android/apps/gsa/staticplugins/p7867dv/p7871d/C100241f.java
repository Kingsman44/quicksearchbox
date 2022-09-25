package com.google.android.apps.gsa.staticplugins.p7867dv.p7871d;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87845fs;
import com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.C88645a;
import com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.C88686i;
import com.google.android.apps.gsa.searchbox.p6960ui.C88704e;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.dv.d.f */
/* compiled from: PG */
public final /* synthetic */ class C100241f implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C100244i f280325a;

    public /* synthetic */ C100241f(C100244i iVar) {
        this.f280325a = iVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C100244i iVar = this.f280325a;
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) ((C23249a) iVar.f280329b.mo91804c()).mo28725a();
        if (bArr2.length != 0) {
            try {
                C88686i iVar2 = iVar.f280330c;
                C87845fs fsVar = (C87845fs) C62942bv.parseFrom((C62942bv) C87845fs.f237675c, bArr2, C62921ba.m95368a());
                if ((fsVar.f237677a & 1) != 0) {
                    int i = fsVar.f237678b;
                    C88704e eVar = (C88704e) ((C88645a) iVar2).f239659q.get(i);
                    if (eVar != null) {
                        eVar.mo82426a(fsVar);
                        ((C88645a) iVar2).f239659q.remove(i);
                        return;
                    }
                    C58976aa aaVar = C58975e.f156826a;
                }
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) C100244i.f280328a.mo56225c()).mo56382g(e)).mo56372aa(33275)).mo56386p("Failed to parse GenericSuggestCallbackEventData nano proto from byte array");
            }
        }
    }
}
