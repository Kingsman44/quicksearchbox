package p5285d.p5290b.p5291a.p5292a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.v */
/* compiled from: PG */
public final class C68209v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C68209v f184561d;

    /* renamed from: e */
    private static volatile C63010eb f184562e;

    /* renamed from: a */
    public boolean f184563a;

    /* renamed from: b */
    public C62971cq f184564b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C62971cq f184565c = emptyProtobufList();

    static {
        C68209v vVar = new C68209v();
        f184561d = vVar;
        C62942bv.registerDefaultInstance(C68209v.class, vVar);
    }

    private C68209v() {
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
                return newMessageInfo(f184561d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0007\u0002Ț\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C68162ay.class});
            case 3:
                return new C68209v();
            case 4:
                return new C68208u();
            case 5:
                return f184561d;
            case 6:
                C63010eb ebVar = f184562e;
                if (ebVar == null) {
                    synchronized (C68209v.class) {
                        ebVar = f184562e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184561d);
                            f184562e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
