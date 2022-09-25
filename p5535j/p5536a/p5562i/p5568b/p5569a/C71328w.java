package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.w */
/* compiled from: PG */
public final class C71328w extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C71328w f190499a;

    /* renamed from: b */
    private static volatile C63010eb f190500b;

    static {
        C71328w wVar = new C71328w();
        f190499a = wVar;
        C62942bv.registerDefaultInstance(C71328w.class, wVar);
    }

    private C71328w() {
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
                return newMessageInfo(f190499a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C71328w();
            case 4:
                return new C71327v();
            case 5:
                return f190499a;
            case 6:
                C63010eb ebVar = f190500b;
                if (ebVar == null) {
                    synchronized (C71328w.class) {
                        ebVar = f190500b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190499a);
                            f190500b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
