package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.p10712d.C142324bc;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.k */
/* compiled from: PG */
public final /* synthetic */ class C89587k implements C89472bk {

    /* renamed from: a */
    public final /* synthetic */ C89474bm f242644a;

    /* renamed from: b */
    public final /* synthetic */ String f242645b;

    /* renamed from: c */
    public final /* synthetic */ long f242646c;

    /* renamed from: d */
    public final /* synthetic */ C142324bc f242647d;

    public /* synthetic */ C89587k(C89474bm bmVar, String str, long j, C142324bc bcVar) {
        this.f242644a = bmVar;
        this.f242645b = str;
        this.f242646c = j;
        this.f242647d = bcVar;
    }

    /* renamed from: a */
    public final void mo83356a() {
        C89474bm bmVar = this.f242644a;
        String str = this.f242645b;
        long j = this.f242646c;
        C142324bc bcVar = this.f242647d;
        C124548d b = bmVar.mo83401b(str);
        if (b == null) {
            C59104x d = C89474bm.f242494a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
            ((C59052c) ((C59052c) d).mo56372aa(10372)).mo56386p("device not found");
            return;
        }
        if (C124721s.UNKNOWN_DEVICE_TYPE.equals(b.mo106514l())) {
            bmVar.f242496c.mo83435o(str, new C89602z(bmVar, str), j);
        }
        String V = b.mo106481V();
        if (!C58837ba.m90859h(V)) {
            C58485gu h = bmVar.f242496c.mo83431h(V, bcVar, j);
            int size = h.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) h.get(i);
                C124709g c = bmVar.f242496c.mo83429c(str2);
                if (c != null) {
                    bmVar.mo83413s(str2, new C58759qy(12), j, c, true);
                } else {
                    C59104x d2 = C89474bm.f242494a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                    ((C59052c) ((C59052c) d2).mo56372aa(10371)).mo56389s("cannot find %s", str2);
                }
            }
            return;
        }
        throw new IllegalArgumentException("no modelId");
    }
}
