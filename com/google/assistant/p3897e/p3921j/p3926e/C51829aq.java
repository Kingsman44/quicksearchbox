package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.aq */
/* compiled from: PG */
public final class C51829aq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51829aq f135974a;

    /* renamed from: b */
    private static volatile C63010eb f135975b;

    static {
        C51829aq aqVar = new C51829aq();
        f135974a = aqVar;
        C62942bv.registerDefaultInstance(C51829aq.class, aqVar);
    }

    private C51829aq() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f135974a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51829aq();
            case 4:
                return new C51828ap();
            case 5:
                return f135974a;
            case 6:
                C63010eb ebVar = f135975b;
                if (ebVar == null) {
                    synchronized (C51829aq.class) {
                        ebVar = f135975b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135974a);
                            f135975b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
