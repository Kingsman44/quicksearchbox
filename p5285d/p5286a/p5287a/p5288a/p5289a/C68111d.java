package p5285d.p5286a.p5287a.p5288a.p5289a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.a.a.a.a.d */
/* compiled from: PG */
public final class C68111d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C68111d f184346c;

    /* renamed from: d */
    private static volatile C63010eb f184347d;

    /* renamed from: a */
    public int f184348a;

    /* renamed from: b */
    public C68109b f184349b;

    static {
        C68111d dVar = new C68111d();
        f184346c = dVar;
        C62942bv.registerDefaultInstance(C68111d.class, dVar);
    }

    private C68111d() {
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
                return newMessageInfo(f184346c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\f\u0003\t", new Object[]{"a", "b"});
            case 3:
                return new C68111d();
            case 4:
                return new C68110c();
            case 5:
                return f184346c;
            case 6:
                C63010eb ebVar = f184347d;
                if (ebVar == null) {
                    synchronized (C68111d.class) {
                        ebVar = f184347d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184346c);
                            f184347d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
