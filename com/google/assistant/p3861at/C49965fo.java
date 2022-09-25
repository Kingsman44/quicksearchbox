package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.fo */
/* compiled from: PG */
public final class C49965fo extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49965fo f129896a;

    /* renamed from: b */
    private static volatile C63010eb f129897b;

    static {
        C49965fo foVar = new C49965fo();
        f129896a = foVar;
        C62942bv.registerDefaultInstance(C49965fo.class, foVar);
    }

    private C49965fo() {
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
                return newMessageInfo(f129896a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49965fo();
            case 4:
                return new C49964fn();
            case 5:
                return f129896a;
            case 6:
                C63010eb ebVar = f129897b;
                if (ebVar == null) {
                    synchronized (C49965fo.class) {
                        ebVar = f129897b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129896a);
                            f129897b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
