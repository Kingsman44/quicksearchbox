package p5602o.p5607c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.w */
/* compiled from: PG */
public final class C71952w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71952w f191645c;

    /* renamed from: d */
    private static volatile C63010eb f191646d;

    /* renamed from: a */
    public int f191647a;

    /* renamed from: b */
    public int f191648b;

    static {
        C71952w wVar = new C71952w();
        f191645c = wVar;
        C62942bv.registerDefaultInstance(C71952w.class, wVar);
    }

    private C71952w() {
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
                return newMessageInfo(f191645c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71952w();
            case 4:
                return new C71951v();
            case 5:
                return f191645c;
            case 6:
                C63010eb ebVar = f191646d;
                if (ebVar == null) {
                    synchronized (C71952w.class) {
                        ebVar = f191646d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191645c);
                            f191646d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
