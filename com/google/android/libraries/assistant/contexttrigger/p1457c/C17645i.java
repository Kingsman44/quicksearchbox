package com.google.android.libraries.assistant.contexttrigger.p1457c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.c.i */
/* compiled from: PG */
public final class C17645i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C17645i f50767a;

    /* renamed from: b */
    private static volatile C63010eb f50768b;

    static {
        C17645i iVar = new C17645i();
        f50767a = iVar;
        C62942bv.registerDefaultInstance(C17645i.class, iVar);
    }

    private C17645i() {
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
                return newMessageInfo(f50767a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C17645i();
            case 4:
                return new C17644h();
            case 5:
                return f50767a;
            case 6:
                C63010eb ebVar = f50768b;
                if (ebVar == null) {
                    synchronized (C17645i.class) {
                        ebVar = f50768b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50767a);
                            f50768b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
