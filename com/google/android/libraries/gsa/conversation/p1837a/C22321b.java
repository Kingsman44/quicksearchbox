package com.google.android.libraries.gsa.conversation.p1837a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;

/* renamed from: com.google.android.libraries.gsa.conversation.a.b */
/* compiled from: PG */
public final /* synthetic */ class C22321b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C22326g f61639a;

    public /* synthetic */ C22321b(C22326g gVar) {
        this.f61639a = gVar;
    }

    public final C60870cx apply(Object obj) {
        C22326g gVar = this.f61639a;
        C118826c cVar = (C118826c) obj;
        C60870cx cxVar = gVar.f61650c;
        if (cxVar != null) {
            return cxVar;
        }
        C58976aa aaVar = C58975e.f156826a;
        gVar.f61649b.mo27556d();
        try {
            gVar.f61650c = gVar.f61648a.mo27547b();
        } catch (IOException | RuntimeException e) {
            gVar.f61650c = C60856cj.m92899h(e);
        }
        return gVar.f61650c;
    }
}
