package p211b.p212a.p216d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: b.a.d.h */
/* compiled from: PG */
public final class C4661h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C4661h f14610f;

    /* renamed from: g */
    private static volatile C63010eb f14611g;

    /* renamed from: a */
    public int f14612a;

    /* renamed from: b */
    public int f14613b;

    /* renamed from: c */
    public int f14614c;

    /* renamed from: d */
    public int f14615d;

    /* renamed from: e */
    public int f14616e;

    static {
        C4661h hVar = new C4661h();
        f14610f = hVar;
        C62942bv.registerDefaultInstance(C4661h.class, hVar);
    }

    private C4661h() {
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
                return newMessageInfo(f14610f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C4661h();
            case 4:
                return new C4660g();
            case 5:
                return f14610f;
            case 6:
                C63010eb ebVar = f14611g;
                if (ebVar == null) {
                    synchronized (C4661h.class) {
                        ebVar = f14611g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14610f);
                            f14611g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
