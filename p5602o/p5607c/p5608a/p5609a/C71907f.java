package p5602o.p5607c.p5608a.p5609a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.a.a.f */
/* compiled from: PG */
public final class C71907f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71907f f191511e;

    /* renamed from: f */
    private static volatile C63010eb f191512f;

    /* renamed from: a */
    public int f191513a;

    /* renamed from: b */
    public C71923v f191514b;

    /* renamed from: c */
    public C71913l f191515c;

    /* renamed from: d */
    public C71904c f191516d;

    static {
        C71907f fVar = new C71907f();
        f191511e = fVar;
        C62942bv.registerDefaultInstance(C71907f.class, fVar);
    }

    private C71907f() {
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
                return newMessageInfo(f191511e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C71907f();
            case 4:
                return new C71906e();
            case 5:
                return f191511e;
            case 6:
                C63010eb ebVar = f191512f;
                if (ebVar == null) {
                    synchronized (C71907f.class) {
                        ebVar = f191512f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191511e);
                            f191512f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
