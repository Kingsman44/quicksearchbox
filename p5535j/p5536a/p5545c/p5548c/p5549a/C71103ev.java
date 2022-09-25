package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.ev */
/* compiled from: PG */
public final class C71103ev extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71103ev f189634d;

    /* renamed from: e */
    private static volatile C63010eb f189635e;

    /* renamed from: a */
    public int f189636a;

    /* renamed from: b */
    public int f189637b;

    /* renamed from: c */
    public int f189638c;

    static {
        C71103ev evVar = new C71103ev();
        f189634d = evVar;
        C62942bv.registerDefaultInstance(C71103ev.class, evVar);
    }

    private C71103ev() {
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
                return newMessageInfo(f189634d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C71102eu.m103886b(), C45240c.f118157a, C71102eu.m103886b()});
            case 3:
                return new C71103ev();
            case 4:
                return new C71100es();
            case 5:
                return f189634d;
            case 6:
                C63010eb ebVar = f189635e;
                if (ebVar == null) {
                    synchronized (C71103ev.class) {
                        ebVar = f189635e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189634d);
                            f189635e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
