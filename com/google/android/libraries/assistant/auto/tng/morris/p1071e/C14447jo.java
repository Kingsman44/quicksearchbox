package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.jo */
/* compiled from: PG */
public final class C14447jo extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14447jo f43712b;

    /* renamed from: c */
    private static volatile C63010eb f43713c;

    /* renamed from: a */
    public int f43714a;

    static {
        C14447jo joVar = new C14447jo();
        f43712b = joVar;
        C62942bv.registerDefaultInstance(C14447jo.class, joVar);
    }

    private C14447jo() {
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
                return newMessageInfo(f43712b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C14447jo();
            case 4:
                return new C14446jn();
            case 5:
                return f43712b;
            case 6:
                C63010eb ebVar = f43713c;
                if (ebVar == null) {
                    synchronized (C14447jo.class) {
                        ebVar = f43713c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43712b);
                            f43713c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
