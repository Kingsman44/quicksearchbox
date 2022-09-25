package com.google.android.libraries.p11016ak;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.ak.n */
/* compiled from: PG */
public final class C147732n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C147732n f398646d;

    /* renamed from: e */
    private static volatile C63010eb f398647e;

    /* renamed from: a */
    public C63088z f398648a = C63088z.f170246b;

    /* renamed from: b */
    public String f398649b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62910ar f398650c;

    static {
        C147732n nVar = new C147732n();
        f398646d = nVar;
        C62942bv.registerDefaultInstance(C147732n.class, nVar);
    }

    private C147732n() {
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
                return newMessageInfo(f398646d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C147732n();
            case 4:
                return new C147731m();
            case 5:
                return f398646d;
            case 6:
                C63010eb ebVar = f398647e;
                if (ebVar == null) {
                    synchronized (C147732n.class) {
                        ebVar = f398647e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398646d);
                            f398647e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
