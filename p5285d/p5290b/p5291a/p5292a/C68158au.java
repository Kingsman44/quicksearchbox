package p5285d.p5290b.p5291a.p5292a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: d.b.a.a.au */
/* compiled from: PG */
public final class C68158au extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C68158au f184441d;

    /* renamed from: e */
    private static volatile C63010eb f184442e;

    /* renamed from: a */
    public int f184443a = 0;

    /* renamed from: b */
    public Object f184444b;

    /* renamed from: c */
    public C63088z f184445c = C63088z.f170246b;

    static {
        C68158au auVar = new C68158au();
        f184441d = auVar;
        C62942bv.registerDefaultInstance(C68158au.class, auVar);
    }

    private C68158au() {
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
                return newMessageInfo(f184441d, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002\n", new Object[]{"b", "a", C68150am.class, C45240c.f118157a});
            case 3:
                return new C68158au();
            case 4:
                return new C68157at();
            case 5:
                return f184441d;
            case 6:
                C63010eb ebVar = f184442e;
                if (ebVar == null) {
                    synchronized (C68158au.class) {
                        ebVar = f184442e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184441d);
                            f184442e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
