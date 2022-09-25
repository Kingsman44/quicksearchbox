package com.google.assistant.p3775ac.p3779d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ac.d.l */
/* compiled from: PG */
public final class C48472l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48472l f125216a;

    /* renamed from: b */
    private static volatile C63010eb f125217b;

    static {
        C48472l lVar = new C48472l();
        f125216a = lVar;
        C62942bv.registerDefaultInstance(C48472l.class, lVar);
    }

    private C48472l() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f125216a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48472l();
            case 4:
                return new C48471k();
            case 5:
                return f125216a;
            case 6:
                C63010eb ebVar = f125217b;
                if (ebVar == null) {
                    synchronized (C48472l.class) {
                        ebVar = f125217b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125216a);
                            f125217b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
