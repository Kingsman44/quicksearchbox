package com.google.p4184bj.p4193c.p4197c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.ar */
/* compiled from: PG */
public final class C55944ar extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55944ar f148910d;

    /* renamed from: e */
    private static volatile C63010eb f148911e;

    /* renamed from: a */
    public int f148912a;

    /* renamed from: b */
    public C62971cq f148913b = emptyProtobufList();

    /* renamed from: c */
    public C55928ab f148914c;

    static {
        C55944ar arVar = new C55944ar();
        f148910d = arVar;
        C62942bv.registerDefaultInstance(C55944ar.class, arVar);
    }

    private C55944ar() {
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
                return newMessageInfo(f148910d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", C55943aq.class, C45240c.f118157a});
            case 3:
                return new C55944ar();
            case 4:
                return new C55941ao();
            case 5:
                return f148910d;
            case 6:
                C63010eb ebVar = f148911e;
                if (ebVar == null) {
                    synchronized (C55944ar.class) {
                        ebVar = f148911e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148910d);
                            f148911e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
