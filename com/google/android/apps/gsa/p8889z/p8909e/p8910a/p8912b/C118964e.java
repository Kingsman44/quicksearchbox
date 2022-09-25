package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.speech.p5208h.C66624cv;

/* renamed from: com.google.android.apps.gsa.z.e.a.b.e */
/* compiled from: PG */
public final /* synthetic */ class C118964e implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C118976q f331743a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f331744b;

    /* renamed from: c */
    public final /* synthetic */ Query f331745c;

    public /* synthetic */ C118964e(C118976q qVar, Runnable runnable, Query query) {
        this.f331743a = qVar;
        this.f331744b = runnable;
        this.f331745c = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C118976q qVar = this.f331743a;
        Runnable runnable = this.f331744b;
        Query query = this.f331745c;
        C66624cv cvVar = (C66624cv) obj;
        ((C59052c) ((C59052c) C118976q.f331762a.mo56224b()).mo56372aa(34208)).mo56389s("#onSuccess: %b", Boolean.valueOf(cvVar.f181251b));
        if (cvVar.f181251b) {
            runnable.run();
            return;
        }
        ((C59052c) ((C59052c) C118976q.f331762a.mo56224b()).mo56372aa(34242)).mo56389s("#suppressMultiDeviceDetection: %b", Boolean.valueOf(query.mo84423dD()));
        qVar.f331774i.f332140a.mo104099k(query);
    }
}
