package kotlinx.coroutines;

import p5462h.p5466c.C69553a;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: kotlinx.coroutines.at */
/* compiled from: PG */
public final class C71419at extends C69553a implements C71686dv {

    /* renamed from: a */
    public static final C71418as f190626a = new C71418as();

    /* renamed from: b */
    public final long f190627b;

    public C71419at(long j) {
        super(f190626a);
        this.f190627b = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo51648a(C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        C71421av avVar = (C71421av) oVar.get(C71421av.f190628a);
        String str = avVar != null ? avVar.f190629b : "coroutine";
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int H = C69764m.m101191H(name, " @");
        if (H < 0) {
            H = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + H + 10);
        String substring = name.substring(0, H);
        C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.f190627b);
        currentThread.setName(sb.toString());
        return name;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo51649b(C69585o oVar, Object obj) {
        String str = (String) obj;
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(str, "oldState");
        Thread.currentThread().setName(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C71419at) && this.f190627b == ((C71419at) obj).f190627b;
    }

    public final int hashCode() {
        long j = this.f190627b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.f190627b;
        return "CoroutineId(" + j + ")";
    }
}
