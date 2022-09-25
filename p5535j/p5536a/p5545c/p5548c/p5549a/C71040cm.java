package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.cm */
/* compiled from: PG */
public final class C71040cm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71040cm f189458d;

    /* renamed from: e */
    private static volatile C63010eb f189459e;

    /* renamed from: a */
    public int f189460a;

    /* renamed from: b */
    public int f189461b;

    /* renamed from: c */
    public long f189462c;

    static {
        C71040cm cmVar = new C71040cm();
        f189458d = cmVar;
        C62942bv.registerDefaultInstance(C71040cm.class, cmVar);
    }

    private C71040cm() {
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
                return newMessageInfo(f189458d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C71039cl.f189457a, C45240c.f118157a});
            case 3:
                return new C71040cm();
            case 4:
                return new C71038ck();
            case 5:
                return f189458d;
            case 6:
                C63010eb ebVar = f189459e;
                if (ebVar == null) {
                    synchronized (C71040cm.class) {
                        ebVar = f189459e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189458d);
                            f189459e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
