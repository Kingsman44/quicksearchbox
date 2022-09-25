package com.google.p4184bj.p4193c.p4197c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.o */
/* compiled from: PG */
public final class C55979o extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55979o f149075f;

    /* renamed from: g */
    private static volatile C63010eb f149076g;

    /* renamed from: a */
    public int f149077a;

    /* renamed from: b */
    public int f149078b;

    /* renamed from: c */
    public String f149079c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f149080d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f149081e;

    static {
        C55979o oVar = new C55979o();
        f149075f = oVar;
        C62942bv.registerDefaultInstance(C55979o.class, oVar);
    }

    private C55979o() {
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
                return newMessageInfo(f149075f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"a", "b", C55960bg.m87869b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C55979o();
            case 4:
                return new C55978n();
            case 5:
                return f149075f;
            case 6:
                C63010eb ebVar = f149076g;
                if (ebVar == null) {
                    synchronized (C55979o.class) {
                        ebVar = f149076g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149075f);
                            f149076g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
