package kotlinx.coroutines;

import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.ab */
/* compiled from: PG */
final class C71395ab {

    /* renamed from: a */
    public final Object f190599a;

    /* renamed from: b */
    public final C71805o f190600b;

    /* renamed from: c */
    public final C69626l f190601c;

    /* renamed from: d */
    public final Object f190602d;

    /* renamed from: e */
    public final Throwable f190603e;

    public C71395ab(Object obj, C71805o oVar, C69626l lVar, Object obj2, Throwable th) {
        this.f190599a = obj;
        this.f190600b = oVar;
        this.f190601c = lVar;
        this.f190602d = obj2;
        this.f190603e = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C71395ab(Object obj, C71805o oVar, C69626l lVar, Object obj2, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : oVar, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    /* renamed from: b */
    public static /* synthetic */ C71395ab m104161b(C71395ab abVar, C71805o oVar, Throwable th, int i) {
        Object obj = null;
        Object obj2 = (i & 1) != 0 ? abVar.f190599a : null;
        if ((i & 2) != 0) {
            oVar = abVar.f190600b;
        }
        C71805o oVar2 = oVar;
        C69626l lVar = (i & 4) != 0 ? abVar.f190601c : null;
        if ((i & 8) != 0) {
            obj = abVar.f190602d;
        }
        Object obj3 = obj;
        if ((i & 16) != 0) {
            th = abVar.f190603e;
        }
        return new C71395ab(obj2, oVar2, lVar, obj3, th);
    }

    /* renamed from: a */
    public final boolean mo62754a() {
        return this.f190603e != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71395ab)) {
            return false;
        }
        C71395ab abVar = (C71395ab) obj;
        return C69664n.m101066l(this.f190599a, abVar.f190599a) && C69664n.m101066l(this.f190600b, abVar.f190600b) && C69664n.m101066l(this.f190601c, abVar.f190601c) && C69664n.m101066l(this.f190602d, abVar.f190602d) && C69664n.m101066l(this.f190603e, abVar.f190603e);
    }

    public final int hashCode() {
        Object obj = this.f190599a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C71805o oVar = this.f190600b;
        int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        C69626l lVar = this.f190601c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f190602d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f190603e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        Object obj = this.f190599a;
        C71805o oVar = this.f190600b;
        C69626l lVar = this.f190601c;
        Object obj2 = this.f190602d;
        Throwable th = this.f190603e;
        return "CompletedContinuation(result=" + obj + ", cancelHandler=" + oVar + ", onCancellation=" + lVar + ", idempotentResume=" + obj2 + ", cancelCause=" + th + ")";
    }
}
