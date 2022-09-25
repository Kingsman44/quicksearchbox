package p001a.p007b.p008a.p009a.p010a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.b.a.a.a.r */
/* compiled from: PG */
public final class C0022r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C0022r f53d;

    /* renamed from: e */
    private static volatile C63010eb f54e;

    /* renamed from: a */
    public int f55a;

    /* renamed from: b */
    public int f56b;

    /* renamed from: c */
    public int f57c;

    static {
        C0022r rVar = new C0022r();
        f53d = rVar;
        C62942bv.registerDefaultInstance(C0022r.class, rVar);
    }

    private C0022r() {
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
                return newMessageInfo(f53d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C0020p.m3b()});
            case 3:
                return new C0022r();
            case 4:
                return new C0021q();
            case 5:
                return f53d;
            case 6:
                C63010eb ebVar = f54e;
                if (ebVar == null) {
                    synchronized (C0022r.class) {
                        ebVar = f54e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53d);
                            f54e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
