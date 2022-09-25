package p5451f.p5452a.p5453a.p5454a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.az */
/* compiled from: PG */
public final class C69404az extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C69404az f185706d;

    /* renamed from: e */
    private static volatile C63010eb f185707e;

    /* renamed from: a */
    public int f185708a;

    /* renamed from: b */
    public int f185709b;

    /* renamed from: c */
    public int f185710c;

    static {
        C69404az azVar = new C69404az();
        f185706d = azVar;
        C62942bv.registerDefaultInstance(C69404az.class, azVar);
    }

    private C69404az() {
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
                return newMessageInfo(f185706d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", C69436cd.m100759b(), C45240c.f118157a});
            case 3:
                return new C69404az();
            case 4:
                return new C69403ay();
            case 5:
                return f185706d;
            case 6:
                C63010eb ebVar = f185707e;
                if (ebVar == null) {
                    synchronized (C69404az.class) {
                        ebVar = f185707e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185706d);
                            f185707e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
