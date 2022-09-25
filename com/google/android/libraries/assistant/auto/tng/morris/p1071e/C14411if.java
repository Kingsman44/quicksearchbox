package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.if */
/* compiled from: PG */
public final class C14411if extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14411if f43585b;

    /* renamed from: c */
    private static volatile C63010eb f43586c;

    /* renamed from: a */
    public C14302ee f43587a;

    static {
        C14411if ifVar = new C14411if();
        f43585b = ifVar;
        C62942bv.registerDefaultInstance(C14411if.class, ifVar);
    }

    private C14411if() {
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
                return newMessageInfo(f43585b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C14411if();
            case 4:
                return new C14410ie();
            case 5:
                return f43585b;
            case 6:
                C63010eb ebVar = f43586c;
                if (ebVar == null) {
                    synchronized (C14411if.class) {
                        ebVar = f43586c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43585b);
                            f43586c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
