package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.s.a.hm */
/* compiled from: PG */
public final class C53265hm extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53265hm f139631f;

    /* renamed from: g */
    private static volatile C63010eb f139632g;

    /* renamed from: a */
    public int f139633a;

    /* renamed from: b */
    public long f139634b;

    /* renamed from: c */
    public String f139635c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f139636d;

    /* renamed from: e */
    public C63042fg f139637e;

    static {
        C53265hm hmVar = new C53265hm();
        f139631f = hmVar;
        C62942bv.registerDefaultInstance(C53265hm.class, hmVar);
    }

    private C53265hm() {
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
                return newMessageInfo(f139631f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0002\u0003ဈ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", "d", C45240c.f118157a, "e"});
            case 3:
                return new C53265hm();
            case 4:
                return new C53264hl();
            case 5:
                return f139631f;
            case 6:
                C63010eb ebVar = f139632g;
                if (ebVar == null) {
                    synchronized (C53265hm.class) {
                        ebVar = f139632g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139631f);
                            f139632g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
