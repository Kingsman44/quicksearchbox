package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.ao */
/* compiled from: PG */
public final class C70988ao extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C70988ao f189297d;

    /* renamed from: e */
    private static volatile C63010eb f189298e;

    /* renamed from: a */
    public int f189299a;

    /* renamed from: b */
    public int f189300b;

    /* renamed from: c */
    public String f189301c = BuildConfig.FLAVOR;

    static {
        C70988ao aoVar = new C70988ao();
        f189297d = aoVar;
        C62942bv.registerDefaultInstance(C70988ao.class, aoVar);
    }

    private C70988ao() {
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
                return newMessageInfo(f189297d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C70986am.f189296a, C45240c.f118157a});
            case 3:
                return new C70988ao();
            case 4:
                return new C70987an();
            case 5:
                return f189297d;
            case 6:
                C63010eb ebVar = f189298e;
                if (ebVar == null) {
                    synchronized (C70988ao.class) {
                        ebVar = f189298e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189297d);
                            f189298e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
