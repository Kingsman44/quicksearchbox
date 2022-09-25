package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ds */
/* compiled from: PG */
public final class C51912ds extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51912ds f136180b;

    /* renamed from: c */
    private static volatile C63010eb f136181c;

    /* renamed from: a */
    public C62971cq f136182a = C62942bv.emptyProtobufList();

    static {
        C51912ds dsVar = new C51912ds();
        f136180b = dsVar;
        C62942bv.registerDefaultInstance(C51912ds.class, dsVar);
    }

    private C51912ds() {
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
                return newMessageInfo(f136180b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C51912ds();
            case 4:
                return new C51911dr();
            case 5:
                return f136180b;
            case 6:
                C63010eb ebVar = f136181c;
                if (ebVar == null) {
                    synchronized (C51912ds.class) {
                        ebVar = f136181c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136180b);
                            f136181c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
