package p5602o.p5607c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.c */
/* compiled from: PG */
public final class C71932c extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71932c f191583f;

    /* renamed from: g */
    private static volatile C63010eb f191584g;

    /* renamed from: a */
    public int f191585a;

    /* renamed from: b */
    public boolean f191586b;

    /* renamed from: c */
    public long f191587c;

    /* renamed from: d */
    public long f191588d;

    /* renamed from: e */
    public boolean f191589e;

    static {
        C71932c cVar = new C71932c();
        f191583f = cVar;
        C62942bv.registerDefaultInstance(C71932c.class, cVar);
    }

    private C71932c() {
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
                return newMessageInfo(f191583f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C71932c();
            case 4:
                return new C71931b();
            case 5:
                return f191583f;
            case 6:
                C63010eb ebVar = f191584g;
                if (ebVar == null) {
                    synchronized (C71932c.class) {
                        ebVar = f191584g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191583f);
                            f191584g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
