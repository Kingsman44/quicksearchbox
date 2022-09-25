package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutoValue_AutocompletePrediction_SubstringMatch;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31788a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.f */
/* compiled from: PG */
public final class C31798f {
    /* renamed from: a */
    public static List m59163a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            C31788a.C31790b bVar = (C31788a.C31790b) G.next();
            Status status = new Status(1, 8, "Unexpected server error: Place ID not provided for an autocomplete prediction result", (PendingIntent) null, (ConnectionResult) null);
            if (bVar != null) {
                Integer num = bVar.offset;
                Integer num2 = bVar.length;
                if (num == null || num2 == null) {
                    throw new C143842n(status);
                }
                arrayList.add(new AutoValue_AutocompletePrediction_SubstringMatch(num.intValue(), num2.intValue()));
            } else {
                throw new C143842n(status);
            }
        }
        return arrayList;
    }
}
