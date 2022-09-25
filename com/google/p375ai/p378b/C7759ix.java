package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ix */
/* compiled from: PG */
public final class C7759ix extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C7759ix f27166f;

    /* renamed from: g */
    private static volatile C63010eb f27167g;

    /* renamed from: a */
    public int f27168a;

    /* renamed from: b */
    public String f27169b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f27170c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C7758iw f27171d;

    /* renamed from: e */
    public C7758iw f27172e;

    static {
        C7759ix ixVar = new C7759ix();
        f27166f = ixVar;
        C62942bv.registerDefaultInstance(C7759ix.class, ixVar);
    }

    private C7759ix() {
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
                return newMessageInfo(f27166f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C7759ix();
            case 4:
                return new C7756iu();
            case 5:
                return f27166f;
            case 6:
                C63010eb ebVar = f27167g;
                if (ebVar == null) {
                    synchronized (C7759ix.class) {
                        ebVar = f27167g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27166f);
                            f27167g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
