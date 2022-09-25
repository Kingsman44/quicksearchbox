package p211b.p212a.p216d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: b.a.d.b */
/* compiled from: PG */
public final class C4655b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C4655b f14597c;

    /* renamed from: d */
    private static volatile C63010eb f14598d;

    /* renamed from: a */
    public int f14599a;

    /* renamed from: b */
    public String f14600b = BuildConfig.FLAVOR;

    static {
        C4655b bVar = new C4655b();
        f14597c = bVar;
        C62942bv.registerDefaultInstance(C4655b.class, bVar);
    }

    private C4655b() {
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
                return newMessageInfo(f14597c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C4655b();
            case 4:
                return new C4654a();
            case 5:
                return f14597c;
            case 6:
                C63010eb ebVar = f14598d;
                if (ebVar == null) {
                    synchronized (C4655b.class) {
                        ebVar = f14598d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14597c);
                            f14598d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
