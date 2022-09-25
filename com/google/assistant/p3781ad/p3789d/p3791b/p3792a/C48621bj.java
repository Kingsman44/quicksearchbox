package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.bj */
/* compiled from: PG */
public final class C48621bj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48621bj f125640d;

    /* renamed from: e */
    private static volatile C63010eb f125641e;

    /* renamed from: a */
    public long f125642a;

    /* renamed from: b */
    public int f125643b;

    /* renamed from: c */
    public String f125644c = BuildConfig.FLAVOR;

    static {
        C48621bj bjVar = new C48621bj();
        f125640d = bjVar;
        C62942bv.registerDefaultInstance(C48621bj.class, bjVar);
    }

    private C48621bj() {
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
                return newMessageInfo(f125640d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48621bj();
            case 4:
                return new C48620bi();
            case 5:
                return f125640d;
            case 6:
                C63010eb ebVar = f125641e;
                if (ebVar == null) {
                    synchronized (C48621bj.class) {
                        ebVar = f125641e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125640d);
                            f125641e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
