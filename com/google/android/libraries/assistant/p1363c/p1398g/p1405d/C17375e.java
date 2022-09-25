package com.google.android.libraries.assistant.p1363c.p1398g.p1405d;

import com.google.android.libraries.assistant.p1363c.p1398g.C17331a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.c.g.d.e */
/* compiled from: PG */
public final class C17375e implements C46675m, C17376f {

    /* renamed from: a */
    public static final C59071e f50256a = C59071e.m91331h();

    /* renamed from: b */
    public final Set f50257b;

    /* renamed from: c */
    public final C71788b f50258c = new C71799m();

    /* renamed from: d */
    public final C58425eo f50259d = new C58425eo(10);

    /* renamed from: e */
    private final C71422aw f50260e;

    public C17375e(C71422aw awVar, Set set) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(set, "ttsDumplables");
        this.f50260e = awVar;
        this.f50257b = set;
    }

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        C69664n.m101061g(oVar, "request");
        return C71663i.m104692e(this.f50260e, (C71424ay) null, new C17372b(oVar, this, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final void mo23328b(C17508k kVar, C17477am amVar, C17331a aVar) {
        C69664n.m101061g(kVar, "clientInfo");
        C69664n.m101061g(amVar, "sessionToken");
        C69664n.m101061g(aVar, "ttsSessionStatus");
        C71803m.m105042c(this.f50260e, (C69585o) null, (C71424ay) null, new C17373c(this, kVar, amVar, aVar, (C69577g) null), 3).mo62873s(C17374d.f50255a);
    }
}
