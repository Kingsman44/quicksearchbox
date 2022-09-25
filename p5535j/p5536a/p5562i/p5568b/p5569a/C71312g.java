package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.g */
/* compiled from: PG */
public final class C71312g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71312g f190446e;

    /* renamed from: f */
    private static volatile C63010eb f190447f;

    /* renamed from: a */
    public int f190448a;

    /* renamed from: b */
    public C62971cq f190449b = emptyProtobufList();

    /* renamed from: c */
    public C71314i f190450c;

    /* renamed from: d */
    public int f190451d;

    static {
        C71312g gVar = new C71312g();
        f190446e = gVar;
        C62942bv.registerDefaultInstance(C71312g.class, gVar);
    }

    private C71312g() {
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
                return newMessageInfo(f190446e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003င\u0001", new Object[]{"a", "b", C71298e.class, C45240c.f118157a, "d"});
            case 3:
                return new C71312g();
            case 4:
                return new C71311f();
            case 5:
                return f190446e;
            case 6:
                C63010eb ebVar = f190447f;
                if (ebVar == null) {
                    synchronized (C71312g.class) {
                        ebVar = f190447f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190446e);
                            f190447f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
