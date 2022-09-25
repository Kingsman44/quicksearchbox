package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.fn */
/* compiled from: PG */
public final class C14338fn extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14338fn f43382b;

    /* renamed from: d */
    private static volatile C63010eb f43383d;

    /* renamed from: a */
    public C62971cq f43384a = emptyProtobufList();

    /* renamed from: c */
    private byte f43385c = 2;

    static {
        C14338fn fnVar = new C14338fn();
        f43382b = fnVar;
        C62942bv.registerDefaultInstance(C14338fn.class, fnVar);
    }

    private C14338fn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43385c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43385c = b;
                return null;
            case 2:
                return newMessageInfo(f43382b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C14292dv.class});
            case 3:
                return new C14338fn();
            case 4:
                return new C14337fm();
            case 5:
                return f43382b;
            case 6:
                C63010eb ebVar = f43383d;
                if (ebVar == null) {
                    synchronized (C14338fn.class) {
                        ebVar = f43383d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43382b);
                            f43383d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
