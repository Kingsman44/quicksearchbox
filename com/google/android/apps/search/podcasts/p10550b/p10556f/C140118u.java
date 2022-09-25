package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97907bf;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97908bg;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.podcasts.b.f.u */
/* compiled from: PG */
public final /* synthetic */ class C140118u implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140097al f380757a;

    /* renamed from: b */
    public final /* synthetic */ C97908bg f380758b;

    public /* synthetic */ C140118u(C140097al alVar, C97908bg bgVar) {
        this.f380757a = alVar;
        this.f380758b = bgVar;
    }

    public final C60870cx apply(Object obj) {
        C140097al alVar = this.f380757a;
        C97908bg bgVar = this.f380758b;
        Throwable th = (Throwable) obj;
        int i = -1;
        if (bgVar != null) {
            int a = C97907bf.m162188a(bgVar.f273367b);
            if (a == 0) {
                a = 1;
            }
            i = -1 + a;
        }
        C59104x d = C140097al.f380721a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "QueueManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(41569)).mo56387q("Queue request failed: %d", i);
        return C47633f.m84733g(alVar.f380724d.mo50395b()).mo51516i(new C140086aa(alVar), alVar.f380722b);
    }
}
