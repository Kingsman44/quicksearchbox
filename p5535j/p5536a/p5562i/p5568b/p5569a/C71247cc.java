package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.cc */
/* compiled from: PG */
public final class C71247cc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71247cc f190208d;

    /* renamed from: e */
    private static volatile C63010eb f190209e;

    /* renamed from: a */
    public int f190210a;

    /* renamed from: b */
    public int f190211b;

    /* renamed from: c */
    public long f190212c;

    static {
        C71247cc ccVar = new C71247cc();
        f190208d = ccVar;
        C62942bv.registerDefaultInstance(C71247cc.class, ccVar);
    }

    private C71247cc() {
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
                return newMessageInfo(f190208d, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005င\u0000\u0006ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71247cc();
            case 4:
                return new C71246cb();
            case 5:
                return f190208d;
            case 6:
                C63010eb ebVar = f190209e;
                if (ebVar == null) {
                    synchronized (C71247cc.class) {
                        ebVar = f190209e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190208d);
                            f190209e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
