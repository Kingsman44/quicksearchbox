package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ep */
/* compiled from: PG */
public final class C49939ep extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49939ep f129802a;

    /* renamed from: b */
    private static volatile C63010eb f129803b;

    static {
        C49939ep epVar = new C49939ep();
        f129802a = epVar;
        C62942bv.registerDefaultInstance(C49939ep.class, epVar);
    }

    private C49939ep() {
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
                return newMessageInfo(f129802a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49939ep();
            case 4:
                return new C49938eo();
            case 5:
                return f129802a;
            case 6:
                C63010eb ebVar = f129803b;
                if (ebVar == null) {
                    synchronized (C49939ep.class) {
                        ebVar = f129803b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129802a);
                            f129803b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
