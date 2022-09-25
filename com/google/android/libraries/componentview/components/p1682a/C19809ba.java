package com.google.android.libraries.componentview.components.p1682a;

import android.util.Log;
import com.google.android.libraries.componentview.components.base.C20015al;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1699f.C20519g;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.componentview.components.a.ba */
/* compiled from: PG */
final class C19809ba extends C20519g {

    /* renamed from: a */
    final /* synthetic */ C19810bb f55357a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19809ba(C19810bb bbVar, C20601ca caVar, C19742a aVar) {
        super(caVar, aVar);
        this.f55357a = bbVar;
    }

    /* renamed from: a */
    public final void mo25126a() {
        C19810bb bbVar = this.f55357a;
        Log.v("ValyrianCollectionComponent", "#loadImages");
        C58485gu K = bbVar.mo25422K(C20015al.class);
        ArrayList arrayList = new ArrayList();
        int size = K.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(C60856cj.m92905n(new C19807az((C20015al) K.get(i)), bbVar.f56325e));
        }
        C20482m.m38442j(arrayList, bbVar.f55359a, bbVar.f55360b);
    }
}
