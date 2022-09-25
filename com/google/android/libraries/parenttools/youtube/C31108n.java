package com.google.android.libraries.parenttools.youtube;

import android.app.Application;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.parenttools.youtube.n */
/* compiled from: PG */
public final class C31108n {

    /* renamed from: a */
    public final C19576m f83797a;

    /* renamed from: b */
    public final C58881cr f83798b = C58886cw.m90973a(new C31104j(this));

    /* renamed from: c */
    public final C58881cr f83799c = C58886cw.m90973a(new C31105k(this));

    /* renamed from: d */
    public final C58881cr f83800d = C58886cw.m90973a(new C31106l(this));

    /* renamed from: e */
    public final C58881cr f83801e = C58886cw.m90973a(new C31107m(this));

    /* renamed from: f */
    private final C19575l f83802f;

    public C31108n(ScheduledExecutorService scheduledExecutorService, C19566c cVar, Application application) {
        C19576m e = C19576m.m37335e("youtube_parent_tools_android");
        this.f83797a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f83802f = C19579p.m37339c(cVar, scheduledExecutorService, e, application);
            return;
        }
        this.f83802f = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }
}
