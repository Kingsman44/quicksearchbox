package kotlinx.coroutines.p5579e;

import kotlinx.coroutines.C71600ba;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.aa */
/* compiled from: PG */
public final class C71693aa extends C71703ak {

    /* renamed from: a */
    public final C71696ad f191152a;

    /* renamed from: b */
    public final C71696ad f191153b;

    /* renamed from: c */
    public final C71742x f191154c;

    public C71693aa(C71696ad adVar, C71696ad adVar2, C71742x xVar) {
        C69664n.m101061g(adVar2, "next");
        this.f191152a = adVar;
        this.f191153b = adVar2;
        this.f191154c = xVar;
    }

    /* renamed from: d */
    public final Object mo62930d(Object obj) {
        Object obj2;
        Object obj3;
        boolean z = C71600ba.f191036a;
        C69664n.m101059e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C71696ad adVar = (C71696ad) obj;
        Object b = this.f191154c.mo62736b(this);
        if (b == C71697ae.f191161a) {
            C71696ad adVar2 = this.f191153b;
            if (adVar.f191159e.mo62679d(this, adVar2.mo62947n())) {
                this.f191154c.mo62737c(adVar);
                adVar2.mo62942k((C71703ak) null);
            }
            return C71697ae.f191161a;
        }
        if (b != null) {
            obj2 = this.f191154c.mo62973e().mo62977c(b);
        } else {
            obj2 = this.f191154c.mo62973e().f191197c.f190532a;
        }
        if (obj2 == C71721c.f191195a) {
            obj3 = this.f191154c.mo62973e();
        } else {
            obj3 = obj2 == null ? this.f191154c.mo62933g(adVar, this.f191153b) : this.f191153b;
        }
        adVar.f191159e.mo62679d(this, obj3);
        return null;
    }

    /* renamed from: e */
    public final C71722d mo62931e() {
        return this.f191154c.mo62973e();
    }

    public final String toString() {
        C71722d e = this.f191154c.mo62973e();
        return "PrepareOp(op=" + e + ")";
    }
}
