package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.vp */
/* compiled from: PG */
public final class C8102vp extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C8102vp f28486e;

    /* renamed from: g */
    private static volatile C63010eb f28487g;

    /* renamed from: a */
    public int f28488a;

    /* renamed from: b */
    public long f28489b;

    /* renamed from: c */
    public C7633ef f28490c;

    /* renamed from: d */
    public C7952qa f28491d;

    /* renamed from: f */
    private byte f28492f = 2;

    static {
        C8102vp vpVar = new C8102vp();
        f28486e = vpVar;
        C62942bv.registerDefaultInstance(C8102vp.class, vpVar);
    }

    private C8102vp() {
    }

    /* renamed from: a */
    public final C7952qa mo17012a() {
        C7952qa qaVar = this.f28491d;
        return qaVar == null ? C7952qa.f27916z : qaVar;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28492f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28492f = b;
                return null;
            case 2:
                return newMessageInfo(f28486e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဂ\u0000\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C8102vp();
            case 4:
                return new C8101vo();
            case 5:
                return f28486e;
            case 6:
                C63010eb ebVar = f28487g;
                if (ebVar == null) {
                    synchronized (C8102vp.class) {
                        ebVar = f28487g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28486e);
                            f28487g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
