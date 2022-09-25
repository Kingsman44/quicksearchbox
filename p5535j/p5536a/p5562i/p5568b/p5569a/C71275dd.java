package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60110ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.dd */
/* compiled from: PG */
public final class C71275dd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C71275dd f190301a;

    /* renamed from: e */
    private static volatile C63010eb f190302e;

    /* renamed from: b */
    private int f190303b;

    /* renamed from: c */
    private C60110ab f190304c;

    /* renamed from: d */
    private byte f190305d = 2;

    static {
        C71275dd ddVar = new C71275dd();
        f190301a = ddVar;
        C62942bv.registerDefaultInstance(C71275dd.class, ddVar);
    }

    private C71275dd() {
        emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f190305d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f190305d = b;
                return null;
            case 2:
                return newMessageInfo(f190301a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0004", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C71275dd();
            case 4:
                return new C71274dc();
            case 5:
                return f190301a;
            case 6:
                C63010eb ebVar = f190302e;
                if (ebVar == null) {
                    synchronized (C71275dd.class) {
                        ebVar = f190302e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190301a);
                            f190302e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
