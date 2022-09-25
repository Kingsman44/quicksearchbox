package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.bd */
/* compiled from: PG */
public final class C48696bd extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C48696bd f125977e;

    /* renamed from: g */
    private static volatile C63010eb f125978g;

    /* renamed from: a */
    public int f125979a;

    /* renamed from: b */
    public C48688aw f125980b;

    /* renamed from: c */
    public C48694bb f125981c;

    /* renamed from: d */
    public C48691az f125982d;

    /* renamed from: f */
    private byte f125983f = 2;

    static {
        C48696bd bdVar = new C48696bd();
        f125977e = bdVar;
        C62942bv.registerDefaultInstance(C48696bd.class, bdVar);
    }

    private C48696bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125983f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f125983f = b;
                return null;
            case 2:
                return newMessageInfo(f125977e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C48696bd();
            case 4:
                return new C48695bc();
            case 5:
                return f125977e;
            case 6:
                C63010eb ebVar = f125978g;
                if (ebVar == null) {
                    synchronized (C48696bd.class) {
                        ebVar = f125978g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125977e);
                            f125978g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
