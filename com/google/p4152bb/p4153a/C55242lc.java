package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.lc */
/* compiled from: PG */
public final class C55242lc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55242lc f145462c;

    /* renamed from: d */
    private static volatile C63010eb f145463d;

    /* renamed from: a */
    public int f145464a;

    /* renamed from: b */
    public String f145465b = BuildConfig.FLAVOR;

    static {
        C55242lc lcVar = new C55242lc();
        f145462c = lcVar;
        C62942bv.registerDefaultInstance(C55242lc.class, lcVar);
    }

    private C55242lc() {
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
                return newMessageInfo(f145462c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C55242lc();
            case 4:
                return new C55241lb();
            case 5:
                return f145462c;
            case 6:
                C63010eb ebVar = f145463d;
                if (ebVar == null) {
                    synchronized (C55242lc.class) {
                        ebVar = f145463d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145462c);
                            f145463d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
