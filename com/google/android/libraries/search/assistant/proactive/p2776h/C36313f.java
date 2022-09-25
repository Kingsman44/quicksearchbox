package com.google.android.libraries.search.assistant.proactive.p2776h;

import android.app.Application;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.search.assistant.proactive.h.f */
/* compiled from: PG */
public final class C36313f {

    /* renamed from: a */
    public final C19576m f94820a;

    /* renamed from: b */
    public final C58881cr f94821b = C58886cw.m90973a(new C36308a(this));

    /* renamed from: c */
    public final C58881cr f94822c = C58886cw.m90973a(new C36309b(this));

    /* renamed from: d */
    public final C58881cr f94823d = C58886cw.m90973a(new C36310c(this));

    /* renamed from: e */
    public final C58881cr f94824e = C58886cw.m90973a(new C36311d(this));

    /* renamed from: f */
    private final C19575l f94825f;

    public C36313f(ScheduledExecutorService scheduledExecutorService, C19566c cVar, Application application) {
        C58886cw.m90973a(new C36312e(this));
        C19576m e = C19576m.m37335e("opa_proactive_agsa");
        this.f94820a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f94825f = C19579p.m37339c(cVar, scheduledExecutorService, e, application);
            return;
        }
        this.f94825f = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }
}
