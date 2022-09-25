package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ih */
/* compiled from: PG */
public final class C14413ih extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14413ih f43588b;

    /* renamed from: d */
    private static volatile C63010eb f43589d;

    /* renamed from: a */
    public C14292dv f43590a;

    /* renamed from: c */
    private byte f43591c = 2;

    static {
        C14413ih ihVar = new C14413ih();
        f43588b = ihVar;
        C62942bv.registerDefaultInstance(C14413ih.class, ihVar);
    }

    private C14413ih() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43591c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f43591c = b;
                return null;
            case 2:
                return newMessageInfo(f43588b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C14413ih();
            case 4:
                return new C14412ig();
            case 5:
                return f43588b;
            case 6:
                C63010eb ebVar = f43589d;
                if (ebVar == null) {
                    synchronized (C14413ih.class) {
                        ebVar = f43589d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43588b);
                            f43589d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
