package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.en */
/* compiled from: PG */
public final class C14311en extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14311en f43296b;

    /* renamed from: c */
    private static volatile C63010eb f43297c;

    /* renamed from: a */
    public C14302ee f43298a;

    static {
        C14311en enVar = new C14311en();
        f43296b = enVar;
        C62942bv.registerDefaultInstance(C14311en.class, enVar);
    }

    private C14311en() {
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
                return newMessageInfo(f43296b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C14311en();
            case 4:
                return new C14310em();
            case 5:
                return f43296b;
            case 6:
                C63010eb ebVar = f43297c;
                if (ebVar == null) {
                    synchronized (C14311en.class) {
                        ebVar = f43297c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43296b);
                            f43297c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
