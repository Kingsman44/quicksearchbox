package com.google.protos.p5064h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4129b.p4136c.p4138b.p4139a.C54749b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.h.o */
/* compiled from: PG */
public final class C65467o extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65467o f177953a;

    /* renamed from: d */
    private static volatile C63010eb f177954d;

    /* renamed from: b */
    private int f177955b;

    /* renamed from: c */
    private C54749b f177956c;

    static {
        C65467o oVar = new C65467o();
        f177953a = oVar;
        C62942bv.registerDefaultInstance(C65467o.class, oVar);
    }

    private C65467o() {
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
                return newMessageInfo(f177953a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C65467o();
            case 4:
                return new C65466n();
            case 5:
                return f177953a;
            case 6:
                C63010eb ebVar = f177954d;
                if (ebVar == null) {
                    synchronized (C65467o.class) {
                        ebVar = f177954d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177953a);
                            f177954d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
