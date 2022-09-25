package p5602o.p5607c.p5608a.p5609a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.a.a.s */
/* compiled from: PG */
public final class C71920s extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71920s f191539e;

    /* renamed from: f */
    private static volatile C63010eb f191540f;

    /* renamed from: a */
    public int f191541a;

    /* renamed from: b */
    public int f191542b;

    /* renamed from: c */
    public int f191543c;

    /* renamed from: d */
    public int f191544d;

    static {
        C71920s sVar = new C71920s();
        f191539e = sVar;
        C62942bv.registerDefaultInstance(C71920s.class, sVar);
    }

    private C71920s() {
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
                return newMessageInfo(f191539e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", C71921t.f191545a, C45240c.f118157a, C71914m.f191530a, "d"});
            case 3:
                return new C71920s();
            case 4:
                return new C71919r();
            case 5:
                return f191539e;
            case 6:
                C63010eb ebVar = f191540f;
                if (ebVar == null) {
                    synchronized (C71920s.class) {
                        ebVar = f191540f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191539e);
                            f191540f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
