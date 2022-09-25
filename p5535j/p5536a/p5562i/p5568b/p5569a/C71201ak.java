package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.ak */
/* compiled from: PG */
public final class C71201ak extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71201ak f190042f;

    /* renamed from: g */
    private static volatile C63010eb f190043g;

    /* renamed from: a */
    public int f190044a;

    /* renamed from: b */
    public boolean f190045b;

    /* renamed from: c */
    public boolean f190046c;

    /* renamed from: d */
    public boolean f190047d;

    /* renamed from: e */
    public boolean f190048e;

    static {
        C71201ak akVar = new C71201ak();
        f190042f = akVar;
        C62942bv.registerDefaultInstance(C71201ak.class, akVar);
    }

    private C71201ak() {
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
                return newMessageInfo(f190042f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C71201ak();
            case 4:
                return new C71200aj();
            case 5:
                return f190042f;
            case 6:
                C63010eb ebVar = f190043g;
                if (ebVar == null) {
                    synchronized (C71201ak.class) {
                        ebVar = f190043g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190042f);
                            f190043g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
