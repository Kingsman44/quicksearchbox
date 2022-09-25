package com.google.android.apps.gsa.assistant.settings.devices.p520b;

import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.search.C73730g;
import com.google.android.apps.gsa.assistant.settings.search.a;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58831av;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58800sl;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.b.b */
/* compiled from: PG */
public final class C9552b {
    /* renamed from: a */
    public static Set m24215a(o oVar) {
        C58526ih ihVar = new C58526ih();
        C58485gu d = oVar.d();
        int size = d.size();
        for (int i = 0; i < size; i++) {
            C49875cf cfVar = (C49875cf) d.get(i);
            if (cfVar != C49875cf.NEXUS) {
                C58800sl lA = oVar.mo65237f(cfVar, (C49893cx) null, (act) null).iterator();
                while (lA.hasNext()) {
                    Pair pair = (Pair) lA.next();
                    String str = (String) C58831av.m90830c((String) pair.first, BuildConfig.FLAVOR);
                    int b = oVar.b(cfVar, str);
                    if (!str.isEmpty() && cfVar != C49875cf.UNKNOWN) {
                        String str2 = (String) pair.second;
                        a i2 = C73730g.m108251i();
                        a aVar = i2;
                        aVar.e = "device_info";
                        i2.f(str2);
                        aVar.c = oVar.g(str2, cfVar);
                        i2.c(b);
                        aVar.d = C58833ax.m90834k(str);
                        i2.b(cfVar.f129621v);
                        i2.g();
                        ihVar.mo55373c(i2.a());
                    }
                }
            }
        }
        return ihVar.mo55486f();
    }
}
