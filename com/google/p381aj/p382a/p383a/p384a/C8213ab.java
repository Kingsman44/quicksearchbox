package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.aj.a.a.a.ab */
/* compiled from: PG */
public final class C8213ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8213ab f28837d;

    /* renamed from: g */
    private static volatile C63010eb f28838g;

    /* renamed from: a */
    public int f28839a;

    /* renamed from: b */
    public int f28840b;

    /* renamed from: c */
    public int f28841c;

    /* renamed from: e */
    private C63771b f28842e;

    /* renamed from: f */
    private byte f28843f = 2;

    static {
        C8213ab abVar = new C8213ab();
        f28837d = abVar;
        C62942bv.registerDefaultInstance(C8213ab.class, abVar);
    }

    private C8213ab() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28843f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28843f = b;
                return null;
            case 2:
                return newMessageInfo(f28837d, "\u0001\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0000\u0003\u0001ᔆ\u0000\u0002ᔆ\u0001\u000fᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "e"});
            case 3:
                return new C8213ab();
            case 4:
                return new C8212aa();
            case 5:
                return f28837d;
            case 6:
                C63010eb ebVar = f28838g;
                if (ebVar == null) {
                    synchronized (C8213ab.class) {
                        ebVar = f28838g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28837d);
                            f28838g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
