package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C130985a;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131079b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.f */
/* compiled from: PG */
public final class C131051f implements C130985a {

    /* renamed from: a */
    public static final C58495hd f358477a;

    /* renamed from: b */
    public static final C58495hd f358478b;

    /* renamed from: c */
    public final C60950i f358479c;

    /* renamed from: d */
    public final ExecutorService f358480d;

    /* renamed from: e */
    public final C130987aa f358481e;

    /* renamed from: f */
    public final C58974d f358482f;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(19, C131079b.FOREGROUND_SERVICE);
        gzVar.mo55429h(1, C131079b.FOREGROUND_ACTIVITY);
        f358477a = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(20, 19);
        gzVar2.mo55429h(2, 1);
        f358478b = gzVar2.mo55427f(false);
    }

    public C131051f(C60950i iVar, ExecutorService executorService, C130987aa aaVar, C130603a aVar) {
        this.f358479c = iVar;
        this.f358480d = executorService;
        this.f358481e = aaVar;
        this.f358482f = aVar.mo109740b(this);
    }
}
