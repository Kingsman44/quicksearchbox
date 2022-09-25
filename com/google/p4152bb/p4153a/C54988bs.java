package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.bs */
/* compiled from: PG */
public final class C54988bs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54988bs f144680b;

    /* renamed from: c */
    public static final C62940bt f144681c;

    /* renamed from: e */
    private static volatile C63010eb f144682e;

    /* renamed from: a */
    public C62971cq f144683a = emptyProtobufList();

    /* renamed from: d */
    private byte f144684d = 2;

    static {
        C54988bs bsVar = new C54988bs();
        f144680b = bsVar;
        C62942bv.registerDefaultInstance(C54988bs.class, bsVar);
        f144681c = C62942bv.newSingularGeneratedExtension(C54946ad.f144531h, bsVar, bsVar, (C62958ce) null, 25433301, C63066gd.MESSAGE, C54988bs.class);
    }

    private C54988bs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144684d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144684d = b;
                return null;
            case 2:
                return newMessageInfo(f144680b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", C55423z.class});
            case 3:
                return new C54988bs();
            case 4:
                return new C54987br();
            case 5:
                return f144680b;
            case 6:
                C63010eb ebVar = f144682e;
                if (ebVar == null) {
                    synchronized (C54988bs.class) {
                        ebVar = f144682e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144680b);
                            f144682e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
