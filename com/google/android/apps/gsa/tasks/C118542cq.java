package com.google.android.apps.gsa.tasks;

import android.database.sqlite.SQLiteConstraintException;
import android.net.Uri;
import androidx.work.C4381ae;
import androidx.work.C4410f;
import androidx.work.C4631l;
import androidx.work.C4632m;
import androidx.work.C4634o;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46585s;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.tasks.cq */
/* compiled from: PG */
public final class C118542cq implements C118526ca {

    /* renamed from: a */
    public static final C59071e f329133a = C59071e.m91332i("com.google.android.apps.gsa.tasks.cq");

    /* renamed from: b */
    public final C118544cs f329134b;

    /* renamed from: c */
    public final C118533ch f329135c;

    /* renamed from: d */
    public final C68214a f329136d;

    /* renamed from: e */
    private final C22871g f329137e;

    public C118542cq(C118544cs csVar, C68214a aVar, C118533ch chVar, C22871g gVar) {
        this.f329134b = csVar;
        this.f329136d = aVar;
        this.f329135c = chVar;
        this.f329137e = gVar;
    }

    /* renamed from: a */
    private static C4632m m196804a(C118485at atVar) {
        HashMap hashMap = new HashMap();
        C4631l.m13032c("data", atVar.toByteArray(), hashMap);
        return C4631l.m13030a(hashMap);
    }

    /* renamed from: d */
    private static C46585s m196805d(C118485at atVar) {
        return new C46574h(Integer.toString(atVar.f328864b), C4634o.REPLACE);
    }

    /* renamed from: i */
    private final void m196806i(C46586t tVar) {
        try {
            this.f329134b.mo17428b().mo50546b(tVar);
        } catch (Throwable th) {
            C59104x c = f329133a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WMEngineAGSAC");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(34013)).mo56389s("Failed to enqueue work for WorkSpec %s", tVar);
            new C90873ag(this.f329134b.mo17428b().mo50547c("AGSAClassicTask"), this.f329137e, "Unschedule one-off WM work", new C118536ck(this, th)).mo85223a(C118537cl.f329127a);
        }
    }

    /* renamed from: j */
    private static C4381ae m196807j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return C4381ae.NOT_REQUIRED;
        }
        if (i2 != 2) {
            return C4381ae.CONNECTED;
        }
        return C4381ae.UNMETERED;
    }

    /* renamed from: b */
    public final C118575h mo103718b() {
        return C118575h.VBT_EXECUTION_DELAY_WORKMANAGER;
    }

    /* renamed from: c */
    public final Class mo103719c() {
        return getClass();
    }

    /* renamed from: e */
    public final void mo103721e(C118472ag agVar, C118485at atVar) {
        C4410f fVar = new C4410f();
        int a = C118470ae.m196676a(agVar.f328824d);
        if (a == 0) {
            a = 1;
        }
        fVar.mo9351c(m196807j(a));
        fVar.f14072b = agVar.f328825e;
        fVar.f14071a = agVar.f328826f;
        C118468ac acVar = agVar.f328828h;
        if (acVar == null) {
            acVar = C118468ac.f328813d;
        }
        if (acVar.f328816b.size() != 0) {
            for (String parse : acVar.f328816b) {
                fVar.mo9350b(Uri.parse(parse), false);
            }
            fVar.mo9352d(Duration.ofMillis(acVar.f328817c));
        }
        C46582p j = C46586t.m83063j(C118545d.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(m196805d(atVar));
        dVar.f121755d = m196804a(atVar);
        String num = Integer.toString(atVar.f328864b);
        C118522by b = C118522by.m196758b(atVar.f328865c);
        if (b == null) {
            b = C118522by.UNKNOWN;
        }
        dVar.f121758g = C58528ij.m90006F(C58528ij.m90013M("AGSAClassicTask", "AGSAClassicOneOff", num, b.name()));
        dVar.f121753b = fVar.mo9349a();
        dVar.f121754c = new C46573g(agVar.f328822b, TimeUnit.MILLISECONDS);
        m196806i(j.mo50561a());
        if (Math.random() < 1.0E-4d) {
            C90873ag agVar2 = new C90873ag(this.f329134b.mo17428b().mo50547c("AGSAClassicTask"), this.f329137e, "task-number-count", new C118538cm(this));
            agVar2.mo85224b(SQLiteConstraintException.class, new C118539cn(this));
            agVar2.mo85223a(C118540co.f329130a);
        }
    }

    /* renamed from: f */
    public final void mo103722f(C118474ai aiVar, C118485at atVar) {
        C46582p j = C46586t.m83063j(C118545d.class);
        C46570d dVar = (C46570d) j;
        dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g(aiVar.f328833b, TimeUnit.MILLISECONDS)));
        dVar.f121757f = C58833ax.m90834k(m196805d(atVar));
        dVar.f121755d = m196804a(atVar);
        String num = Integer.toString(atVar.f328864b);
        C118522by b = C118522by.m196758b(atVar.f328865c);
        if (b == null) {
            b = C118522by.UNKNOWN;
        }
        dVar.f121758g = C58528ij.m90006F(C58528ij.m90013M("AGSAClassicTask", "AGSAClassicPeriodic", num, b.name()));
        C4410f fVar = new C4410f();
        int a = C118470ae.m196676a(aiVar.f328834c);
        if (a == 0) {
            a = 1;
        }
        fVar.mo9351c(m196807j(a));
        fVar.f14072b = aiVar.f328835d;
        fVar.f14071a = aiVar.f328836e;
        dVar.f121753b = fVar.mo9349a();
        m196806i(j.mo50561a());
    }

    /* renamed from: g */
    public final void mo103723g(int i) {
        this.f329137e.mo28211k(this.f329134b.mo17428b().mo50547c(Integer.toString(i)), "UnscheduleBGtask", new C118541cp(this, i));
    }

    /* renamed from: h */
    public final boolean mo103724h() {
        return true;
    }
}
