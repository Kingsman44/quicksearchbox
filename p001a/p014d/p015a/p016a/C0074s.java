package p001a.p014d.p015a.p016a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.s */
/* compiled from: PG */
public final class C0074s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C0074s f202c;

    /* renamed from: d */
    private static volatile C63010eb f203d;

    /* renamed from: a */
    public C0069n f204a;

    /* renamed from: b */
    public C0072q f205b;

    static {
        C0074s sVar = new C0074s();
        f202c = sVar;
        C62942bv.registerDefaultInstance(C0074s.class, sVar);
    }

    private C0074s() {
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
                return newMessageInfo(f202c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C0074s();
            case 4:
                return new C0073r();
            case 5:
                return f202c;
            case 6:
                C63010eb ebVar = f203d;
                if (ebVar == null) {
                    synchronized (C0074s.class) {
                        ebVar = f203d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f202c);
                            f203d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
