package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.hx */
/* compiled from: PG */
public final class C14402hx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14402hx f43571b;

    /* renamed from: d */
    private static volatile C63010eb f43572d;

    /* renamed from: a */
    public C14292dv f43573a;

    /* renamed from: c */
    private byte f43574c = 2;

    static {
        C14402hx hxVar = new C14402hx();
        f43571b = hxVar;
        C62942bv.registerDefaultInstance(C14402hx.class, hxVar);
    }

    private C14402hx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43574c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f43574c = b;
                return null;
            case 2:
                return newMessageInfo(f43571b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C14402hx();
            case 4:
                return new C14401hw();
            case 5:
                return f43571b;
            case 6:
                C63010eb ebVar = f43572d;
                if (ebVar == null) {
                    synchronized (C14402hx.class) {
                        ebVar = f43572d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43571b);
                            f43572d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
