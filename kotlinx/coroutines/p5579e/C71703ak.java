package kotlinx.coroutines.p5579e;

import kotlinx.coroutines.C71601bb;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.ak */
/* compiled from: PG */
public abstract class C71703ak {
    /* renamed from: d */
    public abstract Object mo62930d(Object obj);

    /* renamed from: e */
    public abstract C71722d mo62931e();

    /* renamed from: h */
    public final boolean mo62963h(C71703ak akVar) {
        C71722d e;
        C69664n.m101061g(akVar, "that");
        C71722d e2 = mo62931e();
        if (e2 == null || (e = akVar.mo62931e()) == null || e2.mo62976b() >= e.mo62976b()) {
            return false;
        }
        return true;
    }

    public String toString() {
        String a = C71601bb.m104526a(this);
        String b = C71601bb.m104527b(this);
        return a + "@" + b;
    }
}
