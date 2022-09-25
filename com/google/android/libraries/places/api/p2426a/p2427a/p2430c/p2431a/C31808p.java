package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146025e;
import com.google.android.libraries.places.api.model.AutoValue_PlaceLikelihood;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.p2437b.C31853i;
import com.google.android.libraries.places.api.p2437b.C31864t;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58714pg;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.p */
/* compiled from: PG */
public final /* synthetic */ class C31808p implements C146025e {
    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        C31800h hVar = (C31800h) abVar.mo122488g();
        String str = hVar.status;
        int a = C31823v.m59184a(str);
        if (!C31864t.m59274b(a)) {
            ArrayList arrayList = new ArrayList();
            C31812t[] tVarArr = hVar.predictions;
            if (tVarArr != null) {
                int length = tVarArr.length;
                int i = 0;
                while (i < length) {
                    C31812t tVar = tVarArr[i];
                    C31813u uVar = tVar.place;
                    if (uVar != null) {
                        Double d = tVar.likelihood;
                        if (d != null) {
                            String[] strArr = hVar.htmlAttributions;
                            Place c = C31811s.m59179c(uVar, strArr != null ? C58485gu.m89844l(strArr) : null);
                            double doubleValue = d.doubleValue();
                            Double valueOf = Double.valueOf(C59203do.f157270a);
                            Double valueOf2 = Double.valueOf(1.0d);
                            C58714pg g = C58714pg.m90504g(valueOf, valueOf2);
                            Double valueOf3 = Double.valueOf(doubleValue);
                            C58838bb.m90880o(g.mo5941a(valueOf3), "Likelihood must not be out-of-range: %s to %s, but was: %s.", valueOf, valueOf2, valueOf3);
                            arrayList.add(new AutoValue_PlaceLikelihood(c, doubleValue));
                            i++;
                        } else {
                            throw new C143842n(new Status(1, 8, "Unexpected server error: PlaceLikelihood returned without a likelihood value", (PendingIntent) null, (ConnectionResult) null));
                        }
                    } else {
                        throw new C143842n(new Status(1, 8, "Unexpected server error: PlaceLikelihood returned without a Place value", (PendingIntent) null, (ConnectionResult) null));
                    }
                }
            }
            return new C31853i(C58485gu.m89842j(arrayList));
        }
        throw new C143842n(new Status(1, a, C31823v.m59185b(str, hVar.errorMessage), (PendingIntent) null, (ConnectionResult) null));
    }
}
