package com.google.android.apps.gsa.staticplugins.fedass.p7939a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.p4476cf.p4477a.C58059a;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63259d;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63261f;
import com.google.speech.p5228m.C67333cj;
import java.util.concurrent.TimeUnit;
import org.p5633c.p5634a.C72299w;
import org.p5633c.p5634a.p5639e.C72267x;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C100722ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C91006f f281608a;

    public /* synthetic */ C100722ae(C91006f fVar) {
        this.f281608a = fVar;
    }

    public final Object apply(Object obj) {
        C91006f fVar = this.f281608a;
        C58485gu guVar = (C58485gu) obj;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            fVar.mo85281e((Object) null);
            fVar.mo85291r("Sheldon Speech Learning Scheduling Metrics");
            C63259d dVar = ((C67333cj) guVar.get(i)).f183019b;
            if (dVar == null) {
                dVar = C63259d.f170934n;
            }
            C63261f fVar2 = dVar.f170937b;
            if (fVar2 == null) {
                fVar2 = C63261f.f170949g;
            }
            C100733ap.m166929a(fVar2, fVar);
            fVar.mo85279c("Opted In").mo85276a(C90752i.m148228b(Boolean.valueOf(dVar.f170939d)));
            fVar.mo85279c("Is Eligible").mo85276a(C90752i.m148228b(Boolean.valueOf(dVar.f170938c)));
            fVar.mo85279c("Flag Enabled").mo85276a(C90752i.m148228b(Boolean.valueOf(dVar.f170940e)));
            fVar.mo85279c("Device Requirement Met").mo85276a(C90752i.m148228b(Boolean.valueOf(dVar.f170941f)));
            fVar.mo85279c("Locale Supported").mo85276a(C90752i.m148228b(Boolean.valueOf(dVar.f170942g)));
            fVar.mo85279c("Language Pack Available").mo85276a(C90752i.m148228b(Boolean.valueOf(dVar.f170943h)));
            fVar.mo85279c("Local Compute Plan Available").mo85276a(C90752i.m148228b(Boolean.valueOf(dVar.f170944i)));
            fVar.mo85279c("Data Available").mo85276a(C90752i.m148228b(Boolean.valueOf(dVar.f170945j)));
            fVar.mo85279c("Schedule Succeeded").mo85276a(C90752i.m148228b(Boolean.valueOf(dVar.f170946k)));
            fVar.mo85279c("Schedule Timestamp").mo85276a(C90752i.m148229c(C72267x.f192324e.mo63597c(new C72299w(C58059a.m88814a(TimeUnit.MILLISECONDS.toMicros(dVar.f170947l))))));
            fVar.mo85279c("Time since last schedule").mo85276a(C90752i.m148230d(Integer.valueOf(dVar.f170948m)));
        }
        return null;
    }
}
