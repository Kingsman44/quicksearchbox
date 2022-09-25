package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.hx */
/* compiled from: PG */
public final class C51443hx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51443hx f133974d;

    /* renamed from: e */
    private static volatile C63010eb f133975e;

    /* renamed from: a */
    public int f133976a;

    /* renamed from: b */
    public C52428rj f133977b;

    /* renamed from: c */
    public long f133978c;

    static {
        C51443hx hxVar = new C51443hx();
        f133974d = hxVar;
        C62942bv.registerDefaultInstance(C51443hx.class, hxVar);
    }

    private C51443hx() {
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
                return newMessageInfo(f133974d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51443hx();
            case 4:
                return new C51442hw();
            case 5:
                return f133974d;
            case 6:
                C63010eb ebVar = f133975e;
                if (ebVar == null) {
                    synchronized (C51443hx.class) {
                        ebVar = f133975e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133974d);
                            f133975e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
