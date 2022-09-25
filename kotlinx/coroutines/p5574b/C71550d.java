package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.p5575a.C71450g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.d */
/* compiled from: PG */
final class C71550d extends C71583j {

    /* renamed from: d */
    private final C69630p f190941d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71550d(C69630p pVar, C69585o oVar, int i, C71387t tVar) {
        super(pVar, oVar, i, tVar);
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        this.f190941d = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C71450g mo62793b(C69585o oVar, int i, C71387t tVar) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        return new C71550d(this.f190941d, oVar, i, tVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62794c(kotlinx.coroutines.p5573a.C71361ao r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.p5574b.C71523c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.b.c r0 = (kotlinx.coroutines.p5574b.C71523c) r0
            int r1 = r0.f190879d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f190879d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.b.c r0 = new kotlinx.coroutines.b.c
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f190877b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f190879d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r5 = r0.f190876a
            p5462h.C69714l.m101134b(r6)
            goto L_0x003e
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            r0.f190876a = r5
            r0.f190879d = r3
            java.lang.Object r6 = kotlinx.coroutines.p5574b.C71583j.m104495g(r4, r5, r0)
            if (r6 == r1) goto L_0x0053
        L_0x003e:
            kotlinx.coroutines.a.w r5 = (kotlinx.coroutines.p5573a.C71390w) r5
            kotlinx.coroutines.a.v r5 = r5.f190597b
            boolean r5 = r5.mo62728G()
            if (r5 == 0) goto L_0x004b
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        L_0x004b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5574b.C71550d.mo62794c(kotlinx.coroutines.a.ao, h.c.g):java.lang.Object");
    }
}
