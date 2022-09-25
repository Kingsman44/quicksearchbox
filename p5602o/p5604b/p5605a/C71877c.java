package p5602o.p5604b.p5605a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.b.a.c */
/* compiled from: PG */
public final class C71877c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71877c f191427e;

    /* renamed from: f */
    private static volatile C63010eb f191428f;

    /* renamed from: a */
    public int f191429a;

    /* renamed from: b */
    public int f191430b;

    /* renamed from: c */
    public int f191431c;

    /* renamed from: d */
    public int f191432d;

    static {
        C71877c cVar = new C71877c();
        f191427e = cVar;
        C62942bv.registerDefaultInstance(C71877c.class, cVar);
    }

    private C71877c() {
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
                return newMessageInfo(f191427e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0004င\u0003", new Object[]{"a", "b", C71895u.f191494a, C45240c.f118157a, "d"});
            case 3:
                return new C71877c();
            case 4:
                return new C71876b();
            case 5:
                return f191427e;
            case 6:
                C63010eb ebVar = f191428f;
                if (ebVar == null) {
                    synchronized (C71877c.class) {
                        ebVar = f191428f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191427e);
                            f191428f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
