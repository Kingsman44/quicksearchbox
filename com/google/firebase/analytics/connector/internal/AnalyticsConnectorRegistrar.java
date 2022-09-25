package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.measurement.api.C145178a;
import com.google.android.gms.measurement.api.internal.C145192am;
import com.google.firebase.C61114a;
import com.google.firebase.C61204g;
import com.google.firebase.analytics.connector.C61117a;
import com.google.firebase.analytics.connector.C61118b;
import com.google.firebase.analytics.connector.C61119c;
import com.google.firebase.analytics.connector.C61120d;
import com.google.firebase.components.C61150d;
import com.google.firebase.components.C61151e;
import com.google.firebase.components.C61152f;
import com.google.firebase.components.C61156j;
import com.google.firebase.components.C61166t;
import com.google.firebase.p4609b.C61125c;
import com.google.firebase.p4612e.C61193a;
import com.google.firebase.p4613f.C61202h;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class AnalyticsConnectorRegistrar implements C61156j {
    static /* synthetic */ C61117a lambda$getComponents$0(C61152f fVar) {
        C61204g gVar = (C61204g) fVar.mo57710a(C61204g.class);
        Context context = (Context) fVar.mo57710a(Context.class);
        C61125c cVar = (C61125c) fVar.mo57710a(C61125c.class);
        C143919bh.m233958a(gVar);
        C143919bh.m233958a(context);
        C143919bh.m233958a(cVar);
        C143919bh.m233958a(context.getApplicationContext());
        if (C61120d.f165441a == null) {
            synchronized (C61120d.class) {
                if (C61120d.f165441a == null) {
                    Bundle bundle = new Bundle(1);
                    if (gVar.mo57772h()) {
                        cVar.mo57689a(C61114a.class, C61118b.f165439a, C61119c.f165440a);
                        gVar.mo57770f();
                        bundle.putBoolean("dataCollectionDefaultEnabled", ((C61193a) gVar.f165560h.mo57687a()).mo57757a());
                    }
                    C145178a aVar = C145192am.m235849c(context, bundle).f392454c;
                    C61120d.f165441a = new C61120d();
                }
            }
        }
        return C61120d.f165441a;
    }

    public List getComponents() {
        C61150d a = C61151e.m93514a(C61117a.class);
        a.mo57716b(C61166t.m93534b(C61204g.class));
        a.mo57716b(C61166t.m93534b(Context.class));
        a.mo57716b(C61166t.m93534b(C61125c.class));
        a.mo57717c(C61121a.f165442a);
        a.mo57718d(2);
        return Arrays.asList(new C61151e[]{a.mo57715a(), C61202h.m93574a("fire-analytics", "21.1.2")});
    }
}
