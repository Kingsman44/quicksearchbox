package p001a.p007b.p008a.p009a.p010a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.b.a.a.a.n */
/* compiled from: PG */
public final class C0018n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C0018n f35d;

    /* renamed from: e */
    private static volatile C63010eb f36e;

    /* renamed from: a */
    public int f37a;

    /* renamed from: b */
    public int f38b;

    /* renamed from: c */
    public int f39c;

    static {
        C0018n nVar = new C0018n();
        f35d = nVar;
        C62942bv.registerDefaultInstance(C0018n.class, nVar);
    }

    private C0018n() {
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
                return newMessageInfo(f35d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C0020p.m3b()});
            case 3:
                return new C0018n();
            case 4:
                return new C0017m();
            case 5:
                return f35d;
            case 6:
                C63010eb ebVar = f36e;
                if (ebVar == null) {
                    synchronized (C0018n.class) {
                        ebVar = f36e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f35d);
                            f36e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
