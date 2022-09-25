package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.lw */
/* compiled from: PG */
public final class C14509lw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14509lw f43877b;

    /* renamed from: c */
    private static volatile C63010eb f43878c;

    /* renamed from: a */
    public int f43879a;

    static {
        C14509lw lwVar = new C14509lw();
        f43877b = lwVar;
        C62942bv.registerDefaultInstance(C14509lw.class, lwVar);
    }

    private C14509lw() {
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
                return newMessageInfo(f43877b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C14509lw();
            case 4:
                return new C14508lv();
            case 5:
                return f43877b;
            case 6:
                C63010eb ebVar = f43878c;
                if (ebVar == null) {
                    synchronized (C14509lw.class) {
                        ebVar = f43878c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43877b);
                            f43878c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
