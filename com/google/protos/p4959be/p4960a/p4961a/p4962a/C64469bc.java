package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.bc */
/* compiled from: PG */
public final class C64469bc extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64469bc f174866f;

    /* renamed from: g */
    private static volatile C63010eb f174867g;

    /* renamed from: a */
    public int f174868a;

    /* renamed from: b */
    public int f174869b;

    /* renamed from: c */
    public C62961ch f174870c = emptyIntList();

    /* renamed from: d */
    public int f174871d;

    /* renamed from: e */
    public int f174872e;

    static {
        C64469bc bcVar = new C64469bc();
        f174866f = bcVar;
        C62942bv.registerDefaultInstance(C64469bc.class, bcVar);
    }

    private C64469bc() {
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
                return newMessageInfo(f174866f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002,\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64469bc();
            case 4:
                return new C64468bb();
            case 5:
                return f174866f;
            case 6:
                C63010eb ebVar = f174867g;
                if (ebVar == null) {
                    synchronized (C64469bc.class) {
                        ebVar = f174867g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174866f);
                            f174867g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
