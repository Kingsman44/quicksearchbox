package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.el */
/* compiled from: PG */
public final class C71310el extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71310el f190441d;

    /* renamed from: e */
    private static volatile C63010eb f190442e;

    /* renamed from: a */
    public int f190443a;

    /* renamed from: b */
    public long f190444b;

    /* renamed from: c */
    public int f190445c;

    static {
        C71310el elVar = new C71310el();
        f190441d = elVar;
        C62942bv.registerDefaultInstance(C71310el.class, elVar);
    }

    private C71310el() {
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
                return newMessageInfo(f190441d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C71248cd.f190213a});
            case 3:
                return new C71310el();
            case 4:
                return new C71309ek();
            case 5:
                return f190441d;
            case 6:
                C63010eb ebVar = f190442e;
                if (ebVar == null) {
                    synchronized (C71310el.class) {
                        ebVar = f190442e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190441d);
                            f190442e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
