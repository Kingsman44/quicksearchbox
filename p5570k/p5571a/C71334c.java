package p5570k.p5571a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: k.a.c */
/* compiled from: PG */
public final class C71334c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71334c f190511c;

    /* renamed from: e */
    private static volatile C63010eb f190512e;

    /* renamed from: a */
    public int f190513a;

    /* renamed from: b */
    public long f190514b;

    /* renamed from: d */
    private int f190515d;

    static {
        C71334c cVar = new C71334c();
        f190511c = cVar;
        C62942bv.registerDefaultInstance(C71334c.class, cVar);
    }

    private C71334c() {
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
                return newMessageInfo(f190511c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", C71335d.f190516a, "b"});
            case 3:
                return new C71334c();
            case 4:
                return new C71333b();
            case 5:
                return f190511c;
            case 6:
                C63010eb ebVar = f190512e;
                if (ebVar == null) {
                    synchronized (C71334c.class) {
                        ebVar = f190512e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190511c);
                            f190512e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
