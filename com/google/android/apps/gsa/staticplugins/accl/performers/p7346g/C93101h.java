package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.h */
/* compiled from: PG */
public final /* synthetic */ class C93101h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C93108o f259714a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f259715b;

    /* renamed from: c */
    public final /* synthetic */ String f259716c;

    public /* synthetic */ C93101h(C93108o oVar, C60870cx cxVar, String str) {
        this.f259714a = oVar;
        this.f259715b = cxVar;
        this.f259716c = str;
    }

    public final void run() {
        C93108o oVar = this.f259714a;
        C60870cx cxVar = this.f259715b;
        String str = this.f259716c;
        try {
            C52070ec ecVar = (C52070ec) C90877ak.m148472f(cxVar);
            C118569b bVar = (C118569b) C93108o.f259724b.get(str);
            if (bVar == null) {
                C59104x c = C93108o.f259723a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
                ((C59052c) ((C59052c) c).mo56372aa(13309)).mo56389s("Unknown media action log: %s", str);
                return;
            }
            C118831d g = ((C118827a) oVar.f259727e.mo27525b()).mo77944g(bVar, C118575h.IRIS_GLANCEABILITY);
            C52236kg kgVar = ecVar.f136654b;
            if (kgVar == null) {
                kgVar = C52236kg.f137089d;
            }
            C52235kf a = C52235kf.m86549a(kgVar.f137092b);
            if (a == null) {
                a = C52235kf.OK;
            }
            g.mo104025g((long) a.f137088t);
        } catch (InterruptedException | ExecutionException e) {
            C59104x c2 = C93108o.f259723a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(13308)).mo56386p("Error while logging media glanceable flow");
        }
    }
}
