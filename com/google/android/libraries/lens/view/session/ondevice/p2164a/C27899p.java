package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.ondevice.p2018b.C24274b;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.p */
/* compiled from: PG */
public final /* synthetic */ class C27899p implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f76006a;

    public /* synthetic */ C27899p(C58495hd hdVar) {
        this.f76006a = hdVar;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C58495hd hdVar = this.f76006a;
        C27891h hVar = (C27891h) obj;
        C58974d dVar = C27852ai.f75920a;
        try {
            C60870cx cxVar = (C60870cx) hdVar.get(hVar);
            cxVar.getClass();
            return ((C24274b) C60856cj.m92909r(cxVar)).mo29804b();
        } catch (ExecutionException unused) {
            return false;
        }
    }
}
