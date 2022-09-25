package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a;

import android.content.Context;
import com.google.android.apps.gsa.assistant.settings.features.d.u;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.smartspace.p7259c.C92094j;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106494b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106513c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106517d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106523c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106546e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106529c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8260d.C106990ap;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8266b.C107044a;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d.C131091a;
import com.google.android.libraries.assistant.pcp.p1573k.C18941u;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.e */
/* compiled from: PG */
public final class C106493e implements C106517d {

    /* renamed from: a */
    public final C58974d f296995a;

    /* renamed from: b */
    public final C131091a f296996b;

    /* renamed from: c */
    public final C60888db f296997c;

    /* renamed from: d */
    public final C90021c f296998d;

    /* renamed from: e */
    public final C21370a f296999e;

    /* renamed from: f */
    public final C106492d f297000f = new C106492d(this);

    /* renamed from: g */
    public final C39141kp f297001g;

    /* renamed from: h */
    public final Context f297002h;

    /* renamed from: i */
    public final C84516aa f297003i;

    /* renamed from: j */
    public final C18941u f297004j;

    /* renamed from: k */
    private final u f297005k;

    /* renamed from: l */
    private final C106990ap f297006l;

    public C106493e(Context context, C106990ap apVar, C83564a aVar, C131091a aVar2, C60888db dbVar, C84516aa aaVar, C90021c cVar, C39141kp kpVar, u uVar, C18941u uVar2, C21370a aVar3) {
        this.f297002h = context;
        this.f297006l = apVar;
        this.f296995a = aVar.mo76900a("HeadsetContextPlugin");
        this.f296996b = aVar2;
        this.f296997c = dbVar;
        this.f297003i = aaVar;
        this.f296998d = cVar;
        this.f297001g = kpVar;
        this.f297005k = uVar;
        this.f297004j = uVar2;
        this.f296999e = aVar3;
    }

    /* renamed from: a */
    public final /* synthetic */ C107044a mo95548a() {
        return C106494b.f297007a;
    }

    /* renamed from: b */
    public final C58528ij mo95549b() {
        return new C58759qy(new C106523c(C106546e.f297118a, C106486b.f296979a));
    }

    /* renamed from: c */
    public final C60870cx mo95550c(MessageLite messageLite, long j) {
        C106532f fVar = (C106532f) messageLite;
        C58970a aVar = (C58970a) ((C58970a) this.f296995a.mo56224b()).mo56372aa(23073);
        C106529c a = C106529c.m177304a(fVar.f297081b);
        if (a == null) {
            a = C106529c.UNSPECIFIED;
        }
        aVar.mo56389s("headset state. %s", a);
        C60870cx e = this.f297005k.e(C92094j.HEADPHONES);
        C106433a aVar2 = new C106433a(this, fVar);
        return C60922j.m93045h(e, C47810es.m84966f(aVar2), this.f296997c);
    }

    /* renamed from: d */
    public final /* synthetic */ String mo95551d() {
        return C106513c.m177283a(this);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo95552e(Object obj) {
        C106532f fVar = (C106532f) obj;
        C58970a aVar = (C58970a) ((C58970a) this.f296995a.mo56224b()).mo56372aa(23074);
        C106529c a = C106529c.m177304a(fVar.f297081b);
        if (a == null) {
            a = C106529c.UNSPECIFIED;
        }
        C106531e a2 = C106531e.m177306a(fVar.f297082c);
        if (a2 == null) {
            a2 = C106531e.UNKNOWN;
        }
        aVar.mo56359L("updating context. Connected %s, type %s, name %s", a, a2, fVar.f297083d);
        this.f297006l.mo95730d(fVar);
    }
}
