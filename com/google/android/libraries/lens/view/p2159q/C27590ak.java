package com.google.android.libraries.lens.view.p2159q;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62995dn;
import java.util.Collections;

/* renamed from: com.google.android.libraries.lens.view.q.ak */
/* compiled from: PG */
public final /* synthetic */ class C27590ak implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f75395a;

    /* renamed from: b */
    public final /* synthetic */ String f75396b;

    public /* synthetic */ C27590ak(String str, String str2) {
        this.f75395a = str;
        this.f75396b = str2;
    }

    public final Object apply(Object obj) {
        String str = this.f75395a;
        String str2 = this.f75396b;
        C27615bi biVar = (C27615bi) obj;
        C58974d dVar = C27608bb.f75425a;
        C27612bf bfVar = (C27612bf) C27615bi.f75449c.createBuilder(biVar);
        if (str.isEmpty()) {
            if (Collections.unmodifiableMap(biVar.f75451a).containsKey(str2)) {
                str2.getClass();
                bfVar.copyOnWrite();
                C27615bi biVar2 = (C27615bi) bfVar.instance;
                C62995dn dnVar = biVar2.f75451a;
                if (!dnVar.f170058b) {
                    biVar2.f75451a = dnVar.mo58980a();
                }
                biVar2.f75451a.remove(str2);
            }
            if (Collections.unmodifiableMap(biVar.f75452b).containsKey(str2)) {
                bfVar.mo33136a(str2);
            }
            return (C27615bi) bfVar.build();
        }
        bfVar.mo33136a(C27628bv.m51418a(str, str2));
        return (C27615bi) bfVar.build();
    }
}
