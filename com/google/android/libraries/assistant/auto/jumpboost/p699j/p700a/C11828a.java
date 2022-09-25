package com.google.android.libraries.assistant.auto.jumpboost.p699j.p700a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.C12902a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12985c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12987e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13041c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13042d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.j.a.a */
/* compiled from: PG */
public final class C11828a implements C12902a {

    /* renamed from: a */
    private static final C59071e f38012a = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.j.a.a");

    /* renamed from: a */
    public final C12986d mo20173a(C12991i iVar, C12985c cVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C13042d.f40481n);
        iVar.mo58887l(r0);
        if (!iVar.f169962ag.mo58857o(r0.f169971d)) {
            C59104x d = f38012a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FollowOnRequestUpdater");
            ((C59052c) ((C59052c) d).mo56372aa(43504)).mo56386p("Invalid update of the AssistantRequest for Projected due to missing the extension");
            return (C12986d) cVar.build();
        }
        C62940bt r02 = C62942bv.checkIsLite(C13042d.f40481n);
        iVar.mo58887l(r02);
        Object l = iVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C13042d dVar = (C13042d) obj;
        if (!dVar.f40485c) {
            return (C12986d) cVar.build();
        }
        C12991i iVar2 = ((C12986d) cVar.instance).f40370d;
        if (iVar2 == null) {
            iVar2 = C12991i.f40380k;
        }
        C12987e eVar = (C12987e) iVar2.toBuilder();
        C62940bt btVar = C13042d.f40481n;
        C13041c cVar2 = (C13041c) dVar.toBuilder();
        cVar2.copyOnWrite();
        C13042d dVar2 = (C13042d) cVar2.instance;
        dVar2.f40483a |= 64;
        dVar2.f40491i = false;
        eVar.mo58885m(btVar, (C13042d) cVar2.build());
        cVar.copyOnWrite();
        C12986d dVar3 = (C12986d) cVar.instance;
        C12991i iVar3 = (C12991i) eVar.build();
        iVar3.getClass();
        dVar3.f40370d = iVar3;
        dVar3.f40367a |= 128;
        return (C12986d) cVar.build();
    }
}
