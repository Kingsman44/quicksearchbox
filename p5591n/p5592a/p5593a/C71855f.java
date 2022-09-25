package p5591n.p5592a.p5593a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: n.a.a.f */
/* compiled from: PG */
public final class C71855f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71855f f191394d;

    /* renamed from: e */
    private static volatile C63010eb f191395e;

    /* renamed from: a */
    public int f191396a;

    /* renamed from: b */
    public String f191397b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C71853d f191398c;

    static {
        C71855f fVar = new C71855f();
        f191394d = fVar;
        C62942bv.registerDefaultInstance(C71855f.class, fVar);
    }

    private C71855f() {
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
                return newMessageInfo(f191394d, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71855f();
            case 4:
                return new C71854e();
            case 5:
                return f191394d;
            case 6:
                C63010eb ebVar = f191395e;
                if (ebVar == null) {
                    synchronized (C71855f.class) {
                        ebVar = f191395e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191394d);
                            f191395e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
