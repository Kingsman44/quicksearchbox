package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: d.b.a.a.r */
/* compiled from: PG */
public final class C68205r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68205r f184555b;

    /* renamed from: c */
    private static volatile C63010eb f184556c;

    /* renamed from: a */
    public C63088z f184557a = C63088z.f170246b;

    static {
        C68205r rVar = new C68205r();
        f184555b = rVar;
        C62942bv.registerDefaultInstance(C68205r.class, rVar);
    }

    private C68205r() {
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
                return newMessageInfo(f184555b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
            case 3:
                return new C68205r();
            case 4:
                return new C68204q();
            case 5:
                return f184555b;
            case 6:
                C63010eb ebVar = f184556c;
                if (ebVar == null) {
                    synchronized (C68205r.class) {
                        ebVar = f184556c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184555b);
                            f184556c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
