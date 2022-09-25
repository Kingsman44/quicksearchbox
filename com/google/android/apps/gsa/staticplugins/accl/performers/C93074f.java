package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89067w;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52389py;
import com.google.assistant.p3897e.p3921j.C52390pz;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.f */
/* compiled from: PG */
public final class C93074f extends C22538o {

    /* renamed from: a */
    private final C86124t f259622a;

    /* renamed from: b */
    private final SharedPreferences f259623b;

    /* renamed from: c */
    private final C68214a f259624c;

    /* renamed from: d */
    private final C68214a f259625d;

    public C93074f(C86124t tVar, SharedPreferences sharedPreferences, C68214a aVar, C68214a aVar2) {
        this.f259622a = tVar;
        this.f259623b = sharedPreferences;
        this.f259624c = aVar;
        this.f259625d = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C58485gu guVar;
        int i;
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C89067w wVar = (C89067w) this.f259624c.mo27525b();
        String t = ((C85929cw) this.f259625d.mo27525b()).mo79578t();
        ArrayList arrayList = new ArrayList();
        for (C52389py pyVar : ((C52390pz) m41992m(dwVar, "credential_args", C52390pz.f137470c.getParserForType())).f137473b) {
            if (C58890d.m90990e(pyVar.f137467a, "Set-Cookie")) {
                arrayList.add(pyVar.f137468b);
            }
        }
        if (!arrayList.isEmpty()) {
            int a = (int) this.f259622a.mo79743a(C90014bt.f247402gV);
            if (a > 0 && (i = this.f259623b.getInt("opa_android_count_of_clearing_buggy_zwieback_cookies", 0)) < a) {
                this.f259623b.edit().putInt("opa_android_count_of_clearing_buggy_zwieback_cookies", i + 1).apply();
                C58480gp e = C58485gu.m89837e();
                e.mo55395g("NID=REDACT; expires=Thursday, 01-Jan-1970 00:00:01 GMT");
                e.mo55396h(arrayList);
                guVar = e.mo55394f();
            } else {
                guVar = C58485gu.m89842j(arrayList);
            }
            wVar.mo83052e(t, guVar);
            return f62144n;
        }
        throw new C22534k();
    }
}
