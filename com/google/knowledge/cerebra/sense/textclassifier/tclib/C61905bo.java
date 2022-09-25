package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.content.Context;
import com.google.android.gms.mobstore.C145559g;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3305a.C42715b;
import com.google.android.libraries.storage.p3304a.p3305a.C42716c;
import com.google.android.libraries.storage.p3304a.p3305a.C42735v;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.bo */
/* compiled from: PG */
public final class C61905bo {

    /* renamed from: a */
    private static C42813k f167381a;

    /* renamed from: a */
    public static synchronized C42813k m94564a(Context context) {
        C42813k kVar;
        synchronized (C61905bo.class) {
            if (f167381a == null) {
                C42715b bVar = new C42715b(context);
                bVar.f111957b = new C145559g(context);
                f167381a = new C42813k(C58485gu.m89847o(new C42716c(bVar), new C42735v()));
            }
            kVar = f167381a;
        }
        return kVar;
    }
}
