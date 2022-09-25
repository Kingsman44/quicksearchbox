package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.aa */
/* compiled from: PG */
public final class C71191aa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71191aa f189947e;

    /* renamed from: f */
    private static volatile C63010eb f189948f;

    /* renamed from: a */
    public int f189949a;

    /* renamed from: b */
    public int f189950b;

    /* renamed from: c */
    public int f189951c;

    /* renamed from: d */
    public C71324s f189952d;

    static {
        C71191aa aaVar = new C71191aa();
        f189947e = aaVar;
        C62942bv.registerDefaultInstance(C71191aa.class, aaVar);
    }

    private C71191aa() {
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
                return newMessageInfo(f189947e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C71191aa();
            case 4:
                return new C71331z();
            case 5:
                return f189947e;
            case 6:
                C63010eb ebVar = f189948f;
                if (ebVar == null) {
                    synchronized (C71191aa.class) {
                        ebVar = f189948f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189947e);
                            f189948f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
