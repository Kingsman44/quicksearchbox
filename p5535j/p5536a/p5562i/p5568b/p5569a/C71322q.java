package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.q */
/* compiled from: PG */
public final class C71322q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71322q f190483d;

    /* renamed from: e */
    private static volatile C63010eb f190484e;

    /* renamed from: a */
    public int f190485a;

    /* renamed from: b */
    public int f190486b;

    /* renamed from: c */
    public C71324s f190487c;

    static {
        C71322q qVar = new C71322q();
        f190483d = qVar;
        C62942bv.registerDefaultInstance(C71322q.class, qVar);
    }

    private C71322q() {
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
                return newMessageInfo(f190483d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71322q();
            case 4:
                return new C71321p();
            case 5:
                return f190483d;
            case 6:
                C63010eb ebVar = f190484e;
                if (ebVar == null) {
                    synchronized (C71322q.class) {
                        ebVar = f190484e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190483d);
                            f190484e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
