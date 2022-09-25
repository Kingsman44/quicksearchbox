package androidx.appsearch.builtintypes;

import androidx.appsearch.p047a.C0840e;
import androidx.appsearch.p047a.C0842g;
import androidx.appsearch.p047a.C0848m;
import androidx.appsearch.p047a.C0851p;
import androidx.appsearch.p047a.C0853r;
import androidx.appsearch.p047a.C0855t;
import androidx.appsearch.p047a.C0857v;
import androidx.appsearch.p047a.C0858w;

/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__Timer  reason: invalid class name */
/* compiled from: PG */
public class C$$__AppSearch__Timer implements C0855t {
    public static final String SCHEMA_NAME = "builtin:Timer";

    public Timer fromGenericDocument(C0858w wVar) {
        int i;
        String str;
        C0858w wVar2 = wVar;
        String str2 = wVar2.f2847b;
        String h = wVar.mo3447h();
        long j = wVar2.f2849d;
        long c = wVar.mo3442c();
        int a = wVar.mo3440a();
        String[] n = wVar2.mo3454n("name");
        String str3 = (n == null || n.length == 0) ? null : n[0];
        long b = wVar2.mo3441b("durationMillis");
        long b2 = wVar2.mo3441b("originalDurationMillis");
        long b3 = wVar2.mo3441b("startTimeMillis");
        long b4 = wVar2.mo3441b("baseTimeMillis");
        long b5 = wVar2.mo3441b("baseTimeMillisInElapsedRealtime");
        int b6 = (int) wVar2.mo3441b("bootCount");
        long b7 = wVar2.mo3441b("remainingDurationMillis");
        String[] n2 = wVar2.mo3454n("ringtone");
        if (n2 != null) {
            i = b6;
            if (n2.length != 0) {
                str = n2[0];
                return new Timer(h, str2, a, j, c, str3, b, b2, b3, b4, b5, i, b7, str, (int) wVar2.mo3441b("status"), wVar2.mo3451k("shouldVibrate"));
            }
        } else {
            i = b6;
        }
        str = null;
        return new Timer(h, str2, a, j, c, str3, b, b2, b3, b4, b5, i, b7, str, (int) wVar2.mo3441b("status"), wVar2.mo3451k("shouldVibrate"));
    }

    public C0853r getSchema() {
        C0842g gVar = new C0842g(SCHEMA_NAME);
        C0851p pVar = new C0851p("name");
        pVar.mo3412b(2);
        pVar.mo3414d(1);
        pVar.mo3413c(2);
        gVar.mo3395b(pVar.mo3411a());
        C0848m mVar = new C0848m("durationMillis");
        mVar.mo3403b(2);
        gVar.mo3395b(mVar.mo3402a());
        C0848m mVar2 = new C0848m("originalDurationMillis");
        mVar2.mo3403b(2);
        gVar.mo3395b(mVar2.mo3402a());
        C0848m mVar3 = new C0848m("startTimeMillis");
        mVar3.mo3403b(2);
        gVar.mo3395b(mVar3.mo3402a());
        C0848m mVar4 = new C0848m("baseTimeMillis");
        mVar4.mo3403b(2);
        gVar.mo3395b(mVar4.mo3402a());
        C0848m mVar5 = new C0848m("baseTimeMillisInElapsedRealtime");
        mVar5.mo3403b(2);
        gVar.mo3395b(mVar5.mo3402a());
        C0848m mVar6 = new C0848m("bootCount");
        mVar6.mo3403b(2);
        gVar.mo3395b(mVar6.mo3402a());
        C0848m mVar7 = new C0848m("remainingDurationMillis");
        mVar7.mo3403b(2);
        gVar.mo3395b(mVar7.mo3402a());
        C0851p pVar2 = new C0851p("ringtone");
        pVar2.mo3412b(2);
        pVar2.mo3414d(0);
        pVar2.mo3413c(0);
        gVar.mo3395b(pVar2.mo3411a());
        C0848m mVar8 = new C0848m("status");
        mVar8.mo3403b(2);
        gVar.mo3395b(mVar8.mo3402a());
        C0840e eVar = new C0840e("shouldVibrate");
        eVar.mo3393b();
        gVar.mo3395b(eVar.mo3392a());
        return gVar.mo3394a();
    }

    public String getSchemaName() {
        return SCHEMA_NAME;
    }

    public C0858w toGenericDocument(Timer timer) {
        C0857v vVar = new C0857v(timer.f2908a, timer.f2909b, SCHEMA_NAME);
        vVar.mo3434e(timer.f2911d);
        vVar.mo3431b(timer.f2912e);
        vVar.mo3430a(timer.f2910c);
        String str = timer.f2913f;
        if (str != null) {
            vVar.mo3439j("name", str);
        }
        vVar.mo3438i("durationMillis", timer.f2914g);
        vVar.mo3438i("originalDurationMillis", timer.f2915h);
        vVar.mo3438i("startTimeMillis", timer.f2916i);
        vVar.mo3438i("baseTimeMillis", timer.f2917j);
        vVar.mo3438i("baseTimeMillisInElapsedRealtime", timer.f2918k);
        vVar.mo3438i("bootCount", (long) timer.f2919l);
        vVar.mo3438i("remainingDurationMillis", timer.f2920m);
        String str2 = timer.f2921n;
        if (str2 != null) {
            vVar.mo3439j("ringtone", str2);
        }
        vVar.mo3438i("status", (long) timer.f2922o);
        vVar.mo3435f("shouldVibrate", timer.f2923p);
        return vVar.mo3432c();
    }
}
