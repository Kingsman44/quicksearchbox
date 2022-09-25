package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9048a;

import android.os.Bundle;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120112c;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.a.v */
/* compiled from: PG */
public final class C120037v {

    /* renamed from: a */
    public static final C59071e f334200a = C59071e.m91331h();

    /* renamed from: b */
    private final C120112c f334201b;

    public C120037v(C120112c cVar) {
        C69664n.m101061g(cVar, "apaFlowRoutingReader");
        this.f334201b = cVar;
    }

    /* renamed from: a */
    public final C120036u mo104643a(Bundle bundle) {
        C120124o oVar;
        C69664n.m101061g(bundle, "onShowArgs");
        if (this.f334201b.mo104672a().f334336a.contains(C34043bf.ENTRYPOINT_SESSION)) {
            oVar = C120124o.APA;
        } else {
            oVar = C120124o.CLASSIC;
        }
        return C120035t.m198938a(bundle, oVar);
    }
}
