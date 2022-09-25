package com.google.android.libraries.web.weblayer.p3450c.p3451a;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p445a.C8850c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72327aw;
import org.chromium.p5643b.p5644a.C72331b;
import org.chromium.weblayer.C72579ao;
import org.chromium.weblayer.C72601bj;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72615d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.c.a.g */
/* compiled from: PG */
public final class C44136g extends C72579ao {

    /* renamed from: a */
    final /* synthetic */ C72601bj f114855a;

    /* renamed from: b */
    final /* synthetic */ C44142m f114856b;

    public C44136g(C72601bj bjVar, C44142m mVar) {
        this.f114855a = bjVar;
        this.f114856b = mVar;
    }

    /* renamed from: a */
    public final void mo47096a(C72601bj bjVar, int i) {
        C69664n.m101061g(bjVar, "newTab");
        C72601bj bjVar2 = this.f114855a;
        C72615d dVar = this.f114856b.f114872j;
        C69664n.m101058d(dVar);
        if (!C69664n.m101066l(bjVar2, dVar.mo64482a()) || i == 1) {
            C59052c cVar = (C59052c) C44142m.f114863a.mo56226d();
            cVar.mo56379ah(new C59094n(54175));
            cVar.mo56386p("Tried to open a tab in the background.");
            C72615d dVar2 = this.f114856b.f114872j;
            C69664n.m101058d(dVar2);
            dVar2.mo64484c(bjVar);
            return;
        }
        C44142m mVar = this.f114856b;
        C72615d dVar3 = mVar.f114872j;
        C69664n.m101058d(dVar3);
        if (!C69664n.m101066l(bjVar.mo64473c(), dVar3)) {
            C72604bm.m107399a();
            dVar3.mo64487f();
            if (bjVar.mo64473c() != dVar3) {
                try {
                    C72331b bVar = dVar3.f193182e;
                    C72327aw awVar = bjVar.f193153k;
                    Parcel gA = bVar.mo17260gA();
                    C8850c.m23499h(gA, awVar);
                    bVar.mo17262he(8, gA);
                } catch (RemoteException e) {
                    throw new C72304a(e);
                }
            }
        }
        mVar.mo47101f(bjVar);
        dVar3.mo64486e(bjVar);
    }
}
