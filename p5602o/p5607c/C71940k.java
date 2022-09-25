package p5602o.p5607c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.k */
/* compiled from: PG */
public final class C71940k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71940k f191604c;

    /* renamed from: d */
    private static volatile C63010eb f191605d;

    /* renamed from: a */
    public int f191606a;

    /* renamed from: b */
    public int f191607b;

    static {
        C71940k kVar = new C71940k();
        f191604c = kVar;
        C62942bv.registerDefaultInstance(C71940k.class, kVar);
    }

    private C71940k() {
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
                return newMessageInfo(f191604c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"a", "b"});
            case 3:
                return new C71940k();
            case 4:
                return new C71939j();
            case 5:
                return f191604c;
            case 6:
                C63010eb ebVar = f191605d;
                if (ebVar == null) {
                    synchronized (C71940k.class) {
                        ebVar = f191605d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191604c);
                            f191605d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
