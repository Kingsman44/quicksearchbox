package p5285d.p5286a.p5287a.p5288a.p5289a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.a.a.a.a.v */
/* compiled from: PG */
public final class C68129v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C68129v f184390a;

    /* renamed from: b */
    private static volatile C63010eb f184391b;

    static {
        C68129v vVar = new C68129v();
        f184390a = vVar;
        C62942bv.registerDefaultInstance(C68129v.class, vVar);
    }

    private C68129v() {
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
                return newMessageInfo(f184390a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C68129v();
            case 4:
                return new C68128u();
            case 5:
                return f184390a;
            case 6:
                C63010eb ebVar = f184391b;
                if (ebVar == null) {
                    synchronized (C68129v.class) {
                        ebVar = f184391b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184390a);
                            f184391b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
