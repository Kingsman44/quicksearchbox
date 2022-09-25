package p5304e.p5305a.p5306a.p5431u.p5434b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: e.a.a.u.b.g */
/* compiled from: PG */
public final class C69241g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f185342e = new C69239e();

    /* renamed from: f */
    public static final C69241g f185343f;

    /* renamed from: g */
    private static volatile C63010eb f185344g;

    /* renamed from: a */
    public int f185345a;

    /* renamed from: b */
    public int f185346b;

    /* renamed from: c */
    public int f185347c;

    /* renamed from: d */
    public C62961ch f185348d = emptyIntList();

    static {
        C69241g gVar = new C69241g();
        f185343f = gVar;
        C62942bv.registerDefaultInstance(C69241g.class, gVar);
    }

    private C69241g() {
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
                return newMessageInfo(f185343f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u001e", new Object[]{"a", "b", C45240c.f118157a, "d", C53306j.m86810b()});
            case 3:
                return new C69241g();
            case 4:
                return new C69240f();
            case 5:
                return f185343f;
            case 6:
                C63010eb ebVar = f185344g;
                if (ebVar == null) {
                    synchronized (C69241g.class) {
                        ebVar = f185344g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185343f);
                            f185344g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
