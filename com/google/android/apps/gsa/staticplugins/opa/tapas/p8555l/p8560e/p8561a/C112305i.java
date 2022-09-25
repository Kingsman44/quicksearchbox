package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a;

import com.google.research.p5181a.p5183b.p5184a.C66307h;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a.i */
/* compiled from: PG */
public final class C112305i {

    /* renamed from: a */
    public static final long f311658a = TimeUnit.DAYS.toMillis(7);

    /* renamed from: b */
    public final long f311659b = f311658a;

    /* renamed from: c */
    public final Map f311660c = new HashMap();

    /* renamed from: a */
    public static int m186165a(C66376a aVar) {
        List c = aVar.mo59466i().mo59480c();
        for (int i = 0; i < c.size(); i++) {
            String k = ((C66307h) c.get(i)).mo59491k();
            if (aVar.mo59460c() != null && k != null && aVar.mo59460c().equals(k)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m186166b(C66376a aVar) {
        if (aVar.mo59463f() == 6 && aVar.mo59466i() != null) {
            aVar.mo59466i().mo59480c();
            if (aVar.mo59466i().mo59480c().isEmpty() || aVar.mo59466i().mo59480c().get(0) == null) {
                return false;
            }
            return true;
        }
        return false;
    }
}
