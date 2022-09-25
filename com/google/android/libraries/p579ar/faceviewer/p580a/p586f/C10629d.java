package com.google.android.libraries.p579ar.faceviewer.p580a.p586f;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.youtube.p5162a.p5163a.C65980aj;
import com.google.protos.youtube.p5162a.p5163a.C65982al;
import com.google.protos.youtube.p5162a.p5163a.C65998o;
import com.google.protos.youtube.p5162a.p5163a.C65999p;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.f.d */
/* compiled from: PG */
public final /* synthetic */ class C10629d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C10630e f35510a;

    /* renamed from: b */
    public final /* synthetic */ C65982al f35511b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f35512c;

    public /* synthetic */ C10629d(C10630e eVar, C65982al alVar, C60870cx cxVar) {
        this.f35510a = eVar;
        this.f35511b = alVar;
        this.f35512c = cxVar;
    }

    public final void run() {
        C10630e eVar = this.f35510a;
        C65982al alVar = this.f35511b;
        C60870cx cxVar = this.f35512c;
        if (alVar != null) {
            C10627b bVar = eVar.f35514b;
            C65998o oVar = (C65998o) C65999p.f179492c.createBuilder();
            oVar.copyOnWrite();
            C65999p pVar = (C65999p) oVar.instance;
            pVar.f179495b = alVar;
            pVar.f179494a = 2;
            bVar.mo18664b((C65999p) oVar.build());
        }
        try {
            C65980aj ajVar = (C65980aj) C60856cj.m92909r(cxVar);
            if (ajVar != null) {
                C10627b bVar2 = eVar.f35514b;
                C65998o oVar2 = (C65998o) C65999p.f179492c.createBuilder();
                oVar2.copyOnWrite();
                C65999p pVar2 = (C65999p) oVar2.instance;
                pVar2.f179495b = ajVar;
                pVar2.f179494a = 1;
                bVar2.mo18664b((C65999p) oVar2.build());
                return;
            }
            ((C59052c) ((C59052c) C10630e.f35513a.mo56225c()).mo56372aa(42300)).mo56386p("Error getting Web config. Null returned.");
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C10630e.f35513a.mo56225c()).mo56382g(e)).mo56372aa(42301)).mo56386p("Exception getting Web config.");
        }
    }
}
