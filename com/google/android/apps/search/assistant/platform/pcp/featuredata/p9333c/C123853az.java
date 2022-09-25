package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import android.provider.CalendarContract;
import androidx.work.C4410f;
import androidx.work.C4412h;
import androidx.work.C4631l;
import androidx.work.C4634o;
import androidx.work.WorkerParameters;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58844bh;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4543n.p4546c.C59401i;
import com.google.common.p4543n.p4546c.C59407o;
import com.google.common.p4543n.p4546c.C59417y;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import java.util.HashMap;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.az */
/* compiled from: PG */
public final class C123853az implements C46575i {

    /* renamed from: f */
    public static final /* synthetic */ int f342128f = 0;

    /* renamed from: g */
    private static final Duration f342129g = Duration.ofSeconds(10);

    /* renamed from: a */
    public final C123878w f342130a;

    /* renamed from: b */
    public final C60887da f342131b;

    /* renamed from: c */
    public final C46578l f342132c;

    /* renamed from: d */
    public final C124100bz f342133d;

    /* renamed from: e */
    public final C58974d f342134e;

    /* renamed from: h */
    private final C60888db f342135h;

    public C123853az(C123878w wVar, C60887da daVar, C46578l lVar, C60888db dbVar, C124100bz bzVar, C130603a aVar) {
        this.f342130a = wVar;
        this.f342131b = daVar;
        this.f342132c = lVar;
        this.f342135h = dbVar;
        this.f342133d = bzVar;
        this.f342134e = aVar.mo109739a("PCP.LocalCalendarUpdate");
    }

    /* renamed from: a */
    public final C60870cx mo106145a() {
        C60870cx d = this.f342132c.mo50548d("Local_Calendar_Update_Worker_KEY_ONE");
        C60870cx d2 = this.f342132c.mo50548d("Local_Calendar_Update_Worker_KEY_TWO");
        return C47638k.m84753d(d, d2).mo51520a(new C123846as(d, d2), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        ((C58970a) ((C58970a) this.f342134e.mo56224b()).mo56372aa(35294)).mo56386p("LocalCalendarUpdateWorker#startWork");
        this.f342133d.f342762a.mo41704s("PCP_CALENDAR_REFRESH_TRIGGERED_BY_CONTENT_PROVIDER_UPDATE");
        String b = workerParameters.f13989b.mo9567b("UNIQUENESS_KEY_TAG");
        b.getClass();
        String str = "Local_Calendar_Update_Worker_KEY_ONE";
        if (true == b.equals(str)) {
            str = "Local_Calendar_Update_Worker_KEY_TWO";
        }
        return C47633f.m84733g(this.f342130a.mo106151a()).mo51516i(new C123842ao(this, str), this.f342131b).mo51514f(Exception.class, new C123843ap(this, str), this.f342131b);
    }

    /* renamed from: c */
    public final C60870cx mo106146c() {
        ((C58970a) ((C58970a) this.f342134e.mo56224b()).mo56372aa(35293)).mo56386p("Scheduling the PCP local calendar update worker.");
        return C47633f.m84733g(mo106145a()).mo51516i(new C123850aw(this), this.f342131b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C60870cx mo106147d(String str) {
        C4410f fVar = new C4410f();
        fVar.mo9350b(CalendarContract.Events.CONTENT_URI, true);
        fVar.mo9352d(f342129g);
        C4412h a = fVar.mo9349a();
        C46582p j = C46586t.m83063j(C123853az.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h(str, C4634o.KEEP));
        dVar.f121753b = a;
        HashMap hashMap = new HashMap();
        hashMap.put("UNIQUENESS_KEY_TAG", str);
        dVar.f121755d = C4631l.m13030a(hashMap);
        C59417y e = C59417y.m92319e(new C123849av(this, j.mo50561a()), new C59401i(C59407o.m92308d(Duration.ofSeconds(1)), 2.0d, 5), C58844bh.ALWAYS_TRUE, this.f342135h);
        C60856cj.m92911t(e, C47810es.m84974n(new C123852ay(this, str)), C60826bg.f164896a);
        return e;
    }
}
