package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ak */
/* compiled from: PG */
public final class C14200ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14200ak f42978c;

    /* renamed from: d */
    private static volatile C63010eb f42979d;

    /* renamed from: a */
    public int f42980a = 0;

    /* renamed from: b */
    public Object f42981b;

    static {
        C14200ak akVar = new C14200ak();
        f42978c = akVar;
        C62942bv.registerDefaultInstance(C14200ak.class, akVar);
    }

    private C14200ak() {
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
                return newMessageInfo(f42978c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C14192ac.class, C14196ag.class, C14199aj.class, C14194ae.class});
            case 3:
                return new C14200ak();
            case 4:
                return new C14190aa();
            case 5:
                return f42978c;
            case 6:
                C63010eb ebVar = f42979d;
                if (ebVar == null) {
                    synchronized (C14200ak.class) {
                        ebVar = f42979d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42978c);
                            f42979d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
