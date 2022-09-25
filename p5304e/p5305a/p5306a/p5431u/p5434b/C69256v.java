package p5304e.p5305a.p5306a.p5431u.p5434b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: e.a.a.u.b.v */
/* compiled from: PG */
public final class C69256v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C69256v f185374d;

    /* renamed from: e */
    private static volatile C63010eb f185375e;

    /* renamed from: a */
    public int f185376a;

    /* renamed from: b */
    public int f185377b;

    /* renamed from: c */
    public int f185378c;

    static {
        C69256v vVar = new C69256v();
        f185374d = vVar;
        C62942bv.registerDefaultInstance(C69256v.class, vVar);
    }

    private C69256v() {
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
                return newMessageInfo(f185374d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C69256v();
            case 4:
                return new C69255u();
            case 5:
                return f185374d;
            case 6:
                C63010eb ebVar = f185375e;
                if (ebVar == null) {
                    synchronized (C69256v.class) {
                        ebVar = f185375e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185374d);
                            f185375e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
