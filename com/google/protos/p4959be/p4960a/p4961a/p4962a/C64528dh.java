package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.dh */
/* compiled from: PG */
public final class C64528dh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64528dh f174998f;

    /* renamed from: g */
    private static volatile C63010eb f174999g;

    /* renamed from: a */
    public String f175000a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C64538n f175001b;

    /* renamed from: c */
    public C64457ar f175002c;

    /* renamed from: d */
    public C64526df f175003d;

    /* renamed from: e */
    public C64474bh f175004e;

    static {
        C64528dh dhVar = new C64528dh();
        f174998f = dhVar;
        C62942bv.registerDefaultInstance(C64528dh.class, dhVar);
    }

    private C64528dh() {
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
                return newMessageInfo(f174998f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t\u0004\t\u0005\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64528dh();
            case 4:
                return new C64527dg();
            case 5:
                return f174998f;
            case 6:
                C63010eb ebVar = f174999g;
                if (ebVar == null) {
                    synchronized (C64528dh.class) {
                        ebVar = f174999g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174998f);
                            f174999g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
