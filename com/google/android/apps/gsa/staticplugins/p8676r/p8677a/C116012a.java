package com.google.android.apps.gsa.staticplugins.p8676r.p8677a;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6751p.C85549a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.gsa.tasks.C118550i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.r.a.a */
/* compiled from: PG */
final class C116012a extends C86734a implements C85549a {
    public C116012a() {
        super(C118575h.WORKER_BACKGROUND_TASK, "backgroundtask");
    }

    /* renamed from: a */
    public final C60870cx mo79060a(C118549h hVar, C118476ak akVar) {
        try {
            return hVar.mo65234a(akVar);
        } catch (Error | RuntimeException e) {
            return C60856cj.m92899h(new C118550i(e));
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
