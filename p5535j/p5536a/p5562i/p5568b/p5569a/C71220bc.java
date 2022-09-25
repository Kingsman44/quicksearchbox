package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.bc */
/* compiled from: PG */
public final class C71220bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71220bc f190135c;

    /* renamed from: d */
    private static volatile C63010eb f190136d;

    /* renamed from: a */
    public int f190137a;

    /* renamed from: b */
    public boolean f190138b;

    static {
        C71220bc bcVar = new C71220bc();
        f190135c = bcVar;
        C62942bv.registerDefaultInstance(C71220bc.class, bcVar);
    }

    private C71220bc() {
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
                return newMessageInfo(f190135c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71220bc();
            case 4:
                return new C71219bb();
            case 5:
                return f190135c;
            case 6:
                C63010eb ebVar = f190136d;
                if (ebVar == null) {
                    synchronized (C71220bc.class) {
                        ebVar = f190136d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190135c);
                            f190136d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
