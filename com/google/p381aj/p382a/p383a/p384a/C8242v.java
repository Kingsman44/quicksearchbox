package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.aj.a.a.a.v */
/* compiled from: PG */
public final class C8242v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8242v f28952d;

    /* renamed from: g */
    private static volatile C63010eb f28953g;

    /* renamed from: a */
    public int f28954a;

    /* renamed from: b */
    public long f28955b;

    /* renamed from: c */
    public long f28956c;

    /* renamed from: e */
    private C63771b f28957e;

    /* renamed from: f */
    private byte f28958f = 2;

    static {
        C8242v vVar = new C8242v();
        f28952d = vVar;
        C62942bv.registerDefaultInstance(C8242v.class, vVar);
    }

    private C8242v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28958f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28958f = b;
                return null;
            case 2:
                return newMessageInfo(f28952d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e"});
            case 3:
                return new C8242v();
            case 4:
                return new C8241u();
            case 5:
                return f28952d;
            case 6:
                C63010eb ebVar = f28953g;
                if (ebVar == null) {
                    synchronized (C8242v.class) {
                        ebVar = f28953g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28952d);
                            f28953g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
