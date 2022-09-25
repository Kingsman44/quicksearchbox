package com.google.android.apps.gsa.staticplugins.opa.worker.p8613h;

import androidx.work.C4632m;
import androidx.work.C4645z;
import androidx.work.WorkerParameters;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.h.b */
/* compiled from: PG */
public final class C114319b implements C46575i {

    /* renamed from: a */
    private static final C59071e f316977a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.h.b");

    /* renamed from: b */
    private final Optional f316978b;

    /* renamed from: c */
    private final C86124t f316979c;

    public C114319b(Optional optional, C86124t tVar) {
        this.f316978b = optional;
        this.f316979c = tVar;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        ((C59052c) ((C59052c) f316977a.mo56224b()).mo56372aa(28951)).mo56386p("Start work");
        if (this.f316979c.mo79746e(C90037cp.f248458am)) {
            this.f316978b.ifPresent(C114318a.f316976a);
        }
        return C60856cj.m92900i(new C4645z(C4632m.f14549a));
    }
}
