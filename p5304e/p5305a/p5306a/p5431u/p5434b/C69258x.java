package p5304e.p5305a.p5306a.p5431u.p5434b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: e.a.a.u.b.x */
/* compiled from: PG */
public final class C69258x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C69258x f185379c;

    /* renamed from: d */
    private static volatile C63010eb f185380d;

    /* renamed from: a */
    public int f185381a;

    /* renamed from: b */
    public C69256v f185382b;

    static {
        C69258x xVar = new C69258x();
        f185379c = xVar;
        C62942bv.registerDefaultInstance(C69258x.class, xVar);
    }

    private C69258x() {
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
                return newMessageInfo(f185379c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C69258x();
            case 4:
                return new C69257w();
            case 5:
                return f185379c;
            case 6:
                C63010eb ebVar = f185380d;
                if (ebVar == null) {
                    synchronized (C69258x.class) {
                        ebVar = f185380d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185379c);
                            f185380d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
