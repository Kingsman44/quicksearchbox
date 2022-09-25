package androidx.appsearch.builtintypes;

import androidx.appsearch.p047a.C0842g;
import androidx.appsearch.p047a.C0845j;
import androidx.appsearch.p047a.C0848m;
import androidx.appsearch.p047a.C0851p;
import androidx.appsearch.p047a.C0853r;
import androidx.appsearch.p047a.C0855t;
import androidx.appsearch.p047a.C0857v;
import androidx.appsearch.p047a.C0858w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__Stopwatch  reason: invalid class name */
/* compiled from: PG */
public class C$$__AppSearch__Stopwatch implements C0855t {
    public static final String SCHEMA_NAME = "builtin:Stopwatch";

    public Stopwatch fromGenericDocument(C0858w wVar) {
        int i;
        ArrayList arrayList;
        int i2;
        C0858w wVar2 = wVar;
        String str = wVar2.f2847b;
        String h = wVar.mo3447h();
        long j = wVar2.f2849d;
        long c = wVar.mo3442c();
        int a = wVar.mo3440a();
        String[] n = wVar2.mo3454n("name");
        String str2 = (n == null || n.length == 0) ? null : n[0];
        long b = wVar2.mo3441b("baseTimeMillis");
        long b2 = wVar2.mo3441b("baseTimeMillisInElapsedRealtime");
        int b3 = (int) wVar2.mo3441b("bootCount");
        int b4 = (int) wVar2.mo3441b("status");
        long b5 = wVar2.mo3441b("accumulatedDurationMillis");
        C0858w[] m = wVar2.mo3453m("laps");
        if (m != null) {
            i = b4;
            ArrayList arrayList2 = new ArrayList(m.length);
            i2 = b3;
            int i3 = 0;
            while (i3 < m.length) {
                arrayList2.add((StopwatchLap) m[i3].mo3446g(StopwatchLap.class));
                i3++;
                m = m;
            }
            arrayList = arrayList2;
        } else {
            i = b4;
            i2 = b3;
            arrayList = null;
        }
        return new Stopwatch(h, str, a, j, c, str2, b, b2, i2, i, b5, arrayList);
    }

    public C0853r getSchema() {
        C0842g gVar = new C0842g(SCHEMA_NAME);
        C0851p pVar = new C0851p("name");
        pVar.mo3412b(2);
        pVar.mo3414d(1);
        pVar.mo3413c(2);
        gVar.mo3395b(pVar.mo3411a());
        C0848m mVar = new C0848m("baseTimeMillis");
        mVar.mo3403b(2);
        gVar.mo3395b(mVar.mo3402a());
        C0848m mVar2 = new C0848m("baseTimeMillisInElapsedRealtime");
        mVar2.mo3403b(2);
        gVar.mo3395b(mVar2.mo3402a());
        C0848m mVar3 = new C0848m("bootCount");
        mVar3.mo3403b(2);
        gVar.mo3395b(mVar3.mo3402a());
        C0848m mVar4 = new C0848m("status");
        mVar4.mo3403b(2);
        gVar.mo3395b(mVar4.mo3402a());
        C0848m mVar5 = new C0848m("accumulatedDurationMillis");
        mVar5.mo3403b(2);
        gVar.mo3395b(mVar5.mo3402a());
        C0845j jVar = new C0845j("laps", C$$__AppSearch__StopwatchLap.SCHEMA_NAME);
        jVar.mo3399b(1);
        gVar.mo3395b(jVar.mo3398a());
        return gVar.mo3394a();
    }

    public String getSchemaName() {
        return SCHEMA_NAME;
    }

    public C0858w toGenericDocument(Stopwatch stopwatch) {
        C0857v vVar = new C0857v(stopwatch.f2878a, stopwatch.f2879b, SCHEMA_NAME);
        vVar.mo3434e(stopwatch.f2881d);
        vVar.mo3431b(stopwatch.f2882e);
        vVar.mo3430a(stopwatch.f2880c);
        String str = stopwatch.f2883f;
        int i = 0;
        if (str != null) {
            vVar.mo3439j("name", str);
        }
        vVar.mo3438i("baseTimeMillis", stopwatch.f2884g);
        vVar.mo3438i("baseTimeMillisInElapsedRealtime", stopwatch.f2885h);
        vVar.mo3438i("bootCount", (long) stopwatch.f2886i);
        vVar.mo3438i("status", (long) stopwatch.f2887j);
        vVar.mo3438i("accumulatedDurationMillis", stopwatch.f2888k);
        List<StopwatchLap> list = stopwatch.f2889l;
        C0858w[] wVarArr = new C0858w[list.size()];
        for (StopwatchLap d : list) {
            wVarArr[i] = C0858w.m2731d(d);
            i++;
        }
        vVar.mo3437h("laps", wVarArr);
        return vVar.mo3432c();
    }
}
