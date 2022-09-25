package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.bt */
/* compiled from: PG */
public final class C7566bt extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7566bt f26167a;

    /* renamed from: b */
    private static volatile C63010eb f26168b;

    static {
        C7566bt btVar = new C7566bt();
        f26167a = btVar;
        C62942bv.registerDefaultInstance(C7566bt.class, btVar);
    }

    private C7566bt() {
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
                return newMessageInfo(f26167a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7566bt();
            case 4:
                return new C7565bs();
            case 5:
                return f26167a;
            case 6:
                C63010eb ebVar = f26168b;
                if (ebVar == null) {
                    synchronized (C7566bt.class) {
                        ebVar = f26168b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26167a);
                            f26168b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
