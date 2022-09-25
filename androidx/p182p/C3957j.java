package androidx.p182p;

import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.C4057l;
import java.util.Iterator;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: androidx.p.j */
/* compiled from: PG */
final class C3957j extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C3959l f12644a;

    /* renamed from: b */
    final /* synthetic */ C69626l f12645b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3957j(C3959l lVar, C69626l lVar2) {
        super(1);
        this.f12644a = lVar;
        this.f12645b = lVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C4049d dVar = (C4049d) obj;
        C69664n.m101061g(dVar, "db");
        C4057l d = dVar.mo8245d(this.f12644a.f12647a);
        C69664n.m101060f(d, "db.compileStatement(sql)");
        C3959l lVar = this.f12644a;
        Iterator it = lVar.f12648b.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i < 0) {
                C69540x.m100952j();
            }
            Object obj2 = lVar.f12648b.get(i);
            if (obj2 == null) {
                d.mo8205f(i2);
            } else if (obj2 instanceof Long) {
                d.mo8204e(i2, ((Number) obj2).longValue());
            } else if (obj2 instanceof Double) {
                d.mo8203d(i2, ((Number) obj2).doubleValue());
            } else if (obj2 instanceof String) {
                d.mo8206g(i2, (String) obj2);
            } else if (obj2 instanceof byte[]) {
                d.mo8201c(i2, (byte[]) obj2);
            }
            i = i2;
        }
        return this.f12645b.mo5761a(d);
    }
}
