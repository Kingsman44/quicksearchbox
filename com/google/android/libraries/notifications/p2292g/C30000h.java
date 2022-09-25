package com.google.android.libraries.notifications.p2292g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.notifications.g.h */
/* compiled from: PG */
public final class C30000h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C30000h f81211a;

    /* renamed from: b */
    private static volatile C63010eb f81212b;

    static {
        C30000h hVar = new C30000h();
        f81211a = hVar;
        C62942bv.registerDefaultInstance(C30000h.class, hVar);
    }

    private C30000h() {
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
                return newMessageInfo(f81211a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C30000h();
            case 4:
                return new C29999g();
            case 5:
                return f81211a;
            case 6:
                C63010eb ebVar = f81212b;
                if (ebVar == null) {
                    synchronized (C30000h.class) {
                        ebVar = f81212b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f81211a);
                            f81212b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
