package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.data.manager.p3615a.C46223d;
import com.google.apps.tiktok.account.data.manager.p3615a.C46225f;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.apps.tiktok.account.data.manager.aj */
/* compiled from: PG */
public final /* synthetic */ class C46237aj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f121210a;

    public /* synthetic */ C46237aj(String str) {
        this.f121210a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f121210a;
        C46223d dVar = (C46223d) ((C46225f) obj).toBuilder();
        dVar.copyOnWrite();
        C46225f fVar = (C46225f) dVar.instance;
        C62995dn dnVar = fVar.f121182a;
        if (!dnVar.f170058b) {
            fVar.f121182a = dnVar.mo58980a();
        }
        fVar.f121182a.put(str, true);
        return (C46225f) dVar.build();
    }
}
