package p001a.p014d.p015a.p016a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.h */
/* compiled from: PG */
public final class C0063h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C0063h f168c;

    /* renamed from: d */
    private static volatile C63010eb f169d;

    /* renamed from: a */
    public int f170a = 0;

    /* renamed from: b */
    public Object f171b;

    static {
        C0063h hVar = new C0063h();
        f168c = hVar;
        C62942bv.registerDefaultInstance(C0063h.class, hVar);
    }

    private C0063h() {
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
                return newMessageInfo(f168c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C0063h();
            case 4:
                return new C0062g();
            case 5:
                return f168c;
            case 6:
                C63010eb ebVar = f169d;
                if (ebVar == null) {
                    synchronized (C0063h.class) {
                        ebVar = f169d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168c);
                            f169d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
