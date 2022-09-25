package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.hd */
/* compiled from: PG */
public final class C14382hd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14382hd f43511a;

    /* renamed from: b */
    private static volatile C63010eb f43512b;

    static {
        C14382hd hdVar = new C14382hd();
        f43511a = hdVar;
        C62942bv.registerDefaultInstance(C14382hd.class, hdVar);
    }

    private C14382hd() {
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
                return newMessageInfo(f43511a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14382hd();
            case 4:
                return new C14381hc();
            case 5:
                return f43511a;
            case 6:
                C63010eb ebVar = f43512b;
                if (ebVar == null) {
                    synchronized (C14382hd.class) {
                        ebVar = f43512b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43511a);
                            f43512b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
