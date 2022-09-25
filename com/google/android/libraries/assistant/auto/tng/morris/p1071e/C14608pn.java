package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.pn */
/* compiled from: PG */
public final class C14608pn extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14608pn f44168b;

    /* renamed from: c */
    private static volatile C63010eb f44169c;

    /* renamed from: a */
    public C62971cq f44170a = emptyProtobufList();

    static {
        C14608pn pnVar = new C14608pn();
        f44168b = pnVar;
        C62942bv.registerDefaultInstance(C14608pn.class, pnVar);
    }

    private C14608pn() {
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
                return newMessageInfo(f44168b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C14607pm.class});
            case 3:
                return new C14608pn();
            case 4:
                return new C14605pk();
            case 5:
                return f44168b;
            case 6:
                C63010eb ebVar = f44169c;
                if (ebVar == null) {
                    synchronized (C14608pn.class) {
                        ebVar = f44169c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44168b);
                            f44169c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
