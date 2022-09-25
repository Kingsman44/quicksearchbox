package com.google.common.p4552o;

import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.ef */
/* compiled from: PG */
public final class C59749ef extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59749ef f161436c;

    /* renamed from: d */
    public static final C62940bt f161437d;

    /* renamed from: f */
    private static volatile C63010eb f161438f;

    /* renamed from: a */
    public int f161439a;

    /* renamed from: b */
    public C60214n f161440b;

    /* renamed from: e */
    private byte f161441e = 2;

    static {
        C59749ef efVar = new C59749ef();
        f161436c = efVar;
        C62942bv.registerDefaultInstance(C59749ef.class, efVar);
        f161437d = C62942bv.newSingularGeneratedExtension(aqs.f159780k, efVar, efVar, (C62958ce) null, 596, C63066gd.MESSAGE, C59749ef.class);
    }

    private C59749ef() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f161441e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f161441e = b;
                return null;
            case 2:
                return newMessageInfo(f161436c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59749ef();
            case 4:
                return new C59748ee();
            case 5:
                return f161436c;
            case 6:
                C63010eb ebVar = f161438f;
                if (ebVar == null) {
                    synchronized (C59749ef.class) {
                        ebVar = f161438f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161436c);
                            f161438f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
