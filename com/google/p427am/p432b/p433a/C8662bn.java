package com.google.p427am.p432b.p433a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.bn */
/* compiled from: PG */
public final class C8662bn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8662bn f29965e;

    /* renamed from: f */
    private static volatile C63010eb f29966f;

    /* renamed from: a */
    public String f29967a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f29968b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C8654bf f29969c;

    /* renamed from: d */
    public String f29970d = BuildConfig.FLAVOR;

    static {
        C8662bn bnVar = new C8662bn();
        f29965e = bnVar;
        C62942bv.registerDefaultInstance(C8662bn.class, bnVar);
    }

    private C8662bn() {
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
                return newMessageInfo(f29965e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C8662bn();
            case 4:
                return new C8661bm();
            case 5:
                return f29965e;
            case 6:
                C63010eb ebVar = f29966f;
                if (ebVar == null) {
                    synchronized (C8662bn.class) {
                        ebVar = f29966f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29965e);
                            f29966f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
