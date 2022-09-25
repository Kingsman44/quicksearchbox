package com.google.android.libraries.onegoogle.owners;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.gms.mobstore.C145559g;
import com.google.android.libraries.mdi.p2213d.p2214a.p2215a.C28617e;
import com.google.android.libraries.mdi.p2213d.p2219c.C28624b;
import com.google.android.libraries.mdi.p2213d.p2219c.C28626c;
import com.google.android.libraries.mdi.p2213d.p2219c.p2222c.C28634af;
import com.google.android.libraries.onegoogle.owners.mdi.C30986ag;
import com.google.android.libraries.onegoogle.owners.mdi.C30996k;
import com.google.android.libraries.onegoogle.owners.p2387b.C30962a;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30838d;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3305a.C42715b;
import com.google.android.libraries.storage.p3304a.p3305a.C42716c;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.android.libraries.storage.protostore.C42881ag;
import com.google.android.libraries.storage.protostore.C42957cy;
import com.google.android.libraries.storage.protostore.C43015r;
import com.google.android.libraries.storage.protostore.C43018u;
import com.google.android.libraries.storage.protostore.p3318c.C42932a;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.onegoogle.owners.p */
/* compiled from: PG */
public final /* synthetic */ class C31014p implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C31016r f83516a;

    public /* synthetic */ C31014p(C31016r rVar) {
        this.f83516a = rVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C31016r rVar = this.f83516a;
        C30838d dVar = new C30838d(rVar.f83519a, rVar.f83521c);
        C31015q qVar = new C31015q(rVar, dVar);
        if (rVar.f83523e.mo119362j(rVar.f83519a, 19621000) == 0) {
            C30960ad adVar = new C30960ad(rVar.f83520b, qVar);
            if (rVar.f83524f == null) {
                C145559g gVar = new C145559g(rVar.f83519a);
                C42715b bVar = new C42715b(rVar.f83519a);
                bVar.f111957b = gVar;
                C42813k kVar = new C42813k(C58485gu.m89846n(new C42716c(bVar)));
                C42932a aVar = C42932a.f112315a;
                HashMap hashMap = new HashMap();
                ExecutorService executorService = rVar.f83520b;
                C42881ag.m75749a(C42957cy.f112362a, hashMap);
                C42880af afVar = new C42880af(executorService, kVar, aVar, hashMap);
                Context context = rVar.f83519a;
                context.getClass();
                ExecutorService executorService2 = rVar.f83520b;
                executorService2.getClass();
                Handler handler = rVar.f83522d;
                if (handler == null) {
                    handler = null;
                }
                C28617e eVar = new C28617e(context);
                C28626c cVar = new C28626c();
                C21375e eVar2 = new C21375e();
                if (handler == null) {
                    HandlerThread handlerThread = new HandlerThread("ProtoDataStore-Message-Handler");
                    handlerThread.start();
                    handler = new Handler(handlerThread.getLooper());
                }
                C43015r rVar2 = new C43015r();
                rVar2.f112484a = context.getApplicationContext();
                rVar2.f112486c = "com.google.android.gms.permission.INTERNAL_BROADCAST";
                rVar2.f112485b = C28624b.f77851a;
                rVar2.f112487d = handler;
                rVar.f83524f = new C28634af(context, executorService2, "OneGoogle", kVar, afVar, eVar, cVar, eVar2, new C43018u(rVar2));
            }
            return new C30986ag(new C30962a(new C30996k(rVar.f83519a, rVar.f83524f, new C30973h(rVar.f83519a, rVar.f83520b), dVar), 1, dVar, rVar.f83519a.getPackageName()), adVar);
        }
        Log.i("OneGoogle", "MDI is not available. Forcing Menagerie");
        return (C31012n) qVar.mo6453a();
    }
}
