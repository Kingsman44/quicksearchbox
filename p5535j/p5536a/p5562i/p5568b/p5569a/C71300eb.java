package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.eb */
/* compiled from: PG */
public final class C71300eb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71300eb f190397d;

    /* renamed from: g */
    private static volatile C63010eb f190398g;

    /* renamed from: a */
    public int f190399a;

    /* renamed from: b */
    public int f190400b;

    /* renamed from: c */
    public int f190401c = 1;

    /* renamed from: e */
    private C71297dz f190402e;

    /* renamed from: f */
    private byte f190403f = 2;

    static {
        C71300eb ebVar = new C71300eb();
        f190397d = ebVar;
        C62942bv.registerDefaultInstance(C71300eb.class, ebVar);
    }

    private C71300eb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f190403f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f190403f = b;
                return null;
            case 2:
                return newMessageInfo(f190397d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C71299ea.f190396a, C45240c.f118157a, "e"});
            case 3:
                return new C71300eb();
            case 4:
                return new C71295dx();
            case 5:
                return f190397d;
            case 6:
                C63010eb ebVar = f190398g;
                if (ebVar == null) {
                    synchronized (C71300eb.class) {
                        ebVar = f190398g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190397d);
                            f190398g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
