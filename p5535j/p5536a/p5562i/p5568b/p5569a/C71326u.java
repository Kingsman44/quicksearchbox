package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.u */
/* compiled from: PG */
public final class C71326u extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71326u f190493e;

    /* renamed from: f */
    private static volatile C63010eb f190494f;

    /* renamed from: a */
    public int f190495a;

    /* renamed from: b */
    public C62971cq f190496b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f190497c = emptyProtobufList();

    /* renamed from: d */
    public C71324s f190498d;

    static {
        C71326u uVar = new C71326u();
        f190493e = uVar;
        C62942bv.registerDefaultInstance(C71326u.class, uVar);
    }

    private C71326u() {
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
                return newMessageInfo(f190493e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"a", "b", C71191aa.class, C45240c.f118157a, C71322q.class, "d"});
            case 3:
                return new C71326u();
            case 4:
                return new C71325t();
            case 5:
                return f190493e;
            case 6:
                C63010eb ebVar = f190494f;
                if (ebVar == null) {
                    synchronized (C71326u.class) {
                        ebVar = f190494f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190493e);
                            f190494f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
