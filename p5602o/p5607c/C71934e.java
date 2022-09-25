package p5602o.p5607c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.e */
/* compiled from: PG */
public final class C71934e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71934e f191590e;

    /* renamed from: f */
    private static volatile C63010eb f191591f;

    /* renamed from: a */
    public int f191592a;

    /* renamed from: b */
    public int f191593b;

    /* renamed from: c */
    public String f191594c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C71936g f191595d;

    static {
        C71934e eVar = new C71934e();
        f191590e = eVar;
        C62942bv.registerDefaultInstance(C71934e.class, eVar);
    }

    private C71934e() {
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
                return newMessageInfo(f191590e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C71934e();
            case 4:
                return new C71933d();
            case 5:
                return f191590e;
            case 6:
                C63010eb ebVar = f191591f;
                if (ebVar == null) {
                    synchronized (C71934e.class) {
                        ebVar = f191591f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191590e);
                            f191591f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
