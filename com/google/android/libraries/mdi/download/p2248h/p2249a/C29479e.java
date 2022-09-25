package com.google.android.libraries.mdi.download.p2248h.p2249a;

import android.location.Location;
import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4535g.C59127at;
import com.google.common.p4535g.C59226t;
import com.google.p4273bs.p4277b.p4278a.C56484x;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.h.a.e */
/* compiled from: PG */
public final /* synthetic */ class C29479e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f79903a;

    public /* synthetic */ C29479e(List list) {
        this.f79903a = list;
    }

    public final Object apply(Object obj) {
        List<C28706al> list = this.f79903a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            C29045l.m53930b("%s: Null location returned by Location Supplier", "WebrefLocalSlicingFilter");
            return C58485gu.m89845m();
        }
        Location location = (Location) axVar.mo56107c();
        C59127at b = C59127at.m91610b(location.getLatitude(), location.getLongitude());
        C58480gp e = C58485gu.m89837e();
        for (C28706al alVar : list) {
            Iterator it = C58869cf.m90938d(":").mo56151a().mo56153g(alVar.f77979b).iterator();
            if (it.hasNext()) {
                String str = (String) it.next();
                try {
                    e.mo55395g(C59226t.m91922M(str));
                } catch (NumberFormatException unused) {
                    C29045l.m53931c("%s: Invalid location slice id = %s", "WebrefLocalSlicingFilter", str);
                }
            }
        }
        C58485gu a = C56484x.m88201a(e.mo55394f(), b);
        C58480gp e2 = C58485gu.m89837e();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            e2.mo55395g(((C59226t) a.get(i)).mo56655A());
        }
        return e2.mo55394f();
    }
}
