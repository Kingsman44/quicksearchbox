package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4564j.C60012ah;
import com.google.common.p4552o.p4564j.C60029d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.adt */
/* compiled from: PG */
public final class adt extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final adt f158403d;

    /* renamed from: g */
    private static volatile C63010eb f158404g;

    /* renamed from: a */
    public int f158405a;

    /* renamed from: b */
    public int f158406b = 1;

    /* renamed from: c */
    public C60012ah f158407c;

    /* renamed from: e */
    private C60029d f158408e;

    /* renamed from: f */
    private byte f158409f = 2;

    static {
        adt adt = new adt();
        f158403d = adt;
        C62942bv.registerDefaultInstance(adt.class, adt);
    }

    private adt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f158409f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f158409f = b;
                return null;
            case 2:
                return newMessageInfo(f158403d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C59575ads.f158402a, C45240c.f118157a, "e"});
            case 3:
                return new adt();
            case 4:
                return new adr();
            case 5:
                return f158403d;
            case 6:
                C63010eb ebVar = f158404g;
                if (ebVar == null) {
                    synchronized (adt.class) {
                        ebVar = f158404g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158403d);
                            f158404g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
