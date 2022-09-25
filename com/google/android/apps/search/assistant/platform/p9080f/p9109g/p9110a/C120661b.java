package com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import java.util.concurrent.atomic.AtomicReference;
import p5535j.p5536a.p5545c.p5548c.C71143c;
import p5535j.p5536a.p5545c.p5548c.C71151e;
import p5535j.p5536a.p5545c.p5548c.C71152f;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.a.b */
/* compiled from: PG */
public final class C120661b {

    /* renamed from: a */
    public static final C59071e f335620a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.f.g.a.b");

    /* renamed from: d */
    private static final C58495hd f335621d = C58495hd.m89905s("UNKNOWN", C71151e.UNKNOWN, "UNKNOWN_NOT_PROVIDED", C71151e.UNKNOWN_NOT_PROVIDED, "UNKNOWN_PROVIDED", C71151e.UNKNOWN_PROVIDED, "HUB_MODE", C71151e.HUB_MODE, "NGA", C71151e.NGA, "VS", C71151e.VS);

    /* renamed from: b */
    public final C37215b f335622b;

    /* renamed from: c */
    public final AtomicReference f335623c = new AtomicReference(C71151e.UNKNOWN);

    public C120661b(C37215b bVar) {
        this.f335622b = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo104870a(C62722b bVar) {
        C37215b bVar2 = this.f335622b;
        C37252a c = C37176a.f96815M.mo40805c(bVar);
        C62940bt btVar = C71152f.f189814g;
        C71143c cVar = (C71143c) C71152f.f189813f.createBuilder();
        cVar.copyOnWrite();
        C71152f fVar = (C71152f) cVar.instance;
        fVar.f189820e = ((C71151e) this.f335623c.get()).f189812g;
        fVar.f189816a |= 8;
        ((C37253b) c).mo40792p(btVar, (C71152f) cVar.build());
        bVar2.mo19974a(c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo104871b(String str) {
        this.f335623c.set((C71151e) f335621d.getOrDefault(str, C71151e.UNKNOWN_PROVIDED));
    }
}
