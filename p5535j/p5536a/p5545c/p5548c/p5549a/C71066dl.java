package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.dl */
/* compiled from: PG */
public final class C71066dl extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71066dl f189528e;

    /* renamed from: f */
    private static volatile C63010eb f189529f;

    /* renamed from: a */
    public int f189530a;

    /* renamed from: b */
    public int f189531b = 0;

    /* renamed from: c */
    public Object f189532c;

    /* renamed from: d */
    public int f189533d;

    static {
        C71066dl dlVar = new C71066dl();
        f189528e = dlVar;
        C62942bv.registerDefaultInstance(C71066dl.class, dlVar);
    }

    private C71066dl() {
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
                return newMessageInfo(f189528e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C71065dk.class});
            case 3:
                return new C71066dl();
            case 4:
                return new C71061dg();
            case 5:
                return f189528e;
            case 6:
                C63010eb ebVar = f189529f;
                if (ebVar == null) {
                    synchronized (C71066dl.class) {
                        ebVar = f189529f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189528e);
                            f189529f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
