package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.lc */
/* compiled from: PG */
public final class C14489lc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14489lc f43790b;

    /* renamed from: c */
    private static volatile C63010eb f43791c;

    /* renamed from: a */
    public int f43792a;

    static {
        C14489lc lcVar = new C14489lc();
        f43790b = lcVar;
        C62942bv.registerDefaultInstance(C14489lc.class, lcVar);
    }

    private C14489lc() {
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
                return newMessageInfo(f43790b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C14489lc();
            case 4:
                return new C14487la();
            case 5:
                return f43790b;
            case 6:
                C63010eb ebVar = f43791c;
                if (ebVar == null) {
                    synchronized (C14489lc.class) {
                        ebVar = f43791c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43790b);
                            f43791c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
