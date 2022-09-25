package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.el */
/* compiled from: PG */
public final class C49046el extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49046el f126849c;

    /* renamed from: e */
    private static volatile C63010eb f126850e;

    /* renamed from: a */
    public int f126851a;

    /* renamed from: b */
    public C62910ar f126852b;

    /* renamed from: d */
    private int f126853d;

    static {
        C49046el elVar = new C49046el();
        f126849c = elVar;
        C62942bv.registerDefaultInstance(C49046el.class, elVar);
    }

    private C49046el() {
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
                return newMessageInfo(f126849c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0002", new Object[]{"d", "a", C49044ej.f126848a, "b"});
            case 3:
                return new C49046el();
            case 4:
                return new C49043ei();
            case 5:
                return f126849c;
            case 6:
                C63010eb ebVar = f126850e;
                if (ebVar == null) {
                    synchronized (C49046el.class) {
                        ebVar = f126850e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126849c);
                            f126850e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
