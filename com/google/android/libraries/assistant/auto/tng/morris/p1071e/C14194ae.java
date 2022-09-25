package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ae */
/* compiled from: PG */
public final class C14194ae extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14194ae f42970b;

    /* renamed from: c */
    private static volatile C63010eb f42971c;

    /* renamed from: a */
    public long f42972a;

    static {
        C14194ae aeVar = new C14194ae();
        f42970b = aeVar;
        C62942bv.registerDefaultInstance(C14194ae.class, aeVar);
    }

    private C14194ae() {
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
                return newMessageInfo(f42970b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
            case 3:
                return new C14194ae();
            case 4:
                return new C14193ad();
            case 5:
                return f42970b;
            case 6:
                C63010eb ebVar = f42971c;
                if (ebVar == null) {
                    synchronized (C14194ae.class) {
                        ebVar = f42971c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42970b);
                            f42971c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
