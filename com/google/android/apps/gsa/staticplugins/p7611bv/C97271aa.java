package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.apps.gsa.search.core.p6519al.p6586bf.C84827a;
import com.google.android.apps.gsa.search.core.p6519al.p6586bf.C84837d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.aa */
/* compiled from: PG */
public final /* synthetic */ class C97271aa implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f271679a;

    public /* synthetic */ C97271aa(List list) {
        this.f271679a = list;
    }

    public final Object call() {
        long j = -1;
        int i = 1;
        for (C60870cx cxVar : this.f271679a) {
            C58833ax a = ((C84837d) C90877ak.m148472f(cxVar)).mo78514a();
            int b = ((C84837d) C90877ak.m148472f(cxVar)).mo78515b();
            if (!a.mo56113h()) {
                return (C84837d) C90877ak.m148472f(cxVar);
            }
            Long l = (Long) a.mo56107c();
            if (l.longValue() < 0) {
                return (C84837d) C90877ak.m148472f(cxVar);
            }
            if (l.longValue() > j) {
                j = l.longValue();
                i = b;
            }
        }
        return new C84827a(i, C58833ax.m90834k(Long.valueOf(j)));
    }
}
