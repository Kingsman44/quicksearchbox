package com.google.android.apps.gsa.shared.util.p7188v.p7189a;

import com.google.android.apps.p464c.p465a.p466a.p467a.p468a.C9015a;
import com.google.android.apps.p464c.p465a.p466a.p467a.p468a.C9016b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.shared.util.v.a.f */
/* compiled from: PG */
public final /* synthetic */ class C91133f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f254455a;

    public /* synthetic */ C91133f(String str) {
        this.f254455a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f254455a;
        C9016b bVar = (C9016b) obj;
        if (str == null) {
            C9015a aVar = (C9015a) bVar.toBuilder();
            aVar.copyOnWrite();
            C9016b bVar2 = (C9016b) aVar.instance;
            bVar2.f31145a &= -2;
            bVar2.f31146b = C9016b.f31143e.f31146b;
            return (C9016b) aVar.build();
        }
        C9015a aVar2 = (C9015a) bVar.toBuilder();
        aVar2.copyOnWrite();
        C9016b bVar3 = (C9016b) aVar2.instance;
        bVar3.f31145a |= 1;
        bVar3.f31146b = str;
        return (C9016b) aVar2.build();
    }
}
