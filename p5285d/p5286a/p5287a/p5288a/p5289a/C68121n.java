package p5285d.p5286a.p5287a.p5288a.p5289a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.a.a.a.a.n */
/* compiled from: PG */
public final class C68121n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C68121n f184372c;

    /* renamed from: d */
    private static volatile C63010eb f184373d;

    /* renamed from: a */
    public int f184374a;

    /* renamed from: b */
    public int f184375b;

    static {
        C68121n nVar = new C68121n();
        f184372c = nVar;
        C62942bv.registerDefaultInstance(C68121n.class, nVar);
    }

    private C68121n() {
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
                return newMessageInfo(f184372c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0004\u0003\f", new Object[]{"a", "b"});
            case 3:
                return new C68121n();
            case 4:
                return new C68120m();
            case 5:
                return f184372c;
            case 6:
                C63010eb ebVar = f184373d;
                if (ebVar == null) {
                    synchronized (C68121n.class) {
                        ebVar = f184373d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184372c);
                            f184373d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
