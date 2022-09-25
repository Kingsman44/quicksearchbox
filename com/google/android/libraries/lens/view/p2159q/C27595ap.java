package com.google.android.libraries.lens.view.p2159q;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Collections;

/* renamed from: com.google.android.libraries.lens.view.q.ap */
/* compiled from: PG */
public final /* synthetic */ class C27595ap implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f75404a;

    /* renamed from: b */
    public final /* synthetic */ C27617bk f75405b;

    public /* synthetic */ C27595ap(String str, C27617bk bkVar) {
        this.f75404a = str;
        this.f75405b = bkVar;
    }

    public final Object apply(Object obj) {
        String str = this.f75404a;
        C27617bk bkVar = this.f75405b;
        C27615bi biVar = (C27615bi) obj;
        C58974d dVar = C27608bb.f75425a;
        if (Collections.unmodifiableMap(biVar.f75452b).containsKey(str)) {
            return biVar;
        }
        C27612bf bfVar = (C27612bf) C27615bi.f75449c.createBuilder(biVar);
        str.getClass();
        bkVar.getClass();
        bfVar.copyOnWrite();
        ((C27615bi) bfVar.instance).mo33137a().put(str, bkVar);
        return (C27615bi) bfVar.build();
    }
}
