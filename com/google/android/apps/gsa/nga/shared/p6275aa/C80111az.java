package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.az */
/* compiled from: PG */
public final class C80111az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80111az f219821c;

    /* renamed from: d */
    private static volatile C63010eb f219822d;

    /* renamed from: a */
    public int f219823a;

    /* renamed from: b */
    public int f219824b;

    static {
        C80111az azVar = new C80111az();
        f219821c = azVar;
        C62942bv.registerDefaultInstance(C80111az.class, azVar);
    }

    private C80111az() {
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
                return newMessageInfo(f219821c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", e.b()});
            case 3:
                return new C80111az();
            case 4:
                return new C80110ay();
            case 5:
                return f219821c;
            case 6:
                C63010eb ebVar = f219822d;
                if (ebVar == null) {
                    synchronized (C80111az.class) {
                        ebVar = f219822d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219821c);
                            f219822d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
