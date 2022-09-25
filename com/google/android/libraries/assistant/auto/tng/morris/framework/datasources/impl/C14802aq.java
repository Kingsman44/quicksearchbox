package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.C12902a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12985c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12987e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p883a.C13011a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p883a.C13012b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.aq */
/* compiled from: PG */
public final class C14802aq implements C12902a {

    /* renamed from: a */
    private static final C59071e f44600a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.aq");

    /* renamed from: a */
    public final C12986d mo20173a(C12991i iVar, C12985c cVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C13012b.f40423f);
        iVar.mo58887l(r0);
        if (!iVar.f169962ag.mo58857o(r0.f169971d)) {
            ((C59052c) ((C59052c) f44600a.mo56226d()).mo56372aa(45549)).mo56386p("Invalid update of the AssistantRequest for Morris due to missing the extension");
            return (C12986d) cVar.build();
        }
        C62940bt r02 = C62942bv.checkIsLite(C13012b.f40423f);
        iVar.mo58887l(r02);
        Object l = iVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C13012b bVar = (C13012b) obj;
        if ((bVar.f40425a & 4) != 0) {
            C13011a aVar = (C13011a) bVar.toBuilder();
            aVar.copyOnWrite();
            C13012b bVar2 = (C13012b) aVar.instance;
            bVar2.f40428d = null;
            bVar2.f40425a &= -5;
            bVar = (C13012b) aVar.build();
        }
        C12991i iVar2 = ((C12986d) cVar.instance).f40370d;
        if (iVar2 == null) {
            iVar2 = C12991i.f40380k;
        }
        C12987e eVar = (C12987e) iVar2.toBuilder();
        eVar.mo58885m(C13012b.f40423f, bVar);
        cVar.copyOnWrite();
        C12986d dVar = (C12986d) cVar.instance;
        C12991i iVar3 = (C12991i) eVar.build();
        iVar3.getClass();
        dVar.f40370d = iVar3;
        dVar.f40367a |= 128;
        return (C12986d) cVar.build();
    }
}
