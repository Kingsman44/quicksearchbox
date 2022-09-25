package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.me */
/* compiled from: PG */
public final class C14518me extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14518me f43890b;

    /* renamed from: c */
    private static volatile C63010eb f43891c;

    /* renamed from: a */
    public int f43892a;

    static {
        C14518me meVar = new C14518me();
        f43890b = meVar;
        C62942bv.registerDefaultInstance(C14518me.class, meVar);
    }

    private C14518me() {
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
                return newMessageInfo(f43890b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C14518me();
            case 4:
                return new C14517md();
            case 5:
                return f43890b;
            case 6:
                C63010eb ebVar = f43891c;
                if (ebVar == null) {
                    synchronized (C14518me.class) {
                        ebVar = f43891c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43890b);
                            f43891c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
