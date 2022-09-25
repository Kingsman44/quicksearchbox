package p5451f.p5452a.p5453a.p5454a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.cb */
/* compiled from: PG */
public final class C69434cb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C69434cb f185792e;

    /* renamed from: f */
    private static volatile C63010eb f185793f;

    /* renamed from: a */
    public int f185794a;

    /* renamed from: b */
    public int f185795b = 0;

    /* renamed from: c */
    public Object f185796c;

    /* renamed from: d */
    public long f185797d;

    static {
        C69434cb cbVar = new C69434cb();
        f185792e = cbVar;
        C62942bv.registerDefaultInstance(C69434cb.class, cbVar);
    }

    private C69434cb() {
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
                return newMessageInfo(f185792e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဂ\u0002\u0003ဿ\u0000", new Object[]{C45240c.f118157a, "b", "a", C69436cd.m100759b(), "d", C69431bz.m100757b()});
            case 3:
                return new C69434cb();
            case 4:
                return new C69433ca();
            case 5:
                return f185792e;
            case 6:
                C63010eb ebVar = f185793f;
                if (ebVar == null) {
                    synchronized (C69434cb.class) {
                        ebVar = f185793f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185792e);
                            f185793f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
