package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.bn */
/* compiled from: PG */
public final class C71014bn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71014bn f189381e;

    /* renamed from: f */
    private static volatile C63010eb f189382f;

    /* renamed from: a */
    public int f189383a;

    /* renamed from: b */
    public int f189384b;

    /* renamed from: c */
    public boolean f189385c;

    /* renamed from: d */
    public boolean f189386d;

    static {
        C71014bn bnVar = new C71014bn();
        f189381e = bnVar;
        C62942bv.registerDefaultInstance(C71014bn.class, bnVar);
    }

    private C71014bn() {
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
                return newMessageInfo(f189381e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", C71012bl.f189380a, C45240c.f118157a, "d"});
            case 3:
                return new C71014bn();
            case 4:
                return new C71013bm();
            case 5:
                return f189381e;
            case 6:
                C63010eb ebVar = f189382f;
                if (ebVar == null) {
                    synchronized (C71014bn.class) {
                        ebVar = f189382f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189381e);
                            f189382f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
