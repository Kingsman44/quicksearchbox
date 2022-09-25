package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71696ad;
import kotlinx.coroutines.p5579e.C71740v;
import kotlinx.coroutines.p5579e.C71741w;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.df */
/* compiled from: PG */
public final class C71670df extends C71740v implements C71636ci {
    /* renamed from: c */
    public final String mo62920c(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        Object j = mo62941j();
        C69664n.m101059e(j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        boolean z = true;
        for (C71696ad adVar = (C71696ad) j; !C69664n.m101066l(adVar, this); adVar = C71741w.m104908a(adVar.mo62941j())) {
            if (adVar instanceof C71648cu) {
                C71648cu cuVar = (C71648cu) adVar;
                if (!z) {
                    sb.append(", ");
                }
                sb.append(cuVar);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: lS */
    public final C71670df mo62840lS() {
        return this;
    }

    /* renamed from: lU */
    public final boolean mo62841lU() {
        return true;
    }

    public final String toString() {
        return C71600ba.f191036a ? mo62920c("Active") : super.toString();
    }
}
