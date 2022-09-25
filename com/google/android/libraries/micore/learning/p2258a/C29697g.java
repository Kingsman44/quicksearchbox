package com.google.android.libraries.micore.learning.p2258a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.micore.learning.a.g */
/* compiled from: PG */
public final class C29697g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C29697g f80430f;

    /* renamed from: g */
    private static volatile C63010eb f80431g;

    /* renamed from: a */
    public String f80432a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f80433b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f80434c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C29703m f80435d;

    /* renamed from: e */
    public String f80436e = BuildConfig.FLAVOR;

    static {
        C29697g gVar = new C29697g();
        f80430f = gVar;
        C62942bv.registerDefaultInstance(C29697g.class, gVar);
    }

    private C29697g() {
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
                return newMessageInfo(f80430f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005\t\u0006Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C29697g();
            case 4:
                return new C29696f();
            case 5:
                return f80430f;
            case 6:
                C63010eb ebVar = f80431g;
                if (ebVar == null) {
                    synchronized (C29697g.class) {
                        ebVar = f80431g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f80430f);
                            f80431g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
