package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.ai */
/* compiled from: PG */
public final class C111897ai implements C111917k {

    /* renamed from: a */
    public static final C121537f f310923a = C121537f.m200840b("Tapas/Prefetch/GlobalNgram", C121511c.f337208a);

    /* renamed from: b */
    public static final C59071e f310924b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.ai");

    /* renamed from: c */
    private final C58495hd f310925c;

    /* renamed from: d */
    private final int f310926d;

    /* renamed from: e */
    private final String f310927e;

    public C111897ai(C58495hd hdVar, int i, String str) {
        this.f310925c = hdVar;
        this.f310926d = i;
        this.f310927e = str;
    }

    /* renamed from: a */
    public final /* synthetic */ C58485gu mo99294a(C113408es esVar) {
        return C58485gu.m89845m();
    }

    /* renamed from: b */
    public final C58485gu mo99295b(String str) {
        String substring = str.substring(Math.max(0, str.length() - this.f310926d));
        for (int i = 0; i <= substring.length(); i++) {
            C58485gu guVar = (C58485gu) this.f310925c.getOrDefault(substring.substring(i).toLowerCase(Locale.getDefault()), C58485gu.m89845m());
            if (!guVar.isEmpty()) {
                return (C58485gu) Collection.EL.stream(guVar).map(new C111894af(str)).collect(C58370cn.f155946a);
            }
        }
        return C58485gu.m89845m();
    }

    /* renamed from: c */
    public final String mo99296c() {
        return this.f310927e;
    }
}
