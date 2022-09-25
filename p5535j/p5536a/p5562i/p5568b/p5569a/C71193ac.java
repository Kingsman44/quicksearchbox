package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.ac */
/* compiled from: PG */
public final class C71193ac extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71193ac f189953e;

    /* renamed from: f */
    private static volatile C63010eb f189954f;

    /* renamed from: a */
    public int f189955a;

    /* renamed from: b */
    public int f189956b;

    /* renamed from: c */
    public long f189957c;

    /* renamed from: d */
    public C71324s f189958d;

    static {
        C71193ac acVar = new C71193ac();
        f189953e = acVar;
        C62942bv.registerDefaultInstance(C71193ac.class, acVar);
    }

    private C71193ac() {
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
                return newMessageInfo(f189953e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C71193ac();
            case 4:
                return new C71192ab();
            case 5:
                return f189953e;
            case 6:
                C63010eb ebVar = f189954f;
                if (ebVar == null) {
                    synchronized (C71193ac.class) {
                        ebVar = f189954f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189953e);
                            f189954f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
