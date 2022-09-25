package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.afc */
/* compiled from: PG */
public final class afc extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final afc f129144a;

    /* renamed from: b */
    private static volatile C63010eb f129145b;

    static {
        afc afc = new afc();
        f129144a = afc;
        C62942bv.registerDefaultInstance(afc.class, afc);
    }

    private afc() {
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
                return newMessageInfo(f129144a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new afc();
            case 4:
                return new afb();
            case 5:
                return f129144a;
            case 6:
                C63010eb ebVar = f129145b;
                if (ebVar == null) {
                    synchronized (afc.class) {
                        ebVar = f129145b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129144a);
                            f129145b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
