package p5462h.p5466c;

import java.io.Serializable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.c.c */
/* compiled from: PG */
final class C69573c implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final C69585o[] f185982a;

    public C69573c(C69585o[] oVarArr) {
        C69664n.m101061g(oVarArr, "elements");
        this.f185982a = oVarArr;
    }

    private final Object readResolve() {
        C69585o[] oVarArr = this.f185982a;
        C69585o oVar = C69586p.f185991a;
        for (C69585o plus : oVarArr) {
            oVar = oVar.plus(plus);
        }
        return oVar;
    }
}
