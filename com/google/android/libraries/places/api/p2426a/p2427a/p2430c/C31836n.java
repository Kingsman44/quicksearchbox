package com.google.android.libraries.places.api.p2426a.p2427a.p2430c;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C144953n;
import com.google.android.gms.location.C144978z;
import com.google.android.gms.tasks.C146004a;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p2472s.p2473a.p2474a.p2475a.C32149a;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.places.api.p2426a.p2427a.p2428a.C31780a;
import com.google.android.libraries.places.api.p2426a.p2427a.p2428a.C31781b;
import com.google.android.libraries.places.api.p2426a.p2427a.p2428a.C31785f;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31794b;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31795c;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31796d;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31797e;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31804l;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31805m;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31806n;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31807o;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31810r;
import com.google.android.libraries.places.api.p2426a.p2427a.p2433d.C31837a;
import com.google.android.libraries.places.api.p2426a.p2427a.p2433d.C31838b;
import com.google.android.libraries.places.api.p2426a.p2427a.p2433d.C31839c;
import com.google.android.libraries.places.api.p2426a.p2427a.p2433d.C31840d;
import com.google.android.libraries.places.api.p2426a.p2435c.C31842a;
import com.google.android.libraries.places.api.p2437b.C31855k;
import com.google.android.libraries.places.api.p2437b.C31858n;
import com.google.android.libraries.places.api.p2437b.C31859o;
import com.google.android.libraries.places.api.p2437b.C31861q;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;

/* renamed from: com.google.android.libraries.places.api.a.a.c.n */
/* compiled from: PG */
public final class C31836n implements C31863s {

    /* renamed from: a */
    public final C31785f f85455a;

    /* renamed from: b */
    public final C31842a f85456b;

    /* renamed from: c */
    public final C21370a f85457c;

    /* renamed from: d */
    public final C31810r f85458d;

    /* renamed from: e */
    private final C31781b f85459e;

    public C31836n(C31810r rVar, C31781b bVar, C31785f fVar, C31842a aVar, C21370a aVar2) {
        this.f85458d = rVar;
        this.f85459e = bVar;
        this.f85455a = fVar;
        this.f85456b = aVar;
        this.f85457c = aVar2;
    }

    /* renamed from: d */
    public static void m59198d(C31164au auVar) {
        C31164au.m58091a(auVar, C31164au.m58092b("Duration"));
        C31164au.m58091a(auVar, C31164au.m58092b("Battery"));
    }

    /* renamed from: a */
    public final C146006ab mo37395a(C31855k kVar) {
        C146006ab abVar;
        try {
            C58838bb.m90866a(kVar, "Request must not be null.");
            C32149a.m59926a();
            C31810r rVar = this.f85458d;
            if (TextUtils.isEmpty(kVar.mo37408c())) {
                abVar = C146021aq.m237849c(new C143842n(new Status(1, 9012, "Place ID must not be empty.", (PendingIntent) null, (ConnectionResult) null)));
            } else if (kVar.mo37409d().isEmpty()) {
                abVar = C146021aq.m237849c(new C143842n(new Status(1, 9012, "Place Fields must not be empty.", (PendingIntent) null, (ConnectionResult) null)));
            } else {
                Locale b = rVar.f85434e.mo37401b();
                String a = rVar.f85434e.mo37400a();
                boolean z = rVar.f85434e.f85470a;
                C31794b bVar = new C31794b(kVar, b, a, rVar.f85430a);
                long c = rVar.f85433d.mo26871c();
                abVar = rVar.f85431b.mo37392a(bVar, C31795c.class).mo122482a(C146013ai.f394700a, new C31806n()).mo122482a(C146013ai.f394700a, new C31807o(rVar, c));
            }
            return abVar.mo122482a(C146013ai.f394700a, new C31834l(this, kVar)).mo122484c(C146013ai.f394700a, C31831i.f85444a);
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: b */
    public final C146006ab mo37396b(C31858n nVar) {
        C146006ab abVar;
        try {
            C58838bb.m90866a(nVar, "Request must not be null.");
            C32149a.m59926a();
            C31810r rVar = this.f85458d;
            String g = nVar.mo37428g();
            if (g != null) {
                if (!TextUtils.isEmpty(g.trim())) {
                    Locale b = rVar.f85434e.mo37401b();
                    String a = rVar.f85434e.mo37400a();
                    boolean z = rVar.f85434e.f85470a;
                    C31796d dVar = new C31796d(nVar, b, a, rVar.f85430a);
                    long c = rVar.f85433d.mo26871c();
                    abVar = rVar.f85431b.mo37392a(dVar, C31797e.class).mo122482a(C146013ai.f394700a, new C31804l()).mo122482a(C146013ai.f394700a, new C31805m(rVar, c));
                    return abVar.mo122482a(C146013ai.f394700a, new C31835m(this, nVar)).mo122484c(C146013ai.f394700a, C31831i.f85444a);
                }
            }
            abVar = C146021aq.m237850d(C31859o.m59262b(C58485gu.m89845m()));
            return abVar.mo122482a(C146013ai.f394700a, new C31835m(this, nVar)).mo122484c(C146013ai.f394700a, C31831i.f85444a);
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    /* renamed from: c */
    public final C146006ab mo37397c(C31861q qVar, String str) {
        C146010af afVar;
        try {
            C58838bb.m90866a(qVar, "Request must not be null.");
            long c = this.f85457c.mo26871c();
            C32149a.m59926a();
            C31781b bVar = this.f85459e;
            C146004a a = qVar.mo37404a();
            C31840d dVar = bVar.f85394c;
            C144978z zVar = bVar.f85393b;
            C144953n nVar = new C144953n();
            nVar.mo120458b();
            C146006ab a2 = zVar.mo120475a(nVar.mo120457a(), a);
            long j = C31781b.f85392a;
            if (a == null) {
                afVar = new C146010af();
            } else {
                afVar = new C146010af(a);
            }
            if (!dVar.f85465a.containsKey(afVar)) {
                HandlerThread handlerThread = new HandlerThread("timeoutHandlerThread");
                handlerThread.start();
                dVar.f85465a.put(afVar, handlerThread);
                new Handler(handlerThread.getLooper()).postDelayed(new C31837a(afVar), j);
            }
            a2.mo122484c(C146013ai.f394700a, new C31838b(afVar));
            afVar.f394698a.mo122493l(C146013ai.f394700a, new C31839c(dVar, afVar));
            return afVar.f394698a.mo122484c(C146013ai.f394700a, new C31780a()).mo122486e(C146013ai.f394700a, new C31832j(this, qVar, str)).mo122482a(C146013ai.f394700a, new C31833k(this, qVar, c)).mo122484c(C146013ai.f394700a, C31831i.f85444a);
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }
}
