package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.akd */
/* compiled from: PG */
public final class akd extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final akd f158953f;

    /* renamed from: g */
    private static volatile C63010eb f158954g;

    /* renamed from: a */
    public int f158955a;

    /* renamed from: b */
    public int f158956b;

    /* renamed from: c */
    public int f158957c;

    /* renamed from: d */
    public int f158958d;

    /* renamed from: e */
    public int f158959e;

    static {
        akd akd = new akd();
        f158953f = akd;
        C62942bv.registerDefaultInstance(akd.class, akd);
    }

    private akd() {
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
                return newMessageInfo(f158953f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", ake.f158960a, C45240c.f118157a, "d", "e"});
            case 3:
                return new akd();
            case 4:
                return new akc();
            case 5:
                return f158953f;
            case 6:
                C63010eb ebVar = f158954g;
                if (ebVar == null) {
                    synchronized (akd.class) {
                        ebVar = f158954g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158953f);
                            f158954g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
