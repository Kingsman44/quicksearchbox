package com.google.protos.p4985f.p4986a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.protos.f.a.x */
/* compiled from: PG */
public final class C64714x extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C64714x f175424e;

    /* renamed from: g */
    private static volatile C63010eb f175425g;

    /* renamed from: a */
    public int f175426a;

    /* renamed from: b */
    public float f175427b;

    /* renamed from: c */
    public int f175428c = -1;

    /* renamed from: d */
    public C63771b f175429d;

    /* renamed from: f */
    private byte f175430f = 2;

    static {
        C64714x xVar = new C64714x();
        f175424e = xVar;
        C62942bv.registerDefaultInstance(C64714x.class, xVar);
    }

    private C64714x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175430f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175430f = b;
                return null;
            case 2:
                return newMessageInfo(f175424e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ခ\u0000\u0003င\u0002\u0005ᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64714x();
            case 4:
                return new C64713w();
            case 5:
                return f175424e;
            case 6:
                C63010eb ebVar = f175425g;
                if (ebVar == null) {
                    synchronized (C64714x.class) {
                        ebVar = f175425g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175424e);
                            f175425g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
