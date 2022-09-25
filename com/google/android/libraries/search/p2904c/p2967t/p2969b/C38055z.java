package com.google.android.libraries.search.p2904c.p2967t.p2969b;

import com.google.android.libraries.search.p2904c.C37452ca;
import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.android.libraries.search.p2904c.C37677hx;
import com.google.android.libraries.search.p2904c.p2906aa.C37330e;
import com.google.android.libraries.search.p2904c.p2982x.C38248g;
import com.google.android.libraries.search.p2904c.p2982x.p2983a.C38212u;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71486aq;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71590q;
import kotlinx.coroutines.p5574b.C71594u;
import kotlinx.coroutines.p5574b.C71598y;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.t.b.z */
/* compiled from: PG */
public final class C38055z implements C37452ca {

    /* renamed from: a */
    public static final C59071e f100827a = C59071e.m91331h();

    /* renamed from: b */
    public final C38248g f100828b;

    /* renamed from: c */
    private final C69464a f100829c;

    /* renamed from: d */
    private final C71422aw f100830d;

    public C38055z(C38248g gVar, C69464a aVar, C71422aw awVar) {
        C69664n.m101061g(gVar, "audioServiceStub");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f100828b = gVar;
        this.f100829c = aVar;
        this.f100830d = awVar;
    }

    /* renamed from: a */
    public final C37677hx mo40977a(C37454cc ccVar) {
        C69664n.m101061g(ccVar, "sessionAccessToken");
        C59052c cVar = (C59052c) f100827a.mo56224b();
        int a = C37330e.m66336a(ccVar);
        cVar.mo56379ah(new C59094n(52926));
        cVar.mo56387q("#audio# getReadOnlyListeningSession(token = %s)", a);
        Object b = this.f100829c.mo17428b();
        C69664n.m101060f(b, "grpcSessionResponseHandlerProvider.get()");
        C38212u uVar = (C38212u) b;
        C71594u.m104517d(C71486aq.m104308b(C71477ah.m104295b(C71536cm.m104384b(C71598y.m104521a(C71590q.m104504a(new C38049t(this, ccVar, (C69577g) null)), Integer.MAX_VALUE, C71387t.SUSPEND), new C38050u(uVar, (C69577g) null)), new C38051v(uVar, (C69577g) null)), new C38052w(ccVar, (C69577g) null)), this.f100830d);
        return new C38054y(uVar);
    }
}
