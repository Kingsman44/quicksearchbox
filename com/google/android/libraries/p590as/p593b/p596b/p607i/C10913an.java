package com.google.android.libraries.p590as.p593b.p596b.p607i;

import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.as.b.b.i.an */
/* compiled from: PG */
public final /* synthetic */ class C10913an implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C10921av f36011a;

    /* renamed from: b */
    public final /* synthetic */ C10882h f36012b;

    public /* synthetic */ C10913an(C10921av avVar, C10882h hVar) {
        this.f36011a = avVar;
        this.f36012b = hVar;
    }

    public final C60870cx apply(Object obj) {
        C10921av avVar = this.f36011a;
        C10882h hVar = this.f36012b;
        if (((Boolean) obj).booleanValue()) {
            ((C58970a) ((C58970a) C10921av.f36023a.mo56224b()).mo56372aa(54059)).mo56389s("Zipfile LP successfully removed from MDD: %s", hVar);
        } else {
            ((C58970a) ((C58970a) C10921av.f36023a.mo56226d()).mo56372aa(54058)).mo56389s("Zipfile LP not successfully removed from MDD. Did FileGroup exist? Descriptor: %s", hVar);
        }
        return avVar.f36025c.mo19335a(avVar.f36024b);
    }
}
