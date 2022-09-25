package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.bs */
/* compiled from: PG */
public final class C68183bs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C68183bs f184493c;

    /* renamed from: d */
    private static volatile C63010eb f184494d;

    /* renamed from: a */
    public C68187bw f184495a;

    /* renamed from: b */
    public C68185bu f184496b;

    static {
        C68183bs bsVar = new C68183bs();
        f184493c = bsVar;
        C62942bv.registerDefaultInstance(C68183bs.class, bsVar);
    }

    private C68183bs() {
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
                return newMessageInfo(f184493c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C68183bs();
            case 4:
                return new C68182br();
            case 5:
                return f184493c;
            case 6:
                C63010eb ebVar = f184494d;
                if (ebVar == null) {
                    synchronized (C68183bs.class) {
                        ebVar = f184494d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184493c);
                            f184494d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
