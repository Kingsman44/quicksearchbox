package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.common.base.C58817ah;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.s */
/* compiled from: PG */
public final /* synthetic */ class C29307s implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29314z f79428a;

    /* renamed from: b */
    public final /* synthetic */ List f79429b;

    public /* synthetic */ C29307s(C29314z zVar, List list) {
        this.f79428a = zVar;
        this.f79429b = list;
    }

    public final Object apply(Object obj) {
        C29314z zVar = this.f79428a;
        List list = this.f79429b;
        for (C28816c a : (List) obj) {
            C29334dr a2 = a.mo34483a();
            if (C29099m.m54014j(a2)) {
                for (C29328dl b : a2.f79512n) {
                    list.add(C29099m.m54006b(zVar.f79440a, zVar.f79447h, b, a2));
                }
            }
        }
        return list;
    }
}
