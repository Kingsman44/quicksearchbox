package com.google.android.apps.gsa.smartspace.p7258b;

import com.google.android.apps.gsa.assistant.settings.features.d.ak;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.smartspace.p7259c.C92094j;
import com.google.assistant.p3861at.C49842b;
import com.google.assistant.p3861at.act;
import com.google.common.p4552o.ali;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61820m;
import com.google.knowledge.p4671b.C61826s;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.smartspace.b.aj */
/* compiled from: PG */
public final /* synthetic */ class C92047aj implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C92049al f256629a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f256630b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f256631c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f256632d;

    public /* synthetic */ C92047aj(C92049al alVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f256629a = alVar;
        this.f256630b = cxVar;
        this.f256631c = cxVar2;
        this.f256632d = cxVar3;
    }

    public final Object call() {
        C92049al alVar = this.f256629a;
        C60870cx cxVar = this.f256630b;
        C60870cx cxVar2 = this.f256631c;
        C60870cx cxVar3 = this.f256632d;
        act act = (act) C60856cj.m92909r(cxVar);
        ak akVar = (ak) C60856cj.m92909r(cxVar2);
        Optional optional = (Optional) C60856cj.m92909r(cxVar3);
        ArrayList arrayList = new ArrayList();
        C92049al.m151094d(arrayList, ali.CALENDAR_EVENTS, alVar.f256636c.l(akVar, C92094j.CALENDAR_EVENTS));
        C92049al.m151094d(arrayList, ali.REMINDERS, alVar.f256636c.l(akVar, C92094j.REMINDERS));
        C92049al.m151094d(arrayList, ali.AT_STORE, alVar.f256636c.l(akVar, C92094j.AT_STORE));
        C92049al.m151094d(arrayList, ali.HEADPHONES, alVar.f256636c.l(akVar, C92094j.HEADPHONES));
        C92049al.m151094d(arrayList, ali.LOCATION, alVar.f256636c.l(akVar, C92094j.LOCATION));
        C92049al.m151094d(arrayList, ali.UPCOMING_FLIGHTS, alVar.f256636c.l(akVar, C92094j.UPCOMING_FLIGHTS));
        C92049al.m151094d(arrayList, ali.TRAFFIC_INFORMATION, alVar.f256636c.l(akVar, C92094j.TRAFFIC_INFORMATION));
        C92049al.m151094d(arrayList, ali.WEATHER_ALERT, alVar.f256636c.l(akVar, C92094j.WEATHER_ALERT));
        C92049al.m151094d(arrayList, ali.WEATHER, alVar.f256636c.l(akVar, C92094j.WEATHER));
        C92049al.m151094d(arrayList, ali.UPCOMING_BUNDLE, alVar.f256636c.l(akVar, C92094j.UPCOMING_BUNDLE));
        C92049al.m151094d(arrayList, ali.AMBIENT_MODE, alVar.f256636c.j());
        C61820m c = ((C85664bo) alVar.f256634a.mo27525b()).mo79191c();
        ali ali = ali.PROACTIVE_PERSONAL_RESULTS;
        C61826s a = C61826s.m94481a(c.f167053w);
        if (a == null) {
            a = C61826s.OPA_OPT_IN_STATUS_UNKNOWN;
        }
        boolean z = true;
        C92049al.m151094d(arrayList, ali, a == C61826s.OPA_OPT_IN_STATUS_ENABLED);
        C92049al.m151094d(arrayList, ali.WEB_AND_APP_ACTIVITY, ((C85664bo) alVar.f256634a.mo27525b()).mo79197l(C85662bm.WEB_HISTORY));
        C92049al.m151094d(arrayList, ali.GOOGLE_LOCATION_HISTORY, ((C85664bo) alVar.f256634a.mo27525b()).mo79197l(C85662bm.LOCATION_HISTORY_AND_REPORTING));
        C92049al.m151094d(arrayList, ali.WORK_PROFILE, alVar.f256638e.f256848d.mo86766v());
        C92049al.m151094d(arrayList, ali.ALARM, alVar.f256638e.mo86771k());
        C92049al.m151094d(arrayList, ali.AT_A_GLANCE, alVar.f256638e.f256848d.mo86755k());
        if (optional.isPresent()) {
            C92049al.m151094d(arrayList, ali.ASSISTANT_PERSONAL_RESULTS, ((Boolean) optional.get()).booleanValue());
        }
        C92049al.m151094d(arrayList, ali.AGSA_LOCATION_ACCESS, alVar.f256635b.mo79514e(false));
        if (act != null) {
            ali ali2 = ali.ASSISTANT_HOME_ADDRESS;
            C49842b bVar = act.f128899f;
            if (bVar == null) {
                bVar = C49842b.f129519l;
            }
            if ((bVar.f129521a & 8) == 0) {
                z = false;
            }
            C92049al.m151094d(arrayList, ali2, z);
        }
        C92049al.m151094d(arrayList, ali.LOCKSCREEN_PERSONAL_RESULTS, alVar.f256637d.mo83835A());
        return arrayList;
    }
}
