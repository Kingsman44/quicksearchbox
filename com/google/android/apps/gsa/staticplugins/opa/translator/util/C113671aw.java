package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.p6790a.C85812bd;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3917i.p3918a.C51437hr;
import com.google.assistant.p3897e.p3917i.p3918a.C51438hs;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.aw */
/* compiled from: PG */
public final class C113671aw implements C85812bd {
    /* renamed from: a */
    public final C58833ax mo79460a(Query query) {
        C58836b bVar = C58836b.f156633a;
        if (TextUtils.isEmpty(query.f252754L)) {
            return bVar;
        }
        String str = query.f252754L;
        str.getClass();
        C58976aa aaVar = C58975e.f156826a;
        C51437hr hrVar = (C51437hr) C51438hs.f133965b.createBuilder();
        hrVar.copyOnWrite();
        C51438hs hsVar = (C51438hs) hrVar.instance;
        hsVar.mo53615a();
        hsVar.f133967a.add(str);
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.language.params";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.LanguageParams";
        C63088z byteString = ((C51438hs) hrVar.build()).toByteString();
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
    }
}
