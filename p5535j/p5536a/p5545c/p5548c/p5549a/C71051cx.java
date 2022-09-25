package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.cx */
/* compiled from: PG */
public final class C71051cx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71051cx f189486e;

    /* renamed from: f */
    private static volatile C63010eb f189487f;

    /* renamed from: a */
    public int f189488a;

    /* renamed from: b */
    public int f189489b;

    /* renamed from: c */
    public int f189490c;

    /* renamed from: d */
    public C62971cq f189491d = emptyProtobufList();

    static {
        C71051cx cxVar = new C71051cx();
        f189486e = cxVar;
        C62942bv.registerDefaultInstance(C71051cx.class, cxVar);
    }

    private C71051cx() {
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
                return newMessageInfo(f189486e, "\u0001\u0003\u0000\u0001\u0006\b\u0003\u0000\u0001\u0000\u0006ဌ\u0001\u0007\u001b\bဌ\u0002", new Object[]{"a", "b", C71049cv.f189485a, "d", C71047ct.class, C45240c.f118157a, C71052cy.f189492a});
            case 3:
                return new C71051cx();
            case 4:
                return new C71050cw();
            case 5:
                return f189486e;
            case 6:
                C63010eb ebVar = f189487f;
                if (ebVar == null) {
                    synchronized (C71051cx.class) {
                        ebVar = f189487f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189486e);
                            f189487f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
