package androidx.appsearch.builtintypes;

import androidx.appsearch.p047a.C0842g;
import androidx.appsearch.p047a.C0848m;
import androidx.appsearch.p047a.C0851p;
import androidx.appsearch.p047a.C0853r;
import androidx.appsearch.p047a.C0855t;
import androidx.appsearch.p047a.C0857v;
import androidx.appsearch.p047a.C0858w;

/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__AlarmInstance  reason: invalid class name */
/* compiled from: PG */
public class C$$__AppSearch__AlarmInstance implements C0855t {
    public static final String SCHEMA_NAME = "builtin:AlarmInstance";

    public AlarmInstance fromGenericDocument(C0858w wVar) {
        String str = wVar.f2847b;
        String h = wVar.mo3447h();
        long j = wVar.f2849d;
        long c = wVar.mo3442c();
        int a = wVar.mo3440a();
        String[] n = wVar.mo3454n("scheduledTime");
        String str2 = null;
        if (!(n == null || n.length == 0)) {
            str2 = n[0];
        }
        return new AlarmInstance(h, str, a, j, c, str2, (int) wVar.mo3441b("status"), wVar.mo3441b("snoozeDurationMillis"));
    }

    public C0853r getSchema() {
        C0842g gVar = new C0842g(SCHEMA_NAME);
        C0851p pVar = new C0851p("scheduledTime");
        pVar.mo3412b(2);
        pVar.mo3414d(0);
        pVar.mo3413c(0);
        gVar.mo3395b(pVar.mo3411a());
        C0848m mVar = new C0848m("status");
        mVar.mo3403b(2);
        gVar.mo3395b(mVar.mo3402a());
        C0848m mVar2 = new C0848m("snoozeDurationMillis");
        mVar2.mo3403b(2);
        gVar.mo3395b(mVar2.mo3402a());
        return gVar.mo3394a();
    }

    public String getSchemaName() {
        return SCHEMA_NAME;
    }

    public C0858w toGenericDocument(AlarmInstance alarmInstance) {
        C0857v vVar = new C0857v(alarmInstance.f2870a, alarmInstance.f2871b, SCHEMA_NAME);
        vVar.mo3434e(alarmInstance.f2873d);
        vVar.mo3431b(alarmInstance.f2874e);
        vVar.mo3430a(alarmInstance.f2872c);
        vVar.mo3439j("scheduledTime", alarmInstance.f2875f);
        vVar.mo3438i("status", (long) alarmInstance.f2876g);
        vVar.mo3438i("snoozeDurationMillis", alarmInstance.f2877h);
        return vVar.mo3432c();
    }
}
