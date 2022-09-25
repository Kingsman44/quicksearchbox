package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.go */
/* compiled from: PG */
public final class C51989go extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51989go f136429c;

    /* renamed from: d */
    private static volatile C63010eb f136430d;

    /* renamed from: a */
    public int f136431a;

    /* renamed from: b */
    public boolean f136432b;

    static {
        C51989go goVar = new C51989go();
        f136429c = goVar;
        C62942bv.registerDefaultInstance(C51989go.class, goVar);
    }

    private C51989go() {
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
                return newMessageInfo(f136429c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51989go();
            case 4:
                return new C51988gn();
            case 5:
                return f136429c;
            case 6:
                C63010eb ebVar = f136430d;
                if (ebVar == null) {
                    synchronized (C51989go.class) {
                        ebVar = f136430d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136429c);
                            f136430d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
