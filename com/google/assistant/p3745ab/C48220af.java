package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.af */
/* compiled from: PG */
public final class C48220af extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48220af f124756b;

    /* renamed from: c */
    private static volatile C63010eb f124757c;

    /* renamed from: a */
    public C48222ah f124758a;

    static {
        C48220af afVar = new C48220af();
        f124756b = afVar;
        C62942bv.registerDefaultInstance(C48220af.class, afVar);
    }

    private C48220af() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f124756b, "\u0000\u0001\u0000\u0000\f\f\u0001\u0000\u0000\u0000\f\t", new Object[]{"a"});
            case 3:
                return new C48220af();
            case 4:
                return new C48219ae();
            case 5:
                return f124756b;
            case 6:
                C63010eb ebVar = f124757c;
                if (ebVar == null) {
                    synchronized (C48220af.class) {
                        ebVar = f124757c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124756b);
                            f124757c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
