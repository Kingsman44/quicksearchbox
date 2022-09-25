package com.google.apps.tiktok.account.p3603a;

import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.apps.tiktok.account.a.d */
/* compiled from: PG */
public final class C45954d {
    /* renamed from: a */
    public static C28423g m82060a(AccountId accountId) {
        C62940bt btVar = C45953c.f120745a;
        C45951a aVar = (C45951a) C45952b.f120740d.createBuilder();
        int a = accountId.mo50068a();
        aVar.copyOnWrite();
        C45952b bVar = (C45952b) aVar.instance;
        bVar.f120742a |= 1;
        bVar.f120743b = a;
        return new C28423g(btVar, (C45952b) aVar.build());
    }

    /* renamed from: b */
    public static C28423g m82061b() {
        C62940bt btVar = C45953c.f120745a;
        C45951a aVar = (C45951a) C45952b.f120740d.createBuilder();
        aVar.copyOnWrite();
        C45952b bVar = (C45952b) aVar.instance;
        bVar.f120742a |= 2;
        bVar.f120744c = true;
        return new C28423g(btVar, (C45952b) aVar.build());
    }
}
