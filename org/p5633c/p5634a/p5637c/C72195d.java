package org.p5633c.p5634a.p5637c;

/* renamed from: org.c.a.c.d */
/* compiled from: PG */
public final class C72195d {

    /* renamed from: c */
    private static C72195d f192158c;

    /* renamed from: a */
    public final C72197f f192159a;

    /* renamed from: b */
    public final C72197f f192160b;

    /* renamed from: d */
    private final C72197f f192161d;

    /* renamed from: e */
    private final C72197f f192162e;

    /* renamed from: f */
    private final C72197f f192163f;

    protected C72195d() {
        C72205n nVar = C72205n.f192172a;
        C72209r rVar = C72209r.f192176a;
        C72193b bVar = C72193b.f192157a;
        C72198g gVar = C72198g.f192168a;
        C72200i iVar = C72200i.f192169a;
        C72201j jVar = C72201j.f192170a;
        this.f192159a = new C72197f(new C72194c[]{nVar, rVar, bVar, gVar, iVar, jVar});
        this.f192161d = new C72197f(new C72194c[]{C72207p.f192174a, nVar, rVar, bVar, gVar, iVar, jVar});
        C72204m mVar = C72204m.f192171a;
        C72206o oVar = C72206o.f192173a;
        this.f192162e = new C72197f(new C72194c[]{mVar, oVar, rVar, iVar, jVar});
        this.f192160b = new C72197f(new C72194c[]{mVar, C72208q.f192175a, oVar, rVar, jVar});
        this.f192163f = new C72197f(new C72194c[]{oVar, rVar, jVar});
    }

    /* renamed from: a */
    public static C72195d m106217a() {
        if (f192158c == null) {
            f192158c = new C72195d();
        }
        return f192158c;
    }

    /* renamed from: b */
    public final C72202k mo63537b(Object obj) {
        String str;
        C72202k kVar = (C72202k) this.f192161d.mo63539a(obj == null ? null : obj.getClass());
        if (kVar != null) {
            return kVar;
        }
        if (obj == null) {
            str = "null";
        } else {
            str = obj.getClass().getName();
        }
        throw new IllegalArgumentException("No partial converter found for type: ".concat(String.valueOf(str)));
    }

    public final String toString() {
        int length = this.f192159a.f192166a.length;
        int length2 = this.f192161d.f192166a.length;
        int length3 = this.f192162e.f192166a.length;
        int length4 = this.f192160b.f192166a.length;
        int length5 = this.f192163f.f192166a.length;
        return "ConverterManager[" + length + " instant," + length2 + " partial," + length3 + " duration," + length4 + " period," + length5 + " interval]";
    }
}
