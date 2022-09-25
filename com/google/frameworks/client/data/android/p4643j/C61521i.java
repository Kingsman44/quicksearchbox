package com.google.frameworks.client.data.android.p4643j;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.frameworks.client.data.android.C61466h;
import com.google.frameworks.client.data.android.C61506i;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import p5488io.grpc.C70337dh;

/* renamed from: com.google.frameworks.client.data.android.j.i */
/* compiled from: PG */
public final class C61521i implements C61485f {

    /* renamed from: a */
    private static final C58974d f166316a = C58974d.m91134h("xRPC");

    /* renamed from: b */
    private C21370a f166317b;

    /* renamed from: c */
    private C70337dh f166318c;

    /* renamed from: d */
    private long f166319d;

    /* renamed from: e */
    private C61516d f166320e;

    /* renamed from: a */
    public final /* synthetic */ C61479al mo39483a(C61481b bVar) {
        return C61479al.f166225a;
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        this.f166318c = bVar.f166237c.f187496a;
        C61516d dVar = (C61516d) bVar.f166236b.mo62571g(C61516d.f166297b);
        C58838bb.m90867b(dVar, "%s missing from CallOptions.", C61516d.f166297b);
        this.f166320e = dVar;
        C21370a c = ((C61466h) bVar.f166236b.mo62571g(C61506i.f166279a)).mo57980c();
        this.f166317b = c;
        this.f166319d = c.mo26871c();
        return C61479al.f166225a;
    }

    /* renamed from: c */
    public final C61480am mo39485c(C61467a aVar) {
        try {
            if (aVar.f166174a.mo61679g()) {
                long c = this.f166317b.mo26871c() - this.f166319d;
                boolean z = true;
                if (!this.f166318c.equals(C70337dh.UNARY)) {
                    C61516d dVar = this.f166320e;
                    C58838bb.m90869d(c >= 0, "Cannot record negative stream duration.");
                    if (dVar.f166307l.getAndSet(c) != -1) {
                        z = false;
                    }
                    C58838bb.m90884s(z, "Already recorded stream duration.");
                } else if (c <= 2147483647L) {
                    C61516d dVar2 = this.f166320e;
                    int i = (int) c;
                    C58838bb.m90869d(i >= 0, "Cannot record negative latency.");
                    if (dVar2.f166304i.getAndSet(i) != -1) {
                        z = false;
                    }
                    C58838bb.m90884s(z, "Already recorded latency.");
                } else {
                    ((C58970a) ((C58970a) f166316a.mo56225c()).mo56372aa(54889)).mo56386p("Recorded latency overflows Integer.MAX_VALUE, cannot be recorded");
                }
            }
            this.f166320e.f166301f.incrementAndGet();
        } catch (Throwable th) {
            ((C58970a) ((C58970a) ((C58970a) f166316a.mo56225c()).mo56382g(th)).mo56372aa(54888)).mo56386p("Failed to record network latency");
        }
        return C61480am.f166232a;
    }

    /* renamed from: d */
    public final /* synthetic */ C61480am mo39486d(C61483d dVar) {
        return C61480am.f166232a;
    }

    /* renamed from: e */
    public final /* synthetic */ C61479al mo39487e() {
        return C61479al.f166225a;
    }

    /* renamed from: f */
    public final /* synthetic */ C61479al mo39488f() {
        return C61479al.f166225a;
    }

    /* renamed from: g */
    public final /* synthetic */ C61480am mo39489g() {
        return C61480am.f166232a;
    }
}
