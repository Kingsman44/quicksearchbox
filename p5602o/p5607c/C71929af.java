package p5602o.p5607c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.af */
/* compiled from: PG */
public final class C71929af extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71929af f191569f;

    /* renamed from: g */
    private static volatile C63010eb f191570g;

    /* renamed from: a */
    public int f191571a;

    /* renamed from: b */
    public C71934e f191572b;

    /* renamed from: c */
    public int f191573c;

    /* renamed from: d */
    public C71940k f191574d;

    /* renamed from: e */
    public C71932c f191575e;

    static {
        C71929af afVar = new C71929af();
        f191569f = afVar;
        C62942bv.registerDefaultInstance(C71929af.class, afVar);
    }

    private C71929af() {
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
                return newMessageInfo(f191569f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဉ\u0004\u0006ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", "d"});
            case 3:
                return new C71929af();
            case 4:
                return new C71928ae();
            case 5:
                return f191569f;
            case 6:
                C63010eb ebVar = f191570g;
                if (ebVar == null) {
                    synchronized (C71929af.class) {
                        ebVar = f191570g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191569f);
                            f191570g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
