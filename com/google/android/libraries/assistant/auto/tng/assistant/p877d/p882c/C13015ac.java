package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.ac */
/* compiled from: PG */
public final class C13015ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13015ac f40430c;

    /* renamed from: d */
    private static volatile C63010eb f40431d;

    /* renamed from: a */
    public int f40432a;

    /* renamed from: b */
    public int f40433b;

    static {
        C13015ac acVar = new C13015ac();
        f40430c = acVar;
        C62942bv.registerDefaultInstance(C13015ac.class, acVar);
    }

    private C13015ac() {
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
                return newMessageInfo(f40430c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C13013aa.f40429a});
            case 3:
                return new C13015ac();
            case 4:
                return new C13080z();
            case 5:
                return f40430c;
            case 6:
                C63010eb ebVar = f40431d;
                if (ebVar == null) {
                    synchronized (C13015ac.class) {
                        ebVar = f40431d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40430c);
                            f40431d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
