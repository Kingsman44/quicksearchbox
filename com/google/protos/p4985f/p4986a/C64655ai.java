package com.google.protos.p4985f.p4986a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4184bj.p4193c.p4200e.C55994b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.ai */
/* compiled from: PG */
public final class C64655ai extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64655ai f175254d;

    /* renamed from: e */
    private static volatile C63010eb f175255e;

    /* renamed from: a */
    public int f175256a;

    /* renamed from: b */
    public C55994b f175257b;

    /* renamed from: c */
    public long f175258c;

    static {
        C64655ai aiVar = new C64655ai();
        f175254d = aiVar;
        C62942bv.registerDefaultInstance(C64655ai.class, aiVar);
    }

    private C64655ai() {
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
                return newMessageInfo(f175254d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64655ai();
            case 4:
                return new C64654ah();
            case 5:
                return f175254d;
            case 6:
                C63010eb ebVar = f175255e;
                if (ebVar == null) {
                    synchronized (C64655ai.class) {
                        ebVar = f175255e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175254d);
                            f175255e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
