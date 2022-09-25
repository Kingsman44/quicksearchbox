package p001a.p007b.p011b.p012a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.b.b.a.e */
/* compiled from: PG */
public final class C0029e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C0029e f87d;

    /* renamed from: e */
    private static volatile C63010eb f88e;

    /* renamed from: a */
    public String f89a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f90b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f91c = BuildConfig.FLAVOR;

    static {
        C0029e eVar = new C0029e();
        f87d = eVar;
        C62942bv.registerDefaultInstance(C0029e.class, eVar);
    }

    private C0029e() {
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
                return newMessageInfo(f87d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C0029e();
            case 4:
                return new C0028d();
            case 5:
                return f87d;
            case 6:
                C63010eb ebVar = f88e;
                if (ebVar == null) {
                    synchronized (C0029e.class) {
                        ebVar = f88e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87d);
                            f88e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
