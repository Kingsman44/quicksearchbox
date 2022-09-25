package com.google.android.libraries.assistant.pcp.p1575l.p1577b;

import android.app.Application;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.assistant.pcp.l.b.d */
/* compiled from: PG */
public final class C18955d {

    /* renamed from: a */
    public final C19576m f53273a;

    /* renamed from: b */
    public final C58881cr f53274b = C58886cw.m90973a(new C18952a(this));

    /* renamed from: c */
    public final C58881cr f53275c = C58886cw.m90973a(new C18953b(this));

    /* renamed from: d */
    private final C19575l f53276d;

    public C18955d(ScheduledExecutorService scheduledExecutorService, C19566c cVar, Application application) {
        C58886cw.m90973a(new C18954c(this));
        C19576m e = C19576m.m37335e("assistant_pcp");
        this.f53273a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f53276d = C19579p.m37339c(cVar, scheduledExecutorService, e, application);
            return;
        }
        this.f53276d = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }
}
