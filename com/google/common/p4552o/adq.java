package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.adq */
/* compiled from: PG */
public final class adq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final adq f158397c;

    /* renamed from: d */
    public static final C62940bt f158398d;

    /* renamed from: e */
    private static volatile C63010eb f158399e;

    /* renamed from: a */
    public int f158400a;

    /* renamed from: b */
    public C59603b f158401b;

    static {
        adq adq = new adq();
        f158397c = adq;
        C62942bv.registerDefaultInstance(adq.class, adq);
        f158398d = C62942bv.newSingularGeneratedExtension(apr.f159695c, adq, adq, (C62958ce) null, 391508563, C63066gd.MESSAGE, adq.class);
    }

    private adq() {
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
                return newMessageInfo(f158397c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new adq();
            case 4:
                return new adp();
            case 5:
                return f158397c;
            case 6:
                C63010eb ebVar = f158399e;
                if (ebVar == null) {
                    synchronized (adq.class) {
                        ebVar = f158399e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158397c);
                            f158399e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
