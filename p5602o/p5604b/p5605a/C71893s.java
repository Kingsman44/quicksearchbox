package p5602o.p5604b.p5605a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.b.a.s */
/* compiled from: PG */
public final class C71893s extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71893s f191473f;

    /* renamed from: g */
    private static volatile C63010eb f191474g;

    /* renamed from: a */
    public int f191475a;

    /* renamed from: b */
    public int f191476b;

    /* renamed from: c */
    public int f191477c;

    /* renamed from: d */
    public long f191478d;

    /* renamed from: e */
    public long f191479e;

    static {
        C71893s sVar = new C71893s();
        f191473f = sVar;
        C62942bv.registerDefaultInstance(C71893s.class, sVar);
    }

    private C71893s() {
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
                return newMessageInfo(f191473f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0006ဂ\u0005", new Object[]{"a", "b", C71874ac.f191425a, C45240c.f118157a, C71875ad.f191426a, "d", "e"});
            case 3:
                return new C71893s();
            case 4:
                return new C71892r();
            case 5:
                return f191473f;
            case 6:
                C63010eb ebVar = f191474g;
                if (ebVar == null) {
                    synchronized (C71893s.class) {
                        ebVar = f191474g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191473f);
                            f191474g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
