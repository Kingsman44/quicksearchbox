package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.dm */
/* compiled from: PG */
public final class C71284dm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71284dm f190329e;

    /* renamed from: f */
    private static volatile C63010eb f190330f;

    /* renamed from: a */
    public int f190331a;

    /* renamed from: b */
    public int f190332b;

    /* renamed from: c */
    public int f190333c;

    /* renamed from: d */
    public int f190334d;

    static {
        C71284dm dmVar = new C71284dm();
        f190329e = dmVar;
        C62942bv.registerDefaultInstance(C71284dm.class, dmVar);
    }

    private C71284dm() {
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
                return newMessageInfo(f190329e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C71284dm();
            case 4:
                return new C71283dl();
            case 5:
                return f190329e;
            case 6:
                C63010eb ebVar = f190330f;
                if (ebVar == null) {
                    synchronized (C71284dm.class) {
                        ebVar = f190330f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190329e);
                            f190330f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
