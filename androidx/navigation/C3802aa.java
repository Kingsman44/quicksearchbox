package androidx.navigation;

import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: androidx.navigation.aa */
/* compiled from: PG */
final class C3802aa extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C3807af f12275a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3802aa(C3807af afVar) {
        super(1);
        this.f12275a = afVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C3825ax axVar = (C3825ax) obj;
        C69664n.m101061g(axVar, "destination");
        return Boolean.valueOf(!this.f12275a.f12294h.containsKey(Integer.valueOf(axVar.f12360i)));
    }
}
