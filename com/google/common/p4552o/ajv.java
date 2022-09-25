package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.ajv */
/* compiled from: PG */
public final class ajv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final ajv f158915c;

    /* renamed from: d */
    public static final C62940bt f158916d;

    /* renamed from: e */
    private static volatile C63010eb f158917e;

    /* renamed from: a */
    public int f158918a;

    /* renamed from: b */
    public aju f158919b;

    static {
        ajv ajv = new ajv();
        f158915c = ajv;
        C62942bv.registerDefaultInstance(ajv.class, ajv);
        f158916d = C62942bv.newSingularGeneratedExtension(aqs.f159780k, ajv, ajv, (C62958ce) null, 501, C63066gd.MESSAGE, ajv.class);
    }

    private ajv() {
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
                return newMessageInfo(f158915c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ajv();
            case 4:
                return new ajs();
            case 5:
                return f158915c;
            case 6:
                C63010eb ebVar = f158917e;
                if (ebVar == null) {
                    synchronized (ajv.class) {
                        ebVar = f158917e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158915c);
                            f158917e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
