package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.at.j.a.ej */
/* compiled from: PG */
public final class C54438ej extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54438ej f142957c;

    /* renamed from: d */
    private static volatile C63010eb f142958d;

    /* renamed from: a */
    public C62971cq f142959a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C63042fg f142960b;

    static {
        C54438ej ejVar = new C54438ej();
        f142957c = ejVar;
        C62942bv.registerDefaultInstance(C54438ej.class, ejVar);
    }

    private C54438ej() {
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
                return newMessageInfo(f142957c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C54438ej();
            case 4:
                return new C54437ei();
            case 5:
                return f142957c;
            case 6:
                C63010eb ebVar = f142958d;
                if (ebVar == null) {
                    synchronized (C54438ej.class) {
                        ebVar = f142958d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142957c);
                            f142958d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
