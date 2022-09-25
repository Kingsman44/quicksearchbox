package com.google.android.libraries.assistant.trainingcache.p1617b;

import android.app.Application;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.assistant.trainingcache.b.f */
/* compiled from: PG */
public final class C19434f {

    /* renamed from: a */
    public final C19576m f54339a;

    /* renamed from: b */
    public final C58881cr f54340b = C58886cw.m90973a(new C19429a(this));

    /* renamed from: c */
    public final C58881cr f54341c = C58886cw.m90973a(new C19430b(this));

    /* renamed from: d */
    public final C58881cr f54342d = C58886cw.m90973a(new C19431c(this));

    /* renamed from: e */
    public final C58881cr f54343e = C58886cw.m90973a(new C19432d(this));

    /* renamed from: f */
    public final C58881cr f54344f = C58886cw.m90973a(new C19433e(this));

    /* renamed from: g */
    private final C19575l f54345g;

    public C19434f(ScheduledExecutorService scheduledExecutorService, C19566c cVar, Application application) {
        C19576m e = C19576m.m37335e("fedass");
        this.f54339a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f54345g = C19579p.m37339c(cVar, scheduledExecutorService, e, application);
            return;
        }
        this.f54345g = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }
}
