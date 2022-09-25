package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.bw */
/* compiled from: PG */
public final class C48266bw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48266bw f124845a;

    /* renamed from: b */
    private static volatile C63010eb f124846b;

    static {
        C48266bw bwVar = new C48266bw();
        f124845a = bwVar;
        C62942bv.registerDefaultInstance(C48266bw.class, bwVar);
    }

    private C48266bw() {
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f124845a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48266bw();
            case 4:
                return new C48265bv();
            case 5:
                return f124845a;
            case 6:
                C63010eb ebVar = f124846b;
                if (ebVar == null) {
                    synchronized (C48266bw.class) {
                        ebVar = f124846b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124845a);
                            f124846b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
