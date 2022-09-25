package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.apr */
/* compiled from: PG */
public final class apr extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final apr f159695c;

    /* renamed from: e */
    private static volatile C63010eb f159696e;

    /* renamed from: a */
    public int f159697a;

    /* renamed from: b */
    public apt f159698b;

    /* renamed from: d */
    private byte f159699d = 2;

    static {
        apr apr = new apr();
        f159695c = apr;
        C62942bv.registerDefaultInstance(apr.class, apr);
    }

    private apr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f159699d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f159699d = b;
                return null;
            case 2:
                return newMessageInfo(f159695c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new apr();
            case 4:
                return new apq();
            case 5:
                return f159695c;
            case 6:
                C63010eb ebVar = f159696e;
                if (ebVar == null) {
                    synchronized (apr.class) {
                        ebVar = f159696e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159695c);
                            f159696e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
