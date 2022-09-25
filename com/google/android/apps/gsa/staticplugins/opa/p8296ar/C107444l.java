package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3803ag.p3804a.C48850bq;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48871n;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.l */
/* compiled from: PG */
public final /* synthetic */ class C107444l implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107458z f298994a;

    /* renamed from: b */
    public final /* synthetic */ C48871n f298995b;

    public /* synthetic */ C107444l(C107458z zVar, C48871n nVar) {
        this.f298994a = zVar;
        this.f298995b = nVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C107458z zVar = this.f298994a;
        C48871n nVar = this.f298995b;
        C58833ax axVar = (C58833ax) obj;
        C22871g gVar = zVar.f299022e;
        C59104x b = C107458z.f299018a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
        ((C59052c) ((C59052c) b).mo56372aa(25370)).mo56386p("#storeActiveContent");
        ArrayList arrayList = new ArrayList();
        for (C63088z zVar2 : nVar.f126475d) {
            C48851br brVar = nVar.f126473b;
            if (brVar == null) {
                brVar = C48851br.f126412f;
            }
            C48850bq bqVar = (C48850bq) brVar.toBuilder();
            bqVar.copyOnWrite();
            C48851br brVar2 = (C48851br) bqVar.instance;
            zVar2.getClass();
            brVar2.f126414a |= 2;
            brVar2.f126418e = zVar2;
            arrayList.add(zVar.f299021d.mo28210j(zVar.f299020c.mo77012e(((C48851br) bqVar.build()).toByteString()), "validateContentDependencies#getClientContentInfo", C107446n.f298998a));
        }
        return gVar.mo28210j(zVar.f299022e.mo28210j(C118826c.m197212b(arrayList), "dependencyValidationFuture", new C107442j(zVar, axVar, nVar)), "storeActiveContentFuture", C107455w.f299015a);
    }
}
