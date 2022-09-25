package p211b.p212a.p216d;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: b.a.d.f */
/* compiled from: PG */
public final class C4659f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C4659f f14603e;

    /* renamed from: g */
    private static volatile C63010eb f14604g;

    /* renamed from: a */
    public float f14605a;

    /* renamed from: b */
    public float f14606b;

    /* renamed from: c */
    public float f14607c;

    /* renamed from: d */
    public float f14608d;

    /* renamed from: f */
    private int f14609f;

    static {
        C4659f fVar = new C4659f();
        f14603e = fVar;
        C62942bv.registerDefaultInstance(C4659f.class, fVar);
    }

    private C4659f() {
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
                return newMessageInfo(f14603e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C4659f();
            case 4:
                return new C4658e();
            case 5:
                return f14603e;
            case 6:
                C63010eb ebVar = f14604g;
                if (ebVar == null) {
                    synchronized (C4659f.class) {
                        ebVar = f14604g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14603e);
                            f14604g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
