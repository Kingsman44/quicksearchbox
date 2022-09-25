package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aft */
/* compiled from: PG */
public final class aft extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final aft f135017a;

    /* renamed from: b */
    private static volatile C63010eb f135018b;

    static {
        aft aft = new aft();
        f135017a = aft;
        C62942bv.registerDefaultInstance(aft.class, aft);
    }

    private aft() {
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
                return newMessageInfo(f135017a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new aft();
            case 4:
                return new afs();
            case 5:
                return f135017a;
            case 6:
                C63010eb ebVar = f135018b;
                if (ebVar == null) {
                    synchronized (aft.class) {
                        ebVar = f135018b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135017a);
                            f135018b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
