package com.google.protos.p4985f.p5001d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.p4854c.C63408ai;

@Deprecated
/* renamed from: com.google.protos.f.d.k */
/* compiled from: PG */
public final class C64829k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64829k f175678a;

    /* renamed from: f */
    private static volatile C63010eb f175679f;

    /* renamed from: b */
    private int f175680b;

    /* renamed from: c */
    private C63408ai f175681c;

    /* renamed from: d */
    private C52568wo f175682d;

    /* renamed from: e */
    private byte f175683e = 2;

    static {
        C64829k kVar = new C64829k();
        f175678a = kVar;
        C62942bv.registerDefaultInstance(C64829k.class, kVar);
    }

    private C64829k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175683e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175683e = b;
                return null;
            case 2:
                return newMessageInfo(f175678a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C64829k();
            case 4:
                return new C64828j();
            case 5:
                return f175678a;
            case 6:
                C63010eb ebVar = f175679f;
                if (ebVar == null) {
                    synchronized (C64829k.class) {
                        ebVar = f175679f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175678a);
                            f175679f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
