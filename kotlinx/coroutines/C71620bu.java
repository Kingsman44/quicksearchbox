package kotlinx.coroutines;

import p5462h.C69788q;

/* renamed from: kotlinx.coroutines.bu */
/* compiled from: PG */
final class C71620bu extends C71622bw {

    /* renamed from: a */
    final /* synthetic */ C71624by f191057a;

    /* renamed from: c */
    private final C71807q f191058c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71620bu(C71624by byVar, long j, C71807q qVar) {
        super(j);
        this.f191057a = byVar;
        this.f191058c = qVar;
    }

    public final void run() {
        this.f191058c.mo63037j(this.f191057a, C69788q.f186170a);
    }

    public final String toString() {
        String bwVar = super.toString();
        C71807q qVar = this.f191058c;
        StringBuilder sb = new StringBuilder();
        sb.append(bwVar);
        sb.append(qVar);
        return String.valueOf(bwVar).concat(qVar.toString());
    }
}
