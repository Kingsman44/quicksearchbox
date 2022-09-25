package com.google.p4172bg;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.af */
/* compiled from: PG */
public final class C55698af extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55698af f146937e;

    /* renamed from: f */
    private static volatile C63010eb f146938f;

    /* renamed from: a */
    public String f146939a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f146940b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f146941c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C55700ah f146942d;

    static {
        C55698af afVar = new C55698af();
        f146937e = afVar;
        C62942bv.registerDefaultInstance(C55698af.class, afVar);
    }

    private C55698af() {
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
                return newMessageInfo(f146937e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\t", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C55698af();
            case 4:
                return new C55697ae();
            case 5:
                return f146937e;
            case 6:
                C63010eb ebVar = f146938f;
                if (ebVar == null) {
                    synchronized (C55698af.class) {
                        ebVar = f146938f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146937e);
                            f146938f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
