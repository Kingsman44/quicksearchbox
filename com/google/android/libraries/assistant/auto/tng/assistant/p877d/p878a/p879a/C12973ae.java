package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.ae */
/* compiled from: PG */
public final class C12973ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C12973ae f40345c;

    /* renamed from: d */
    private static volatile C63010eb f40346d;

    /* renamed from: a */
    public int f40347a;

    /* renamed from: b */
    public C13023ak f40348b;

    static {
        C12973ae aeVar = new C12973ae();
        f40345c = aeVar;
        C62942bv.registerDefaultInstance(C12973ae.class, aeVar);
    }

    private C12973ae() {
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
                return newMessageInfo(f40345c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C12973ae();
            case 4:
                return new C12972ad();
            case 5:
                return f40345c;
            case 6:
                C63010eb ebVar = f40346d;
                if (ebVar == null) {
                    synchronized (C12973ae.class) {
                        ebVar = f40346d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40345c);
                            f40346d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
