package com.google.p4160bf.p4161a.p4163b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4160bf.p4161a.p4162a.C55432a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.br */
/* compiled from: PG */
public final class C55481br extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55481br f146365e;

    /* renamed from: f */
    private static volatile C63010eb f146366f;

    /* renamed from: a */
    public int f146367a;

    /* renamed from: b */
    public int f146368b;

    /* renamed from: c */
    public C55515w f146369c;

    /* renamed from: d */
    public String f146370d = BuildConfig.FLAVOR;

    static {
        C55481br brVar = new C55481br();
        f146365e = brVar;
        C62942bv.registerDefaultInstance(C55481br.class, brVar);
    }

    private C55481br() {
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
                return newMessageInfo(f146365e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0005ဈ\u0003", new Object[]{"a", "b", C55432a.f146254a, C45240c.f118157a, "d"});
            case 3:
                return new C55481br();
            case 4:
                return new C55480bq();
            case 5:
                return f146365e;
            case 6:
                C63010eb ebVar = f146366f;
                if (ebVar == null) {
                    synchronized (C55481br.class) {
                        ebVar = f146366f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146365e);
                            f146366f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
