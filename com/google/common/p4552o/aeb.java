package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aeb */
/* compiled from: PG */
public final class aeb extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final aeb f158441d;

    /* renamed from: f */
    private static volatile C63010eb f158442f;

    /* renamed from: a */
    public int f158443a;

    /* renamed from: b */
    public aef f158444b;

    /* renamed from: c */
    public int f158445c;

    /* renamed from: e */
    private byte f158446e = 2;

    static {
        aeb aeb = new aeb();
        f158441d = aeb;
        C62942bv.registerDefaultInstance(aeb.class, aeb);
    }

    private aeb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f158446e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f158446e = b;
                return null;
            case 2:
                return newMessageInfo(f158441d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, aea.m92374b()});
            case 3:
                return new aeb();
            case 4:
                return new ady();
            case 5:
                return f158441d;
            case 6:
                C63010eb ebVar = f158442f;
                if (ebVar == null) {
                    synchronized (aeb.class) {
                        ebVar = f158442f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158441d);
                            f158442f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
