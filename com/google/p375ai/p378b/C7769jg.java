package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.jg */
/* compiled from: PG */
public final class C7769jg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7769jg f27208a;

    /* renamed from: b */
    private static volatile C63010eb f27209b;

    static {
        C7769jg jgVar = new C7769jg();
        f27208a = jgVar;
        C62942bv.registerDefaultInstance(C7769jg.class, jgVar);
    }

    private C7769jg() {
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
                return newMessageInfo(f27208a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7769jg();
            case 4:
                return new C7768jf();
            case 5:
                return f27208a;
            case 6:
                C63010eb ebVar = f27209b;
                if (ebVar == null) {
                    synchronized (C7769jg.class) {
                        ebVar = f27209b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27208a);
                            f27209b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
