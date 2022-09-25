package com.google.android.libraries.assistant.p1533o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.bo */
/* compiled from: PG */
public final class C18479bo extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C18479bo f52410b;

    /* renamed from: c */
    private static volatile C63010eb f52411c;

    /* renamed from: a */
    public C18460aw f52412a;

    static {
        C18479bo boVar = new C18479bo();
        f52410b = boVar;
        C62942bv.registerDefaultInstance(C18479bo.class, boVar);
    }

    private C18479bo() {
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
                return newMessageInfo(f52410b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C18479bo();
            case 4:
                return new C18478bn();
            case 5:
                return f52410b;
            case 6:
                C63010eb ebVar = f52411c;
                if (ebVar == null) {
                    synchronized (C18479bo.class) {
                        ebVar = f52411c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52410b);
                            f52411c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
