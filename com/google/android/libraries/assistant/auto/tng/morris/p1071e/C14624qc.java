package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.qc */
/* compiled from: PG */
public final class C14624qc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14624qc f44197b;

    /* renamed from: c */
    private static volatile C63010eb f44198c;

    /* renamed from: a */
    public int f44199a;

    static {
        C14624qc qcVar = new C14624qc();
        f44197b = qcVar;
        C62942bv.registerDefaultInstance(C14624qc.class, qcVar);
    }

    private C14624qc() {
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
                return newMessageInfo(f44197b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C14624qc();
            case 4:
                return new C14623qb();
            case 5:
                return f44197b;
            case 6:
                C63010eb ebVar = f44198c;
                if (ebVar == null) {
                    synchronized (C14624qc.class) {
                        ebVar = f44198c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44197b);
                            f44198c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
