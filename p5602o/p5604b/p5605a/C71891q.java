package p5602o.p5604b.p5605a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.b.a.q */
/* compiled from: PG */
public final class C71891q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71891q f191468d;

    /* renamed from: e */
    private static volatile C63010eb f191469e;

    /* renamed from: a */
    public int f191470a;

    /* renamed from: b */
    public int f191471b;

    /* renamed from: c */
    public long f191472c;

    static {
        C71891q qVar = new C71891q();
        f191468d = qVar;
        C62942bv.registerDefaultInstance(C71891q.class, qVar);
    }

    private C71891q() {
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
                return newMessageInfo(f191468d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဂ\u0002", new Object[]{"a", "b", C71874ac.f191425a, C45240c.f118157a});
            case 3:
                return new C71891q();
            case 4:
                return new C71890p();
            case 5:
                return f191468d;
            case 6:
                C63010eb ebVar = f191469e;
                if (ebVar == null) {
                    synchronized (C71891q.class) {
                        ebVar = f191469e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191468d);
                            f191469e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
