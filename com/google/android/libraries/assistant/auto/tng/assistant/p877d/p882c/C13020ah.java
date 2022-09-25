package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.ah */
/* compiled from: PG */
public final class C13020ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13020ah f40439c;

    /* renamed from: d */
    private static volatile C63010eb f40440d;

    /* renamed from: a */
    public int f40441a;

    /* renamed from: b */
    public C51805du f40442b;

    static {
        C13020ah ahVar = new C13020ah();
        f40439c = ahVar;
        C62942bv.registerDefaultInstance(C13020ah.class, ahVar);
    }

    private C13020ah() {
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
                return newMessageInfo(f40439c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13020ah();
            case 4:
                return new C13019ag();
            case 5:
                return f40439c;
            case 6:
                C63010eb ebVar = f40440d;
                if (ebVar == null) {
                    synchronized (C13020ah.class) {
                        ebVar = f40440d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40439c);
                            f40440d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
