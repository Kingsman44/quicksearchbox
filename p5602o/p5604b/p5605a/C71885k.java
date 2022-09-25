package p5602o.p5604b.p5605a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.b.a.k */
/* compiled from: PG */
public final class C71885k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71885k f191450d;

    /* renamed from: e */
    private static volatile C63010eb f191451e;

    /* renamed from: a */
    public int f191452a;

    /* renamed from: b */
    public int f191453b;

    /* renamed from: c */
    public long f191454c = 1;

    static {
        C71885k kVar = new C71885k();
        f191450d = kVar;
        C62942bv.registerDefaultInstance(C71885k.class, kVar);
    }

    private C71885k() {
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
                return newMessageInfo(f191450d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဂ\u0002\u0004ဌ\u0001", new Object[]{"a", C45240c.f118157a, "b", C71898x.f191497a});
            case 3:
                return new C71885k();
            case 4:
                return new C71884j();
            case 5:
                return f191450d;
            case 6:
                C63010eb ebVar = f191451e;
                if (ebVar == null) {
                    synchronized (C71885k.class) {
                        ebVar = f191451e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191450d);
                            f191451e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
