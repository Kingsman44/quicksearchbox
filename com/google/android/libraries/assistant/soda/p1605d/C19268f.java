package com.google.android.libraries.assistant.soda.p1605d;

import android.app.Application;
import android.content.Context;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.assistant.soda.d.f */
/* compiled from: PG */
public final class C19268f {

    /* renamed from: a */
    public final C19576m f53977a;

    /* renamed from: b */
    public final C58881cr f53978b = C58886cw.m90973a(new C19263a(this));

    /* renamed from: c */
    public final C58881cr f53979c = C58886cw.m90973a(new C19264b(this));

    /* renamed from: d */
    public final C58881cr f53980d = C58886cw.m90973a(new C19265c(this));

    /* renamed from: e */
    public final C58881cr f53981e = C58886cw.m90973a(new C19266d(this));

    /* renamed from: f */
    public final C58881cr f53982f = C58886cw.m90973a(new C19267e(this));

    /* renamed from: g */
    private final C19575l f53983g;

    private C19268f(ScheduledExecutorService scheduledExecutorService, C19566c cVar, Application application) {
        C19576m e = C19576m.m37335e("soda_agsa");
        this.f53977a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f53983g = C19579p.m37339c(cVar, scheduledExecutorService, e, application);
            return;
        }
        this.f53983g = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }

    /* renamed from: a */
    public static C19268f m36761a(ScheduledExecutorService scheduledExecutorService, Context context, Application application) {
        return new C19268f(scheduledExecutorService, new C19566c(context, "STREAMZ_SODA", (String) null), application);
    }
}
