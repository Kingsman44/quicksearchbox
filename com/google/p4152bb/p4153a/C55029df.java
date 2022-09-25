package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.df */
/* compiled from: PG */
public final class C55029df extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C55029df f144771d;

    /* renamed from: f */
    private static volatile C63010eb f144772f;

    /* renamed from: a */
    public int f144773a;

    /* renamed from: b */
    public C55123gs f144774b;

    /* renamed from: c */
    public C55365pr f144775c;

    /* renamed from: e */
    private byte f144776e = 2;

    static {
        C55029df dfVar = new C55029df();
        f144771d = dfVar;
        C62942bv.registerDefaultInstance(C55029df.class, dfVar);
    }

    private C55029df() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144776e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144776e = b;
                return null;
            case 2:
                return newMessageInfo(f144771d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55029df();
            case 4:
                return new C55028de();
            case 5:
                return f144771d;
            case 6:
                C63010eb ebVar = f144772f;
                if (ebVar == null) {
                    synchronized (C55029df.class) {
                        ebVar = f144772f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144771d);
                            f144772f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
