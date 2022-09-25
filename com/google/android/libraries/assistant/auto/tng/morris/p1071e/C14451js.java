package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.js */
/* compiled from: PG */
public final class C14451js extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14451js f43717a;

    /* renamed from: b */
    private static volatile C63010eb f43718b;

    static {
        C14451js jsVar = new C14451js();
        f43717a = jsVar;
        C62942bv.registerDefaultInstance(C14451js.class, jsVar);
    }

    private C14451js() {
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
                return newMessageInfo(f43717a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14451js();
            case 4:
                return new C14450jr();
            case 5:
                return f43717a;
            case 6:
                C63010eb ebVar = f43718b;
                if (ebVar == null) {
                    synchronized (C14451js.class) {
                        ebVar = f43718b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43717a);
                            f43718b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
