package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70137aa;
import p5488io.grpc.C70273cb;
import p5488io.grpc.C70275cd;
import p5488io.grpc.C70279ch;
import p5488io.grpc.C70280ci;
import p5488io.grpc.C70766ff;

/* renamed from: io.grpc.e.gd */
/* compiled from: PG */
final class C70523gd extends C70275cd {

    /* renamed from: a */
    C70685p f187914a;

    /* renamed from: b */
    final /* synthetic */ C70542gw f187915b;

    public C70523gd(C70542gw gwVar) {
        this.f187915b = gwVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C70279ch mo61941a(C70273cb cbVar) {
        this.f187915b.f188009n.mo62447d();
        C58838bb.m90884s(!this.f187915b.f187970E, "Channel is being terminated");
        return new C70540gu(this.f187915b, cbVar);
    }

    /* renamed from: b */
    public final void mo61942b() {
        this.f187915b.f188009n.mo62447d();
        C70766ff ffVar = this.f187915b.f188009n;
        ffVar.mo62446c(new C70521gb(this));
        ffVar.mo62445b();
    }

    /* renamed from: c */
    public final void mo61943c(C70137aa aaVar, C70280ci ciVar) {
        this.f187915b.f188009n.mo62447d();
        C58838bb.m90866a(aaVar, "newState");
        C70766ff ffVar = this.f187915b.f188009n;
        ffVar.mo62446c(new C70522gc(this, ciVar, aaVar));
        ffVar.mo62445b();
    }
}
