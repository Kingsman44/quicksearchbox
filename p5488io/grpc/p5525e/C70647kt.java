package p5488io.grpc.p5525e;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.SettableFuture;
import p5488io.grpc.C70141ae;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70703eh;
import p5488io.p5489a.C69792b;

/* renamed from: io.grpc.e.kt */
/* compiled from: PG */
final class C70647kt extends C70390bf {

    /* renamed from: a */
    final /* synthetic */ C70141ae f188319a;

    /* renamed from: b */
    final /* synthetic */ SettableFuture f188320b;

    /* renamed from: c */
    final /* synthetic */ String f188321c;

    /* renamed from: d */
    final /* synthetic */ C70334de f188322d;

    /* renamed from: e */
    final /* synthetic */ C70658ld f188323e;

    /* renamed from: f */
    final /* synthetic */ C70642ko f188324f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70647kt(C70141ae aeVar, SettableFuture settableFuture, String str, C70334de deVar, C70658ld ldVar, C70642ko koVar) {
        super(aeVar);
        this.f188319a = aeVar;
        this.f188320b = settableFuture;
        this.f188321c = str;
        this.f188322d = deVar;
        this.f188323e = ldVar;
        this.f188324f = koVar;
    }

    /* renamed from: a */
    public final void mo62079a() {
        int i = C69792b.f186180a;
        C70659le leVar = C70652ky.f188340c;
        if (!(this.f188320b.value instanceof C60873d.C60875b)) {
            try {
                String str = this.f188321c;
                C70650kw kwVar = (C70650kw) C60856cj.m92909r(this.f188320b);
                C70703eh a = kwVar.f188335b.mo39514a(kwVar.f188334a, this.f188322d);
                if (a != null) {
                    C70636ki kiVar = kwVar.f188334a;
                    this.f188324f.mo62386g(new C70635kh(kiVar, a, kiVar.f188294b));
                    this.f188319a.mo61700d(new C70646ks(this), C60826bg.f164896a);
                    return;
                }
                throw new NullPointerException("startCall() returned a null listener for method ".concat(String.valueOf(str)));
            } catch (Throwable th) {
                this.f188324f.mo62386g(leVar);
                throw th;
            }
        }
    }
}
