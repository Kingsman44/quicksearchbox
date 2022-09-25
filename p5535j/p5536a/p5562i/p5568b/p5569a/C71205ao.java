package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.i.b.a.ao */
/* compiled from: PG */
public final class C71205ao extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71205ao f190072c;

    /* renamed from: d */
    public static final C62940bt f190073d;

    /* renamed from: e */
    private static volatile C63010eb f190074e;

    /* renamed from: a */
    public int f190075a;

    /* renamed from: b */
    public int f190076b;

    static {
        C71205ao aoVar = new C71205ao();
        f190072c = aoVar;
        C62942bv.registerDefaultInstance(C71205ao.class, aoVar);
        f190073d = C62942bv.newSingularGeneratedExtension(C71207aq.f190077a, aoVar, aoVar, (C62958ce) null, 19, C63066gd.MESSAGE, C71205ao.class);
    }

    private C71205ao() {
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
                return newMessageInfo(f190072c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C71204an.m103937b()});
            case 3:
                return new C71205ao();
            case 4:
                return new C71202al();
            case 5:
                return f190072c;
            case 6:
                C63010eb ebVar = f190074e;
                if (ebVar == null) {
                    synchronized (C71205ao.class) {
                        ebVar = f190074e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190072c);
                            f190074e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
