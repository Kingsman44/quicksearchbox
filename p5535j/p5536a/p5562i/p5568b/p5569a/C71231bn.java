package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.bn */
/* compiled from: PG */
public final class C71231bn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71231bn f190159c;

    /* renamed from: d */
    private static volatile C63010eb f190160d;

    /* renamed from: a */
    public int f190161a;

    /* renamed from: b */
    public int f190162b = -1;

    static {
        C71231bn bnVar = new C71231bn();
        f190159c = bnVar;
        C62942bv.registerDefaultInstance(C71231bn.class, bnVar);
    }

    private C71231bn() {
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
                return newMessageInfo(f190159c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C71229bl.f190158a});
            case 3:
                return new C71231bn();
            case 4:
                return new C71228bk();
            case 5:
                return f190159c;
            case 6:
                C63010eb ebVar = f190160d;
                if (ebVar == null) {
                    synchronized (C71231bn.class) {
                        ebVar = f190160d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190159c);
                            f190160d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
