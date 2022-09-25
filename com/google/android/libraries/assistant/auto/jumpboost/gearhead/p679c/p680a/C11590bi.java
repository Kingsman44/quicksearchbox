package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.bi */
/* compiled from: PG */
public final /* synthetic */ class C11590bi implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C11590bi f37516a = new C11590bi();

    private /* synthetic */ C11590bi() {
    }

    public final Object apply(Object obj) {
        C58800sl lA = ((C58495hd) obj).entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            if (((C65753ak) entry.getKey()).equals(C65753ak.TNG_ASSISTANT_TOP_CONTACTS)) {
                if (((C21850cf) entry.getValue()).mo27152b().isEmpty()) {
                    return null;
                }
                ((C59052c) ((C59052c) C11594bm.f37520a.mo56226d()).mo56372aa(43390)).mo56389s("Failure happens during geller batch refresh sync: %s", Collection.EL.stream(((C21850cf) entry.getValue()).mo27152b()).map(C11593bl.f37519a).collect(Collectors.joining("\n")));
                return null;
            }
        }
        ((C59052c) ((C59052c) C11594bm.f37520a.mo56226d()).mo56372aa(43389)).mo56386p("Did not find the CORPUS TNG_ASSISTANT_TOP_CONTACTS in synced results.");
        return null;
    }
}
