package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.os */
/* compiled from: PG */
public final class C14586os extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14586os f44098b;

    /* renamed from: c */
    private static volatile C63010eb f44099c;

    /* renamed from: a */
    public boolean f44100a;

    static {
        C14586os osVar = new C14586os();
        f44098b = osVar;
        C62942bv.registerDefaultInstance(C14586os.class, osVar);
    }

    private C14586os() {
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
                return newMessageInfo(f44098b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C14586os();
            case 4:
                return new C14585or();
            case 5:
                return f44098b;
            case 6:
                C63010eb ebVar = f44099c;
                if (ebVar == null) {
                    synchronized (C14586os.class) {
                        ebVar = f44099c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44098b);
                            f44099c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
