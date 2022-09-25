package com.google.protos.p4883as.p4884a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.p4855d.p4858c.C63498af;

/* renamed from: com.google.protos.as.a.h */
/* compiled from: PG */
public final class C63779h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63779h f172532a;

    /* renamed from: e */
    private static volatile C63010eb f172533e;

    /* renamed from: b */
    private int f172534b;

    /* renamed from: c */
    private C63498af f172535c;

    /* renamed from: d */
    private byte f172536d = 2;

    static {
        C63779h hVar = new C63779h();
        f172532a = hVar;
        C62942bv.registerDefaultInstance(C63779h.class, hVar);
    }

    private C63779h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172536d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172536d = b;
                return null;
            case 2:
                return newMessageInfo(f172532a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63779h();
            case 4:
                return new C63778g();
            case 5:
                return f172532a;
            case 6:
                C63010eb ebVar = f172533e;
                if (ebVar == null) {
                    synchronized (C63779h.class) {
                        ebVar = f172533e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172532a);
                            f172533e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
