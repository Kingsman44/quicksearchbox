package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58526ih;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.ed */
/* compiled from: PG */
public final /* synthetic */ class C29063ed implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58526ih f78878a;

    public /* synthetic */ C29063ed(C58526ih ihVar) {
        this.f78878a = ihVar;
    }

    public final Object apply(Object obj) {
        C58526ih ihVar = this.f78878a;
        for (C28816c a : (List) obj) {
            C29334dr a2 = a.mo34483a();
            for (C29328dl dlVar : a2.f79512n) {
                int a3 = C29332dp.m54217a(a2.f79507i);
                if (a3 == 0) {
                    a3 = 1;
                }
                ihVar.mo55373c(C29292lr.m54176a(dlVar, a3));
            }
        }
        return ihVar.mo55486f();
    }
}
