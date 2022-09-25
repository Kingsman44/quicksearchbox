package p5451f.p5455b.p5456a.p5457a.p5458a.p5459a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.b.a.a.a.a.b */
/* compiled from: PG */
public final class C69463b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C69463b f185875d;

    /* renamed from: e */
    private static volatile C63010eb f185876e;

    /* renamed from: a */
    public int f185877a;

    /* renamed from: b */
    public int f185878b;

    /* renamed from: c */
    public int f185879c;

    static {
        C69463b bVar = new C69463b();
        f185875d = bVar;
        C62942bv.registerDefaultInstance(C69463b.class, bVar);
    }

    private C69463b() {
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
                return newMessageInfo(f185875d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C69463b();
            case 4:
                return new C69462a();
            case 5:
                return f185875d;
            case 6:
                C63010eb ebVar = f185876e;
                if (ebVar == null) {
                    synchronized (C69463b.class) {
                        ebVar = f185876e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185875d);
                            f185876e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
