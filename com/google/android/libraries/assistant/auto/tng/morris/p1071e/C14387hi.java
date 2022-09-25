package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.hi */
/* compiled from: PG */
public final class C14387hi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14387hi f43524b;

    /* renamed from: c */
    private static volatile C63010eb f43525c;

    /* renamed from: a */
    public int f43526a;

    static {
        C14387hi hiVar = new C14387hi();
        f43524b = hiVar;
        C62942bv.registerDefaultInstance(C14387hi.class, hiVar);
    }

    private C14387hi() {
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
                return newMessageInfo(f43524b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C14387hi();
            case 4:
                return new C14386hh();
            case 5:
                return f43524b;
            case 6:
                C63010eb ebVar = f43525c;
                if (ebVar == null) {
                    synchronized (C14387hi.class) {
                        ebVar = f43525c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43524b);
                            f43525c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
