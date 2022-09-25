package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62963cj;
import com.google.protobuf.p4746a.C62883b;
import java.util.Iterator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: j.a.c.c.a.dw */
/* compiled from: PG */
public final class C71077dw {

    /* renamed from: a */
    public final C71072dr f189553a;

    public C71077dw(C71072dr drVar) {
        this.f189553a = drVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C71075du mo62611a() {
        C62942bv build = this.f189553a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C71075du) build;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo62612b(Iterable iterable) {
        C69664n.m101061g(iterable, "values");
        C71072dr drVar = this.f189553a;
        drVar.copyOnWrite();
        C71075du duVar = (C71075du) drVar.instance;
        C62962ci ciVar = C71075du.f189548b;
        duVar.mo62610a();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            duVar.f189552a.mo58916g(((C71074dt) it.next()).f189547j);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo62613c() {
        new C62883b(new C62963cj(((C71075du) this.f189553a.instance).f189552a, C71075du.f189548b));
    }
}
