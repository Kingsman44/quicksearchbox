package com.google.android.libraries.lens.view.p2159q.p2160a;

import com.google.android.libraries.lens.view.p2159q.C27617bk;
import com.google.android.libraries.mdi.download.C28798cm;
import com.google.android.libraries.mdi.download.C28803cr;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.q.a.w */
/* compiled from: PG */
public final /* synthetic */ class C27576w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C27578y f75374a;

    public /* synthetic */ C27576w(C27578y yVar) {
        this.f75374a = yVar;
    }

    public final Object apply(Object obj) {
        C27578y yVar = this.f75374a;
        C58480gp e = C58485gu.m89837e();
        for (C27617bk bkVar : ((Map) obj).values()) {
            if (bkVar.f75457c.equals(yVar.f75376a)) {
                C28798cm cmVar = (C28798cm) C28803cr.f78265n.createBuilder();
                String str = yVar.f75376a;
                cmVar.copyOnWrite();
                C28803cr crVar = (C28803cr) cmVar.instance;
                crVar.f78267a |= 8;
                crVar.f78270d = str;
                String str2 = bkVar.f75458d;
                cmVar.copyOnWrite();
                C28803cr crVar2 = (C28803cr) cmVar.instance;
                str2.getClass();
                crVar2.f78267a |= 16384;
                crVar2.f78279m = str2;
                e.mo55395g((C28803cr) cmVar.build());
            }
        }
        return e.mo55394f();
    }
}
