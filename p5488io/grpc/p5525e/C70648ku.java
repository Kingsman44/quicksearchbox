package p5488io.grpc.p5525e;

import com.google.common.util.concurrent.SettableFuture;
import p5488io.grpc.C70141ae;
import p5488io.grpc.C70173bh;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70705ej;
import p5488io.grpc.C70706ek;
import p5488io.grpc.C70707el;
import p5488io.grpc.C70709en;
import p5488io.grpc.C70713er;
import p5488io.grpc.C70762fb;
import p5488io.grpc.Status;
import p5488io.p5489a.C69792b;

/* renamed from: io.grpc.e.ku */
/* compiled from: PG */
final class C70648ku extends C70390bf {

    /* renamed from: a */
    final /* synthetic */ C70141ae f188325a;

    /* renamed from: b */
    final /* synthetic */ String f188326b;

    /* renamed from: c */
    final /* synthetic */ C70658ld f188327c;

    /* renamed from: d */
    final /* synthetic */ C70642ko f188328d;

    /* renamed from: e */
    final /* synthetic */ SettableFuture f188329e;

    /* renamed from: f */
    final /* synthetic */ C70670lp f188330f;

    /* renamed from: g */
    final /* synthetic */ C70334de f188331g;

    /* renamed from: h */
    final /* synthetic */ C70651kx f188332h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70648ku(C70651kx kxVar, C70141ae aeVar, String str, C70658ld ldVar, C70642ko koVar, SettableFuture settableFuture, C70670lp lpVar, C70334de deVar) {
        super(aeVar);
        this.f188332h = kxVar;
        this.f188325a = aeVar;
        this.f188326b = str;
        this.f188327c = ldVar;
        this.f188328d = koVar;
        this.f188329e = settableFuture;
        this.f188330f = lpVar;
        this.f188331g = deVar;
    }

    /* renamed from: a */
    public final void mo62079a() {
        int i = C69792b.f186180a;
        try {
            C70709en a = this.f188332h.f188338c.f188342e.mo58124a(this.f188326b);
            if (a == null) {
                C70173bh bhVar = this.f188332h.f188338c.f188343f;
                String str = this.f188326b;
                this.f188327c.mo61779m();
                a = bhVar.mo58124a(str);
            }
            if (a == null) {
                Status status = Status.f186914l;
                Status withDescription = status.withDescription("Method not found: " + this.f188326b);
                this.f188328d.mo62386g(C70652ky.f188340c);
                this.f188327c.mo61774e(withDescription, new C70334de());
                this.f188325a.mo61706j((Throwable) null);
                this.f188329e.cancel(false);
                return;
            }
            C70651kx kxVar = this.f188332h;
            C70658ld ldVar = this.f188327c;
            C70670lp lpVar = this.f188330f;
            ldVar.mo61771a();
            ldVar.mo61779m();
            C70762fb[] fbVarArr = lpVar.f188401b;
            if (fbVarArr.length <= 0) {
                C70705ej ejVar = a.f188451b;
                C70706ek[] ekVarArr = kxVar.f188338c.f188345h;
                int length = ekVarArr.length;
                int i2 = 0;
                while (i2 < length) {
                    i2++;
                    ejVar = new C70707el(ekVarArr[i2], ejVar);
                }
                C70709en a2 = a.mo62430a(ejVar);
                C70658ld ldVar2 = this.f188327c;
                C70334de deVar = this.f188331g;
                C70141ae aeVar = this.f188325a;
                C70338di diVar = a2.f188450a;
                C70652ky kyVar = this.f188332h.f188338c;
                this.f188329e.mo57356n(new C70650kw(new C70636ki(ldVar2, diVar, deVar, aeVar, kyVar.f188353p, kyVar.f188355r), a2.f188451b));
                return;
            }
            C70713er erVar = (C70713er) fbVarArr[0];
            throw null;
        } catch (Throwable th) {
            this.f188328d.mo62386g(C70652ky.f188340c);
            this.f188327c.mo61774e(Status.m102100d(th), new C70334de());
            this.f188325a.mo61706j((Throwable) null);
            this.f188329e.cancel(false);
            throw th;
        }
    }
}
