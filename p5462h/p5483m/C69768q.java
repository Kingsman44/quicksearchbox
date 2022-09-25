package p5462h.p5483m;

import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: h.m.q */
/* compiled from: PG */
final class C69768q extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ String f186151a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69768q(String str) {
        super(1);
        this.f186151a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "it");
        if (!C69764m.m101229h(str)) {
            return this.f186151a.concat(String.valueOf(str));
        }
        int length = str.length();
        String str2 = this.f186151a;
        return length >= str2.length() ? str : str2;
    }
}
