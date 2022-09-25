package com.google.p4184bj.p4193c.p4197c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.bd */
/* compiled from: PG */
public final class C55957bd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55957bd f148946d;

    /* renamed from: e */
    private static volatile C63010eb f148947e;

    /* renamed from: a */
    public int f148948a;

    /* renamed from: b */
    public String f148949b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f148950c;

    static {
        C55957bd bdVar = new C55957bd();
        f148946d = bdVar;
        C62942bv.registerDefaultInstance(C55957bd.class, bdVar);
    }

    private C55957bd() {
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
                return newMessageInfo(f148946d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55957bd();
            case 4:
                return new C55956bc();
            case 5:
                return f148946d;
            case 6:
                C63010eb ebVar = f148947e;
                if (ebVar == null) {
                    synchronized (C55957bd.class) {
                        ebVar = f148947e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148946d);
                            f148947e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
