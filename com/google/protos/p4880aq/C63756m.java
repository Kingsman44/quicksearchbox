package com.google.protos.p4880aq;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.m */
/* compiled from: PG */
public final class C63756m extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63756m f172474f;

    /* renamed from: g */
    private static volatile C63010eb f172475g;

    /* renamed from: a */
    public int f172476a;

    /* renamed from: b */
    public int f172477b;

    /* renamed from: c */
    public int f172478c;

    /* renamed from: d */
    public int f172479d;

    /* renamed from: e */
    public int f172480e;

    static {
        C63756m mVar = new C63756m();
        f172474f = mVar;
        C62942bv.registerDefaultInstance(C63756m.class, mVar);
    }

    private C63756m() {
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
                return newMessageInfo(f172474f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C63756m();
            case 4:
                return new C63755l();
            case 5:
                return f172474f;
            case 6:
                C63010eb ebVar = f172475g;
                if (ebVar == null) {
                    synchronized (C63756m.class) {
                        ebVar = f172475g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172474f);
                            f172475g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
