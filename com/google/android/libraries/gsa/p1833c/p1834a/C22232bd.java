package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;
import org.chromium.net.ExperimentalCronetEngine;
import p5488io.grpc.p5523c.C70261e;

/* renamed from: com.google.android.libraries.gsa.c.a.bd */
/* compiled from: PG */
public final /* synthetic */ class C22232bd implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C22239bk f61386a;

    /* renamed from: b */
    public final /* synthetic */ String f61387b;

    /* renamed from: c */
    public final /* synthetic */ int f61388c;

    /* renamed from: d */
    public final /* synthetic */ int f61389d;

    public /* synthetic */ C22232bd(C22239bk bkVar, String str, int i, int i2) {
        this.f61386a = bkVar;
        this.f61387b = str;
        this.f61388c = i;
        this.f61389d = i2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C22239bk bkVar = this.f61386a;
        String str = this.f61387b;
        int i = this.f61388c;
        int i2 = this.f61389d;
        ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) obj;
        if (bkVar.f61408i.mo27463h()) {
            return C60856cj.m92899h(new C90457d(C89885b.GRPC_ENGINE_NOT_AVAILABLE_VALUE));
        }
        C70261e b = C70261e.m102411b(str, i, experimentalCronetEngine);
        b.f187275c.mo62290e(new C22238bj(bkVar));
        return C60856cj.m92900i(new C22229ba(b, str, i, bkVar.f61412m, i2));
    }
}
