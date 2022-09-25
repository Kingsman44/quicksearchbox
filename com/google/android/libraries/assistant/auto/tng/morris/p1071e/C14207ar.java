package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ar */
/* compiled from: PG */
public final class C14207ar extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14207ar f42988b;

    /* renamed from: c */
    private static volatile C63010eb f42989c;

    /* renamed from: a */
    public C14361gj f42990a;

    static {
        C14207ar arVar = new C14207ar();
        f42988b = arVar;
        C62942bv.registerDefaultInstance(C14207ar.class, arVar);
    }

    private C14207ar() {
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
                return newMessageInfo(f42988b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C14207ar();
            case 4:
                return new C14206aq();
            case 5:
                return f42988b;
            case 6:
                C63010eb ebVar = f42989c;
                if (ebVar == null) {
                    synchronized (C14207ar.class) {
                        ebVar = f42989c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42988b);
                            f42989c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
