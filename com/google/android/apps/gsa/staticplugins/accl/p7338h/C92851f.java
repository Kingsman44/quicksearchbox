package com.google.android.apps.gsa.staticplugins.accl.p7338h;

import com.google.android.apps.gsa.search.core.google.p6790a.C85812bd;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3917i.p3918a.C51570mp;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.h.f */
/* compiled from: PG */
public final class C92851f implements C85812bd {

    /* renamed from: a */
    private static final C59071e f259060a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.h.f");

    /* renamed from: a */
    public final C58833ax mo79460a(Query query) {
        byte[] dV = query.mo84441dV();
        if (dV == null) {
            return C58836b.f156633a;
        }
        try {
            C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
            kbVar.copyOnWrite();
            C52232kc kcVar = (C52232kc) kbVar.instance;
            kcVar.f137064a |= 1;
            kcVar.f137065b = "asst.suggestions.params";
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.params.SuggestionsParams";
            C63088z byteString = ((C51570mp) C62942bv.parseFrom((C62942bv) C51570mp.f134408e, dV)).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString;
            C52230ka kaVar3 = (C52230ka) jzVar.build();
            kbVar.copyOnWrite();
            C52232kc kcVar2 = (C52232kc) kbVar.instance;
            kaVar3.getClass();
            kcVar2.f137066c = kaVar3;
            kcVar2.f137064a |= 2;
            return C58833ax.m90834k((C52232kc) kbVar.build());
        } catch (C62974ct e) {
            C59104x d = f259060a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SuggestionsPPF");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(13474)).mo56386p("Unable to parse SuggestionParams included in Query.");
            return C58836b.f156633a;
        } catch (RuntimeException e2) {
            C59104x d2 = f259060a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "SuggestionsPPF");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(13475)).mo56389s("Runtime exception while parsing SuggestionParams: %s", e2);
            return C58836b.f156633a;
        }
    }
}
