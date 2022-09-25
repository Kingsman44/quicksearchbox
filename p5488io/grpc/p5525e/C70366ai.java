package p5488io.grpc.p5525e;

import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.p5489a.C69792b;

/* renamed from: io.grpc.e.ai */
/* compiled from: PG */
final class C70366ai extends C70390bf {

    /* renamed from: a */
    final /* synthetic */ Status f187546a;

    /* renamed from: b */
    final /* synthetic */ C70334de f187547b;

    /* renamed from: c */
    final /* synthetic */ C70368ak f187548c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70366ai(C70368ak akVar, Status status, C70334de deVar) {
        super(akVar.f187552c.f187560d);
        this.f187548c = akVar;
        this.f187546a = status;
        this.f187547b = deVar;
    }

    /* renamed from: a */
    public final void mo62079a() {
        int i = C69792b.f186180a;
        Status status = this.f187546a;
        C70334de deVar = this.f187547b;
        Status status2 = this.f187548c.f187551b;
        if (status2 != null) {
            deVar = new C70334de();
            status = status2;
        }
        this.f187548c.f187552c.f187562f = true;
        try {
            this.f187548c.f187550a.mo27484b(status, deVar);
        } finally {
            this.f187548c.f187552c.mo62087e();
            this.f187548c.f187552c.f187559c.mo62074a(status.mo61679g());
        }
    }
}
