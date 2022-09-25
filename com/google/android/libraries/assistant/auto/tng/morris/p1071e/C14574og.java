package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.og */
/* compiled from: PG */
public final class C14574og extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14574og f44066c;

    /* renamed from: d */
    private static volatile C63010eb f44067d;

    /* renamed from: a */
    public C14348fx f44068a;

    /* renamed from: b */
    public boolean f44069b;

    static {
        C14574og ogVar = new C14574og();
        f44066c = ogVar;
        C62942bv.registerDefaultInstance(C14574og.class, ogVar);
    }

    private C14574og() {
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
                return newMessageInfo(f44066c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C14574og();
            case 4:
                return new C14573of();
            case 5:
                return f44066c;
            case 6:
                C63010eb ebVar = f44067d;
                if (ebVar == null) {
                    synchronized (C14574og.class) {
                        ebVar = f44067d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44066c);
                            f44067d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
