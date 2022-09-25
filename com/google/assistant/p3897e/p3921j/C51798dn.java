package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.dn */
/* compiled from: PG */
public final class C51798dn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51798dn f135907e;

    /* renamed from: f */
    private static volatile C63010eb f135908f;

    /* renamed from: a */
    public int f135909a;

    /* renamed from: b */
    public int f135910b;

    /* renamed from: c */
    public C62971cq f135911c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f135912d = emptyProtobufList();

    static {
        C51798dn dnVar = new C51798dn();
        f135907e = dnVar;
        C62942bv.registerDefaultInstance(C51798dn.class, dnVar);
    }

    private C51798dn() {
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
                return newMessageInfo(f135907e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", C51727by.m86370b(), C45240c.f118157a, C51797dm.class, "d", C51795dk.class});
            case 3:
                return new C51798dn();
            case 4:
                return new C51792dh();
            case 5:
                return f135907e;
            case 6:
                C63010eb ebVar = f135908f;
                if (ebVar == null) {
                    synchronized (C51798dn.class) {
                        ebVar = f135908f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135907e);
                            f135908f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
