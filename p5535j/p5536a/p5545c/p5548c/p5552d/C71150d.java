package p5535j.p5536a.p5545c.p5548c.p5552d;

import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.c.c.d.d */
/* compiled from: PG */
public final class C71150d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71150d f189799c;

    /* renamed from: d */
    public static final C62940bt f189800d;

    /* renamed from: f */
    private static volatile C63010eb f189801f;

    /* renamed from: a */
    public int f189802a;

    /* renamed from: b */
    public C71148b f189803b;

    /* renamed from: e */
    private byte f189804e = 2;

    static {
        C71150d dVar = new C71150d();
        f189799c = dVar;
        C62942bv.registerDefaultInstance(C71150d.class, dVar);
        f189800d = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, dVar, dVar, (C62958ce) null, 403243392, C63066gd.MESSAGE, C71150d.class);
    }

    private C71150d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f189804e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f189804e = b;
                return null;
            case 2:
                return newMessageInfo(f189799c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71150d();
            case 4:
                return new C71149c();
            case 5:
                return f189799c;
            case 6:
                C63010eb ebVar = f189801f;
                if (ebVar == null) {
                    synchronized (C71150d.class) {
                        ebVar = f189801f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189799c);
                            f189801f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
