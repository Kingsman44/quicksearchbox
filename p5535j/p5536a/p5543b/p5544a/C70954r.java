package p5535j.p5536a.p5543b.p5544a;

import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.b.a.r */
/* compiled from: PG */
public final class C70954r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C70954r f189184c;

    /* renamed from: d */
    public static final C62940bt f189185d;

    /* renamed from: e */
    private static volatile C63010eb f189186e;

    /* renamed from: a */
    public int f189187a = 0;

    /* renamed from: b */
    public Object f189188b;

    static {
        C70954r rVar = new C70954r();
        f189184c = rVar;
        C62942bv.registerDefaultInstance(C70954r.class, rVar);
        f189185d = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, rVar, rVar, (C62958ce) null, 397360987, C63066gd.MESSAGE, C70954r.class);
    }

    private C70954r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f189184c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C70948l.class, C70945i.class});
            case 3:
                return new C70954r();
            case 4:
                return new C70953q();
            case 5:
                return f189184c;
            case 6:
                C63010eb ebVar = f189186e;
                if (ebVar == null) {
                    synchronized (C70954r.class) {
                        ebVar = f189186e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189184c);
                            f189186e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
