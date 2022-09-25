package kotlinx.coroutines.p5574b.p5575a;

import android.support.p033v7.widget.LinearLayoutManager;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71813w;
import kotlinx.coroutines.p5579e.C71706an;
import p5462h.p5466c.C69582l;
import p5462h.p5466c.C69583m;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: kotlinx.coroutines.b.a.ak */
/* compiled from: PG */
final class C71439ak extends C69665o implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C71436ah f190654a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71439ak(C71436ah ahVar) {
        super(2);
        this.f190654a = ahVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        C69582l lVar = (C69582l) obj2;
        C69664n.m101061g(lVar, "element");
        C69583m key = lVar.getKey();
        C69582l lVar2 = this.f190654a.f190648b.get(key);
        if (key != C71643cp.f191083c) {
            return Integer.valueOf(lVar != lVar2 ? LinearLayoutManager.INVALID_OFFSET : intValue + 1);
        }
        C71643cp cpVar = (C71643cp) lVar2;
        C71643cp cpVar2 = (C71643cp) lVar;
        while (true) {
            if (cpVar2 != null) {
                if (cpVar2 == cpVar || !(cpVar2 instanceof C71706an)) {
                    break;
                }
                C71813w H = ((C71706an) cpVar2).mo62903H();
                cpVar2 = H != null ? H.mo62922c() : null;
            } else {
                cpVar2 = null;
                break;
            }
        }
        if (cpVar2 == cpVar) {
            if (cpVar != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + cpVar2 + ", expected child of " + cpVar + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
    }
}
