package p5602o.p5604b.p5605a.p5606a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.b.a.a.g */
/* compiled from: PG */
public final class C71869g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71869g f191417c;

    /* renamed from: d */
    private static volatile C63010eb f191418d;

    /* renamed from: a */
    public int f191419a;

    /* renamed from: b */
    public int f191420b;

    static {
        C71869g gVar = new C71869g();
        f191417c = gVar;
        C62942bv.registerDefaultInstance(C71869g.class, gVar);
    }

    private C71869g() {
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
                return newMessageInfo(f191417c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71869g();
            case 4:
                return new C71868f();
            case 5:
                return f191417c;
            case 6:
                C63010eb ebVar = f191418d;
                if (ebVar == null) {
                    synchronized (C71869g.class) {
                        ebVar = f191418d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191417c);
                            f191418d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
