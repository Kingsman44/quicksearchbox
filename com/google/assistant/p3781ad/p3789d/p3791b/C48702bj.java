package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.p3790a.C48553f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.bj */
/* compiled from: PG */
public final class C48702bj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48702bj f125992e;

    /* renamed from: f */
    private static volatile C63010eb f125993f;

    /* renamed from: a */
    public int f125994a;

    /* renamed from: b */
    public String f125995b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f125996c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C48553f f125997d;

    static {
        C48702bj bjVar = new C48702bj();
        f125992e = bjVar;
        C62942bv.registerDefaultInstance(C48702bj.class, bjVar);
    }

    private C48702bj() {
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
                return newMessageInfo(f125992e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C48702bj();
            case 4:
                return new C48701bi();
            case 5:
                return f125992e;
            case 6:
                C63010eb ebVar = f125993f;
                if (ebVar == null) {
                    synchronized (C48702bj.class) {
                        ebVar = f125993f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125992e);
                            f125993f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
