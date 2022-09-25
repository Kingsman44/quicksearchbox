package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ix */
/* compiled from: PG */
public final class C14429ix extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14429ix f43660b;

    /* renamed from: c */
    private static volatile C63010eb f43661c;

    /* renamed from: a */
    public int f43662a;

    static {
        C14429ix ixVar = new C14429ix();
        f43660b = ixVar;
        C62942bv.registerDefaultInstance(C14429ix.class, ixVar);
    }

    private C14429ix() {
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
                return newMessageInfo(f43660b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C14429ix();
            case 4:
                return new C14428iw();
            case 5:
                return f43660b;
            case 6:
                C63010eb ebVar = f43661c;
                if (ebVar == null) {
                    synchronized (C14429ix.class) {
                        ebVar = f43661c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43660b);
                            f43661c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
