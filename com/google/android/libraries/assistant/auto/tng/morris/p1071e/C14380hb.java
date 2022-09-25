package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.hb */
/* compiled from: PG */
public final class C14380hb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14380hb f43509a;

    /* renamed from: b */
    private static volatile C63010eb f43510b;

    static {
        C14380hb hbVar = new C14380hb();
        f43509a = hbVar;
        C62942bv.registerDefaultInstance(C14380hb.class, hbVar);
    }

    private C14380hb() {
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
                return newMessageInfo(f43509a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14380hb();
            case 4:
                return new C14379ha();
            case 5:
                return f43509a;
            case 6:
                C63010eb ebVar = f43510b;
                if (ebVar == null) {
                    synchronized (C14380hb.class) {
                        ebVar = f43510b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43509a);
                            f43510b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
