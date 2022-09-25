package com.google.p4017at.p4060h.p4061a.p4062a.p4066d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4061a.p4062a.C54128b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.d.x */
/* compiled from: PG */
public final class C54172x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54172x f142173d;

    /* renamed from: f */
    private static volatile C63010eb f142174f;

    /* renamed from: a */
    public int f142175a;

    /* renamed from: b */
    public C54128b f142176b;

    /* renamed from: c */
    public C54170v f142177c;

    /* renamed from: e */
    private byte f142178e = 2;

    static {
        C54172x xVar = new C54172x();
        f142173d = xVar;
        C62942bv.registerDefaultInstance(C54172x.class, xVar);
    }

    private C54172x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142178e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142178e = b;
                return null;
            case 2:
                return newMessageInfo(f142173d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54172x();
            case 4:
                return new C54171w();
            case 5:
                return f142173d;
            case 6:
                C63010eb ebVar = f142174f;
                if (ebVar == null) {
                    synchronized (C54172x.class) {
                        ebVar = f142174f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142173d);
                            f142174f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
