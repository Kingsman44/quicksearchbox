package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146025e;
import com.google.android.libraries.places.api.p2437b.C31847c;
import com.google.android.libraries.places.api.p2437b.C31864t;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.n */
/* compiled from: PG */
public final /* synthetic */ class C31806n implements C146025e {
    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        C31795c cVar = (C31795c) abVar.mo122488g();
        String str = cVar.status;
        int a = C31823v.m59184a(str);
        if (!C31864t.m59274b(a)) {
            C31813u uVar = cVar.result;
            String[] strArr = cVar.htmlAttributions;
            return new C31847c(C31811s.m59179c(uVar, strArr != null ? C58485gu.m89844l(strArr) : null));
        }
        throw new C143842n(new Status(1, a, C31823v.m59185b(str, cVar.errorMessage), (PendingIntent) null, (ConnectionResult) null));
    }
}
