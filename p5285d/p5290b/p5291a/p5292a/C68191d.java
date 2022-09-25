package p5285d.p5290b.p5291a.p5292a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.d */
/* compiled from: PG */
public final class C68191d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C68191d f184508d;

    /* renamed from: e */
    private static volatile C63010eb f184509e;

    /* renamed from: a */
    public C68169be f184510a;

    /* renamed from: b */
    public C68179bo f184511b;

    /* renamed from: c */
    public C68169be f184512c;

    static {
        C68191d dVar = new C68191d();
        f184508d = dVar;
        C62942bv.registerDefaultInstance(C68191d.class, dVar);
    }

    private C68191d() {
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
                return newMessageInfo(f184508d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C68191d();
            case 4:
                return new C68190c();
            case 5:
                return f184508d;
            case 6:
                C63010eb ebVar = f184509e;
                if (ebVar == null) {
                    synchronized (C68191d.class) {
                        ebVar = f184509e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184508d);
                            f184509e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
