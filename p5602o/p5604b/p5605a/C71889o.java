package p5602o.p5604b.p5605a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.b.a.o */
/* compiled from: PG */
public final class C71889o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71889o f191463d;

    /* renamed from: e */
    private static volatile C63010eb f191464e;

    /* renamed from: a */
    public int f191465a;

    /* renamed from: b */
    public int f191466b;

    /* renamed from: c */
    public long f191467c;

    static {
        C71889o oVar = new C71889o();
        f191463d = oVar;
        C62942bv.registerDefaultInstance(C71889o.class, oVar);
    }

    private C71889o() {
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
                return newMessageInfo(f191463d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဌ\u0000", new Object[]{"a", C45240c.f118157a, "b", C71873ab.f191424a});
            case 3:
                return new C71889o();
            case 4:
                return new C71888n();
            case 5:
                return f191463d;
            case 6:
                C63010eb ebVar = f191464e;
                if (ebVar == null) {
                    synchronized (C71889o.class) {
                        ebVar = f191464e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191463d);
                            f191464e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
