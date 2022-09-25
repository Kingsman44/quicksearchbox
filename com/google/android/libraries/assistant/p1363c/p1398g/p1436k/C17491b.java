package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.g.k.b */
/* compiled from: PG */
public final class C17491b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C17491b f50496a;

    /* renamed from: b */
    private static volatile C63010eb f50497b;

    static {
        C17491b bVar = new C17491b();
        f50496a = bVar;
        C62942bv.registerDefaultInstance(C17491b.class, bVar);
    }

    private C17491b() {
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
                return newMessageInfo(f50496a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C17491b();
            case 4:
                return new C17464a();
            case 5:
                return f50496a;
            case 6:
                C63010eb ebVar = f50497b;
                if (ebVar == null) {
                    synchronized (C17491b.class) {
                        ebVar = f50497b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50496a);
                            f50497b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
