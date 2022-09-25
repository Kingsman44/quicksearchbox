package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.hl */
/* compiled from: PG */
public final class C49127hl extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49127hl f127052a;

    /* renamed from: b */
    private static volatile C63010eb f127053b;

    static {
        C49127hl hlVar = new C49127hl();
        f127052a = hlVar;
        C62942bv.registerDefaultInstance(C49127hl.class, hlVar);
    }

    private C49127hl() {
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
                return newMessageInfo(f127052a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49127hl();
            case 4:
                return new C49126hk();
            case 5:
                return f127052a;
            case 6:
                C63010eb ebVar = f127053b;
                if (ebVar == null) {
                    synchronized (C49127hl.class) {
                        ebVar = f127053b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127052a);
                            f127053b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
