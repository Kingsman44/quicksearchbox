package androidx.appsearch.builtintypes;

import androidx.appsearch.p047a.C0842g;
import androidx.appsearch.p047a.C0848m;
import androidx.appsearch.p047a.C0853r;
import androidx.appsearch.p047a.C0855t;
import androidx.appsearch.p047a.C0857v;
import androidx.appsearch.p047a.C0858w;

/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__StopwatchLap  reason: invalid class name */
/* compiled from: PG */
public class C$$__AppSearch__StopwatchLap implements C0855t {
    public static final String SCHEMA_NAME = "builtin:StopwatchLap";

    public StopwatchLap fromGenericDocument(C0858w wVar) {
        String str = wVar.f2847b;
        String h = wVar.mo3447h();
        long j = wVar.f2849d;
        long c = wVar.mo3442c();
        int a = wVar.mo3440a();
        long b = wVar.mo3441b("lapNumber");
        return new StopwatchLap(h, str, a, j, c, (int) b, wVar.mo3441b("lapDurationMillis"), wVar.mo3441b("accumulatedLapDurationMillis"));
    }

    public C0853r getSchema() {
        C0842g gVar = new C0842g(SCHEMA_NAME);
        C0848m mVar = new C0848m("lapNumber");
        mVar.mo3403b(2);
        gVar.mo3395b(mVar.mo3402a());
        C0848m mVar2 = new C0848m("lapDurationMillis");
        mVar2.mo3403b(2);
        gVar.mo3395b(mVar2.mo3402a());
        C0848m mVar3 = new C0848m("accumulatedLapDurationMillis");
        mVar3.mo3403b(2);
        gVar.mo3395b(mVar3.mo3402a());
        return gVar.mo3394a();
    }

    public String getSchemaName() {
        return SCHEMA_NAME;
    }

    public C0858w toGenericDocument(StopwatchLap stopwatchLap) {
        C0857v vVar = new C0857v(stopwatchLap.f2890a, stopwatchLap.f2891b, SCHEMA_NAME);
        vVar.mo3434e(stopwatchLap.f2893d);
        vVar.mo3431b(stopwatchLap.f2894e);
        vVar.mo3430a(stopwatchLap.f2892c);
        vVar.mo3438i("lapNumber", (long) stopwatchLap.f2895f);
        vVar.mo3438i("lapDurationMillis", stopwatchLap.f2896g);
        vVar.mo3438i("accumulatedLapDurationMillis", stopwatchLap.f2897h);
        return vVar.mo3432c();
    }
}
