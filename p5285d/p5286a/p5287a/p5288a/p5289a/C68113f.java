package p5285d.p5286a.p5287a.p5288a.p5289a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.a.a.a.a.f */
/* compiled from: PG */
public final class C68113f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68113f f184350b;

    /* renamed from: c */
    private static volatile C63010eb f184351c;

    /* renamed from: a */
    public C68117j f184352a;

    static {
        C68113f fVar = new C68113f();
        f184350b = fVar;
        C62942bv.registerDefaultInstance(C68113f.class, fVar);
    }

    private C68113f() {
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
                return newMessageInfo(f184350b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C68113f();
            case 4:
                return new C68112e();
            case 5:
                return f184350b;
            case 6:
                C63010eb ebVar = f184351c;
                if (ebVar == null) {
                    synchronized (C68113f.class) {
                        ebVar = f184351c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184350b);
                            f184351c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
