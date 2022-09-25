package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.el */
/* compiled from: PG */
public final class C71093el extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71093el f189603d;

    /* renamed from: e */
    private static volatile C63010eb f189604e;

    /* renamed from: a */
    public int f189605a;

    /* renamed from: b */
    public int f189606b;

    /* renamed from: c */
    public long f189607c;

    static {
        C71093el elVar = new C71093el();
        f189603d = elVar;
        C62942bv.registerDefaultInstance(C71093el.class, elVar);
    }

    private C71093el() {
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
                return newMessageInfo(f189603d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C71109fa.m103889b(), C45240c.f118157a});
            case 3:
                return new C71093el();
            case 4:
                return new C71092ek();
            case 5:
                return f189603d;
            case 6:
                C63010eb ebVar = f189604e;
                if (ebVar == null) {
                    synchronized (C71093el.class) {
                        ebVar = f189604e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189603d);
                            f189604e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
