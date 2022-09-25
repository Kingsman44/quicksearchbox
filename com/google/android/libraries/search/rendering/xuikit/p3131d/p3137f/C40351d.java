package com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f;

import android.app.Application;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19575l;
import com.google.android.libraries.p1635au.C19576m;
import com.google.android.libraries.p1635au.C19579p;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.f.d */
/* compiled from: PG */
public final class C40351d {

    /* renamed from: a */
    public final C19576m f105965a;

    /* renamed from: b */
    public final C58881cr f105966b = C58886cw.m90973a(new C40348a(this));

    /* renamed from: c */
    public final C58881cr f105967c = C58886cw.m90973a(new C40349b(this));

    /* renamed from: d */
    private final C19575l f105968d;

    public C40351d(ScheduledExecutorService scheduledExecutorService, C19566c cVar, Application application) {
        C58886cw.m90973a(new C40350c(this));
        C19576m e = C19576m.m37335e("xuikit_android");
        this.f105965a = e;
        C19575l lVar = e.f54496c;
        if (lVar == null) {
            this.f105968d = C19579p.m37339c(cVar, scheduledExecutorService, e, application);
            return;
        }
        this.f105968d = lVar;
        ((C19579p) lVar).f54506g = cVar;
    }
}
